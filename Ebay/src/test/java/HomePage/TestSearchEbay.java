package HomePage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSearchEbay extends CommonAPI {
    //User should be able to search items in the search box and get results
    @Test
    public void searchItems() throws IOException, InterruptedException {
        SearchEbay search = PageFactory.initElements(driver, SearchEbay.class);
        search.searchItemsAndSubmitButton();
    }
}
