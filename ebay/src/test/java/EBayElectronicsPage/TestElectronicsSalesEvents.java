package EBayElectronicsPage;

import EBayElectronics.ShopElectronicsSalesEvents;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


import static base.CommonAPI.convertToString;

public class TestElectronicsSalesEvents extends ShopElectronicsSalesEvents {
    ShopElectronicsSalesEvents shopElectronicsSalesEvents;
    @BeforeMethod
    public void initElement() {
        shopElectronicsSalesEvents = PageFactory.initElements(driver, ShopElectronicsSalesEvents.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
    }
    //User should be able to click on Certified Refurbish
    @Test
    public void testCertifiedRefurbish(){
        shopElectronicsSalesEvents.ClickViewElectronics();
        shopElectronicsSalesEvents.ClickViewCertifiedRefurbish();
    }
    //User should be able to click on Laptop under $399
    @Test
    public void testLaptopUnder399(){
        shopElectronicsSalesEvents.ClickViewElectronics();
        shopElectronicsSalesEvents.ClickViewLaptopUnder399();
    }
    //User should be able to click on All tech deals
    @Test
    public void testAllTechDeals(){
        shopElectronicsSalesEvents.ClickViewElectronics();
        shopElectronicsSalesEvents.ClickViewAllTechDeals();
    }


}
