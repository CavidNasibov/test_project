package stepDefenetion;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BIT_Contact_Click_page;
import utils.SingletonBrowser;

public class BIT_Contact_click_stepDef {
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BIT_Contact_Click_page cont = new BIT_Contact_Click_page(driver);

	@Given("User click on Contact")
	public void user_click_on_Contact() {
	cont.clickContact.click();
	}

	@Then("User types name {string}")
	public void user_types_name(String name) {

	cont.typesName.sendKeys(name);

	}

	@Then("User fills email {string}")
	public void user_fills_email(String email) {

	cont.fillsEmail.sendKeys(email);

	}

	@Then("User enters subject {string}")
	public void user_enters_subject(String subject) {
	cont.entersSubject.sendKeys(subject);

	}

	@Then("User sends message {string}")
	public void user_sends_message(String message) {
	cont.sendsMessage.sendKeys(message);

	}

	@Then("User clicks send button")
	public void user_clicks_send_button() {
	cont.sendButton.click();

	}

	@Then("User verifies response after sending message {string}")
	public void user_verifies_response_after_sending_message(String expectedHeader) {
	String actualHeader = cont.verifyMessage.getText();
	System.out.println(expectedHeader);
	System.out.println(actualHeader);
	assertEquals(actualHeader, expectedHeader);
	}

}
