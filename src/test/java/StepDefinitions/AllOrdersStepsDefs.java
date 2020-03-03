package StepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllOrdersPage;

public class AllOrdersStepsDefs {

    AllOrdersPage ordersPage = new AllOrdersPage();


    @Then("the user validate header text {string}")
    public void the_user_validate_header_text(String expectedText) {

        String actual = ordersPage.header.getText().trim();
        Assert.assertTrue(actual.equals(expectedText.trim()));



    }
}
