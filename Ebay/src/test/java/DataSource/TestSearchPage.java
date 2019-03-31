package DataSource;

import DataSource.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchPage extends SearchPage {
    //Search data feed from MySql database
    @Test
    public void testSearchPage() throws Exception {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItems();
    }
}
