import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

public class TestLogin extends Login {

    //ExcelDataSource excelData = new ExcelDataSource();

    //String path = "../BankofAmerica/src/test/resources/TestData.xls";


    //@Test

    public void testLocation() {
        findATM();

    }

   // @Test
    public void testSignIn() {
        signInWithInvalidIDAndPassword();
    }

    //@Test
    public void testSecurity() {
        securityAndHelp();

    }
    //@Test
    public void testhomeLoans(){
        navigateToHomeLoans();
    }
    //@Test
    public void testMortgage(){
        Mortgage();
    }
    //@Test
    public void testNavigateToMortgage(){
        navigateToMortgage();
    }

    @Test
    public void CalculateMonthlyPayment() throws IOException {
        mortgageCalculator();
    }


}
