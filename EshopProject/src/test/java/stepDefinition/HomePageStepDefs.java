package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utility.browserDriver;

import static pages.homePage.*;

public class HomePageStepDefs extends browserDriver {
    @Given("User opens website")
    public void User_opens_website() throws InterruptedException {
        clickOnLoginIcon();
        login();
        throw new io.cucumber.java.PendingException();
    }

    @Then("User is logged in successfully")
    public void User_is_logged_in_successfully() {
        Assert.assertTrue(welcomeIconXpath.contains(" welcome"));
        throw new io.cucumber.java.PendingException();

    }
}
