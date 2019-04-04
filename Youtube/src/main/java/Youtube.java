import base.CommonAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class Youtube extends CommonAPI {
    public String getTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return driver.getTitle();
    }

    public void goHomePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//div [@id='logo-icon-container']")).click();
    }

    public List<String> getTopNavBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<>();
        List<WebElement> listWE = driver.findElements(By.xpath("//div [@id='button']"));
        for (WebElement wE : listWE) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + wE.getTagName());
            list.add(wE.getText());
            System.out.println(wE.getTagName());
        }
        return list;
    }

    public void clickSideMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@id='guide-icon']")).click();
    }

    public void searchItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }

    public void clickOnTrending() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@id='guide-icon']")).click();
        driver.findElement(By.xpath("(//a[@id='endpoint']/paper-item/span)[3]")).click();
        Thread.sleep(500);
    }

    public void serachItemsLastHour() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@aria-label='Search filters']//yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@title='Search for Last hour']/yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }

    public void serachItemsToday() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@aria-label='Search filters']//yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@title='Search for Today']/yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }

    public void serachItemsThisWeek() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@aria-label='Search filters']//yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@title='Search for This week']/yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }

    public void serachItemsThisMonth() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@aria-label='Search filters']//yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@title='Search for This month']/yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }

    public void serachItemsThisYear() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@aria-label='Search filters']//yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@title='Search for This year']/yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }

    public void serachItemsSortByRelevance() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@aria-label='Search filters']//yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@title='Sort by relevance']/yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }

    public void serachItemsSortByUploadDate() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@aria-label='Search filters']//yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@title='Sort by upload date']/yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }

    public void serachItemsSortByViewCount() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@aria-label='Search filters']//yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@title='Sort by view count']/yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }

    public void serachItemsSortByRating() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items = ConnectToSqlDB.readDataBase("ItemList", "Items");
        for (String str : items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@aria-label='Search filters']//yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@title='Sort by rating']/yt-formatted-string")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }
}
