import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Login extends CommonAPI {

    public void findATM() {

        String HomePage = driver.getCurrentUrl();
        Assert.assertEquals(HomePage, "https://www.bankofamerica.com/");
        Boolean flag = driver.findElement(By.id("finCenterLocator")).isDisplayed();
        Assert.assertTrue(flag);

        clickOnElement("finCenterLocator");
    }

    public void signInWithInvalidIDAndPassword() {

        String HomePage = driver.getCurrentUrl();
        Assert.assertEquals(HomePage, "https://www.bankofamerica.com/");

        driver.findElement(By.id("onlineId1")).sendKeys("xxxx");
        driver.findElement(By.id("passcode1")).sendKeys("xxxx");


        clickOnElement("signIn");
        //Boolean flag = driver.findElement(By.name("forgot-id-passcode")).isDisplayed();
       // Assert.assertTrue(flag);
        //String text = driver.findElement(By.className("error-message")).getText();
       // Assert.assertTrue(text.contains("The Online ID or Passcode you entered does not match our records."));

    }
    public void securityAndHelp(){
        String HomePage = driver.getCurrentUrl();
        Assert.assertEquals(HomePage, "https://www.bankofamerica.com/");
        Boolean flag = driver.findElement(By.id("security")).isDisplayed();
        Assert.assertTrue(flag);

        clickOnElement("security");

    }
    public void navigateToHomeLoans(){
        clickOnElement("navHomeLoans");
        Boolean flag = driver.findElement(By.id("mortgages")).isDisplayed();
        Assert.assertTrue(flag);
        String text = driver.findElement(By.id("mortgages")).getText();
        Assert.assertEquals(text, "Mortgages");
    }

    public void Mortgage(){
        clickOnElement("title");
        Boolean flag = driver.findElement(By.id("mortgages")).isDisplayed();
        Assert.assertTrue(flag);

    }
    public void navigateToMortgage(){
        clickOnElement("mortgages");
        String text = driver.findElement(By.id("skip-to-h1")).getText();
         Assert.assertEquals(text,"Home Mortgage Loans");
    }



    }



