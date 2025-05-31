package page.actions;

public class SubClassAddToCartActions extends AddToCartActions {

	@Override
	public void clickSamsungGalaxyS6() {

		addtocartLocators.SamsungGalaxyS6Link.click();
	}

	@Override
	public void ClickIphone632GB() {

		addtocartLocators.Iphone6Link.click();

	}
	@Override
	public void ClickNexus6() {

		addtocartLocators.Nexus6Link.click();


	}
	@Override
	public void ClickAddToCartButton() {

		addtocartLocators.AddToCartBtn.click();

	}
	@Override
	public void ClickHomeLink() {

		addtocartLocators.HomeLink.click();

	}
	@Override
	public void ClickCartLink() {

		addtocartLocators.CartLink.click();

	}

	@Override
	public String SamsungGalaxyGetTitle() {

		return addtocartLocators.SamsungGalaxyTitle.getText();

	}

	@Override
	public String IPhone6GetTitle() {

		return addtocartLocators.IPhone6Title.getText();

	}

	@Override
	public String Nexus6GetTitle() {

		return addtocartLocators.Nexus6Title.getText();

	}

	@Override
	public int TotalPrice() {
		//use the text and then parse it using an integer
		int i = Integer.parseInt(addtocartLocators.Total.getText());
		return i;

	}

}
