import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Login extends CommonAPI {

    public static void loginIcon() {

        String HomePage = driver.getCurrentUrl();
        Assert.assertEquals(HomePage, "https://www.bankofamerica.com/");
        Boolean flag = driver.findElement(By.id("finCenterLocator")).isDisplayed();
        Assert.assertTrue(flag);

        clickOnElement("finCenterLocator");
    }

}
