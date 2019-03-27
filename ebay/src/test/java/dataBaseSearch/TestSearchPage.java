package dataBaseSearch;

import datasource.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchPage extends SearchPage {
    //User should be able to search items from search box using MySql database
    @Test
    public void testSearchPage() throws Exception {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItems();
    }
}
