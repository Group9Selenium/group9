import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class TestFBSheets extends CommonAPI {
    @Test
    public void runLogin() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBSheets fbPage = PageFactory.initElements(driver, FBSheets.class);
        fbPage.login();
    }

    @Test
    public void runSearchFriends() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBSheets fbPage = PageFactory.initElements(driver, FBSheets.class);
        fbPage.searchFriends();
    }

    @Test
    public void runclickLeftNavBartop() throws InterruptedException, IOException, GeneralSecurityException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBSheets fbPage = PageFactory.initElements(driver, FBSheets.class);
        fbPage.clickLeftNavBartop();
    }

    @Test
    public void runSearchMarketPlace() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBSheets fbPage = PageFactory.initElements(driver, FBSheets.class);
        fbPage.searchMarketPlace();
    }
    @Test
    public void runSearchMarketPlaceGroups() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBSheets fbPage = PageFactory.initElements(driver, FBSheets.class);
        fbPage.searchMarketPlaceGroups();
    }

    @Test
    public void runSearchMarketPlaceStores() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBSheets fbPage = PageFactory.initElements(driver, FBSheets.class);
        fbPage.searchMarketPlaceStores();
    }

    @Test
    public void runReadSheet() throws IOException, InterruptedException, GeneralSecurityException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBSheets fbPage = PageFactory.initElements(driver, FBSheets.class);
        List<String> list1 = fbPage.leftNavBartop();
        List<String> list2 = fbPage.getDataFromGSheet("LeftNavBartop");
        Assert.assertEquals(list1, list2);
    }

    @Test
    public void getListMarketPlaceNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBSheets fbPage = PageFactory.initElements(driver, FBSheets.class);
        List<String> list1 = fbPage.marketplaceNavBar();
        List<String> list2 = fbPage.getDataFromGSheet("MarketPlace");
        ;
        Assert.assertEquals(list1, list2);
    }

    @Test
    public void runClickMarketplaceNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBSheets fbPage = PageFactory.initElements(driver, FBSheets.class);
        fbPage.clickMarketplaceNavBar();
    }

    @Test
    public void runSearchJob() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FBSheets fbPage = PageFactory.initElements(driver, FBSheets.class);
        fbPage.searchJobs();
    }
}
