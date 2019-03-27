package EBayFashionPage;

import EBayFashion.TopBrands;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTopBrands extends TopBrands {
    TopBrands topBrands;
    @BeforeMethod
    public void initElement() {
        topBrands = PageFactory.initElements(driver, TopBrands.class);
    }
    //User should be able to click on Adidas
    @Test
    public void testViewAdidas() {
        topBrands.ClickViewAdidas();
        driver.navigate().back();
    }
    //User should be able to click on Air Jordan
    @Test
    public void testViewAirJordan() {
        topBrands.ClickViewAirJordan();
    }
    //User should be able to click on Anthropologie
    @Test
    public void testViewAnthropologie() {
        topBrands.ClickViewAnthropologie();
    }
    //User should be able to click on Calvin Klein
    @Test
    public void testViewCalvinKlein() {
        topBrands.ClickViewCalvinKlein();
    }
    //User should be able to click on Chanel
    @Test
    public void testViewChanel() {
        topBrands.ClickViewChanel();
    }
    //User should be able to click on Coach
    @Test
    public void testViewCoach() {
        topBrands.ClickViewCoach();
    }
    //User should be able to click on David Yurman
    @Test
    public void testViewDavidYurman() {
        topBrands.ClickViewDavidYurman();
    }
    //User should be able to click on Free People
    @Test
    public void testViewFreePeople() {
        topBrands.ClickViewFreePeople();
        driver.navigate().back();
    }
    //User should be able to click on Gucci
    @Test
    public void testViewGucci() {
        topBrands.ClickViewGucci();
    }
    //User should be able to click on Invicta
    @Test
    public void testViewInvicta() {
        topBrands.ClickViewInvicta();
        driver.navigate().back();
    }
    //User should be able to click on JCrew
    @Test
    public void testViewJCrew() {
        topBrands.ClickViewJCrew();
        driver.navigate().back();
    }
    //User should be able to click on Lewis
    @Test
    public void testViewLevis() {
        topBrands.ClickViewLevis();
        driver.navigate().back();
    }
    //User should be able to click on Louis Vuitton
    @Test
    public void testViewLouisVuitton() {
        topBrands.ClickViewLouisVuitton();
    }
    //User should be able to click on LuluMelon
    @Test
    public void testViewLuluMelon() {
        topBrands.ClickViewLuluMelon();
        driver.navigate().back();
    }
    //User should be able to click on MadeWell
    @Test
    public void testViewMadeWell() {
        topBrands.ClickViewMadeWell();
        driver.navigate().back();
        driver.close();
    }
    //User should be able to click on MichaelKors
    @Test
    public void testViewMichaelKors() {
        topBrands.ClickViewMichaelKors();
    }
    //User should be able to click on Nike
    @Test
    public void testViewNike() {
        topBrands.ClickViewNike();
    }
    //User should be able to click on Omega
    @Test
    public void testViewOmega() {
        topBrands.ClickViewOmega();
        driver.navigate().back();
        driver.close();
    }
    //User should be able to click on Ralph Lauren
    @Test
    public void testViewRalphLauren() {
        topBrands.ClickViewRalphLauren();
    }
    //User should be able to click on RayBan
    @Test
    public void testViewRayBan() {
        topBrands.ClickViewRayBan();
    }
    //User should be able to click on Supreme
    @Test
    public void testViewSupreme() {
        topBrands.ClickViewSupreme();
    }
    //User should be able to click on Rolex
    @Test
    public void testViewRolex() {
        topBrands.ClickViewRolex();
    }
    //User should be able to click on Tory Burch
    @Test
    public void testViewToryBurch() {
        topBrands.ClickViewToryBurch();
    }
    //User should be able to click on Under Armor
    @Test
    public void testViewUnderArmour() {
        topBrands.ClickViewUnderArmour();
    }
    //User should be able to click on Victoria Secret
    @Test
    public void testViewVictoriaSecret() {
        topBrands.ClickViewVictoriaSecret();
    }
    //User should be able to click on Zara
    @Test
    public void testViewZara() {
        topBrands.ClickViewZara();
        driver.navigate().back();
    }
}
