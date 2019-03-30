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
    @Test
    public void testOpeningChecking(){
        openingCheckingAccount();
    }
    @Test
    public void testCheckingAccount(){
        checkingAccountSettings();
    }
    @Test
    public void testAdvantageBanking(){
        advantageBanking();
    }
    @Test
    public void testStudentBanking(){
        studentBanking();
    }
    @Test
    public void testBusinessChecking(){
        businessChecking();
    }
    @Test
    public void testCheckingSolutions(){
        checkingSolutions();
    }
    @Test
    public void testOnlineBanking(){
        onlineBanking();
    }
    @Test
    public void testMobileBanking(){
        mobileBanking();
    }
    @Test
    public void testMyRewards(){
        myRewards();
    }
    @Test
    public void testOpenCheckingAccount(){
        openCheckingAccount();
    }
    @Test
    public void testMobileAlerts(){
        mobileAlerts();
    }
    @Test
    public void testFinancialGoals(){
        financialGoals();
    }
    @Test
    public void testAutoLoanRate(){
        autoLoanRate();
    }
    @Test
    public void testRightFeaturesForChecking(){
        checkingWithRightFeatures();
    }
    @Test
    public void testDealsAndShopping(){
        dealsAndShopping();
    }
    @Test
    public void testSavingsAccount(){
        savingAccount();
    }
    @Test
    public void testRewardSavings(){
        rewardSavings();
    }
    @Test
    public void testChildSavings(){
        childSavings();
    }
    @Test
    public void testCDs(){
        CDs();
    }
    @Test
    public void testIRAs(){
        IRAs();
    }
}


