import base.CommonAPI;
import databases.ConnectToSqlDB;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utility.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LinkedIn extends CommonAPI {

    public static String getTitle() {
        return driver.getTitle();
    }

    public static Boolean isLogedin() {
        //System.out.println(driver.getTitle());
        return driver.getTitle().equals("LinkedIn: Log In or Sign Up");
    }

    public static void logout() throws InterruptedException {
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

    public static void login() throws InterruptedException {

        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#login-email")).sendKeys("aroussi.nouredine@gmail.com");
        driver.findElement(By.cssSelector("#login-password")).sendKeys("ANHakim@19872017");
        driver.findElement(By.cssSelector("#login-submit")).click();
        System.out.println("Successfully logged in");
        Thread.sleep(1000);
    }

    public static void goHomePage() {
        driver.findElement(By.cssSelector("#feed-tab-icon")).click();
    }

    public static void getTopNavBar() {
        List<WebElement> wEs = driver.findElements(By.xpath("//*[@id='extended-nav']/div/nav//li"));
        for (WebElement wE : wEs) {
            System.out.println(wE.getText());
        }
    }

    public static List<String> readExcelFile() throws IOException {
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

    public static void clickTopNavBartop() throws InterruptedException, IOException {
        List<String> btnAction = readExcelFile();
        List<WebElement> listWE = driver.findElements(By.xpath("//*[@id='extended-nav']/div/nav//li"));
        for (String act : btnAction) {
            for (WebElement wE : listWE) {
                if (act.equals(wE.getText())) wE.click();
            }
        }

    }

    public static void searchJobs() throws Exception {
        List<String> jobSearch = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        driver.findElement(By.xpath("//*[@id='jobs-nav-item']")).click();
        //WebElement searchEdtText =driver.findElement(By.xpath("//input[@placeholder='Search jobs']"));
        //WebElement locationEdtText = driver.findElement(By.xpath("//input[@placeholder='Search location']"));
        for (String job : jobSearch) {
            driver.findElement(By.xpath("//input[@placeholder='Search jobs']")).sendKeys(job);
            driver.findElement(By.xpath("//input[@placeholder='Search location']")).sendKeys("New York", Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Search jobs']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Search location']")).clear();
        }
    }

    public static void uploadFile() throws Exception {
        driver.findElement(By.xpath("//*[@class='share-box__open share-box__trigger p4 hoverable-link-text t-16 t-black--light t-bold']")).click();
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='share-box-media-upload display-flex align-items-center flex-1']/div"));
        for (WebElement wE : list
        ) {
            System.out.println(wE.getText());

        }

    }
}
