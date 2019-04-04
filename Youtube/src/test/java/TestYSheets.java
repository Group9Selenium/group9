import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestYSheets  extends YSheets {
    @Test
    public void runSearchItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YSheets ySheets = PageFactory.initElements(driver, YSheets.class);
        ySheets.serachItems();
    }

    @Test
    public void runSearchItemsLastHour() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YSheets ySheets = PageFactory.initElements(driver, YSheets.class);
        ySheets.serachItemsLastHour();
    }

    @Test
    public void runSearchItemsToday() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YSheets ySheets = PageFactory.initElements(driver, YSheets.class);
        ySheets.serachItemsToday();
    }

    @Test
    public void runSearchItemsThisWeek() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YSheets ySheets = PageFactory.initElements(driver, YSheets.class);
        ySheets.serachItemsThisWeek();
    }

    @Test
    public void runSearchItemsThisMonth() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YSheets ySheets = PageFactory.initElements(driver, YSheets.class);
        ySheets.serachItemsThisMonth();
    }

    @Test
    public void runSearchItemsThisYear() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YSheets ySheets = PageFactory.initElements(driver, YSheets.class);
        ySheets.serachItemsThisYear();
    }

    @Test
    public void runSearchItemsSortByRelevance() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YSheets ySheets = PageFactory.initElements(driver, YSheets.class);
        ySheets.serachItemsSortByRelevance();
    }

    @Test
    public void runSearchItemsSortByUploadDate() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YSheets ySheets = PageFactory.initElements(driver, YSheets.class);
        ySheets.serachItemsSortByUploadDate();
    }

    @Test
    public void runSearchItemsSortByViewCount() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YSheets ySheets = PageFactory.initElements(driver, YSheets.class);
        ySheets.serachItemsSortByViewCount();
    }

    @Test
    public void runSearchItemsSortByRating() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YSheets ySheets = PageFactory.initElements(driver, YSheets.class);
        ySheets.serachItemsSortByRating();
    }
}
