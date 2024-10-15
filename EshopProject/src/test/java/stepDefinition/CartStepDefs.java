package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.browserDriver;

import static pages.CartPage.*;
import static pages.homePage.clickOnLoginIcon;
import static pages.homePage.login;


public class CartStepDefs extends browserDriver {
    @Given("User is logged in successfully")
    public void User_is_logged_in_successfully() throws InterruptedException {
        clickOnLoginIcon();
        login();
        throw new io.cucumber.java.PendingException();
    }

    @When("User searches for an item from search bar")
    public void User_searches_for_an_item_from_search_bar() {
        clickOnSearchField();
        sendKeysInSearchField();
        throw new io.cucumber.java.PendingException();

    }

    @When("User selects an item from results")
    public void User_selects_an_item_from_results() {
        selectSamsungInSmartPhonesTab();
        throw new io.cucumber.java.PendingException();
    }

    @And("User scrolls down")
    public void User_scrolls_down() {
        scrollDown();
        throw new io.cucumber.java.PendingException();
    }

    @When("User add item to the cart successfully")
    public void User_add_item_to_the_cart_successfully() {
        selectItemToBeAddedToCart();
        throw new io.cucumber.java.PendingException();
    }

    @And("User scrolls down again")
    public void User_scrolls_down_again() {
        scrollDown();
        clickOnAddToCartButton();
        assertItemAddedSuccessfully();
        throw new io.cucumber.java.PendingException();
    }

    @And("User clicks on checkout button")
    public void User_clicks_on_checkout_button() {
        clickOnCartIcon();
        scrollUp();
        clickOnGoToCheckoutButton();
        throw new io.cucumber.java.PendingException();
    }

    @And("User sets City details correct")
    public void User_sets_City_details_correct() {
        clickOnAddNewAddressIcon();
        selectCityFromDropDownList();
        throw new io.cucumber.java.PendingException();
    }

    @And("User sets District details correct")
    public void User_sets_District_details_correct() {
        selectDistrictFromDropDownList();
        throw new io.cucumber.java.PendingException();
    }

    @And("User sets Street Name correct")
    public void User_sets_Street_Name_correct() {
        sendKeysInStreetNameField();
        throw new io.cucumber.java.PendingException();
    }

    @When("User sets Building Value to an invalid input")
    public void User_sets_Building_Value_to_an_invalid_input() {
        sendKeysInBuildingNumberField();
        throw new io.cucumber.java.PendingException();
    }

    @And("User sets Floor Number to an invalid input")
    public void User_sets_Floor_Number_to_an_invalid_input() {
        sendKeysInFloorNumberField();
        throw new io.cucumber.java.PendingException();
    }

    @And("User sets the Apartment Number to an invalid input")
    public void User_sets_the_Apartment_Number_to_an_invalid_input() {
        sendKeysInApartmentNumberField();
        throw new io.cucumber.java.PendingException();

    }

    @Then("Error message should be displayed and Save Address button is dimmed successfully")
    public void Error_message_should_be_displayed_and_Save_Address_button_is_dimmed_successfully() {
        assertErrorMessage();
        assertSaveButtonIsDimmed();
        throw new io.cucumber.java.PendingException();
    }
}
