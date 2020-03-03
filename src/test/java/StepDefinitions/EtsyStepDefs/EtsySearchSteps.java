package StepDefinitions.EtsyStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.EtsyPage.EtsyPage;
import utils.ConfigReader;
import utils.Driver;

public class EtsySearchSteps {
  WebDriver driver= Driver.getDriver();
  EtsyPage page = new EtsyPage();
    @Given("the user navigate to the Etsy web page")
    public void the_user_navigate_to_the_Etsy_web_page() {
    driver.get(ConfigReader.getProperty("etsyUrl"));
    }

    @When("the user search {string}")
    public void the_user_search(String searchValue) {
        page.searchBox.sendKeys(searchValue);
        page.searchButton.click();
    }

    @Then("the user validate title {string}")
    public void the_user_validate_title(String expectedtitle) {
        String actual = driver.getTitle();
        Assert.assertTrue(actual.equals(expectedtitle));
    }







}
