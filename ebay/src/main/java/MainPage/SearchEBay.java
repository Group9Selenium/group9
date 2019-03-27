package MainPage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchEBay extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"gh-ac\"]")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.XPATH, using ="//*[@id=\"gh-btn\"]")
    public static WebElement submitButtonWebElement;
    public WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }
    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton() throws InterruptedException {
        getSubmitButtonWebElement().click();
        driver.navigate().back();
        Thread.sleep(2000);
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton() throws IOException, InterruptedException {
        List<String> list = getItemValue();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }
    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }
    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }
    public void searchItems() throws InterruptedException, IOException {
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
    public List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("book");
        itemsList.add("cars");
        itemsList.add("watch");
        itemsList.add("clock");
        itemsList.add("notebook");
        itemsList.add("car parts");
        itemsList.add("baby diaper");
        itemsList.add("hammer");
        return itemsList;
    }
}
