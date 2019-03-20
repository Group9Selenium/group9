import org.testng.annotations.Test;

public class TestLinkedIn extends LinkedIn {
   /* @Test
    public static void runGetTitle(){
        System.out.println(getTitle());
    }
   @Test
    public static void runLogIn() throws InterruptedException {
       login();
   }
   @Test
    public static void runLogout() throws InterruptedException {
       logout();
   }
   @Test
   public static void runLogInOut() throws InterruptedException {
       login();
       logout();
   }
   @Test
   public static void runHomePage() throws Exception{
       login();
       goHomePage();
   }
   @Test
    public  static  void runGetTopNavBar() throws Exception{
       login();
       getTopNavBar();
   }
   @Test
    public static void runReadExcelFile() throws Exception {
       readExcelFile();
   }
   @Test
    public static void runClickTopNavBar() throws Exception{
       login();
       clickTopNavBartop();
   }
   @Test
    public static void runJobSearch() throws Exception{
       login();
       searchJobs();
   }*/
   @Test
   public static void runUploadFile() throws Exception{
      login();
      uploadFile();
   }
}
