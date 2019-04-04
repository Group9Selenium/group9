import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class TestYoutube extends Youtube {
    @Test
    public void runGetTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getTitle(), "YouTube");
    }

    @Test
    public void runGohome() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goHomePage();
        Assert.assertEquals(driver.getTitle(), "YouTube");
    }

    @Test
    public void runGetTopNavBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = getTopNavBar();
        Assert.assertEquals(list.size(), 4);
    }

    @Test
    public void runClickSideMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSideMenu();
    }

    @Test
    public void runSearchItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchItems();
    }

    @Test
    public void runClickOnTrending() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnTrending();
    }

    @Test
    public void runSearchItemsLastHour() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        serachItemsLastHour();
    }

    @Test
    public void runSearchItemsToday() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        serachItemsToday();
    }

    @Test
    public void runSearchItemsThisWeek() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        serachItemsThisWeek();
    }

    @Test
    public void runSearchItemsThisMonth() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        serachItemsThisMonth();
    }

    @Test
    public void runSearchItemsThisYear() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        serachItemsThisYear();
    }

    @Test
    public void runSearchItemsSortByRelevance() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        serachItemsSortByRelevance();
    }

    @Test
    public void runSearchItemsSortByUploadDate() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        serachItemsSortByUploadDate();
    }

    @Test
    public void runSearchItemsSortByViewCount() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        serachItemsSortByViewCount();
    }

    @Test
    public void runSearchItemsSortByRating() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        serachItemsSortByRating();
    }
}
