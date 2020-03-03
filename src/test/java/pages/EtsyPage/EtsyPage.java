package pages.EtsyPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class EtsyPage {


    public EtsyPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;
    @FindBy (xpath = "//button[@value= 'Search']")
    public WebElement searchButton;


}
