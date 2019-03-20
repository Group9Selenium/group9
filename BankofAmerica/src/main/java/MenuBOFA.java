import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuBOFA extends  CommonAPI{

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


}
