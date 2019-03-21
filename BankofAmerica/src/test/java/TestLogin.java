import org.testng.annotations.Test;

public class TestLogin extends Login{
    @Test

    public void testLocation (){
        findATM();

    }
    @Test
    public void testSignIn(){
        signInWithInvalidIDAndPassword();
    }



}
