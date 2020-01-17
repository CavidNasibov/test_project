package stepDefenetion;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import utils.SingletonBrowser;

public class google {
	WebDriver driver;
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	
	@Given("I am on Google Home Page {string}")
	public void i_am_on_Google_Home_Page(String url) {
		driver = sb.getDriver();
		driver.get(url);
	}
	    
	
//		
	}

