package DataReader;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


import java.io.IOException;

public class TestExcelSearch extends ExcelSearch {
    ExcelSearch objExcelFile;

    @BeforeMethod
    public void initialization() {
        objExcelFile = PageFactory.initElements(driver, ExcelSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
    }

    //User should be able to search items using itemlist from excel file
    @Test
    public void searchProdctUsingExcelInfo() throws IOException, InterruptedException {
        String[] actualItems = objExcelFile.searchProduct("DataEBay.xls");
    }
}
