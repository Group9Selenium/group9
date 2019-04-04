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

public class FBPage extends CommonAPI {
    @FindBy(css = ".layerCancel")
    WebElement closePup;

    public void closePapup() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        if (closePup.isDisplayed()) {
            closePup.click();
        }
    }

    @FindBy(id = "email")
    WebElement tUser;
    @FindBy(id = "pass")
    WebElement tPass;

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

    @FindBy(xpath = "//*[@class='_2s25']")
    WebElement bHome;

    public void goHomePage() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        if (isLogedin()) bHome.click();
        else {
            driver.navigate().to("https://www.facebook.com");
            System.out.println("You Are Not Logedin");
        }
    }

    public Boolean isLogedin() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + " ," + !driver.getTitle().equals("Facebook - Log In or Sign Up"));
        return !driver.getTitle().equals("Facebook - Log In or Sign Up");
    }

    @FindBy(xpath = "//*[@name='firstname']")
    WebElement fName;
    @FindBy(xpath = "//*[@name='reg_email_confirmation__']")
    WebElement cPass;

    public void logup() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        fName.sendKeys("Testuser", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("TestUser", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("TestUser@hotmail.com");
        cPass.sendKeys("TestUser@hotmail.com", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("TestUser-users", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Jan", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("1", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("2000", Keys.TAB);
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//div[@id='userNavigationLabel']")
    WebElement profile;
    @FindBy(css = ".\\_64kz .\\_54nh")
    WebElement logOut;

    public void logout() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        if (isLogedin() == false) {
            profile.click();
            Thread.sleep(2000);
            logOut.click();
            Thread.sleep(1000);
            System.out.println("Successfully logedout");
        } else {
            System.out.println("The User is already logout");
        }

    }

    @FindBy(css = "#navItem_4748854339 .linkWrap")
    WebElement nFeeds;

    public void newFeed() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        nFeeds.click();
        Thread.sleep(1000);
    }//endregion

    @FindBy(css = ".\\_1frb")
    WebElement mSearchETxt;

    public void searchFriends() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> listFriends = ConnectToSqlDB.readDataBase("Friends", "Names");
        for (String str : listFriends) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + " ," + str);
            mSearchETxt.sendKeys(str, Keys.ENTER);
            Thread.sleep(1000);
            mSearchETxt.clear();
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
            System.out.println(wE.getText());
            list.add(wE.getText());
        }
        return list;
    }

    public List<String> readExcelFile(int sheetNbr) throws IOException {
        DataReader dr = new DataReader();
        List<String> list = new ArrayList<String>();
        String path = "/Users/anour/GDrive/Projects/Intellij/Group9/Facebook/src/main/data/Excel.xls";//System.getProperty("user.dir")+"/data/Excel.xl";
        //System.out.println(path);
        String[] data = dr.fileReader2(path, sheetNbr);
        for (int i = 1; i < data.length; i++) {
            //System.out.println(data[i]);
            if (data[i] != null) list.add(data[i]);
        }
        return list;
    }

    @FindBy(xpath = "//div[@id='universalNav']/ul/li")
    List<WebElement> universalNav;

    public void clickLeftNavBartop() throws InterruptedException, IOException {
        List<String> btnAction = readExcelFile(0);
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

    public boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    @FindBy(xpath = "//*[@id='appsNav']/ul/li[22]/a")
    WebElement lNBBSeeAll;
    @FindBy(xpath = "//*[@id='appsNav']//li")
    List<WebElement> LNBBElement;

    public List<String> leftNavBarBottum() throws InterruptedException {
        List<String> list = new ArrayList<String>();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        lNBBSeeAll.click();
        for (WebElement wE : LNBBElement) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + " ," + wE.getText());
            //System.out.println(wE.getText()+" "+ isNumeric(wE.getText()));
            if (!isNumeric(wE.getText()))
                list.add(wE.getText());
        }
        return list;
    }

    @FindBy(css = ".sx_5c186e")
    WebElement showUploadsOptions;
    @FindBy(xpath = "//div[@class ='_3jk']/input")
    WebElement uploadFiles;

    public void uploadFile() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        showUploadsOptions.click();
        Thread.sleep(1000);
        //uploadFiles.click();
        //Thread.sleep(1000);
    }

    @FindBy(xpath = "//*[@id='navItem_1606854132932955']/a/div")
    WebElement clickMarketPlace;
    @FindBy(xpath = "//span/span/label/input")
    WebElement searchETxt;

    public void searchMarketPlace() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> listItems = ConnectToSqlDB.readDataBase("ItemList", "items");
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
        List<String> listItems = ConnectToSqlDB.readDataBase("ItemList", "items");
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
        List<String> listItems = ConnectToSqlDB.readDataBase("ItemList", "items");
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

    public void clickMarketplaceNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> btnAction = readExcelFile(1);
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

    @FindBy(xpath = "//*[@id='appsNav']/ul/li[22]/a")
    WebElement showAllLetNavButtom;
    @FindBy(xpath = "//*[@id='navItem_977114232337111']/a/div")
    WebElement bJobs;
    @FindBy(xpath = "//input[@placeholder='Search jobs']")
    WebElement tSearchJob;
    @FindBy(xpath = "//div [@class ='_4llw _2pi2 uiInputLabel clearfix']")
    WebElement cBoxFulltime;

    public void searchJobs() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> btnAction = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
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
