import amazonpages.HomePage;
import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends HomePage {

    String homepageUrl = "https://www.amazon.com/";
    HomePage homePage;

    @Test
    public void testUserCanNavigateToHomePage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.homepageUrl);
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    @Test
    public void testSearchBar(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.homepageUrl);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Laptops", Keys.ENTER);
    }

    @Test
    public void testSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.homepageUrl);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Phones", Keys.ENTER);
    }

    @Test
    public void testYourAmazonButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(this.homepageUrl);
        driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span")).click();
    }
}
