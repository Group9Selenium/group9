import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuBOFA extends  CommonAPI {

    public void searchUrl() {

        String HomePage = driver.getCurrentUrl();
        Assert.assertEquals(HomePage, "https://www.bankofamerica.com/");

    }

    public void checkingMenu() {
        clickOnElement("navChecking");
        Boolean flag = driver.findElement(By.id("exploreCheckingSolutions")).isDisplayed();
        Assert.assertTrue(flag);
        String text = driver.findElement(By.id("exploreCheckingSolutions")).getText();
        Assert.assertEquals(text, "Explore checking solutions");

    }

    public void savingsMenu() {
        clickOnElement("navSavings");
        Boolean flag = driver.findElement(By.id("rewardsSavingsAccount")).isDisplayed();
        Assert.assertTrue(flag);
        String text = driver.findElement(By.id("rewardsSavingsAccount")).getText();
        Assert.assertEquals(text, "Rewards Savings");

    }

    public void creditCardMenu() {
        clickOnElement("navCreditCards");
        Boolean flag = driver.findElement(By.id("manageCreditCardAccount")).isDisplayed();
        Assert.assertTrue(flag);
        String text = driver.findElement(By.id("manageCreditCardAccount")).getText();
        Assert.assertEquals(text, "Manage your credit card account");

    }

    public void homeLoansMenu() {
        clickOnElement("navHomeLoans");
        Boolean flag = driver.findElement(By.id("mortgages")).isDisplayed();
        Assert.assertTrue(flag);
        String text = driver.findElement(By.id("mortgages")).getText();
        Assert.assertEquals(text, "Mortgages");
    }

    public void autoLoansMenu() {
        clickOnElement("navAutoLoans");
        Boolean flag = driver.findElement(By.id("autoLoanRates")).isDisplayed();
        Assert.assertTrue(flag);
        String text = driver.findElement(By.id("autoLoanRates")).getText();
        Assert.assertEquals(text, "Auto loan rates");

    }

    public void investingMenu() {
        clickOnElement("navInvesting");
        Boolean flag = driver.findElement(By.id("investmentProducts")).isDisplayed();
        Assert.assertTrue(flag);
        String text = driver.findElement(By.id("investmentProducts")).getText();
        Assert.assertEquals(text, "Investment Choices");


    }

    public void smallBusinessMenu() {
        clickOnElement("NAV_BUSINESS_ADVANTAGE");

        String smallbusinesspage = driver.getCurrentUrl();
        Assert.assertEquals(smallbusinesspage, "https://www.bankofamerica.com/smallbusiness/");

    }

    public void personalMenu(){

        clickOnElement("NAV_PERSONAL");
        Boolean flag = driver.findElement(By.id("NAV_PERSONAL")).isDisplayed();
        Assert.assertTrue(flag);

    }
    public void openingCheckingAccount(){
        clickOnElement("/html/body/div[1]/div/div/section[3]/div/div/div[1]/div/div/div/div[1]/a/div[2]/div[2]");
        Boolean flag = driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div/div/h1")).isDisplayed();
        Assert.assertTrue(flag);
        clickOnElement("/html/body/div[2]/div/section[1]/div/div/a/span");
    }
    public void checkingAccountSettings() {
        clickOnElement("navChecking");
        String title = driver.getTitle();
        Assert.assertEquals(title, " Bank of America - Banking, Credit Cards, Home Loans and Auto Loans");

    }
    public void advantageBanking(){
        checkingAccountSettings();
        clickOnElement("advantageBanking");

    }
    public void studentBanking(){
        checkingAccountSettings();
        clickOnElement("studentBanking");
    }
    public void businessChecking(){
        checkingAccountSettings();
        clickOnElement("businessChecking");
    }
    public void checkingSolutions(){
        checkingAccountSettings();
        clickOnElement("exploreCheckingSolutions");
    }
    public void onlineBanking(){
        checkingAccountSettings();
        clickOnElement("navCheckingOnlineBanking");
    }
    public void mobileBanking(){
        checkingAccountSettings();
        clickOnElement("navCheckingMobileBanking");
    }
    public void myRewards(){
        checkingAccountSettings();
        clickOnElement("navCheckingPreferredRewards");
    }
    public void openCheckingAccount(){
        checkingAccountSettings();
        clickOnElement("DCTAHZ26");
    }
    public void mobileAlerts(){
        checkingAccountSettings();
        clickOnElement("/html/body/div[1]/div/div/section[3]/div/div/div[1]/div/div/div/div[1]/a/div[2]/div[4]");
    }
    public void financialGoals(){
        checkingAccountSettings();
        clickOnElement("/html/body/div[1]/div/div/section[3]/div/div/div[1]/div/div/div/div[2]/a/div[2]/div[4]");

    }
    public void autoLoanRate(){
        checkingAccountSettings();
        clickOnElement("/html/body/div[1]/div/div/section[3]/div/div/div[1]/div/div/div/div[3]/a/div[2]/div[4]");
    }
    public void checkingWithRightFeatures(){
        checkingAccountSettings();
        clickOnElement("/html/body/div[1]/div/div/section[3]/div/div/div[1]/div/div/div/div[4]/a/div[2]/div[4]");
    }
    public void dealsAndShopping(){
        checkingAccountSettings();
        clickOnElement("/html/body/div[1]/div/div/section[3]/div/div/div[1]/div/div/div/div[5]/a/div[2]/div[4]");
    }
    public void savingAccount(){
        clickOnElement("navSavings");
        String title = driver.getTitle();
        Assert.assertEquals(title, " Bank of America - Banking, Credit Cards, Home Loans and Auto Loans");

    }
    public void rewardSavings(){
        savingAccount();
        clickOnElement("rewardsSavingsAccount");
    }
    public void childSavings(){
        savingAccount();
        clickOnElement("childSavingsAccount");
    }
    public void CDs(){
        savingAccount();
        clickOnElement("cdAccount");
    }
    public void IRAs(){
        savingAccount();
        clickOnElement("iraAccount");
    }
    public void mobileBankingPage(){
        mobileBanking();
        Boolean flag = driver.findElement(By.id("skip-to-h1")).isDisplayed();
        Assert.assertTrue(flag);

    }
    public void manageAccounts(){
        mobileBanking();
        clickOnElement("/html/body/div[2]/div/div/section[2]/div/div/div[3]/section/section/div/nav/ul/li[2]/a/span");
    }
    public void paymentsAndTransfers(){
        mobileBanking();
        clickOnElement("/html/body/div[2]/div/div/section[2]/div/div/div[3]/section/section/div/nav/ul/li[3]/a/span");
    }

    public void setUpCustomAlerts(){
        mobileBanking();
       // clickOnElement("//*[@id=\"\\med_up_port_\"]");
    }
    public void lockUnlockDebitCard(){
       mobileBanking();
        //clickOnElement("//*[@id=\"\\med_up_port_\"]");
    }
    public void moreAboutMobileBanking(){
        mobileBanking();
        clickOnElement("learn_more_about_mobile_online_banking_1");
    }
    public void mobileAndOnlineFeatures(){
        moreAboutMobileBanking();
        clickOnElement("manageAccountsOnlineFeatures");
    }
    public void mobileAndOnlineOverview(){
        moreAboutMobileBanking();
        clickOnElement("manageAccountsOnlineOverview");
    }
    public void bankAmeriDeals(){
        moreAboutMobileBanking();
        clickOnElement("manageAccountsBankAmeriDeals");
    }
    public void getPaperlessStatement(){
        moreAboutMobileBanking();
        clickOnElement("manageAccountsPaperless");
    }
    public void budgetingTool(){
        moreAboutMobileBanking();
        clickOnElement("manageAccountsBudgetingTool");
    }
    public void orderChecks(){
        moreAboutMobileBanking();
        clickOnElement("manageAccountsOrder");
    }
    public void security(){
        moreAboutMobileBanking();
        clickOnElement("securityAlerts");
    }
    public void debitCardSecurity(){
        moreAboutMobileBanking();
        clickOnElement("securityLock");
    }
    public void fingerPrintSignIn(){
        moreAboutMobileBanking();
        clickOnElement("securityFingerprint");
    }
    public void mobileCheckDeposit(){
        moreAboutMobileBanking();
        clickOnElement("paymentsTransfersDeposit");

    }
    public void transferMoney(){
        moreAboutMobileBanking();
        clickOnElement("paymentsTransfersMoney");
    }
    public void payBills(){
        moreAboutMobileBanking();
        clickOnElement("paymentsTransfersPay");
    }
    public void getMobileBankingApp(){
        moreAboutMobileBanking();
        clickOnElement("footerGetTheAppLink");
    }
    public void enrollInOnlineBanking(){
        moreAboutMobileBanking();
        clickOnElement("onlineResourcesEnroll");
    }
    public void onlineBankingSecurity(){
        moreAboutMobileBanking();
        clickOnElement("onlineResourcesGuarantee");
    }
    public void onlineBankingFAQs(){
        moreAboutMobileBanking();
        clickOnElement("onlineResourcesFAQ");
    }
    public void mobileBankingSupportDevices(){
        moreAboutMobileBanking();
        clickOnElement("onlineResourcesDevices");
    }
    public void serviceAgreement(){
        moreAboutMobileBanking();
        clickOnElement("onlineResourcesAgreement");
    }
    public void eCommunication(){
        moreAboutMobileBanking();
        clickOnElement("onlineResourcesDisclosure");
    }








}