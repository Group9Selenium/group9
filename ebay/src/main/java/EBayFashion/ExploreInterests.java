package EBayFashion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExploreInterests extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"))
    public static WebElement ViewFashion;
    @FindBy(xpath = "//*[@id=\"w1-w3\"]/ul/li[1]/a")
    public static WebElement ViewWomensTrends;
    @FindBy(xpath = ("//*[@id=\"w1-w3\"]/ul/li[2]/a"))
    public static WebElement ViewWomensHeadToToeDenim;
    @FindBy(xpath = "//*[@id=\"w1-w3\"]/ul/li[3]/a")
    public static WebElement ViewWomensLuxeBags;
    @FindBy(xpath = ("//*[@id=\"w1-w3\"]/ul/li[5]/a"))
    public static WebElement ViewWomensBasic;
    @FindBy(xpath = "//*[@id=\"w1-w3\"]/ul/li[6]/a")
    public static WebElement ViewMakeUpLover;
    @FindBy(xpath = ("//*[@id=\"w1-w3\"]/ul/li[7]/a"))
    public static WebElement ViewMensSneaker;
    @FindBy(xpath = "//*[@id=\"w1-w3\"]/ul/li[8]/a")
    public static WebElement ViewMensStreetStyle;
    @FindBy(xpath = ("//*[@id=\"w1-w3\"]/ul/li[9]/a"))
    public static WebElement ViewMensBasics;
    @FindBy(xpath = "//*[@id=\"w1-w3\"]/ul/li[10]/a")
    public static WebElement ViewMensGrooming;

    public void ClickViewFashion() {
        ViewFashion.click();
    }
    public void ClickViewWomensTrends() {
        ViewFashion.click();
        ViewWomensTrends.click();
    }
    public void ClickViewWomensHeadToToeDenim() {
        ViewFashion.click();
        ViewWomensHeadToToeDenim.click();
    }
    public void ClickViewWomensBasic() {
        ViewFashion.click();
        ViewWomensBasic.click();
    }
    public void ClickViewWomensLuxeBags() {
        ViewFashion.click();
        ViewWomensLuxeBags.click();
    }
    public void ClickViewMensSneaker() {
        ViewFashion.click();
        ViewMensSneaker.click();
    }
    public void ClickViewMensStreetStyle() {
        ViewFashion.click();
        ViewMensStreetStyle.click();
    }
    public void ClickViewMensBasics() {
        ViewFashion.click();
        ViewMensBasics.click();
    }
    public void ClickViewMensGrooming() {
        ViewFashion.click();
        ViewMensGrooming.click();
    }
}
