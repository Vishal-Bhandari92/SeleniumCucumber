package StepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.actions.AddToCartActions;
import utils.SeleniumDriver;

public class Add_to_cart_steps {

	private int priceOne;
	private int priceTwo;
	private int priceThree;
	private int result;
	
	private String ActSamsungTitle;
	private String ActNexusTitle;
	private String ActIPhone;


	AddToCartActions addtocartActions = new AddToCartActions();

	@And("I add samsung galaxy s6, Iphone6, Nexus6 to cart")
	public void i_add_samsung_galaxy_s6_iphone6_nexus6_to_cart() throws InterruptedException {


		addtocartActions.clickSamsungGalaxyS6();
		addtocartActions.ClickAddToCartButton();
		Thread.sleep(6000);
		Alert alt = SeleniumDriver.getDriver().switchTo().alert();
		alt.accept();

		addtocartActions.ClickHomeLink();

		addtocartActions.ClickNexus6();
		addtocartActions.ClickAddToCartButton();
		Thread.sleep(5000);
		alt.accept();

		addtocartActions.ClickHomeLink();

		addtocartActions.ClickIphone632GB();
		addtocartActions.ClickAddToCartButton();
		Thread.sleep(4000);
		alt.accept();


	}

	@And("I click cart")
	public void i_click_cart() throws InterruptedException {

		addtocartActions.ClickCartLink();
		Thread.sleep(5000);


	}


	@Then("I should see the following on the products page:")
	public void i_should_see_the_following_on_the_products_page(DataTable dataTable) {

		List<Map<String, String>>userList = dataTable.asMaps(String.class, String.class);


		//System.out.println("This is my map" +userList);
		//System.out.println("This is my samsung title" +userList.get(2).get("Title"));

		this.ActSamsungTitle = addtocartActions.SamsungGalaxyGetTitle();
		this.ActNexusTitle = addtocartActions.Nexus6GetTitle();
		this.ActIPhone = addtocartActions.IPhone6GetTitle();


		assertEquals(userList.get(0).get("Title"), this.ActSamsungTitle);
		assertEquals(userList.get(1).get("Title"), this.ActIPhone);
		assertEquals(userList.get(2).get("Title"), this.ActNexusTitle);



	}

	@And("I sum up the items in my cart")
	public void i_sum_up_the_items_in_my_cart(DataTable dataTable) {

		List<Map<String, Integer>>priceList = dataTable.asMaps(String.class, Integer.class);

		
		this.priceOne = priceList.get(0).get("Price");
		this.priceTwo = priceList.get(1).get("Price");
		this.priceThree = priceList.get(2).get("Price");

		this.result = priceOne + priceTwo + priceThree;

	//	System.out.println("This is my result -> " + result);

	}


	@Then("the total value of the items should be {int}")
	public void the_total_value_of_the_items_should_be(Integer int1) {
		
		assertEquals(this.result, addtocartActions.TotalPrice());
	}



}
