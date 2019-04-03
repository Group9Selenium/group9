import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class TestYoutube extends Youtube{
    @Test
    public void runGetTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getTitle(),"YouTube");
    }
    @Test
    public void runGohome(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goHomePage();
        Assert.assertEquals(driver.getTitle(),"YouTube");
    }
    @Test
    public void runGetTopNavBar(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = getTopNavBar();
        Assert.assertEquals(list.size(),4);
    }
    @Test
    public void runClickSideMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSideMenu();
    }
    @Test
    public void runSearchItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        serachItems();
    }
}
