import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class TestFaceBook extends FaceBook {

    @Test
    public void runGetTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(getTitle());
    }

    @Test
    public void runIsLogedin(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean b= isLogedin();
        Assert.assertEquals(b,true);
    }

    @Test
    public void runLogin() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login();
        boolean b =isLogedin();
        Assert.assertEquals(b,false);
    }

    @Test
    public void runLogout() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login();
        logout();
        boolean b =isLogedin();
        Assert.assertEquals(b,true);
    }
    @Test
    public  void runNewFeed() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        newFeed();
    }
    @Test
    public  void runSearchFriends() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchFriends();
    }
    @Test
    public  void runLefNavBartop() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        leftNavBartop();
    }
    @Test
    public  void runReadExcel() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list1 =leftNavBartop();
        List<String> list2 = readExcelFile();
        Assert.assertEquals(list1,list2);
    }
    @Test
    public  void runclickLeftNavBartop() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickLeftNavBartop();
    }
    @Test
    public  void runLeftNavBarButtom() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        List<String> list1 = leftNavBarBottum();
        for (String str: list1) {
            System.out.println(str);
        }
    }
    @Test
    public  void runUploadFile() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        uploadFile();
    }
}
