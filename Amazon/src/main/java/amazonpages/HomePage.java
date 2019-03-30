package amazonpages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(className = "nav-input")
    private WebElement searchButton;

    @FindBy(id = "nav-cart")
    private WebElement cartButton;

    @FindBy(id = "nav-your-amazon")
    private WebElement yourAmazonButton;

    @FindBy(css = ".Your Account")
    private WebElement topLink;

    public void setSearchBox(String text) {
        this.searchBox.sendKeys(text);
    }

    public void setSearchButton(){
        this.searchButton.click();
    }

    public void setYourAmazonButton(){
        this.yourAmazonButton.click();
    }


}
