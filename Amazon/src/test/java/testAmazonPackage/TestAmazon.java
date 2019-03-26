package testAmazonPackage;

import amazonpages.AmazonHome;
import base.CommonAPI;
import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestAmazon extends AmazonHome {
    @Test
    public void getTitle(){
        System.out.println(driver.getTitle());
    }
    /*AmazonHome amazonHome;
    ConnectToSqlDB mySqlData;
    ConnectToMongoDB mongoDbData;
    String excelPath = "../Amazon/src/test/resources/testForSelenium.xls";
    List<String> inLinks = new ArrayList<>();
    List<String> extLinks = new ArrayList<>();
    List<String> imageInfo = new ArrayList<>();
    private Object String;
*/
        /*@BeforeMethod
        public void initialize() {
            this.amazonHome = PageFactory.initElements(this.driver, AmazonHome.class);
            mySqlData = new ConnectToSqlDB();
            mongoDbData = new ConnectToMongoDB();
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
        }*/

        /*@Test(description = "search bar")
        public void testSearchForItems() {
            searchForItems("alexa");
            Assert.assertEquals(driver.getTitle(), "Amazon.com: alexa");
        }*/

    /*@Test(description = "mysql test")
    public void testSearchItemsSql() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = null;
        try {
            list = mySqlData.insertDataFromStringToSqlTable(String);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String s : list) {
            amazonHome.searchForItems(s);
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + " " + s);
        }
    }*/

    /*@Test(description = "mongo database")
    public void testSearchForItemsMongo() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = (List<String>) mongoDbData.readStudentListFromMongoDB();
        for (String s : list) {
            amazonHome.searchForItems(s);
        }
    }*/

    /*@Test(description = "search button")
    public void testSearchButton() {
        amazonHome.searchButton("laptops");
    }

    @Test(description = "search results")
    public void testSearchResults() {
        String item = "iphones";
        System.out.println(amazonHome.searchResults(item) + " " + item);
    }

    @Test(description = "dropdown test1")
    public void testSetDropdown() {
        boolean checkTitle = true;
        Assert.assertEquals(amazonHome.setDropdown().endsWith("AmazonFresh"), checkTitle);
    }

    @Test(description = "dropdown options")
    public void testGetDropdownOptions() {
        List<WebElement> options = amazonHome.getDropdownOptions();
        for (WebElement element : options) {
            System.out.println(element.getText());
        }
    }

    @Test(description = "sign in")
    public void testSignInLink() {
        amazonHome.signInLink();
        String signInPageTitle = "Amazon Sign In";
        Assert.assertEquals(driver.getTitle(), signInPageTitle);
    }

    *//*@DataProvider(name = "signInExcelData")
    public Object[][] signInData() throws IOException {
        Object[][] arrayExcelData = excelPath();
        return arrayExcelData;
    }

    private Object[][] excelPath() {
    }*/

    @Test(dataProvider = "signInExcelData")
    public void testInvalidAccountSignIn(String email, String pwd) {
        System.out.println(invalidAccountSignIn(email, pwd));
    }

    //5
    @Test(description = "navigation")
    public void testNavigation() {
        String subUrl = "https://www.google.com/";
        driver.navigate().to(subUrl);
        driver.navigate().back();
        driver.navigate().forward();
        Assert.assertEquals(driver.getCurrentUrl(), subUrl);
    }

    @Test(description = "?")
    public void testClickLangSettings() {
        clickLangSettings();
    }

    @Test(description = "mouse hover your list link")
    public void testYourLists() throws Exception {
        System.out.println(hoverOverAccountsAndSelect());

    }

    @Test(description = "checkboxes")
    public void testCheckboxesInGiftCards() throws Exception {
        checkboxesInGiftCards();
    }

    @Test(description = "form, radiobuttons, text area")
    public void testAdFeedbackWindow() {
        adFeedbackWindow();
    }

    @Test(description = "web table")
    public void testPrimePageTable() {
        primePageTable();
    }

    @Test(description = "tabs")
    public void testGetPrimePageTabs() {
        getPrimePageTabs();
    }

    @Test(description = "your account")
    public void testYourAccountLists() {
        yourAccountLinks();
    }

    @Test(description = "try prime")
    public void testPrimeLink() {
        primeLink();
        Assert.assertEquals(driver.getTitle(), "Prime Delivery");
    }

    @Test(description = "Add to cart")
    public void testAddToCart() throws Exception {
        addToCart();
    }

    @Test(description = "iframe")
    public void testIFrameExample() throws Exception {
        iFrameExample();
    }

    @Test(description = "top right link")
    public void testUpperRightLink() {
        upperRightLink();
    }
}