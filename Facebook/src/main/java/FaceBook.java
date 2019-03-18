import base.CommonAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.sql.SQLOutput;
import java.util.List;


public class FaceBook extends CommonAPI {
    public static String  getTitle(){
        return driver.getTitle();
    }
    public static Boolean isLogedin(){
        return driver.getTitle()!="Facebook - Log In or Sign Up";
    }
    public static void logout() throws InterruptedException {
        if (! isLogedin()){
            driver.findElement(By.xpath("//div[@id='u_0_c']/a")).click();
            driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".\\_64kz .\\_54nh")).click();
            System.out.println("Successfully logedout");
        }else
        {
            System.out.println("The User is already logout");
        }
    }
    public static void login() throws InterruptedException {

        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("aroussi.nouredine@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("ANHakim@19872017");
        driver.findElement(By.id("u_0_2")).click();
        System.out.println("Successfully logged in");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".layerCancel")).click();
        Thread.sleep(1000);
    }
    public static void newFeed() throws InterruptedException {
        login();
        driver.findElement(By.id("u_ps_0_1_3")).click();
        driver.findElement(By.cssSelector(".\\_54nd .\\_54nh")).click();
        Thread.sleep(1000);
    }

    public static void searchFriends() throws Exception {
        login();
        List<String> listFriends= ConnectToSqlDB.readDataBase("ItemList","items");
        for (String str:listFriends) {
            driver.findElement(By.cssSelector(".\\_1frb")).sendKeys(str, Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".\\_1frb")).clear();
        }
    }
}
