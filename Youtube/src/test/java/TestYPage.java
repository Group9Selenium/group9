import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class TestYPage extends YPage {
    @Test
    public void runGohome() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.goHomePage();
        Assert.assertEquals(driver.getTitle(), "YouTube");
    }

    @Test
    public void runGetTopNavBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        List<String> list = yPage.getTopNavBar();
        Assert.assertEquals(list.size(), 4);
    }

    @Test
    public void runClickSideMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.clickSideMenu();
    }

    @Test
    public void runSearchItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.serachItems();
    }

    @Test
    public void runClickOnTrending() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.clickOnTrending();
    }

    @Test
    public void runSearchItemsLastHour() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.serachItemsLastHour();
    }

    @Test
    public void runSearchItemsToday() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.serachItemsToday();
    }

    @Test
    public void runSearchItemsThisWeek() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.serachItemsThisWeek();
    }

    @Test
    public void runSearchItemsThisMonth() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.serachItemsThisMonth();
    }

    @Test
    public void runSearchItemsThisYear() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.serachItemsThisYear();
    }

    @Test
    public void runSearchItemsSortByRelevance() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.serachItemsSortByRelevance();
    }

    @Test
    public void runSearchItemsSortByUploadDate() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.serachItemsSortByUploadDate();
    }

    @Test
    public void runSearchItemsSortByViewCount() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.serachItemsSortByViewCount();
    }

    @Test
    public void runSearchItemsSortByRating() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver, YPage.class);
        yPage.serachItemsSortByRating();
    }
}
