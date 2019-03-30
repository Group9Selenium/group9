import amazonpages.HomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends CommonAPI {

    String homepageUrl = "https://www.amazon.com/";
    HomePage homePage;

    @Test
    public void testUserCanNavigateToHomePage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.homepageUrl);
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    @Test
    public void testSearchBar(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.homepageUrl);
        homePage.setSearchBox("Laptops");
    }




}
