import org.testng.annotations.Test;

public class TestLogin extends Login {
    //@Test

    public void testLocation() {
        findATM();

    }

   // @Test
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


}
