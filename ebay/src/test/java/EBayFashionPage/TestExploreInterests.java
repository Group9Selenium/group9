package EBayFashionPage;

import EBayFashion.ExploreInterests;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExploreInterests extends ExploreInterests {
    ExploreInterests exploreInterests;
    @BeforeMethod
    public void initElement() {
        exploreInterests = PageFactory.initElements(driver, ExploreInterests.class);
    }
    //User should be able to click on view thrends
    @Test
    public void testViewWomensTrends() {
        exploreInterests.ClickViewWomensTrends();
    }
    //User should be able to click on womens head to denim
    @Test
    public void testViewWomensHeadToToeDenim() {
        exploreInterests.ClickViewWomensHeadToToeDenim();
    }
    //User should be able to click on womens luxe bags
    @Test
    public void testViewWomensLuxeBags() {
        exploreInterests.ClickViewWomensLuxeBags();
    }
    //User should be able to click on womens basic
    @Test
    public void testViewWomensBasic() {
        exploreInterests.ClickViewWomensBasic();
    }
    //User should be able to click on mens street style
    @Test
    public void testViewMensStreetStyle() {
        exploreInterests.ClickViewMensStreetStyle();
    }
    //User should be able to click on mens basics
    @Test
    public void testViewMensBasics() {
        exploreInterests.ClickViewMensBasics();
    }
    //User should be able to click on mens grooming
    @Test
    public void testViewMensGrooming() {
        exploreInterests.ClickViewMensGrooming();
    }
}
