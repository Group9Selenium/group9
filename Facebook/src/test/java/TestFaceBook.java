import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TestFaceBook extends FaceBook {
    /*@Test
    public static void runGetTitle(){
        System.out.println(FaceBook.getTitle());
    }
    @Test
    public static void runIsLogedin(){
        System.out.println(FaceBook.isLogedin());
    }

    @Test
    public static void runLogin() throws InterruptedException {
        FaceBook.login();
    }
    @Test
    public static void runLogout() throws InterruptedException {
        FaceBook.login();
        FaceBook.logout();
    }
    @Test
    public static void runNewFeed() throws InterruptedException {
        FaceBook.newFeed();
    }
    @Test
    public static void runSearchFriends() throws Exception {
        FaceBook.searchFriends();
    }
    @Test
    public static void runLefNavBartop() throws InterruptedException {
        FaceBook.leftNavBartop();
    }
    @Test
    public static void runReadExcel() throws IOException, InterruptedException {
        List<String> list1 =FaceBook.leftNavBartop();
        List<String> list2 = FaceBook.readExcelFile();
        Assert.assertEquals(list1,list2);
    }
    @Test
    public static void runclickLeftNavBartop() throws IOException, InterruptedException {
        FaceBook.clickLeftNavBar();
    }
    @Test
    public static void runLeftnavBarButtom() throws InterruptedException {

        List<String> list1 = FaceBook.leftNavBarBottum();
        for (String str: list1) {
            System.out.println(str);
        }
    }*/
    @Test
    public static void runUploadFile() throws Exception{
        FaceBook.uploadFile();
    }

}
