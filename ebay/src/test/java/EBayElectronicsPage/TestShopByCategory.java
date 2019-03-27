package EBayElectronicsPage;

import EBayElectronics.ShopByCategory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class TestShopByCategory extends ShopByCategory {
    ShopByCategory shopByCategory;
    @BeforeMethod
    public void initElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        shopByCategory = PageFactory.initElements(driver, ShopByCategory.class);
    }
    //User should be able to click on Camera Photo
    @Test
    public void testCameraPhoto() {
        shopByCategory.ClickViewElectronics();
        shopByCategory.ClickViewCameraPhoto();
    }
    //User should be able to click on cell phone and accessories
    @Test
    public void testCellPhone() {
        shopByCategory.ClickViewElectronics();
        shopByCategory.ClickViewCellPhone();
    }
    //User should be able to click on Computer Tablets
    @Test
    public void testComputerTablet() {
        shopByCategory.ClickViewElectronics();
        shopByCategory.ClickViewComputerTablet();
    }
    //User should be able to click on TV Video
    @Test
    public void testTvVideo() {
        shopByCategory.ClickViewElectronics();
        shopByCategory.ClickViewTvVideo();
    }
    //User should be able to click on Video Games
    @Test
    public void testVideoGames() {
        shopByCategory.ClickViewElectronics();
        shopByCategory.ClickViewVideoGames();
    }
}
