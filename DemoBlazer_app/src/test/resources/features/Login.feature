@Login
Feature: Log in
  I want to use this template for my feature file

  Scenario: Logging into the app
    Given I am on the Home page of the demoblaze site "https://www.demoblaze.com/"
    When I click on the login link
    And I enter a username and password to login:
      | Username   | Password   |
      | Vishal5829 | Vishal123! |
    And I click on the login button
    Then I should see "Welcome Vishal5829" as logged in

  Scenario: User does not exist when logging in
    Given I am on the Home page of the demoblaze site "https://www.demoblaze.com/"
    When I click on the login link
    And I enter a username and password to login:
      | Incorrect Username | Incorrect Password |
      | Vishal4334         | Vishal125          |
    And I click on the login button
    Then user should see a prompt that states that "User does not exist."
