package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumDriver;

import io.cucumber.java.After;


public class SeleniumDriver {
	
	private static SeleniumDriver seleniumdriver;
	
	//init Webdriver
	private static WebDriver driver;
	
	//private static WebDriverWait waitDriver;
	
	//30 seconds to timeout page 
	//public final static int TIMEOUT = 30;
	
	//Should not take more than 50 seconds to load the page
	//public final static int PAGE_LOAD_TIMEOUT = 50;
	
	private SeleniumDriver()  {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/execute/chromedriver.exe");
		
		//Firefox driver --- System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/execute/geckodriver.exe");

		//This constructor will always be called. It should create an object of ChromeDriver
		driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		// driver.get("https://www.demoblaze.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));	
			//30 seconds to timeout page 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //page should not take more than 50 seconds to load
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	
}

	public static void openPage(String url) {
	//When ever you want to navigate to a URL, you need to call this method always
		driver.get(url);
		}
	
	public static WebDriver getDriver() {
		//this will return driver
		return driver;
	}
	
	
	
	public static void setUpDriver() {
		
		if(seleniumdriver==null){
			
			seleniumdriver = new SeleniumDriver(); 
			
			
		}
		
	
	}
	
	public static void tearDown() {
		
		if (driver !=null) {
			
			driver.close();
			driver.quit();
			
		}
		seleniumdriver = null;
		
	}
	
	
	
}


