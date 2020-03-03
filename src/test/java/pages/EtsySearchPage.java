package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class EtsySearchPage {

    public EtsySearchPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy (xpath = "//input[@id = 'global-enhancements-search-query']")
    public WebElement searchField;
    @FindBy (xpath = "//button[@value= 'Search']")
    public WebElement searchButton;




}
