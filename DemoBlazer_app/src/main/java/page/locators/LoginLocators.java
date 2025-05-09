package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	
	@FindBy (id = "login2")
	public WebElement loginLink;
	
	@FindBy (id = "loginusername")
	public WebElement EnterloginUsername;
	
	@FindBy (id = "loginpassword")
	public WebElement EnterloginPassword;
	
	@FindBy (xpath =  "/html/body/div[3]/div/div/div[3]/button[2]")
	public WebElement ClickLoginIn;
	
	@FindBy (id = "nameofuser")
	public WebElement NameofUserWelcome;


}
