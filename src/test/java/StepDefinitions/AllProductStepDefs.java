package StepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllProductsPage;
import pages.HomePage;

import java.util.List;

public class AllProductStepDefs {


    HomePage homepage = new HomePage();
    AllProductsPage allProductsPage = new AllProductsPage();

    @Then("the user click view all products button")
    public void the_user_click_view_all_products_button() {
        homepage.viewAllProductButton.click();
    }

    @Then("the user validate product table")
    public void the_user_validate_product_table() {
        List<String> actualList=allProductsPage.getProductList();
        List<String> expectedList=allProductsPage.expectedData();
        Assert.assertTrue(actualList.containsAll(expectedList));
    }
    @Then("the user validate header List of All Orders")
    public void the_user_validate_header_List_of_All_Orders() {
        homepage.orderMenuData();
    }


}
