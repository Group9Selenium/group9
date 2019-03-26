import base.CommonAPI;
import org.testng.annotations.Test;

public class TestAmazontest extends CommonAPI {
    @Test
    public void getTitle(){
        System.out.println(driver.getTitle());
    }
}
