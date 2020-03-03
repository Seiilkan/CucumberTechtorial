package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "ctl00_menu")
    public List<WebElement>  orderMenu;
    @FindBy(xpath = "//a[.='View all products']")
    public WebElement viewAllProductButton;
    //this is just an example, normally it should come from Api or Database;
    public List<String> orderMenuData() {
        List<String> menus = new ArrayList<>();
        menus.add("View all orders");
        menus.add("View all products");
        menus.add("Order");
        return menus;
    }


}
