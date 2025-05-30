@Add-to-cart
Feature: Adding items to cart
  I want to use this template for my feature file

  Scenario: Adding multiple items to cart - please make sure before running this test that the cart within the app is empty
    Given I am on the Home page of the demoblaze site "https://www.demoblaze.com/"
    When I click on the login link
    And I enter a username and password to login:
      | Username   | Password   |
      | Vishal5829 | Vishal123! |
    And I click on the login button
    And I add samsung galaxy s6, Iphone6, Nexus6 to cart
    When I click cart
    Then I should see the following on the products page:
      | Title             |
      | Samsung galaxy s6 |
      | Iphone 6 32gb     |
      | Nexus 6           |
    And I sum up the items in my cart
      | Price |
      |   360 |
      |   790 |
      |   650 |
    Then the total value of the items should be 1800
