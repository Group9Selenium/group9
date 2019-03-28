package DataReader;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.IOException;

public class TestExcelSearch extends ExcelSearch {
    /*ExcelSearch objExcelFile;
    @BeforeMethod
    public void initialization(){
        objExcelFile = PageFactory.initElements(driver, ExcelSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
    }
    //User should be able to search items using itemlist from excel file
    @Test
    public void searchProdctUsingExcelInfo() throws IOException, InterruptedException {
        String[] actualItems = objExcelFile.searchProduct("DataEBay.xls");
    }
    //Test using Assert statement
    @Test
    public void searchProductUsingExcel() throws IOException, InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        String[] expectedItems = objExcelFile.getAssertData("DataEBay.xls");
        String[] actualItems = objExcelFile.getExcelData("DataEBay.xls");
        for (int i = 0; i < actualItems.length; i++) {
            Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": Test - Passed"+actualItems[i]);
        }
        System.out.println("searchProductUsingExcel test pass");
    }*/

}
