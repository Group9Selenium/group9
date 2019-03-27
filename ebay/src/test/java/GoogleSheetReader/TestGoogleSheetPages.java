package GoogleSheetReader;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestGoogleSheetPages extends GoogleSheets{
    //User should be able to search items using google sheet
    /*@Test
    public void amzTS05TC01() throws Exception {
        int i = 0;
        String spreadsheetId = "1bJtVC5OBrhZdoCOyRxoTHMs7nWhVMzq8RmpHjBeAQmE";
        String range = "Sheet1!A2:C";
        List<String> actualItems = searchItemByName(spreadsheetId, range);
        List<List<Object>> expectedItems = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedItems) {
            Assert.assertTrue(actualItems.get(i).contains(row.get(2).toString()));
            i++;
        }
        System.out.println("Test cases passed");
    }*/
}

