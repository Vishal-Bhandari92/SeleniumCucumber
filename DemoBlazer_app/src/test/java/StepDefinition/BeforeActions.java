package StepDefinition;



import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	
	@Before
	public static void setUp() {
		
		//before anything is executed it should call set up driver and set up driver should create an object of selenium driver
		//then selenium driver will launch chrome driver, the waits etc
		
		SeleniumDriver.setUpDriver();
		
		
	}

}
