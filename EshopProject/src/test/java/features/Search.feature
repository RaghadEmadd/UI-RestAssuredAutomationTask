Feature: Search feature

  Scenario: User searches for Oppo device
    Given User is logged in successfully.
    When User searches for device in search bar
    Then User checks if product is out of stock or not and add to cart successfully

