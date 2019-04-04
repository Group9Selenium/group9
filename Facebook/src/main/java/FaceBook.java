import base.CommonAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;
import utility.DataReader;
import java.io.IOException;
import java.util.*;


public class FaceBook extends CommonAPI {

    public String getTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return driver.getTitle();
    }

    public void closePapup() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("aroussi.nouredine@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("NourEddine@2019", Keys.ENTER);
        //driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
        System.out.println("Successfully logged in");
        Thread.sleep(500);
        try {
            if (driver.findElement(By.xpath("//*[@class='_51-u']")).isDisplayed()) {
                driver.findElement(By.xpath("//*[@class='_51-u']")).click();
            }
        } catch (Exception e) {
            System.out.println("Ther Is No PapPup form");
        }
    }

    public void goHomePage() {
        // closePapup();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@class='_2s25']")).click();
    }

    public Boolean isLogedin() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + " ," + driver.getTitle().equals("Facebook - Log In or Sign Up"));
        return driver.getTitle().equals("Facebook - Log In or Sign Up");
    }

    public void logup() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Testuser", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("TestUser", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("TestUser@hotmail.com");
        driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("TestUser@hotmail.com", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("TestUser-users", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Jan", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("1", Keys.TAB);
        driver.switchTo().activeElement().sendKeys("2000", Keys.TAB);
        Thread.sleep(3000);
    }

    public void logout() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        if (isLogedin() == false) {
            driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".\\_64kz .\\_54nh")).click();
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
        driver.findElement(By.id("email")).sendKeys("aroussi.nouredine@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("NourEddine@2019", Keys.ENTER);
        System.out.println("Successfully logged in");
        Thread.sleep(500);
        try {
            if (driver.findElement(By.cssSelector(".layerCancel")).isDisplayed())
                driver.findElement(By.cssSelector(".layerCancel")).click();
            ;
        } catch (Exception e) {
            System.out.println("Ther Is No Pappup Form");
        }
        Thread.sleep(500);
    }

    public void newFeed() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        driver.findElement(By.cssSelector("#navItem_4748854339 .linkWrap")).click();
        Thread.sleep(1000);
    }

    public void searchFriends() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> listFriends = ConnectToSqlDB.readDataBase("Friends", "Names");
        for (String str : listFriends) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + " ," + str);
            driver.findElement(By.cssSelector(".\\_1frb")).sendKeys(str, Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".\\_1frb")).clear();
        }
    }

    public List<String> leftNavBartop() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> list = new ArrayList<String>();
        List<WebElement> listWE = driver.findElements(By.xpath("//*[@id='universalNav']//a/div"));
        for (WebElement wE : listWE) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + " ," + wE.getText());
            System.out.println(wE.getText());
            list.add(wE.getText());
        }
        return list;
    }

    public List<String> readExcelFile(int sheetNbr) throws IOException {
        DataReader dr = new DataReader();
        List<String> list = new ArrayList<String>();
        String path = "/Users/anour/GDrive/Projects/Intellij/Group9/Facebook/src/main/data/Excel.xls";//System.getProperty("user.dir")+"/data/Excel.xl";
        String[] data = dr.fileReader2(path, sheetNbr);
        for (int i = 1; i < data.length; i++) {
            if (data[i] != null) list.add(data[i]);
        }
        return list;
    }

    public void clickLeftNavBartop() throws InterruptedException, IOException {
        List<String> btnAction = readExcelFile(0);
        login();
        for (String act : btnAction) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + " ," + act);
            if (act.equals("News Feed")) {
                driver.findElement(By.cssSelector("#navItem_4748854339 .linkWrap")).click();
                Thread.sleep(1000);
            } else {
                if (act.equals("Messenger")) {
                    driver.findElement(By.xpath("//li[@id='navItem_217974574879787']/a/div")).click();
                    Thread.sleep(1000);
                    //goHomePage();

                } else {
                    if (act.equals("Watch")) {
                        driver.findElement(By.xpath("//li[@id='navItem_2392950137']/a/div")).click();
                        Thread.sleep(1000);
                        //goHomePage();
                    } else if (act.equals("Marketplace")) {
                        driver.findElement(By.xpath("//li[@id='navItem_1606854132932955']/a/div")).click();
                        //goHomePage();
                    }
                }
            }
            goHomePage();
        }
    }

    public boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public List<String> leftNavBarBottum() throws InterruptedException {
        List<String> list = new ArrayList<String>();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        driver.findElement(By.xpath("//*[@id='appsNav']/ul/li[22]/a")).click();
        List<WebElement> wEList = driver.findElements(By.xpath("//*[@id='appsNav']//li"));
        for (WebElement wE : wEList) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + " ," + wE.getText());
            //System.out.println(wE.getText()+" "+ isNumeric(wE.getText()));
            if (!isNumeric(wE.getText()))
                list.add(wE.getText());
        }
        return list;
    }

    public void uploadFile() throws Exception {

        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        driver.findElement(By.cssSelector(".sx_5c186e")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class ='_3jk']/input"));
        Thread.sleep(1000);
        //driver.findElement(By.xpath("")).click();
    }

    public void searchMarketPlace() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> listItems = ConnectToSqlDB.readDataBase("ItemList", "items");
        driver.findElement(By.xpath("//*[@id='navItem_1606854132932955']/a/div")).click();
        WebElement wE = driver.findElement(By.xpath("//span/span/label/input"));
        for (String item : listItems) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + item);
            wE.sendKeys(item, Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span/span/label/input")).clear();
            Thread.sleep(500);
        }
    }

    public void searchMarketPlaceGroups() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> listItems = ConnectToSqlDB.readDataBase("ItemList", "items");
        driver.findElement(By.xpath("//*[@id='navItem_1606854132932955']/a/div")).click();
        driver.findElement(By.xpath("//*[@title='Groups']")).click();
        WebElement wE = driver.findElement(By.xpath("//span/span/label/input"));
        for (String item : listItems) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + item);
            wE.sendKeys(item, Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span/span/label/input")).clear();
            Thread.sleep(500);
        }
    }

    public void searchMarketPlaceStores() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        List<String> listItems = ConnectToSqlDB.readDataBase("ItemList", "items");
        driver.findElement(By.xpath("//*[@id='navItem_1606854132932955']/a/div")).click();
        driver.findElement(By.xpath("//*[@title='Stores']")).click();
        WebElement wE = driver.findElement(By.xpath("//span/span/label/input"));
        for (String item : listItems) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + item);
            wE.sendKeys(item, Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span/span/label/input")).clear();
            Thread.sleep(500);
        }
    }

    public List<String> marketplaceNavBar() throws Exception {
        List<String> list = new ArrayList<String>();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        login();
        driver.findElement(By.xpath("//*[@id='navItem_1606854132932955']/a/div")).click();
        List<WebElement> listWE = driver.findElements(By.xpath("//*[@class='_k01 _1itu _2pi2']"));
        for (WebElement wE : listWE) {
            list.add(wE.getText());
        }
        return list;
    }

    public void clickMarketplaceNavBar() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> btnAction = readExcelFile(1);
        login();
        driver.findElement(By.xpath("//*[@id='navItem_1606854132932955']/a/div")).click();
        List<WebElement> listWE = driver.findElements(By.xpath("//*[@class='_k01 _1itu _2pi2']"));
        for (String act : btnAction) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + act);
            switch (act) {
                case "Groups":
                    driver.findElement(By.xpath("//a[@title='Groups']/span")).click();
                    Thread.sleep(1000);
                    break;
                case "Stores":
                    driver.findElement(By.xpath("//a[@title='Stores']/span")).click();
                    Thread.sleep(1000);
                    break;
                case "Buying":
                    driver.findElement(By.xpath("//a[@title='Buying']/span")).click();
                    Thread.sleep(1000);
                    break;
                case "Selling":
                    driver.findElement(By.xpath("//a[@title='Selling']/span")).click();
                    Thread.sleep(1000);
                    break;
                case "Saved Items":
                    driver.findElement(By.xpath("//a[@title='Saved Items']/span")).click();
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("no match");
                    break;
            }
        }
    }

    public void searchJobs() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> btnAction = ConnectToSqlDB.readDataBase("Jobs", "JobTitle");
        login();
        driver.findElement(By.xpath("//*[@id='appsNav']/ul/li[22]/a")).click();
        driver.findElement(By.xpath("//*[@id='navItem_977114232337111']/a/div")).click();
        for (String job : btnAction) {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + ", " + job);
            driver.findElement(By.xpath("//div [@class ='_4llw _2pi2 uiInputLabel clearfix']")).click();
            driver.findElement(By.xpath("//input[@placeholder='Search jobs']")).sendKeys(job, Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Search jobs']")).clear();
            Thread.sleep(500);
        }
    }
}
