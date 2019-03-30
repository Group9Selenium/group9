import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

public class TestLogin extends Login {

    //ExcelDataSource excelData = new ExcelDataSource();

    //String path = "../BankofAmerica/src/test/resources/TestData.xls";


  //  @Test

    public void testLocation() {
        findATM();

    }

    @Test
    public void testSignIn() {
        signInWithInvalidIDAndPassword();
    }

    @Test
    public void testSecurity() {
        securityAndHelp();
    }
    @Test
    public void testhomeLoans(){
        navigateToHomeLoans();
    }
   @Test
    public void testMortgage(){
        Mortgage();
    }
   @Test
    public void testNavigateToMortgage(){
        navigateToMortgage();
    }
    @Test
    public void CalculateMonthlyPayment() throws IOException {
        mortgageCalculator();
    }
    @Test
    public void testMoreMenu(){
        moreMenu();
    }
   @Test
    public void testContactUs(){
        contactUs();
    }
    @Test
    public void testHelpMenu(){
        helpMenu();
    }
   @Test
    public void testAccessibleBanking(){
        accessibleBanking();
    }
   @Test
    public void testCareer(){
        careersWithBOA();
    }
    @Test
    public void testPrivacyAndSecurity(){
        privacyAndSecurity();

    }
   @Test
    public void testMcafee(){
        mcafeeSecurity();
    }
   @Test
    public void testAdvertising(){
        advertising();
   }
  @Test
    public void testFeedback(){
        feedback();
   }
   @Test
    public void testOnlineBankingSite(){
        onlineBankingSite();

   }
   @Test
    public void testClickPrivacy(){
        clickPrivacyAndSecurity();
   }
   @Test
    public void testClickAccount(){
        clickAccount();
   }
   @Test
    public void testClickProtectIdentity(){
        clickProtectIdentity();
   }
   @Test
    public void testClickAvoidScam(){
        clickAvoidScam();
   }
   @Test
    public void testNavigatePage(){
        navigateBackward();
   }

}

