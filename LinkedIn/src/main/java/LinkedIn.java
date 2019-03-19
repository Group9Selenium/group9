import base.CommonAPI;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;

public class LinkedIn extends CommonAPI {

    public static String  getTitle(){
        return driver.getTitle();
    }
    public static Boolean isLogedin(){
        //System.out.println(driver.getTitle());
        return driver.getTitle().equals("LinkedIn: Log In or Sign Up");
    }
    public static void logout() throws InterruptedException {
        if (isLogedin()==false){
            driver.findElement(By.xpath("//*[@id='nav-settings__dropdown-trigger']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//ul[@id='nav-settings__dropdown-options']/li[5]/ul/li/a")).click();
            Thread.sleep(1000);
            System.out.println("Successfully logedout");
        }else
        {
            System.out.println("The User is already logout");
        }

    }
    public static void login() throws InterruptedException {

        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#login-email")).sendKeys("aroussi.nouredine@gmail.com");
        driver.findElement(By.cssSelector("#login-password")).sendKeys("ANHakim@19872017");
        driver.findElement(By.cssSelector("#login-submit")).click();
        System.out.println("Successfully logged in");
        Thread.sleep(1000);
    }

}
