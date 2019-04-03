import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class TestYPage extends YPage{
    @Test
    public void runGohome(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver,YPage.class);
        yPage.goHomePage();
        Assert.assertEquals(driver.getTitle(),"YouTube");
    }
    @Test
    public void runGetTopNavBar(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver,YPage.class);
        List<String> list =  yPage.getTopNavBar();
        Assert.assertEquals(list.size(),4);
    }
    @Test
    public void runClickSideMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver,YPage.class);
        yPage.clickSideMenu();
    }
    @Test
    public void runSearchItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        YPage yPage = PageFactory.initElements(driver,YPage.class);
        yPage.serachItems();
    }
}
