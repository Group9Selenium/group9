package EBayFashionPage;

import EBayFashion.SalesEvents;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSalesEvents extends SalesEvents {
    SalesEvents testSalesEvents;
    @BeforeMethod
    public void initElement() {
        testSalesEvents = PageFactory.initElements(driver, SalesEvents.class);
    }
    //User should be able to click on womens trends
    @Test
    public void testViewWomensTrends() {
        testSalesEvents.ClickViewSalesEvents();
    }
    //User should be able to click on fashion deals
    @Test
    public void testsViewFashionDeals() {
        testSalesEvents.ClickViewFashionDeals();
    }
    //User should be able to click on fashion fix signup
    @Test
    public void testViewFashionFIxSignUp() {
        testSalesEvents.ClickViewFashionFIxSignUp();
    }
}
