import org.testng.annotations.Test;

public class TestLinkedIn extends LinkedIn {
   /* @Test
    public static void runGetTitle(){
        System.out.println(LinkedIn.getTitle());
    }
   @Test
    public static void runLogIn() throws InterruptedException {
       LinkedIn.login();
   }
   @Test
    public static void runLogout() throws InterruptedException {
       LinkedIn.logout();
   }*/
   @Test
   public static void runLogInOut() throws InterruptedException {
       LinkedIn.login();
       LinkedIn.logout();
   }
}
