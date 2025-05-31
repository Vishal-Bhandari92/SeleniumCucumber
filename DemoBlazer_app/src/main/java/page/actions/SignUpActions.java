package page.actions;

import org.openqa.selenium.support.PageFactory;
import page.locators.SignUpLocators;
import utils.SeleniumDriver;

public abstract class SignUpActions {
	
	//creating an object for SignUpLocators so we can access all of the page factory elements
	
	SignUpLocators signUpLocators = new SignUpLocators();

	public SignUpActions() {
		
		//create an object of loginPageLocators 
		this.signUpLocators = new SignUpLocators();
		//Initialize the page factory
		PageFactory.initElements(SeleniumDriver.getDriver(), signUpLocators);
		
		
	}
	
	//----------this is where we put our actions----------
	
	public abstract void SignUpLink();
	
	public abstract void EnterUserName(String UsernameFromDataTable);
	
	public abstract void EnterPassword (String PasswordFromDataTable);
	
	public abstract void ClickSignUp();
	
	public abstract void EnterUserNameBlank();
	
	public abstract void EnterPasswordBlank();
	
}
