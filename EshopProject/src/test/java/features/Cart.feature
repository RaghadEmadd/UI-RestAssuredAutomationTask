Feature: Checkout Validation feature

  Scenario: Changing delivery address to an invalid input
    Given User is logged in successfully.
    When User searches for an item from search bar
    When User selects an item from results
    And User scrolls down
    When User add item to the cart successfully
    And User scrolls down again
    And User clicks on checkout button
    And User sets City details correct
    And User sets District details correct
    And User sets Street Name correct
    When User sets Building Value to an invalid input
    And User sets Floor Number to an invalid input
    And User sets the Apartment Number to an invalid input
    Then Error message should be displayed and Save Address button is dimmed successfully
