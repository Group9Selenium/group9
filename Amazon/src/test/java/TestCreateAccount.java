import amazonpages.CreateAccount;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestCreateAccount extends CreateAccount {

    String createAccount = "https://www.amazon.com/ap/register?clientContext=134-7861387-7901466&showRememberMe=true&openid.pape.max_auth_age=900&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&siteState=clientContext%3D143-6875306-3758038%2CsourceUrl%3Dhttps%253A%252F%252Fwww.amazon.com%252Fcpe%252Fmanagepaymentmethods%253Fref_%253Dya_d_c_pmt_mpo%2Csignature%3Dj2F3MDq0CISjYdOdEKE3EfKCfOJ6sj3D&marketPlaceId=ATVPDKIKX0DER&pageId=usflex&ignoreAuthState=1&fromAuthPrompt=1&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fcpe%2Fmanagepaymentmethods%3Fref_%3Dya_d_c_pmt_mpo&prevRID=9YXRCWFH4APWCCCCTXMD&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
    CreateAccount createAccountPage;



    @Test
    public void testUserCanNavigateToCreateAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.createAccount);
        String createAccountTitle = driver.getTitle();
        Assert.assertEquals(createAccountTitle,"Amazon Registration");
    }

    @Test
    public void EnterNameOnly() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.createAccount);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Monzur Miah", Keys.TAB);
        Thread.sleep(2000);
    }

    @Test
    public void EnterEmailOnly() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.createAccount);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("monzur1337@gmail.com", Keys.TAB);
        Thread.sleep(2000);
    }


    @Test
    public void EnterNameAndEmail() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.createAccount);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Monzur Miah", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("monzur1337@gmail.com",Keys.TAB);
        Thread.sleep(2000);
    }

    @Test
    public void EnterNameEmailPass() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.createAccount);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Monzur Miah", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("monzur1337@gmail.com",Keys.TAB);
        driver.switchTo().activeElement().sendKeys("selenium2019",Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Selenium2019",Keys.TAB);
        Thread.sleep(2000);
    }

    @Test
    public void SuccessfulLogin() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.createAccount);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Monzur Miah", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("monzur1337@gmail.com",Keys.TAB);
        driver.switchTo().activeElement().sendKeys("selenium2019",Keys.TAB);
        driver.switchTo().activeElement().sendKeys("selenium2019",Keys.TAB);
        Thread.sleep(2000);
    }
    @Test
    public void runElementIsdisplied(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean b= elementShow();
        Assert.assertEquals(true,b);
    }

}

