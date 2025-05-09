package page.actions;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.PageFactory;

import page.locators.SignUpLocators;
import utils.SeleniumDriver;

public class SignUpActions {
	
	
	//creating an object for LoginPageLocators so we can access all of the page factory elements
	
	
	SignUpLocators signUpLocators = new SignUpLocators();

	public SignUpActions() {
		
		//create an object of loginPageLocators 
		this.signUpLocators = new SignUpLocators();
		//Initialize the page factory
		PageFactory.initElements(SeleniumDriver.getDriver(), signUpLocators);
		
		
	}
	
	//----------this is where we put our actions----------
	
	public void SignUpLink() {
		
		signUpLocators.SignUpLink.click();
		
	}
	
	public void EnterUserName(String UsernameFromDataTable) {
		
		signUpLocators.EnterUsername.sendKeys(UsernameFromDataTable);
		
	}
	
	public void EnterPassword (String PasswordFromDataTable) {
		
		signUpLocators.EnterPassword.sendKeys(PasswordFromDataTable);
		
	}
	
	
	public void ClickSignUp () {
		
		signUpLocators.ClickSignUp.click();
		
		
	}
	
	public void EnterUserNameBlank() {
		
		signUpLocators.EnterUsername.clear();;
		
	}
	
	public void EnterPasswordBlank () {
		
		signUpLocators.EnterPassword.clear();;
		
	}
	
}
