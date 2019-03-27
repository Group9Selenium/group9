package EBayFashionPage;
import EBayFashion.Category;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCategory extends Category {
    Category category;
    @BeforeMethod
    public void initElement() {
        category = PageFactory.initElements(driver, Category.class);
    }
    //User should be able to click on logo
    @Test
    public void testViewLogo() {
        category.ClickViewFashion();
    }
    //User should be able to click on mens clothing
    @Test
    public void testViewMensClothing() {
        category.ClickViewMensClothing();
    }
    //User should be able to click on shoes
    @Test
    public void testClickViewShoes() {
        category.ClickViewShoes();
    }
    //User should be able to click on jewelry
    @Test
    public void testClickViewJewelry() {
        category.ClickViewJewelry();
    }
    //User should be able to click on watches
    @Test
    public void testViewWatches() {
        category.ClickViewWatches();
    }
    //User should be able to click on handbag accessories
    @Test
    public void testViewHandbagAccessories() {
        category.ClickViewHandbagAccessories();
    }
    //User should be able to click on beauty
    @Test
    public void testViewBeauty() {
        category.ClickViewBeauty();
    }
    //User should be able to click on health
    @Test
    public void testViewHealth() {
        category.ClickViewHealth();
    }
    //User should be able to click on kids and baby
    @Test
    public void testViewKidsBaby() {
        category.ClickViewKidsBaby();
    }
    //User should be able to click on vintage
    @Test
    public void testViewVintage() {
        category.ClickViewVintage();
    }
    //User should be able to click on ethnic clothing
    @Test
    public void testViewCultureEthnicClothing() {
        category.ClickViewCultureEthnicClothing();
    }
    //User should be able to click on fan clothing
    @Test
    public void testViewSportsFanClothing() {
        category.ClickViewSportsFanClothing();
    }
}
