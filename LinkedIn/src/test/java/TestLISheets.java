import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class TestLISheets extends CommonAPI {
    @Test
    public void runReadSheet() throws IOException, InterruptedException, GeneralSecurityException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LISheets liSheets = PageFactory.initElements(driver, LISheets.class);
        List<String> list1 = liSheets.getTopNavBar();
        List<String> list2 = liSheets.getDataFromGSheet("LITopBar");
        Assert.assertEquals(list1, list2);
    }

    @Test
    public void runClickTopNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LISheets liSheets = PageFactory.initElements(driver, LISheets.class);
        liSheets.login();
        liSheets.clickTopNavBartop();
    }

    @Test
    public void runJobSearch() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LISheets liSheets = PageFactory.initElements(driver, LISheets.class);
        liSheets.login();
        liSheets.searchJobs();
    }

    @Test
    public void runSearchMyNetwork() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LISheets liSheets = PageFactory.initElements(driver, LISheets.class);
        liSheets.login();
        liSheets.searchMyNetwork();
    }

    @Test
    public void runSearchMessages() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LISheets liSheets = PageFactory.initElements(driver, LISheets.class);
        liSheets.login();
        liSheets.searchMyMessages();
    }

}
