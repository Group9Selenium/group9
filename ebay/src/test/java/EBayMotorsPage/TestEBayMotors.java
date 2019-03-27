package EBayMotorsPage;

import EBayMotors.EBayMotors;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEBayMotors extends EBayMotors {
    EBayMotors motors;
    @BeforeMethod
    public void initElement() {
        motors = PageFactory.initElements(driver, EBayMotors.class);
    }
    //User should be able to click on find parts
    @Test
    public void testViewFindParts() {
        motors.checkViewFindParts();
    }
    //User should be able to click on all parts
    @Test
    public void testViewAllParts() {
        motors.checkViewAllParts();
    }
    //User should be able to click on  car, truck and parts
    @Test
    public void testViewCarTruckParts() {
        motors.checkViewCarTruckParts();
    }
    //User should be able to click on wheel parts
    @Test
    public void testViewWheelParts() {
        motors.checkViewWheelParts();
    }
    //User should be able to click on motorcycle parts
    @Test
    public void testViewMotorCycleParts() {
        motors.checkViewMotorCycleParts();
    }
    //User should be able to click on ATV and UTV parts
    @Test
    public void testViewAtvUtvParts() {
        motors.checkViewAtvUtvParts();
    }
    //User should be able to click on Commercial Truck Parts
    @Test
    public void testViewCommercialTruckParts() {
        motors.checkViewCommercialTruckParts();
    }
    //User should be able to click on automotive tool display
    @Test
    public void testViewAutoMativeToolSupply() {
        motors.checkViewAutoMativeToolSupply();
    }
    //User should be able to click on car and truck
    @Test
    public void testViewCarTruck() {
        motors.checkViewCarTruck();
    }
    //User should be able to click on motorcycle
    @Test
    public void testViewMotorCycle() {
        motors.checkViewMotorCycle();
    }
    //User should be able to click on classics
    @Test
    public void testViewClassic() {
        motors.checkViewClassic();
    }
    //User should be able to click on collector cars
    @Test
    public void testViewCollectorCar() {
        motors.checkViewCollectorCar();
    }
    //User should be able to click on hybrid cars
    @Test
    public void ViewElectricHybrid() {
        motors.checkViewElectricHybrid();
    }
    //User should be able to click on electric hybrid
    @Test
    public void testViewExotic() {
        motors.checkViewExotic();
    }
    //User should be able to click on power sports
    @Test
    public void testViewPowerSport() {
        motors.checkViewPowerSport();
    }
    //User should be able to click on view other option
    @Test
    public void testViewOther() {
        motors.checkViewOther();
    }
    //User should be able to click on boat
    @Test
    public void testViewBoat() {
        motors.checkViewBoat();
    }
    //User should be able to click on motors daily deals
    @Test
    public void testViewMotorsDailyDeals() {
        motors.checkViewMotorsDailyDeals();
    }
    //User should be able to click on motors sales events
    @Test
    public void testViewMotorsSalesEvents() {
        motors.checkViewMotorsSalesEvents();
    }
    //User should be able to click on car care
    @Test
    public void testViewCarCare() {
        motors.checkViewCarCare();
    }
    //User should be able to click on digital manual
    @Test
    public void testViewDigitalManual() {
        motors.checkViewDigitalManual();
    }
    //User should be able to click on virtual tech
    @Test
    public void testViewVirtualTech() {
        motors.checkViewVirtualTech();
    }
    //User should be able to click on blog
    @Test
    public void testViewBlog() {
        motors.checkViewBlog();
    }
    //User should be able to click on parts hub
    @Test
    public void testViewPartsHub() {
        motors.checkViewPartsHub();
    }
    //User should be able to click on sellparts
    @Test
    public void testViewSellParts() {
        motors.checkViewSellParts();
    }
    //User should be able to click on sell vehicle
    @Test
    public void testViewSellVehicle() {
        motors.checkViewSellVehicle();
    }
    //User should be able to click on vehicles sales hub
    @Test
    public void testViewVehiclesSalesHub() {
        motors.checkViewVehiclesSalesHub();
    }
    //User should be able to click on send suggestion
    @Test
    public void testViewSendSuggestion() {
        motors.checkViewSendSuggestion();
    }
    //User should be able to click on what you think
    @Test
    public void testViewTellWhatYouThink() {
        motors.checkViewTellWhatYouThink();
    }
    //User should be able to click on ship tires
    @Test
    public void testViewShipTires() {
        motors.checkViewShipTires();
    }
}
