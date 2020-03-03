package StepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class HomePageDefs {

    HomePage homePage = new HomePage();

    @Then("the user validate order menu list")
    public void the_user_validate_order_menu_list() {

        List<String> expected = homePage.orderMenuData();
        List<WebElement>actualList = homePage.orderMenu;
        List <String> actual = new ArrayList<>();

        // used for each loop to get a text
        for(WebElement element :homePage.orderMenu){
            actual.add(element.getText());
        }
        //for loop for assertion
        for(int i =0; i<actual.size(); i++){

            Assert.assertEquals(expected.get(i), actual.get(i));
        }

        System.out.println("This is for menu");
    }


}
