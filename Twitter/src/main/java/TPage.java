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

public class TPage extends CommonAPI {
    @FindBy(xpath = "//a[@data-nav='home']/span[3]")
    WebElement goHome;

    public void goHomePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goHome.click();
    }

    public Boolean isLogedin() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return driver.getTitle().equals("Twitter. It's what's happening.");
    }

    @FindBy(xpath = "//*[@id='user-dropdown-toggle']")
    WebElement profileDropDown;
    @FindBy(xpath = "//*[@id='signout-button']/button")
    WebElement profileLogOut;

    public void logout() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        if (isLogedin() == false) {
            profileDropDown.click();
            Thread.sleep(2000);
            profileLogOut.click();
            Thread.sleep(1000);
            System.out.println("Successfully logedout");
        } else {
            System.out.println("The User is already logout");
        }

    }

    @FindBy(xpath = "//*[@id='doc']/div/div[1]/div[1]/div[2]/div[2]/div/a[2]")
    WebElement loginPage;
    @FindBy(xpath = "//input[@class='js-username-field email-input js-initial-focus']")
    WebElement loginEmail;
    @FindBy(xpath = "//input[@class='js-password-field']")
    WebElement loginPass;

    public void login() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        loginPage.click();
        loginEmail.sendKeys("aroussi.nouredine@gmail.com");
        loginPass.sendKeys("NourEddine@2019", Keys.ENTER);
        System.out.println("Successfully logged in");
        Thread.sleep(1000);

    }

    @FindBy(xpath = "//*[@class='js-nav EdgeButton EdgeButton--medium EdgeButton--primary StaticLoggedOutHomePage-buttonSignup']")
    WebElement logupPage;
    @FindBy(xpath = "//input[@name='name']")
    WebElement logUpEmail;
    @FindBy(xpath = "//input[@name='phone_number']")
    WebElement logIpPhone;

    public void logup() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logupPage.click();
        Thread.sleep(1000);
        logUpEmail.sendKeys("NourEddine Aroussi");
        logIpPhone.sendKeys("6467644871");
        Thread.sleep(1000);
    }

    @FindBy(xpath = "//*[@id='global-actions']/li")
    List<WebElement> topNavBarList;

    public List<String> getTopNavBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<String>();
        for (WebElement wE : topNavBarList) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + wE.getText());
            list.add(wE.getText());
            //System.out.println(wE.getText());
        }
        return list;
    }

    public List<String> readExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        DataReader dr = new DataReader();
        List<String> list = new ArrayList<String>();
        String path = "/Users/anour/GDrive/Projects/Intellij/Group9/Twitter/src/main/data/Excel.xls";//System.getProperty("user.dir")+"/data/Excel.xl";
        System.out.println(path);
        String[] data = dr.fileReader2(path, 0);
        for (int i = 1; i < data.length; i++) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + data[i]);
            if (data[i] != null) list.add(data[i]);
        }
        return list;
    }

    public void clickTopNavBar() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = readExcelFile();
        for (int i = 0; i < list.size(); i++) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + topNavBarList.get(i).getText());
            topNavBarList.get(i).click();
            Thread.sleep(1000);
        }
    }

    @FindBy(xpath = "//*[@data-component-context='moments_nav']")
    WebElement clickMoments;
    @FindBy(xpath = "//*[@class='MomentGuideNavigation-categories']/li")
    List<WebElement> momentsList;

    public void clickMomentNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickMoments.click();
        for (WebElement wE : momentsList) {
            if (!wE.getText().equals("Sports")) wE.click();
            Thread.sleep(1000);
        }
    }

    @FindBy(xpath = "//a[@data-nav='search_filter_users']")
    WebElement searchPeopleClick;
    @FindBy(xpath = "//a[@data-nav='search_filter_images']")
    WebElement searchPotoClick;
    @FindBy(xpath = "//a[@data-nav='search_filter_videos']")
    WebElement searchVideoClick;
    @FindBy(xpath = "//a[@data-nav='search_filter_news']")
    WebElement searchNewClick;
    @FindBy(xpath = "//*[@id='search-query']")
    WebElement tSearch;

    public void searchPeople() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tSearch.sendKeys("Test", Keys.ENTER);
        searchPeopleClick.click();
        Thread.sleep(500);
        tSearch.clear();
        List<String> list = ConnectToSqlDB.readDataBase("Friends", "Names");
        for (String name : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + name);
            tSearch.sendKeys(name, Keys.ENTER);
            Thread.sleep(500);
            tSearch.clear();

        }
    }

    public void searchPhoto() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tSearch.sendKeys("Test", Keys.ENTER);
        searchPotoClick.click();
        Thread.sleep(500);
        tSearch.clear();
        List<String> list = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String name : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + name);
            tSearch.sendKeys(name, Keys.ENTER);
            Thread.sleep(500);
            tSearch.clear();

        }
    }

    public void searchVideos() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tSearch.sendKeys("Test", Keys.ENTER);
        searchVideoClick.click();
        Thread.sleep(500);
        tSearch.clear();
        List<String> list = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String name : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + name);
            tSearch.sendKeys(name, Keys.ENTER);
            Thread.sleep(500);
            tSearch.clear();

        }
    }

    public void searchNews() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tSearch.sendKeys("Test", Keys.ENTER);
        searchNewClick.click();
        Thread.sleep(500);
        tSearch.clear();
        List<String> list = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String name : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + name);
            tSearch.sendKeys(name, Keys.ENTER);
            Thread.sleep(500);
            tSearch.clear();

        }
    }
}
