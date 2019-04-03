import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestTPage extends CommonAPI {
    @Test
    public void runLogUp() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.logup();
    }

    @Test
    public void runLogIn() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.login();
    }

    @Test
    public void runGoHome() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.login();
        tPage.goHomePage();
    }
    @Test
    public void runLogout() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.login();
        tPage.logout();
    }

    @Test
    public void runTopNavBar() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.login();
        tPage.getTopNavBar();
    }

    @Test
    public void runReadExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.readExcelFile();
    }

    @Test
    public void runClickTopNavBar() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.login();
        tPage.clickTopNavBar();
    }

    @Test
    public void runClickMomentNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.login();
        tPage.clickMomentNavBar();
    }

    @Test
    public void runSearchPeople() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.login();
        tPage.searchPeople();
    }

    @Test
    public void runSearchPhoto() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.login();
        tPage.searchPhoto();
    }

    @Test
    public void runSearchVideos() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.login();
        tPage.searchVideos();
    }

    @Test
    public void runSearchNews() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TPage tPage = PageFactory.initElements(driver, TPage.class);
        tPage.login();
        tPage.searchNews();
    }
}
