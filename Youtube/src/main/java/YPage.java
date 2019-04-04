import base.CommonAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class YPage extends CommonAPI {
    @FindBy(xpath = "//div [@id='logo-icon-container']")
    WebElement bHome;

    public void goHomePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bHome.click();
    }

    @FindBy(xpath = "//div [@id='button']")
    List<WebElement> topNavBar;

    public List<String> getTopNavBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<>();
        for (WebElement wE : topNavBar) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + wE.getTagName());
            list.add(wE.getText());
            System.out.println(wE.getTagName());
        }
        return list;
    }

    @FindBy(xpath = "//*[@id='guide-icon']")
    WebElement sideMenu;

    public void clickSideMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sideMenu.click();
    }

    @FindBy(xpath = "//input[@id='search']")
    WebElement searchEdit;

    public void serachItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    @FindBy(xpath = "(//a[@id='endpoint']/paper-item/span)[3]")
    WebElement bTrending;

    public void clickOnTrending() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sideMenu.click();
        Thread.sleep(500);
        bTrending.click();
        Thread.sleep(500);
    }

    @FindBy(xpath = "//paper-button[@aria-label='Search filters']/yt-formatted-string")
    WebElement sFilter;
    @FindBy(xpath = "//div[@title='Search for Last hour']/yt-formatted-string")
    WebElement lastHour;

    public void serachItemsLastHour() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            sFilter.click();
            Thread.sleep(500);
            lastHour.click();
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    @FindBy(xpath = "//div[@title='Search for Today']/yt-formatted-string")
    WebElement lastDay;

    public void serachItemsToday() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            sFilter.click();
            Thread.sleep(500);
            lastDay.click();
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    @FindBy(xpath = "//div[@title='Search for This week']/yt-formatted-string")
    WebElement lastWeek;

    public void serachItemsThisWeek() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            sFilter.click();
            Thread.sleep(500);
            lastWeek.click();
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    @FindBy(xpath = "//div[@title='Search for This month']/yt-formatted-string")
    WebElement lastMonth;

    public void serachItemsThisMonth() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            sFilter.click();
            Thread.sleep(500);
            lastMonth.click();
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    @FindBy(xpath = "//div[@title='Search for This year']/yt-formatted-string")
    WebElement lastYear;

    public void serachItemsThisYear() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            sFilter.click();
            Thread.sleep(500);
            lastYear.click();
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    @FindBy(xpath = "//div[@title='Sort by relevance']/yt-formatted-string")
    WebElement sortByRelevance;

    public void serachItemsSortByRelevance() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            sFilter.click();
            Thread.sleep(500);
            sortByRelevance.click();
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    @FindBy(xpath = "//div[@title='Sort by upload date']/yt-formatted-string")
    WebElement sortByUploadDate;

    public void serachItemsSortByUploadDate() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            sFilter.click();
            Thread.sleep(500);
            sortByUploadDate.click();
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    @FindBy(xpath = "//div[@title='Sort by view count']/yt-formatted-string")
    WebElement sortByViewCount;

    public void serachItemsSortByViewCount() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            sFilter.click();
            Thread.sleep(500);
            sortByViewCount.click();
            Thread.sleep(500);
            searchEdit.clear();
        }
    }

    @FindBy(xpath = "//div[@title='Sort by rating']/yt-formatted-string")
    WebElement sortByRating;

    public void serachItemsSortByRating() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            sFilter.click();
            Thread.sleep(500);
            sortByRating.click();
            Thread.sleep(500);
            searchEdit.clear();
        }
    }
}
