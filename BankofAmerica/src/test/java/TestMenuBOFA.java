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
    public void TestHomeLoansMenu(){
        homeLoansMenu();

    }
    @Test
    public void TestAutoLoansMenu(){
        autoLoansMenu();
    }
    @Test
    public void TestInvestingMenu(){
        investingMenu();
    }
    @Test
    public void TestSmallBusinessMenu() {
        smallBusinessMenu();

    }
    @Test
    public void TestPersonalMenu(){

        personalMenu();
    }

}


