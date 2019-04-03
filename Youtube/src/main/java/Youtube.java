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
    public void serachItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> items= ConnectToSqlDB.readDataBase("ItemList","Items");
        for (String str :items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+", "+ str);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).clear();
        }
    }
}
