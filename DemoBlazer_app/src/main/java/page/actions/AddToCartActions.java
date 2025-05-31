package page.actions;

import org.openqa.selenium.support.PageFactory;

import page.locators.AddToCartLocators;
import utils.SeleniumDriver;

public abstract class AddToCartActions {
	
	AddToCartLocators addtocartLocators = new AddToCartLocators();

	public AddToCartActions() {
		//create an object of AddToCartLocators 
		this.addtocartLocators = new AddToCartLocators();
		//Initialize the page factory
		PageFactory.initElements(SeleniumDriver.getDriver(), addtocartLocators);
	}
	
	public abstract void clickSamsungGalaxyS6();
	
	public abstract void ClickIphone632GB(); 
	
	public abstract void ClickNexus6(); 
	
	public abstract void ClickAddToCartButton(); 
	
	public abstract void ClickHomeLink();
	
	public abstract void ClickCartLink();
	
	public abstract String SamsungGalaxyGetTitle();

	public abstract String IPhone6GetTitle();

	public abstract String Nexus6GetTitle();

	public abstract int TotalPrice();

}
