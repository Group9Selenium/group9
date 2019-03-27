package HomePage;

import MainPage.PageElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class TestPageElement extends PageElement {
    PageElement firstPage;
    @BeforeMethod
    public void initElement() {
        firstPage = PageFactory.initElements(driver, PageElement.class);
    }
    //User should be able to click on logo
    @Test
    public void testViewLogo() {
        firstPage.ClickViewLogo();
    }
    //User should be able to click on daily deals
    @Test
    public void testDailyDeals() {
        firstPage.ClickViewDailyDeals();
    }
    //User should be able to click on gift cards
    @Test
    public void testGiftCards() {
        firstPage.ClickGiftCards();
    }
    //User should be able to click on help and contacts
    @Test
    public void testHelpContact() {
        firstPage.ClickHelpContact();
    }
    //User should be able to click on hot seller
    @Test
    public void testSellHot() {
        firstPage.ClickSellHot();
    }
    ////User should be able to click on home button
    @Test
    public void testViewHome() {
        firstPage.ClickViewHome();
    }
    //User should be able to click on saved button
    @Test
    public void testViewSaved() {
        firstPage.ClickViewSaved();
    }
    //User should be able to click on motors button
    @Test
    public void testViewMotors() {
        firstPage.ClickViewMotors();
    }
    //User should be able to click on fashion button
    @Test
    public void testViewFashion() {
        firstPage.ClickViewFashion();
        driver.navigate().back();
    }
    //User should be able to click on electronics button
    @Test
    public void testElectronics() {
        firstPage.ClickViewElectronics();
        driver.navigate().back();
    }
    //User should be able to click on collectible button
    @Test
    public void testCollectible() {
        firstPage.ClickViewCollectibles();
        driver.navigate().back();
    }
    //User should be able to click on home garden button
    @Test
    public void testViewHomeGarden() {
        firstPage.ClickViewHomeGarden();
        driver.navigate().back();
        driver.close();
    }
    //User should be able to click on toys button
    @Test
    public void testViewToys() {
        firstPage.ClickViewToys();
        driver.navigate().back();
    }
    //User should be able to click on business industrial button
    @Test
    public void testBusinessIndustrial() {
        firstPage.ClickViewBusinessIndustrial();
        driver.navigate().back();
    }
    //User should be able to click on music button
    @Test
    public void testMusic() {
        firstPage.ClickViewMusic();
        driver.navigate().back();
    }
    //User should be able to click on deals button
    @Test
    public void testDeals() {
        firstPage.ClickViewDeals();
        driver.navigate().back();
    }
    //User should be able to click on under ten button
    @Test
    public void testUnderTen() {
        firstPage.ClickViewUnderTen();
        driver.navigate().back();
    }
    //User should be able to click on play pause button
    @Test
    public void testPlayPause() {
        firstPage.ClickViewPlayPause();
        driver.navigate().back();
    }
    //User should be able to click on active wear men button
    @Test
    public void testActiveWearMen() {
        firstPage.ClickViewActiveWearMen();
        driver.navigate().back();
    }
    //User should be able to click on active wear women button
    @Test
    public void testActiveWearWomen() {
        firstPage.ClickViewActiveWearWomen();
        driver.navigate().back();
    }
    //User should be able to click on find the beat button
    @Test
    public void testFindTheBeat() {
        firstPage.ClickViewFindTheBeat();
        driver.navigate().back();
    }
    //User should be able to click on track your progress button
    @Test
    public void testTrackProgress() {
        firstPage.ClickViewTrackProgress();
        driver.navigate().back();
        driver.close();
    }
    //User should be able to click on gear up button
    @Test
    public void testGearUp() {
        firstPage.ClickViewGearUp();
        driver.navigate().back();
    }
    //User should be able to click on juice it button
    @Test
    public void testJuiceIt() {
        firstPage.ClickViewJuiceIt();
        driver.navigate().back();
    }
    //User should be able to click on fuel your fitness button
    @Test
    public void testFuelYourFitness() {
        firstPage.ClickViewFuelYourFitness();
        driver.navigate().back();
    }
    //User should be able to click on daily deals
    @Test
    public void testDailyDealsAll() {
        firstPage.ClickViewDailyDealsAll();
        driver.navigate().back();
    }
    //User should be able to click on trending on ebay button
    @Test
    public void testTrendingOnEbay() {
        firstPage.ClickViewTrendingOnEbay();
        driver.navigate().back();
    }
    //User should be able to click on treat yourself button
    @Test
    public void testTreatYourself() {
        firstPage.ClickViewTreatYourself();
        driver.navigate().back();
    }
    //User should be able to click on featured sale button
    @Test
    public void testFeaturedSale() {
        firstPage.ClickViewFeaturedSale();
        driver.navigate().back();
    }
    //User should be able to click on editors pick button
    @Test
    public void testEditorsPick() {
        firstPage.ClickViewEditorsPick();
        driver.navigate().back();
    }
    //User should be able to click on love your look button
    @Test
    public void testLoveYourLook() {
        firstPage.ClickViewLoveYourLook();
        driver.navigate().back();
    }
}
