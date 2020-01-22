package stepDefenetion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BIT_Registr_page;
import utils.SingletonBrowser;

public class BIT_Registr_stepDef {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BIT_Registr_page reg = new BIT_Registr_page(driver);
	WebDriverWait wait = new WebDriverWait(driver, 120);

	@Given("User click on Register button")
	public void user_click_on_Register_button() {
		reg.clickRegister.click();

	}

	@Then("User types firstname {string}")
	public void user_types_firstname(String name) throws InterruptedException {

		// With this method I wasn't able close parent page,thats why method with set
		// more efficiently toSwitch;
//		But except that issue everything works proporly

//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		for (int i = 0; i < tabs.size(); i++) {
//			
//			 driver.switchTo().window(tabs.get(i));
//			 
//		}

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(parent);
		driver.close();
		driver.switchTo().window(child);
		reg.typesFirstname.sendKeys(name);
	}

	@Then("User types middlename {string}")
	public void user_types_middlename(String middlename) {
		reg.typeMiddlename.sendKeys(middlename);
	}

	@Then("User types lastname {string}")
	public void user_types_lastname(String lastname) {
		reg.typesLastname.sendKeys(lastname);

	}

	@Then("User chooses gender {string}")
	public void user_chooses_gender(String female) throws InterruptedException {
		Thread.sleep(4000);

		Select gender = new Select(driver.findElement(By.cssSelector("[name='_aol_app_10']")));
		gender.selectByVisibleText(female);

	}

	@Then("User types email {string}")
	public void user_types_email(String email) {
		reg.typesEmail.sendKeys(email);
	}

	@Then("User types phone number {string}")
	public void user_types_phone_number(String phoneNumber) {
		reg.typesPhoneNumber.sendKeys(phoneNumber);
	}

	@Then("User choose work status {string}")
	public void user_choose_work_status(String decision1) {
		reg.workStatus(driver, decision1);
	}

	@Then("User choose past experience {string}")
	public void user_choose_past_experience(String decision2) {
		reg.pastExperience(driver, decision2);
	}

	@Then("User click submit button")
	public void user_click_submit_button() {
		reg.submitButton.submit();
	}

	@Then("User verifies response sending message{string}")
	public void user_verifies_response_sending_message(String expectedHeader) throws InterruptedException {
		String actualHeader = reg.status.getText();
		System.out.println(expectedHeader);
		System.out.println(actualHeader);
		assertTrue(actualHeader.contains(expectedHeader));

	}
}
