package stepDefenetion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BostonIvyTechHomePage;

import utils.SingletonBrowser;

public class bostonIvyTech_HP {

	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BostonIvyTechHomePage bt = new BostonIvyTechHomePage(driver);

	@Given("User is on bostonIvyTech home page")
	public void user_is_on_bostonIvyTech_home_page() {
		bt.goToHomePage(driver);
	}

	@Then("User  verifies  bostonIvyTech title {string}")
	public void user_verifies_bostonIvyTech_title(String string) {
//		String actualTitle = driver.getTitle();
//		String expectedTitle = "Title of Page";
//		assertEquals(expectedTitle,actualTitle);
		
		
		assertTrue(driver.getTitle().contains("Boston Ivy Tech – Your Signature in IT"));
		
	}

	//@Given("User verifies primary-menu options")
//	public void user_verifies_primary_menu_options(DataTable dataTable) {
//
//	}

}
