package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utility.browserDriver;

import static pages.SearchPage.checkIfProductOutOfStock;
import static pages.homePage.*;

public class SearchStepDefs extends browserDriver {
    @Given("User is logged in successfully.")
    public void User_is_logged_in_successfully() throws InterruptedException {
        clickOnLoginIcon();
        login();
        throw new io.cucumber.java.PendingException();
    }

    @When("User searches for device in search bar")
    public void User_searches_for_device_in_search_bar() {
        searchForOppoPhone();
        throw new io.cucumber.java.PendingException();
    }

    @And("User checks if product is out of stock or not and add to cart successfully")
    public void User_checks_if_product_is_out_of_stock_or_not_and_add_to_cart_successfully() {
        checkIfProductOutOfStock();
        throw new io.cucumber.java.PendingException();
    }
}
