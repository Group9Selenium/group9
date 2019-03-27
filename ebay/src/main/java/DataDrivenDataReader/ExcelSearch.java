package DataDrivenDataReader;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

import static org.openqa.selenium.support.How.XPATH;

public class ExcelSearch extends CommonAPI {
    /*@FindBy(how = XPATH, using ="//*[@id=\"gh-ac\"]")
    public static WebElement searchBox;
    @FindBy(how = XPATH, using ="//*[@id=\"gh-btn\"]")
    public static WebElement resultText;
    //ExcelDataReader dtr = new ExcelDataReader();
    //Read data for input search
    public String[] getExcelData(String fileName) throws IOException {
        String path = "../eBay/data/" + fileName;
        String[] output = dtr.colReader(path, 2); //Reading from column2
        return output;
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value + Keys.ENTER);
    }
    //Read data for Expected result
    public String[] getAssertData(String fileName) throws IOException {
        String path = "../eBay/data/" + fileName;
        String[] output = dtr.colReader(path, 3);  //Reading from Column3 which has Expected data
        return output;
    }
    //Search Product using Excel data
    public String[] searchProduct(String fileName) throws IOException, InterruptedException {
        String[] searchItem = getExcelData(fileName);
        String[] actual = new String[searchItem.length];
        for (int i = 0; i < searchItem.length; i++) {
            searchBox.sendKeys(searchItem[i]);
            resultText.click();
            searchBox.clear();
        }
        return actual;
    }*/
}


