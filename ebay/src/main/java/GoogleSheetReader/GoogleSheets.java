package GoogleSheetReader;

import base.CommonAPI;
//import com.google.api.services.sheets.v4.Sheets;
//import com.google.api.services.sheets.v4.model.*;
//import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
//import static googleAPIs.GoogleSheetReader.getSheetsService;

public class GoogleSheets extends CommonAPI {
    /*public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    public void keysInput(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }
    public String getTextByXpath(String locator){
        String st = driver.findElement(By.xpath(locator)).getText();
        return st;
    }
    public List<String> searchItemByName(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : values) {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            keysInput("//*[@id=\"gh-ac\"]");
            actual.add(getTextByXpath("//*[text()='"+row.get(1).toString()+"']"));
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        return actual;
    }*/
}