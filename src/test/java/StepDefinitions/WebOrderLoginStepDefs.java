package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class WebOrderLoginStepDefs {

    WebDriver driver = Driver.getDriver();
    LoginPage page = new LoginPage();

    @Given("the user navigate to the web orders page")
    public void the_user_navigate_to_the_web_orders_page() {
        System.out.println("Navigated to web order page");
        driver.get(ConfigReader.getProperty("url"));
    }

    @When("the user provide valid username")
    public void the_user_provide_valid_username() {
        System.out.println("The user sent Tester");
        page.username.sendKeys(ConfigReader.getProperty("username"));
    }

    @When("the user provide valid password")
    public void the_user_provide_valid_password() {
        System.out.println("The user sent test ");
        page.password.sendKeys(ConfigReader.getProperty("password"));
        page.loginBtn.click();
    }

    @Then("the user should see home page")
    public void the_user_should_see_home_page() {
        System.out.println("The user validate home page");
        String expectedTitle = "Web Orders";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("the user provide username {string}")
    public void the_user_provide_username(String username) {
        page.username.sendKeys(username);
    }

    @When("the user provide password {string}")
    public void the_user_provide_password(String password) {
        page.password.sendKeys(password);
        page.loginBtn.click();
    }

    @Then("the user validate text {string}")
    public void the_user_validate_text(String expectedMessage) {
        String actual = page.errorMessage.getText();
        Assert.assertEquals(actual, expectedMessage);
    }

    @When("the user provide valid username {int}")
    public void the_user_provide_username(Integer username) {
        page.username.sendKeys("" + username);
    }

    @When("the user provide valid password {int}")
    public void the_user_provide_password(Integer password) {
        page.password.sendKeys("" + password);

    }

    @When("the user provide username {string} and password {string}")
    public void the_user_provide_username_and_password(String username, String password) {

       page.username.sendKeys(username);
       page.password.sendKeys(password);
       page.loginBtn.click();

    }
}