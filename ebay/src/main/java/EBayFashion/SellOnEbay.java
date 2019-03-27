package EBayFashion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SellOnEbay extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"))
    public static WebElement ViewFashion;
    @FindBy(xpath = "//*[@id=\"w1-w4\"]/ul/li[1]/a")
    public static WebElement ViewConsignItem;
    @FindBy(xpath = ("//*[@id=\"w1-w4\"]/ul/li[2]/a"))
    public static WebElement ViewSellDirect;

    public void ClickViewConsignItem() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewConsignItem.click();
    }
    public void ClickViewSellDirect() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewSellDirect.click();
    }
}

