package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartLocators {
	
	@FindBy (linkText = "Samsung galaxy s6")
	public WebElement SamsungGalaxyS6Link;

	@FindBy (xpath = "/html/body/div[5]/div/div[2]/div[2]/div/a")
	public WebElement AddToCartBtn;

	@FindBy (css = "a.nav-link")
	public WebElement HomeLink;
	
	@FindBy (xpath = "/html/body/div[5]/div/div[2]/div/div[3]/div/div/h4/a")
	public WebElement Nexus6Link;
	
	@FindBy (linkText = "Iphone 6 32gb")
	public WebElement Iphone6Link;
	
	@FindBy (id = "cartur")
	public WebElement CartLink;
	
	//have to create a new XPath expression to search text in table i.e. this selects any td that contains this text
	@FindBy (xpath = "//tr/td[normalize-space(text())=\"Samsung galaxy s6\"]")
	public WebElement SamsungGalaxyTitle;
	
	//have to create a new XPath expression to search text in table i.e. this selects any td that contains this text
	@FindBy (xpath = "//tr/td[normalize-space(text())=\"Iphone 6 32gb\"]")
	public WebElement IPhone6Title;
	
	
//	//have to create a new XPath expression to search text in table i.e. this selects any td that contains this text
	@FindBy (xpath = "//tr/td[normalize-space(text())=\"Nexus 6\"]")
	public WebElement Nexus6Title;
	
	@FindBy (id = "totalp")
	public WebElement Total;
	

	
}
