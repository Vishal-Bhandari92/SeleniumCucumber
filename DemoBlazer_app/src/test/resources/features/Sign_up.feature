@Sign-in
Feature: Sign up as a new user on demoblaze app
  I want to use this template for my feature file

  @AlreadyExist
  Scenario Outline: User enters a username and password that already exists
    Given I am on the Home page of the demoblaze site "https://www.demoblaze.com/"
    When I click on the sign up link
    And I enter an invalid "<username>" and I enter an invalid "<password>"
    And I click on the sign up button
    Then user should see a prompt that states that the user already exists "This user already exist."

    Examples: 
      | username | password |
      | Harry    | Harry123 |

  Scenario: User enters username and password field blank when signing up
    Given I am on the Home page of the demoblaze site "https://www.demoblaze.com/"
    When I click on the sign up link
    And I enter a blank username in the username field
    And I enter a blank password in the password field
    And I click on the sign up button
    Then user should see a prompt that states that the fields are blank "Please fill out Username and Password."

  @SignUpSuccess
  Scenario Outline: User enters a username and password to sign up successfully
    Given I am on the Home page of the demoblaze site "https://www.demoblaze.com/"
    When I click on the sign up link
    And I enter a "<username>" and I enter an "<password>" to sign up
    And I click on the sign up button
    Then user should see a prompt that states that the user has successfully signed up "Sign up successful."

    Examples: 
      | username         | password         |
      | Newcastle976dd5678 | Newcastleee9765678 |
