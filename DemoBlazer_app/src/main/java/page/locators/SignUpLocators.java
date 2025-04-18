package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpLocators {
	
	@FindBy (id = "login2")
	public WebElement loginLink;
	
	@FindBy (id = "signin2")
	public WebElement SignUpLink;
	
	@FindBy (id = "sign-username")
	public WebElement EnterUsername;
	
	@FindBy (id = "sign-password")
	public WebElement EnterPassword;
	
	@FindBy (xpath =  "/html/body/div[2]/div/div/div[3]/button[2]")
	public WebElement ClickSignUp;

}
