package EbayElectronics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


import static base.CommonAPI.convertToString;

public class TestShopElectronics extends ShopElectronics {

    ShopElectronics shopElectronics;
    @BeforeMethod
    public void initElement() {
        shopElectronics = PageFactory.initElements(driver, ShopElectronics.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
    }
    //User should be able to click on Certified Refurbish
    @Test
    public void testCertifiedRefurbish(){
        shopElectronics.ClickViewElectronics();
        shopElectronics.ClickViewCertifiedRefurbish();
    }
    //User should be able to click on Laptop under $399
    @Test
    public void testLaptopUnder399(){
        shopElectronics.ClickViewElectronics();
        shopElectronics.ClickViewLaptopUnder399();
    }
    //User should be able to click on All tech deals
    @Test
    public void testAllTechDeals(){
        shopElectronics.ClickViewElectronics();
        shopElectronics.ClickViewAllTechDeals();
    }


}
