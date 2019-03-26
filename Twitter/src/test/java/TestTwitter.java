import base.CommonAPI;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestTwitter extends Twitter{
    @Test
    public  void runGetTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(getTitle());
    }

    @Test
    public  void runLogUp() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logup();
    }

    @Test
    public  void runLogIn() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login();
    }
    @Test
    public  void runLogout() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login();
        logout();
    }
    @Test
    public  void runTopNavBar() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login();
        getTopNavBar();
    }
    @Test
    public  void runReadExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        readExcelFile();
    }
    @Test
    public  void runClickTopNavBar() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login();
        clickTopNavBar();
    }
}
