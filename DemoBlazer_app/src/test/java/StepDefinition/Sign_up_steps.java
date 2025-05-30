package StepDefinition;

import static org.junit.Assert.fail;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.actions.SubClassSignUpActions;
import utils.SeleniumDriver;

public class Sign_up_steps {

	//if you want to use driver - you need to use getDriver method from SeleniumDriver class !!

	//create an object for SignUpPageActions
	SubClassSignUpActions signUpActions = new SubClassSignUpActions();
	//	SeleniumDriver driver = new SeleniumDriver();

	WebDriver driver;
	@Given("I am on the Home page of the demoblaze site {string}")
	public void i_am_on_the_home_page_of_the_demoblaze_site(String url) {

		SeleniumDriver.openPage(url);

	}


	@When("I click on the sign up link")
	public void i_click_on_the_SignUp_link() throws InterruptedException {
		signUpActions.SignUpLink();

		//Avoid thread sleeps - slows down the application
		Thread.sleep(3000);
	}


	// --------- used example table instead, reduces 1 step ---------

	//	@And("I enter an invalid username")
	//	public void i_enter_an_invalid_username() throws InterruptedException {
	//	    
	//		signUpActions.EnterUserName("Harry");
	//		Thread.sleep(4000);
	//		
	//	}
	//	@And("I enter an invalid password")
	//	public void i_enter_an_invalid_password() throws InterruptedException {
	//	    
	//		signUpActions.EnterPassword("Harry123");
	//		
	//	}
	// --------------------------------------------------------------


	@And("I enter an invalid {string} and I enter an invalid {string}")
	public void i_enter_an_invalid_and_i_enter_an_invalid(String username, String password) {

		signUpActions.EnterUserName(username);
		signUpActions.EnterPassword(password);

	}


	@And("I click on the sign up button")
	public void i_click_on_the_sign_up_button() throws InterruptedException  {

		signUpActions.ClickSignUp();
		Thread.sleep(2000);

		//handing alerts
		Alert alt = SeleniumDriver.getDriver().switchTo().alert();
		String alertMessage = alt.getText();

		System.out.println("THIS IS THE ALERT MESSAGE --> " + alertMessage);	
		// alt.accept();

		//Different ways to handle alerts - alert.accept();, alert.dismiss();, alert.getText();, alert.sendkeys("input");

	}


	@Then("user should see a prompt that states that the user already exists {string}")
	public void user_should_see_a_prompt_that_states_that_the_user_already_exists(String expAlertMessage) {

		Alert alt = SeleniumDriver.getDriver().switchTo().alert();
		String actAlertMessage = alt.getText();

		if (!expAlertMessage.equals(actAlertMessage)) {
			fail("Expected alert message did not match the actual alert message ");
		}
		else 

			alt.accept();

	}


	@And("I enter a blank username in the username field")
	public void i_enter_a_blank_username_in_the_username_field() {

		signUpActions.EnterUserNameBlank();

	}
	@And("I enter a blank password in the password field")
	public void i_enter_a_blank_password_in_the_password_field() {
		signUpActions.EnterPasswordBlank();
	}


	@Then("user should see a prompt that states that the fields are blank {string}")
	public void user_should_see_a_prompt_that_states_that_the_fields_are_blank(String expAlertMessageBlank) {
		Alert alt = SeleniumDriver.getDriver().switchTo().alert();
		String actAlertMessageBlank = alt.getText();

		if (!expAlertMessageBlank.equals(actAlertMessageBlank)) {
			fail("Blank expected alert message did not match the Blank actual alert message ");
		}
		else 

			alt.accept();
	}


	@And("I enter a {string} and I enter an {string} to sign up")
	public void i_enter_a_and_i_enter_an_to_sign_up(String username, String password) {

		signUpActions.EnterUserName(username);
		signUpActions.EnterPassword(password);



	}
	@Then("user should see a prompt that states that the user has successfully signed up {string}")
	public void user_should_see_a_prompt_that_states_that_the_user_has_successfully_signed_up(String expAlertMessageSignUpSuccess) {

		Alert alt = SeleniumDriver.getDriver().switchTo().alert();
		String actAlertMessageSignUpSuccess = alt.getText();

		if (!expAlertMessageSignUpSuccess.equals(actAlertMessageSignUpSuccess)) {
			fail("Sign up success message did not match. Please change your username and password in feature file");
		}
		else 

			alt.accept();


	}






}




