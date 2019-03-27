package MainPage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class PageElement extends CommonAPI {
    @FindBy(xpath = ("//a[@href='https://www.ebay.com/']"))
    public static WebElement ViewLogo;
    public void ClickViewLogo() {
        ViewLogo.click();
    }
    @FindBy(xpath = ("//a[@href='https://www.ebay.com/deals' and @class='gh-p']"))
    public static WebElement ViewDailyDeals;
    public void ClickViewDailyDeals() {
        ViewDailyDeals.click();
    }
    @FindBy(xpath = ("//a[@href=' https://www.ebay.com/rpp/gift-cards']"))
    public static WebElement ViewGiftCards;
    public void ClickGiftCards() {
        ViewGiftCards.click();
    }
    @FindBy(xpath = ("//a[@href='https://ocsnext.ebay.com/ocs/home' and @class='gh-p']"))
    public static WebElement ViewHelpContact;
    public void ClickHelpContact() {
        ViewHelpContact.click();
    }
    @FindBy(xpath = ("//img[@title='Sell What s Hot. Make More Cash.']"))
    public static WebElement ViewSellHot;
    public void ClickSellHot() {
        ViewSellHot.click();
    }
    @FindBy(xpath = ("//a[@href='https://www.ebay.com/']"))
    public static WebElement ViewHome;
    public void ClickViewHome() {
        ViewHome.click();
    }
    @FindBy(xpath = ("//a[@href='/feed']"))
    public static WebElement ViewSaved;
    public void ClickViewSaved() {
        ViewSaved.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"))
    public static WebElement ViewMotors;
    public void ClickViewMotors() {
        ViewMotors.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"))
    public static WebElement ViewFashion;
    public void ClickViewFashion() {
        ViewFashion.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"))
    public static WebElement ViewElectronics;
    public void ClickViewElectronics() {
        ViewElectronics.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"))
    public static WebElement ViewCollectibles;
    public void ClickViewCollectibles() {
        ViewLogo.click();
    }@FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a"))
    public static WebElement ViewHomeGarden;
    public void ClickViewHomeGarden() {
        ViewHomeGarden.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a"))
    public static WebElement ViewSportingGoods;
    public void ClickViewSportingGoods() {
        ViewSportingGoods.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[9]"))
    public static WebElement ViewToys;
    public void ClickViewToys() {
        ViewToys.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a"))
    public static WebElement ViewBusinessIndustrial;
    public void ClickViewBusinessIndustrial() { ViewBusinessIndustrial.click();}
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a"))
    public static WebElement ViewMusic;
    public void ClickViewMusic() {
        ViewLogo.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[12]/a"))
    public static WebElement ViewDeals;
    public void ClickViewDeals() {
        ViewDeals.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[13]/a"))
    public static WebElement ViewUnderTen;
    public void ClickViewUnderTen() {ViewUnderTen.click(); }
    @FindBy(xpath = ("//*[@id=\"rtm_list1\"]/div/div/button[2]"))
    public static WebElement ViewPlayPause;
    public void ClickViewPlayPause() {
        ViewPlayPause.click();
    }
    @FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[1]/a/h3"))
    public static WebElement ViewActiveWearMen;
    public void ClickViewActiveWearMen() {
        ViewActiveWearMen.click();
    }
    @FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[2]/a/h3"))
    public static WebElement ViewActiveWearWomen;
    public void ClickViewActiveWearWomen() {
        ViewActiveWearWomen.click();
    }
    @FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[3]/a/h3"))
    public static WebElement ViewFindTheBeat;
    public void ClickViewFindTheBeat() {
        ViewFindTheBeat.click();
    }@FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[4]/a/h3"))
    public static WebElement ViewTrackProgress;
    public void ClickViewTrackProgress() {
        ViewTrackProgress.click();
    }@FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[5]/a/h3"))
    public static WebElement ViewGearUp;
    public void ClickViewGearUp() {
        ViewGearUp.click();
    }@FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[6]/a/h3"))
    public static WebElement ViewJuiceIt;
    public void ClickViewJuiceIt() {
        ViewJuiceIt.click();
    }@FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[7]/a/h3"))
    public static WebElement ViewFuelYourFitness;
    public void ClickViewFuelYourFitness() {
        ViewFuelYourFitness.click();
    }@FindBy(xpath = ("//*[@id=\"items_list1\"]/div[1]/div/div[2]/a"))
    public static WebElement ViewDailyDealsAll;
    public void ClickViewDailyDealsAll() {
        ViewDailyDealsAll.click();
    }@FindBy(xpath = ("//*[@id=\"topics_list1\"]/div[1]/div/div[2]/a"))
    public static WebElement ViewTrendingOnEbay;
    public void ClickViewTrendingOnEbay() {ViewTrendingOnEbay.click();}
    @FindBy(xpath = ("//*[@id=\"rtm_list3\"]/div/div/div[2]/a/div[2]"))
    public static WebElement ViewTreatYourself;
    public void ClickViewTreatYourself() {
        ViewTreatYourself.click();
    }
    @FindBy(xpath = ("//*[@id=\"events_list1\"]/div[1]/div/div[2]/a"))
    public static WebElement ViewFeaturedSale;
    public void ClickViewFeaturedSale() {
        ViewFeaturedSale.click();
    }
    @FindBy(xpath = ("//*[@id=\"events_list2\"]/div[1]/div/div[2]/a"))
    public static WebElement ViewEditorsPick;
    public void ClickViewEditorsPick() {
        ViewEditorsPick.click();
    }
    @FindBy(xpath = ("//*[@id=\"rtm_list4\"]/div/div[2]/a/div[2]"))
    public static WebElement ViewLoveYourLook;
    public void ClickViewLoveYourLook() {
        ViewLoveYourLook.click();
    }
}
