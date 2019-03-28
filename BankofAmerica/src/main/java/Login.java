import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import utility.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Login extends CommonAPI {

    DataReader reader = new DataReader();
    public String testdatapath = "../BankofAmerica/src/main/resources/TestData.xls";

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
    public void Calculator(String purchasePrice, String downPayment, String monthlyPayment){
        //navigateToHomeLoans();
        //navigateToMortgage();
        clearField("purchase-price-input-medium");
        typeOnID("purchase-price-input-medium",purchasePrice);
        clearField("down-payment-input-medium");
        typeOnID("down-payment-input-medium",downPayment);
        clickOnElement("update-button-medium");
       // Boolean flag = driver.findElement(By.className("update-partial")).isDisplayed();
       // Assert.assertTrue(flag);
        String monthly = driver.findElement(By.className("partial-payment")).getText();
        System.out.println("Montly payment from application " + monthly);
        Assert.assertTrue(monthly.contains(monthlyPayment));

    }

    public  void mortgageCalculator() throws IOException {
        String[][] excelData = reader.fileReader1(testdatapath, 0);

        navigateToHomeLoans();
        navigateToMortgage();
        //Calculator(String purchasePrice, downPayment, monthlyPayment);


        for (int i = 0; i <= excelData.length - 1; i++) {

            String purchasePrice = excelData[i + 1][0];
            String downPayment = excelData[i + 1][1];
            String monthlyPayment = excelData[i + 1][2];
            System.out.println("Running test with Purchase Price = " + purchasePrice);
            Calculator(purchasePrice, downPayment, monthlyPayment);
        }
    }
    public void moreMenu(){
        String HomePage = driver.getCurrentUrl();
        Boolean flag = driver.findElement(By.id("footer_bofa_locations")).isDisplayed();
        Assert.assertTrue(flag);
    }
    public void contactUs(){
        String HomePage = driver.getCurrentUrl();
        Boolean flag = driver.findElement(By.id("footer_bofa_contactus")).isDisplayed();
        Assert.assertTrue(flag);

    }
    public void helpMenu(){
        String HomePage = driver.getCurrentUrl();
        Boolean flag = driver.findElement(By.id("footer_bofa_help")).isDisplayed();
        Assert.assertTrue(flag);
    }
    public void accessibleBanking(){
        String HomePage = driver.getCurrentUrl();
        Boolean flag = driver.findElement(By.id("footer_bofa_accessible_banking")).isDisplayed();
        Assert.assertTrue(flag);
    }
    public void careersWithBOA(){
        String HomePage = driver.getCurrentUrl();
        Boolean flag = driver.findElement(By.id("footer_bofa_careers")).isDisplayed();
        Assert.assertTrue(flag);
    }
    public void privacyAndSecurity(){
        String HomePage = driver.getCurrentUrl();
        Boolean flag = driver.findElement(By.id("footer_bofa_privacy_and_security")).isDisplayed();
        Assert.assertTrue(flag);
    }
    public void mcafeeSecurity(){
        String HomePage = driver.getCurrentUrl();
        Boolean flag = driver.findElement(By.id("footer_bofa_mcafee_internet_security")).isDisplayed();
        Assert.assertTrue(flag);
    }
    public void advertising(){
        String HomePage = driver.getCurrentUrl();
        Boolean flag = driver.findElement(By.id("footer_bofa_advertising_practices")).isDisplayed();
        Assert.assertTrue(flag);
    }
    public void feedback(){
        String HomePage = driver.getCurrentUrl();
        Boolean flag = driver.findElement(By.id("footer_bofa_feedback")).isDisplayed();
        Assert.assertTrue(flag);

    }
    public void onlineBankingSite(){
        String HomePage = driver.getCurrentUrl();
        Boolean flag = driver.findElement(By.id("footer_bofa_view_full_online_banking_site")).isDisplayed();
        Assert.assertTrue(flag);

    }
    public void clickPrivacyAndSecurity(){
        privacyAndSecurity();
        clickOnElement("footer_bofa_privacy_and_security");
        Boolean flag = driver.findElement(By.className("cnx-regular")).isDisplayed();
        Assert.assertTrue(flag);
        clickOnElement("How_we_protect_your_accounts_and_identity");

    }
    public void clickProtectAccountAndIdentity(){
        privacyAndSecurity();
        //clickOnElement("How_we_protect_your_accounts_and_identity");
        clickOnElement("How_we_protect_your_privacy");
    }
    public void clickAccount(){
        privacyAndSecurity();
        clickOnElement("How_you_can_help_protect_your_accounts");
    }
    public void clickProtectIdentity(){
        privacyAndSecurity();
        clickOnElement("How_you_can_help_protect_your_identity");
    }
    public void clickAvoidScam(){
        privacyAndSecurity();
        clickOnElement("How_you_can_identify_and_avoid_scams");

    }



}








