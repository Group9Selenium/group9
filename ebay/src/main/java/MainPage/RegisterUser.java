package MainPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUser extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"gh-ug-flex\"]/a"))
    public static WebElement ViewRegisterUser;
    @FindBy(id = ("firstname"))
    public static WebElement RegisterFirstName;
    @FindBy(id = ("lastname"))
    public static WebElement RegisterLastName;
    @FindBy(id = ("email"))
    public static WebElement RegisterEmail;
    @FindBy(id = ("lastname"))
    public static WebElement RegisterPassWord;
    @FindBy(id = ("ppaFormSbtBtn"))
    public static WebElement CreateAccountButton;
    @FindBy(id = ("reg_sfk_btn_fb"))
    public static WebElement FacebookContinueButton;
    @FindBy(id = ("reg_sfk_btn_ggl"))
    public static WebElement GoogleContinueButton;

    public void ClickViewRegisterUser() {
        ViewRegisterUser.click();
    }
    public void InputRegisterFirstName() {
        RegisterFirstName.sendKeys("Shafayat");
    }
    public void InputRegisterLastName() {
        RegisterLastName.sendKeys("Ahmed");
    }
    public void InputRegisterEmail() {
        RegisterEmail.sendKeys("ahmed@gmail.com");
    }
    public void InputRegisterPassWord() {
        RegisterPassWord.sendKeys("ahmed123");
    }
    public void ClickCreateAccountButton() {
        CreateAccountButton.click();
    }
    public void ClickFacebookContinueButton() {
        FacebookContinueButton.click();
    }
    public void ClickGoogleContinueButton() {
        GoogleContinueButton.click();
    }
}
