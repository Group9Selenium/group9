package HomePage;

import MainPage.SignInUser;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestSignInUser extends SignInUser {
    @Test
    //User should be able to click on sign in button
    public void testSignIn() {
        SignInUser signIn = PageFactory.initElements(driver, SignInUser.class);
        signIn.ClickViewSignInUser();
    }
    //User should be able to sign in using personal information
    @Test
    public void testSignInAccount() {
        SignInUser signIn = PageFactory.initElements(driver, SignInUser.class);
        signIn.ClickViewSignInUser();
        signIn.InputSignInEmailorID();
        signIn.InputSignInPassWord();
        signIn.ClickSignInButton();
    }
    //User should be able to click on sign in by google button
    @Test
    public void testGoogleButtonFromSignIn() {
        SignInUser signIn = PageFactory.initElements(driver, SignInUser.class);
        signIn.ClickViewSignInUser();
        signIn.ClickGoogleButtonSignInPage();
        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
            }
        }

    }
    //User should be able to click on sign in by facebook button
    @Test
    public void testFacebookButtonFromSignIn() {
        SignInUser signIn = PageFactory.initElements(driver, SignInUser.class);
        signIn.ClickViewSignInUser();
        signIn.ClickFacebookButtonSignInPage();
        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
            }
        }
    }
}

