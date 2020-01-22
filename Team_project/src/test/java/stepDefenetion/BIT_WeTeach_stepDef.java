package stepDefenetion;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import pages.BIT_Registr_page;
import pages.BIT_WeTeach_page;
import utils.SingletonBrowser;

public class BIT_WeTeach_stepDef {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BIT_WeTeach_page we = new BIT_WeTeach_page(driver);
	WebDriverWait wait = new WebDriverWait(driver, 120);

	@Then("User clicks on application {string}")
	public void user_clicks_on_application(String App) {
		we.clickJava(driver, App);
	}

	@Then("User verifies title of webpage Java {string}")
	public void user_verifies_title_of_webpage_Java(String title) {
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(parent);
		driver.close();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		System.out.println(title);
		assertTrue(driver.getTitle().contains(title));
	}
}
