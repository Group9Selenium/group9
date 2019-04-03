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
import databases.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FBSheets extends CommonAPI {
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
        InputStream in = FBSheets.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
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
    @FindBy(css = ".layerCancel")
    WebElement closePup;
    @FindBy(css = ".\\_1frb")
    WebElement mSearchETxt;
    @FindBy(id = "email")
    WebElement tUser;
    @FindBy(id = "pass")
    WebElement tPass;
    @FindBy(xpath = "//*[@class='_2s25']")
    WebElement bHome;

    public void login() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        tUser.sendKeys("aroussi.nouredine@gmail.com");
        tPass.sendKeys("NourEddine@2019", Keys.ENTER);
        System.out.println("Successfully logged in");
        Thread.sleep(500);
        try {
            if (closePup.isDisplayed()) closePup.click();;
        }catch (Exception e){
            System.out.println("Ther Is No Pappup Form");
        }

        Thread.sleep(500);
    }

    public void searchFriends() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> listFriends = getDataFromGSheet("Friends");
        for (String str : listFriends) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + " ," + str);
            mSearchETxt.sendKeys(str, Keys.ENTER);
            Thread.sleep(1000);
            mSearchETxt.clear();
        }
    }

    @FindBy(xpath = "//div[@id='universalNav']/ul/li")
    List<WebElement> universalNav;

    public void clickLeftNavBartop() throws InterruptedException, IOException, GeneralSecurityException {
        List<String> btnAction = getDataFromGSheet("LeftNavBartop");
        login();
        for (String act : btnAction) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + " ," + act);
            switch (act) {
                case "New Feed":
                    universalNav.get(0).click();
                    Thread.sleep(1000);
                    bHome.click();
                    break;
                case "Messenger":
                    universalNav.get(1).click();
                    Thread.sleep(1000);
                    bHome.click();
                    break;
                case "Watch":
                    universalNav.get(2).click();
                    Thread.sleep(1000);
                    bHome.click();
                    break;
                case "Marketplace":
                    universalNav.get(3).click();
                    Thread.sleep(1000);
                    bHome.click();
                    break;
                default:
                    System.out.println("no match");
                    break;
            }
        }
    }

    @FindBy(xpath = "//*[@id='navItem_1606854132932955']/a/div")
    WebElement clickMarketPlace;
    @FindBy(xpath = "//span/span/label/input")
    WebElement searchETxt;

    public void searchMarketPlace() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> listItems = getDataFromGSheet("Items");
        clickMarketPlace.click();
        for (String item : listItems) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + item);
            searchETxt.sendKeys(item, Keys.ENTER);
            Thread.sleep(1000);
            searchETxt.clear();
            Thread.sleep(500);
        }
    }

    @FindBy(xpath = "//*[@title='Groups']")
    WebElement clickGroups;

    public void searchMarketPlaceGroups() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> listItems = getDataFromGSheet("Items");
        clickMarketPlace.click();
        clickGroups.click();
        for (String item : listItems) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + item);
            searchETxt.sendKeys(item, Keys.ENTER);
            Thread.sleep(1000);
            searchETxt.clear();
            Thread.sleep(500);
        }
    }

    @FindBy(xpath = "//*[@title='Stores']")
    WebElement clickStores;

    public void searchMarketPlaceStores() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> listItems = getDataFromGSheet("Items");
        clickMarketPlace.click();
        clickStores.click();
        for (String item : listItems) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + item);
            searchETxt.sendKeys(item, Keys.ENTER);
            Thread.sleep(1000);
            searchETxt.clear();
            Thread.sleep(500);
        }
    }

    @FindBy(xpath = "//*[@id='universalNav']//a/div")
    List<WebElement> topLeftNavBar;

    public List<String> leftNavBartop() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> list = new ArrayList<String>();
        for (WebElement wE : topLeftNavBar) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + " ," + wE.getText());
            //System.out.println(wE.getText());
            list.add(wE.getText());
        }
        return list;
    }


    @FindBy(xpath = "//*[@class='_k01 _1itu _2pi2']")
    List<WebElement> marketPlaceLeftNav;
    public List<String> marketplaceNavBar() throws Exception {
        List<String> list = new ArrayList<String>();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        clickMarketPlace.click();
        for (WebElement wE : marketPlaceLeftNav) {
            list.add(wE.getText());
        }
        return list;
    }
    @FindBy(xpath = "//*[@id='appsNav']/ul/li[22]/a")
    WebElement showAllLetNavButtom;
    @FindBy(xpath = "//*[@id='navItem_977114232337111']/a/div")
    WebElement bJobs;
    @FindBy(xpath = "//input[@placeholder='Search jobs']")
    WebElement tSearchJob;
    @FindBy(xpath = "//div [@class ='_4llw _2pi2 uiInputLabel clearfix']")
    WebElement cBoxFulltime;
    public void clickMarketplaceNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> btnAction = getDataFromGSheet("MarketPlace");
        login();
        clickMarketPlace.click();
        for (String act : btnAction) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + act);
            switch (act) {
                case "Groups":
                    marketPlaceLeftNav.get(0).click();
                    Thread.sleep(1000);
                    break;
                case "Stores":
                    marketPlaceLeftNav.get(1).click();
                    Thread.sleep(1000);
                    break;
                case "Buying":
                    marketPlaceLeftNav.get(2).click();
                    Thread.sleep(1000);
                    break;
                case "Selling":
                    marketPlaceLeftNav.get(3).click();
                    Thread.sleep(1000);
                    break;
                case "Saved Items":
                    marketPlaceLeftNav.get(4).click();
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("no match");
                    break;
            }
        }
    }
    public void searchJobs() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> btnAction = getDataFromGSheet("Jobs");
        login();
        showAllLetNavButtom.click();
        bJobs.click();
        for (String job : btnAction) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + job);
            cBoxFulltime.click();
            tSearchJob.sendKeys(job, Keys.ENTER);
            Thread.sleep(1000);
            tSearchJob.clear();
            Thread.sleep(500);
        }

    }
}

