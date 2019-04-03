import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class TestFBPage extends CommonAPI {
    @Test
    public void runLogin() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.login();
    }

    @Test
    public void runIsLogedin() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        boolean b = fbPage.isLogedin();
        Assert.assertEquals(b, false);
    }

    @Test
    public void runLogout() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.login();
        fbPage.logout();
    }

    @Test
    public void runLogup() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.logup();
    }

    @Test
    public void runNewFeed() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.newFeed();
    }

    @Test
    public void runSearchFriends() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.searchFriends();
    }

    @Test
    public void runLefNavBartop() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.leftNavBartop();
    }

    @Test
    public void rubGoHome() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.goHomePage();
    }

    @Test
    public void runclickLeftNavBartop() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.clickLeftNavBartop();
    }

    @Test
    public void runLeftNavBarButtom() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        List<String> list1 = fbPage.leftNavBarBottum();
        Assert.assertEquals(21, list1.size());
    }

    @Test
    public void runUploadFile() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.uploadFile();
    }

    @Test
    public void runSearchMarketPlace() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.searchMarketPlace();
    }
    @Test
    public void runSearchMarketPlaceGroups() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.searchMarketPlaceGroups();
    }

    @Test
    public void runSearchMarketPlaceStores() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.searchMarketPlaceStores();
    }

    @Test
    public void getListMarketPlaceNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        List<String> btnAction = fbPage.readExcelFile(1);
        List<String> searhCr = fbPage.marketplaceNavBar();
        Assert.assertEquals(btnAction, searhCr);
    }

    @Test
    public void runClickMarketplaceNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.clickMarketplaceNavBar();
    }

    @Test
    public void runSearchJob() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBPage fbPage = PageFactory.initElements(driver, FBPage.class);
        fbPage.searchJobs();
    }
}
