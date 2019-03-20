import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestMenuBOFA extends MenuBOFA {
    @Test
    public void TestSearchUrl() {
        searchUrl();

    }

    @Test
    public void TestCheckingMenu() {
        checkingMenu();


    }

    @Test
    public void TestSavingsMenu() {
        savingsMenu();


    }

    @Test
    public void TestCreditCardMenu() {
        creditCardMenu();


    }
    @Test
    public void homeLoansMenu(){

    }
}


