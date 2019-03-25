import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestTwitter extends Twitter{
    @Test
    public static void runGetTitle(){

        System.out.println(getTitle());
    }

    @Test
    public static void runLogUp() throws InterruptedException {
        logup();
    }
    /*
    @Test
    public static void runLogIn() throws Exception{
        login();
    }
    @Test
    public static void runLogout() throws InterruptedException{
        login();
        logout();
    }
    @Test
    public static void runTopNavBar() throws InterruptedException {
        login();
        getTopNavBar();
    }
    @Test
    public static void runReadExcelFile() throws IOException {
        readExcelFile();
    }
    @Test
    public static void runClickTopNavBar() throws InterruptedException, IOException {
        login();
        clickTopNavBar();
    }*/
}
