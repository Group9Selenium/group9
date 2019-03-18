import org.testng.annotations.Test;

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
    }*/
    @Test
    public static void runSearchFriends() throws Exception {
        FaceBook.searchFriends();
    }
}
