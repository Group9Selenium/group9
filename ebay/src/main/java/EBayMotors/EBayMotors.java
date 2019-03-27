package EBayMotors;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EBayMotors extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li/a")
    public static WebElement ViewFindParts;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[1]/a")
    public static WebElement ViewAllParts;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[2]/a")
    public static WebElement ViewCarTruckParts;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[3]/a")
    public static WebElement ViewWheelParts;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[4]/a")
    public static WebElement ViewMotorCycleParts;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[5]/a")
    public static WebElement ViewAtvUtvParts;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[6]/a")
    public static WebElement ViewCommercialTruckParts;
    @FindBy(xpath = "//*[@id=\"w1-w1\"]/ul/li[7]/a")
    public static WebElement ViewAutoMativeToolSupply;
    @FindBy(xpath = "//*[@id=\"w1-w2\"]/ul/li[1]/a")
    public static WebElement ViewCarTruck;
    @FindBy(xpath = "//*[@id=\"w1-w2\"]/ul/li[2]/a")
    public static WebElement ViewMotorCycle;
    @FindBy(xpath = "//*[@id=\"w1-w2\"]/ul/li[3]/a")
    public static WebElement ViewClassic;
    @FindBy(xpath = "//*[@id=\"w1-w2\"]/ul/li[4]/a")
    public static WebElement ViewCollectorCar;
    @FindBy(xpath = "//*[@id=\"w1-w2\"]/ul/li[5]/a")
    public static WebElement ViewElectricHybrid;
    @FindBy(xpath = "//*[@id=\"w1-w2\"]/ul/li[6]/a")
    public static WebElement ViewExotic;
    @FindBy(xpath = "//*[@id=\"w1-w2\"]/ul/li[7]/a")
    public static WebElement ViewPowerSport;
    @FindBy(xpath = "//*[@id=\"w1-w2\"]/ul/li[8]/a")
    public static WebElement ViewOther;
    @FindBy(xpath = "//*[@id=\"w1-w2\"]/ul/li[9]/a")
    public static WebElement ViewBoat;
    @FindBy(xpath = "//*[@id=\"w1-w3\"]/ul/li[1]/a")
    public static WebElement ViewMotorsDailyDeals;
    @FindBy(xpath = "//*[@id=\"w1-w3\"]/ul/li[2]/a")
    public static WebElement ViewMotorsSalesEvents;
    @FindBy(xpath = "//*[@id=\"w1-w4\"]/ul/li[1]/a")
    public static WebElement ViewCarCare;
    @FindBy(xpath = "//*[@id=\"w1-w4\"]/ul/li[2]/a")
    public static WebElement ViewDigitalManual;
    @FindBy(xpath = "//*[@id=\"w1-w4\"]/ul/li[3]/a")
    public static WebElement ViewVirtualTech;
    @FindBy(xpath = "//*[@id=\"w1-w5\"]/ul/li/a")
    public static WebElement ViewShipTires;
    @FindBy(xpath = "//*[@id=\"w1-w6\"]/ul/li/a")
    public static WebElement ViewBlog;
    @FindBy(xpath = "//*[@id=\"w1-w7\"]/ul/li[1]/a")
    public static WebElement ViewPartsHub;
    @FindBy(xpath = "//*[@id=\"w1-w7\"]/ul/li[2]/a")
    public static WebElement ViewSellParts;
    @FindBy(xpath = "//*[@id=\"w1-w7\"]/ul/li[3]/a")
    public static WebElement ViewSellVehicle;
    @FindBy(xpath = "//*[@id=\"w1-w7\"]/ul/li[4]/a")
    public static WebElement ViewVehiclesSalesHub;
    @FindBy(xpath = "//*[@id=\"w1-w8\"]/ul/li[1]/a")
    public static WebElement ViewSendSuggestion;
    @FindBy(xpath = "//*[@id=\"w1-w8\"]/ul/li[2]/a")
    public static WebElement ViewTellWhatYouThink;
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"))
    public static WebElement ViewMotors;

    public void ClickViewMotors() {
        ViewMotors.click();
    }
    public void checkViewFindParts() {
        ViewMotors.click();
        ViewFindParts.click();
    }
    public void checkViewAllParts() {
        ViewMotors.click();
        ViewAllParts.click();
    }
    public void checkViewCarTruckParts() {
        ViewMotors.click();
        ViewCarTruckParts.click();
    }
    public void checkViewWheelParts() {
        ViewMotors.click();
        ViewWheelParts.click();
    }
    public void checkViewMotorCycleParts() {
        ViewMotors.click();
        ViewMotorCycleParts.click();
    }
    public void checkViewAtvUtvParts() {
        ViewMotors.click();
        ViewAtvUtvParts.click();
    }
    public void checkViewCommercialTruckParts() {
        ViewMotors.click();
        ViewCommercialTruckParts.click();
    }
    public void checkViewAutoMativeToolSupply() {
        ViewMotors.click();
        ViewAutoMativeToolSupply.click();
    }
    public void checkViewCarTruck() {
        ViewMotors.click();
        ViewCarTruck.click();
    }
    public void checkViewMotorCycle() {
        ViewMotors.click();
        ViewMotorCycle.click();
    }
    public void checkViewClassic() {
        ViewMotors.click();
        ViewClassic.click();
    }
    public void checkViewCollectorCar() {
        ViewMotors.click();
        ViewCollectorCar.click();
    }
    public void checkViewElectricHybrid() {
        ViewMotors.click();
        ViewElectricHybrid.click();
    }
    public void checkViewExotic() {
        ViewMotors.click();
        ViewExotic.click();
    }
    public void checkViewPowerSport() {
        ViewMotors.click();
        ViewPowerSport.click();
    }
    public void checkViewOther() {
        ViewMotors.click();
        ViewOther.click();
    }
    public void checkViewBoat() {
        ViewMotors.click();
        ViewBoat.click();
    }
    public void checkViewMotorsDailyDeals() {
        ViewMotors.click();
        ViewMotorsDailyDeals.click();
    }
    public void checkViewMotorsSalesEvents() {
        ViewMotors.click();
        ViewMotorsSalesEvents.click();
    }
    public void checkViewCarCare() {
        ViewMotors.click();
        ViewCarCare.click();
    }
    public void checkViewDigitalManual() {
        ViewMotors.click();
        ViewDigitalManual.click();
    }
    public void checkViewVirtualTech() {
        ViewMotors.click();
        ViewVirtualTech.click();
    }
    public void checkViewBlog() {
        ViewMotors.click();
        ViewBlog.click();
    }
    public void checkViewPartsHub() {
        ViewMotors.click();
        ViewPartsHub.click();
    }
    public void checkViewSellParts() {
        ViewMotors.click();
        ViewSellParts.click();
    }
    public void checkViewSellVehicle() {
        ViewMotors.click();
        ViewSellVehicle.click();
    }
    public void checkViewVehiclesSalesHub() {
        ViewMotors.click();
        ViewVehiclesSalesHub.click();
    }
    public void checkViewSendSuggestion() {
        ViewMotors.click();
        ViewSendSuggestion.click();
    }
    public void checkViewTellWhatYouThink() {
        ViewMotors.click();
        ViewTellWhatYouThink.click();
    }
    public void checkViewShipTires() {
        ViewMotors.click();
        ViewShipTires.click();
    }
}
