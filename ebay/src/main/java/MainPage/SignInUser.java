package MainPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInUser extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"gh-ug\"]/a"))
    public static WebElement ViewSignInUser;
    public void ClickViewSignInUser() {
        ViewSignInUser.click();
        }
    @FindBy(id = ("userid"))
    public static WebElement SignInEmailorID;
    public void InputSignInEmailorID() {
        SignInEmailorID.sendKeys("ahmed@gmail.com");
        }
    @FindBy(id = ("pass"))
    public static WebElement SignInPassWord;
    public void InputSignInPassWord() {
        SignInPassWord.sendKeys("ahmed123");
    }
    @FindBy(xpath = ("//*[@id=\"sgnBt\"]"))
    public static WebElement SignInButton;
    public void ClickSignInButton() {
        //ViewSignInUser.click();
        SignInButton.click();
    }
    @FindBy(id = ("signin_fb_btn"))
    public static WebElement FacebookButtonSignInPage;

    public void ClickFacebookButtonSignInPage() {
        FacebookButtonSignInPage.click();
        }
    @FindBy(id = ("signin_ggl_btn"))
    public static WebElement GoogleButtonSignInPage;
    public void ClickGoogleButtonSignInPage() {
        GoogleButtonSignInPage.click();
    }
}
