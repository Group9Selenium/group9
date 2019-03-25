import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TestFaceBook extends FaceBook {

    @Test
    public static void runGetTitle(){
        System.out.println(getTitle());
    }

    @Test
    public static void runIsLogedin(){
        System.out.println(isLogedin());
    }

    @Test
    public static void runLogin() throws InterruptedException {
        login();
    }
    /*
    @Test
    public static void runLogout() throws InterruptedException {
        login();
        logout();
    }
    @Test
    public static void runNewFeed() throws InterruptedException {
        newFeed();
    }
    @Test
    public static void runSearchFriends() throws Exception {
        searchFriends();
    }
    @Test
    public static void runLefNavBartop() throws InterruptedException {
        leftNavBartop();
    }
    @Test
    public static void runReadExcel() throws IOException, InterruptedException {
        List<String> list1 =leftNavBartop();
        List<String> list2 = readExcelFile();
        //Assert.assertEquals(list1,list2);
    }
    @Test
    public static void runclickLeftNavBartop() throws IOException, InterruptedException {
        clickLeftNavBartop();
    }
    @Test
    public static void runLeftnavBarButtom() throws InterruptedException {

        List<String> list1 = leftNavBarBottum();
        for (String str: list1) {
            System.out.println(str);
        }
    }
    @Test
    public static void runUploadFile() throws Exception{
        FaceBook.uploadFile();
    }*/
}
