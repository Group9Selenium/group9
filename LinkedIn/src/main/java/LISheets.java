import base.CommonAPI;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LISheets extends CommonAPI {
    //region Get The data from google sheat
    private static final String APPLICATION_NAME = "GSheetsStart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "credentials.json";

    /**
     * Creates an authorized Credential object.
     *
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = LISheets.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    /**
     * Prints the names and majors of students in a sample spreadsheet:
     * https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
     */
    public List<String> getDataFromGSheet(String sheetName) throws IOException, GeneralSecurityException {
        // Build a new authorized API client service.
        List<String> list = new ArrayList<String>();
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String spreadsheetId = "1Ix83cJHE4h2UxCU_eCxXuWzMEvu40hSWvm9TD_HzYBM";
        final String range = sheetName + "!A2:E";
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
            list = null;
        } else {
            //System.out.println("Name, Major");
            for (List row : values) {
                // Print columns A and E, which correspond to indices 0 and 4.
                //System.out.printf("%s\n", row.get(0));
                list.add(row.get(0).toString());
            }
            //System.out.println(list);
        }
        return list;
    }

    //endregion
    @FindBy(css = "#login-email")
    WebElement logEmail;
    @FindBy(css = "#login-password")
    WebElement logPass;
    @FindBy(css = "#login-submit")
    WebElement logSubmit;

    public void login() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        logEmail.sendKeys("aroussi.nouredine@gmail.com");
        logPass.sendKeys("NourEddine@2019");
        logSubmit.click();
        System.out.println("Successfully logged in");
        Thread.sleep(1000);
    }

    @FindBy(xpath = "//*[@id='extended-nav']/div/nav//li")
    List<WebElement> topNavBarList;

    public void clickTopNavBartop() throws IOException, GeneralSecurityException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> btnAction = getDataFromGSheet("LITopBar");
        for (String act : btnAction) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + act);
            for (WebElement wE : topNavBarList) {
                if (act.equals(wE.getText())) wE.click();
            }
        }

    }

    @FindBy(xpath = "//*[@id='mynetwork-nav-item']")
    WebElement clickMyNetwork;
    @FindBy(xpath = "//*[@id='nav-search-artdeco-typeahead']//input")
    WebElement tSearchMyNetwork;

    public void searchMyNetwork() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> friendSearch = getDataFromGSheet("Friends");
        clickMyNetwork.click();
        for (String name : friendSearch) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + name);
            tSearchMyNetwork.sendKeys(name);
            Thread.sleep(500);
            tSearchMyNetwork.clear();
        }
    }

    @FindBy(xpath = "//*[@id='messaging-nav-item']")
    WebElement clickMyMessaging;
    @FindBy(xpath = "//*[@id='search-conversations']")
    WebElement tSearchMessaging;

    public void searchMyMessages() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> friendSearch = getDataFromGSheet("Friends");
        clickMyMessaging.click();
        for (String name : friendSearch) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + name);
            tSearchMessaging.sendKeys(name);
            Thread.sleep(1000);
            tSearchMessaging.clear();
        }
    }

    @FindBy(xpath = "//*[@id='jobs-nav-item']")
    WebElement clickJobs;
    @FindBy(xpath = "//input[@placeholder='Search jobs']")
    WebElement tSearchJobs;
    @FindBy(xpath = "//input[@placeholder='Search location']")
    WebElement tSearchLocation;

    public void searchJobs() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> jobSearch = getDataFromGSheet("Jobs");
        clickJobs.click();
        for (String job : jobSearch) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + job);
            tSearchJobs.sendKeys(job);
            tSearchLocation.sendKeys("New York", Keys.ENTER);
            Thread.sleep(1000);
            tSearchJobs.clear();
            tSearchLocation.clear();
        }
    }

    public List<String> getTopNavBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<>();
        for (WebElement wE : topNavBarList) {
            list.add(wE.getText());
        }
        return list;
    }
}
