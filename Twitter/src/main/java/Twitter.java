import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Twitter extends CommonAPI {
    public  String getTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.getTitle();
    }

    public  void goHomePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//div[@id='u_0_c']/a")).click();
    }

    public  Boolean isLogedin() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.getTitle().equals("Twitter. It's what's happening.");
    }

    public  void logout() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        if (isLogedin() == false) {
            driver.findElement(By.xpath("//*[@id='user-dropdown-toggle']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='signout-button']/button")).click();
            Thread.sleep(1000);
            System.out.println("Successfully logedout");
        } else {
            System.out.println("The User is already logout");
        }

    }

    public  void login() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='doc']/div/div[1]/div[1]/div[2]/div[2]/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id='page-container']/div/div[1]/form/fieldset/div[1]/input")).sendKeys("aroussi.nouredine@gmail.com");
        driver.findElement(By.xpath("//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input")).sendKeys("NourEddine@2019", Keys.ENTER);
        System.out.println("Successfully logged in");
        Thread.sleep(1000);

    }

    public  void logup() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@class='js-nav EdgeButton EdgeButton--medium EdgeButton--primary StaticLoggedOutHomePage-buttonSignup']")).click();
        driver.findElement(By.xpath("//*[@id='react-root']/div[2]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/label/div/div/input")).sendKeys("NourEddine Aroussi");
        driver.findElement(By.xpath("//*[@class='rn-30o5oe rn-1niwhzg rn-ou6ah9 rn-t12b5v rn-zmljjp rn-pm2fo rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-homxoj rn-poiln3 rn-7cikom rn-1exrs8c rn-1qfoi16 rn-1hfyk0a rn-1qxgc49 rn-19yat4t rn-1dz5y72 rn-1ttztb7 rn-13qz1uu']")).sendKeys("6467644871");
        Thread.sleep(1000);
    }

    public  List<String> getTopNavBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<String>();
        List<WebElement> wEList = driver.findElements(By.xpath("//*[@id=\"global-actions\"]/li"));
        for (WebElement wE : wEList) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+", "+wE.getText());
            list.add(wE.getText());
            // System.out.println(wE.getText());
        }
        return list;
    }

    public  List<String> readExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DataReader dr = new DataReader();
        List<String> list = new ArrayList<String>();
        String path = "/Users/anour-mbp/GDrive/Projects/Intellij/Group9/Twitter/src/main/data/Excel.xls";//System.getProperty("user.dir")+"/data/Excel.xl";
        System.out.println(path);
        String[] data = dr.fileReader2(path, 0);
        for (int i = 1; i < data.length; i++) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+", "+ data[i]);
            if (data[i] != null) list.add(data[i]);
        }
        return list;
    }

    public  void clickTopNavBar() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = readExcelFile();
        List<WebElement> wEList = driver.findElements(By.xpath("//*[@id='global-actions']/li"));
        for (int i = 0; i < list.size(); i++) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+", "+wEList.get(i).getText());
            wEList.get(i).click();
            Thread.sleep(1000);
        }
    }
}


