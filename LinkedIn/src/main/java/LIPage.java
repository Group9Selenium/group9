import base.CommonAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LIPage extends CommonAPI {

    public Boolean isLogedin() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return driver.getTitle().equals("LinkedIn: Log In or Sign Up");
    }

    @FindBy(xpath = "//*[@id='nav-settings__dropdown-trigger']")
    WebElement profileDropDown;
    @FindBy(xpath = "//ul[@id='nav-settings__dropdown-options']/li[5]/ul/li/a")
    WebElement logoutClick;

    public void logout() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        if (isLogedin() == false) {
            profileDropDown.click();
            Thread.sleep(2000);
            logoutClick.click();
            Thread.sleep(1000);
            System.out.println("Successfully logedout");
        } else {
            System.out.println("The User is already logout");
        }

    }

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

    @FindBy(css = "#feed-tab-icon")
    WebElement homeFeed;

    public void goHomePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeFeed.click();
    }

    @FindBy(xpath = "//*[@id='extended-nav']/div/nav//li")
    List<WebElement> topNavBarList;

    public void getTopNavBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        for (WebElement wE : topNavBarList) {
            System.out.println(wE.getText());
        }
    }

    public List<String> readExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        DataReader dr = new DataReader();
        List<String> list = new ArrayList<String>();
        String path = "/Users/anour/GDrive/Projects/Intellij/Group9/LinkedIn/src/main/data/Excel.xls";//System.getProperty("user.dir")+"/data/Excel.xl";
        //System.out.println(path);
        String[] data = dr.fileReader2(path, 0);
        for (int i = 1; i < data.length; i++) {
            //System.out.println(data[i]);
            if (data[i] != null) list.add(data[i]);
        }
        return list;
    }

    public void clickTopNavBartop() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> btnAction = readExcelFile();
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
        List<String> friendSearch = ConnectToSqlDB.readDataBase("Friends", "Names");
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
        List<String> friendSearch = ConnectToSqlDB.readDataBase("Friends", "Names");
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
        List<String> jobSearch = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
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

    @FindBy(xpath = "//*[@class='share-box__open share-box__trigger p4 hoverable-link-text t-16 t-black--light t-bold']")
    WebElement clickUploadFile;
    @FindBy(xpath = "//div[@class='share-box-media-upload display-flex align-items-center flex-1']/div")
    List<WebElement> uploadFileOptions;

    public void uploadFile() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickUploadFile.click();
        for (WebElement wE : uploadFileOptions) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", upload a" + wE.getText());
            System.out.println(wE.getText());
        }
    }

    @FindBy(xpath = "//*[@name='firstName']")
    WebElement logUpFirtsName;

    public void logup() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logUpFirtsName.sendKeys("Test User", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Test User", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Test.User@gmail.com", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Test-User2019", Keys.ENTER);
        Thread.sleep(1000);
    }

    @FindBy(xpath = "//*[@id='nav-settings__dropdown-options']/li//li")
    List<WebElement> profileDropDownList;

    public void dropDownListItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        profileDropDown.click();
        Thread.sleep(2000);
        for (WebElement wE : profileDropDownList) {
            System.out.println(wE.getText());
        }
    }

    public void clickDropDownListItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String originalHandle = driver.getWindowHandle();
        profileDropDown.click();
        Thread.sleep(2000);
        for (WebElement wE : profileDropDownList) {
            wE.click();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    Thread.sleep(500);
                    driver.close();
                }
            }
            driver.switchTo().window(originalHandle);
            profileDropDown.click();
            Thread.sleep(1000);
        }
    }
}
