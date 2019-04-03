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
    @FindBy(xpath="//div [@id='button']")
    List<WebElement> topNavBar;
    public List<String> getTopNavBar(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<>();
        for (WebElement wE: topNavBar) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+", "+wE.getTagName());
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
        List<String> items= ConnectToSqlDB.readDataBase("ItemList","Items");
        for (String str :items) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+", "+ str);
            searchEdit.sendKeys(str, Keys.ENTER);
            Thread.sleep(500);
            searchEdit.clear();
        }
    }
}
