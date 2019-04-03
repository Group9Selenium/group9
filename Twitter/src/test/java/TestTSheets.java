import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class TestTSheets extends CommonAPI {

    @Test
    public void runClickTopNavBar() throws InterruptedException, IOException, GeneralSecurityException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TSheets tSheets = PageFactory.initElements(driver, TSheets.class);
        tSheets.login();
        tSheets.clickTopNavBar();
    }

    @Test
    public void runSearchPeople() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TSheets tSheets = PageFactory.initElements(driver, TSheets.class);
        tSheets.login();
        tSheets.searchPeople();
    }

    @Test
    public void runReadSheet() throws IOException, InterruptedException, GeneralSecurityException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TSheets tSheets = PageFactory.initElements(driver, TSheets.class);
        List<String> list1 = tSheets.getTopNavBar();
        List<String> list2 = tSheets.getDataFromGSheet("TTopBar");
        Assert.assertEquals(list1, list2);
    }

    @Test
    public void runSearchPhoto() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TSheets tSheets = PageFactory.initElements(driver, TSheets.class);
        tSheets.login();
        tSheets.searchPhoto();
    }

    @Test
    public void runSearchVideos() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TSheets tSheets = PageFactory.initElements(driver, TSheets.class);
        tSheets.login();
        tSheets.searchVideos();
    }

    @Test
    public void runSearchNews() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TSheets tSheets = PageFactory.initElements(driver, TSheets.class);
        tSheets.login();
        tSheets.searchNews();
    }
}