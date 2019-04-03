import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestLIPage extends CommonAPI {
    @Test
    public void runLogIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
    }

    @Test
    public void runLogout() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.logout();
    }

    @Test
    public void runLogInOut() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
        liPage.logout();
    }

    @Test
    public void runHomePage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
        liPage.goHomePage();
    }

    @Test
    public void runGetTopNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
        liPage.getTopNavBar();
    }

    @Test
    public void runReadExcelFile() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.readExcelFile();
    }

    @Test
    public void runClickTopNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
        liPage.clickTopNavBartop();
    }

    @Test
    public void runJobSearch() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
        liPage.searchJobs();
    }

    @Test
    public void runSearchMyNetwork() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
        liPage.searchMyNetwork();
    }

    @Test
    public void runSearchMessages() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
        liPage.searchMyMessages();
    }

    @Test
    public void runUploadFile() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
        liPage.uploadFile();
    }

    @Test
    public void runLogUp() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.logup();
    }

    @Test
    public void runDropDownItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
        liPage.dropDownListItems();
    }

    @Test
    public void runClickDropDownItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LIPage liPage = PageFactory.initElements(driver, LIPage.class);
        liPage.login();
        liPage.clickDropDownListItems();
    }
}
