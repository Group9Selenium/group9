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
}
