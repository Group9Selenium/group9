import base.CommonAPI;
import databases.ConnectToSqlDB;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LinkedIn extends CommonAPI {

    public String getTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return driver.getTitle();
    }

    public Boolean isLogedin() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return driver.getTitle().equals("LinkedIn: Log In or Sign Up");
    }

    public void logout() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        if (isLogedin() == false) {
            driver.findElement(By.xpath("//*[@id='nav-settings__dropdown-trigger']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//ul[@id='nav-settings__dropdown-options']/li[5]/ul/li/a")).click();
            Thread.sleep(1000);
            System.out.println("Successfully logedout");
        } else {
            System.out.println("The User is already logout");
        }

    }

    public void login() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#login-email")).sendKeys("aroussi.nouredine@gmail.com");
        driver.findElement(By.cssSelector("#login-password")).sendKeys("NourEddine@2019");
        driver.findElement(By.cssSelector("#login-submit")).click();
        System.out.println("Successfully logged in");
        Thread.sleep(1000);
    }

    public void goHomePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.cssSelector("#feed-tab-icon")).click();
    }

    public void getTopNavBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<WebElement> wEs = driver.findElements(By.xpath("//*[@id='extended-nav']/div/nav//li"));
        for (WebElement wE : wEs) {
            System.out.println(wE.getText());
        }
    }

    public List<String> readExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        DataReader dr = new DataReader();
        List<String> list = new ArrayList<String>();
        String path = "/Users/anour-mbp/GDrive/Projects/Intellij/Group9/LinkedIn/src/main/data/Excel.xls";//System.getProperty("user.dir")+"/data/Excel.xl";
        System.out.println(path);
        String[] data = dr.fileReader2(path, 0);
        for (int i = 1; i < data.length; i++) {
            System.out.println(data[i]);
            if (data[i] != null) list.add(data[i]);
        }
        return list;
    }

    public void clickTopNavBartop() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> btnAction = readExcelFile();
        List<WebElement> listWE = driver.findElements(By.xpath("//*[@id='extended-nav']/div/nav//li"));
        for (String act : btnAction) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + act);
            for (WebElement wE : listWE) {
                if (act.equals(wE.getText())) wE.click();
            }
        }

    }

    public void searchJobs() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> jobSearch = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        //System.out.println(jobSearch);
        driver.findElement(By.xpath("//*[@id='jobs-nav-item']")).click();
        //WebElement searchEdtText =driver.findElement(By.xpath("//input[@placeholder='Search jobs']"));
        //WebElement locationEdtText = driver.findElement(By.xpath("//input[@placeholder='Search location']"));
        for (String job : jobSearch) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + job);
            driver.findElement(By.xpath("//input[@placeholder='Search jobs']")).sendKeys(job);
            driver.findElement(By.xpath("//input[@placeholder='Search location']")).sendKeys("New York", Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Search jobs']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Search location']")).clear();
        }
    }

    public void uploadFile() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@class='share-box__open share-box__trigger p4 hoverable-link-text t-16 t-black--light t-bold']")).click();
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='share-box-media-upload display-flex align-items-center flex-1']/div"));
        for (WebElement wE : list) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", upload a" + wE.getText());
            System.out.println(wE.getText());
        }
    }
    public void logup() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Test User",Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Test User",Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Test.User@gmail.com",Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Test-User2019",Keys.ENTER);
        Thread.sleep(1000);
    }
}