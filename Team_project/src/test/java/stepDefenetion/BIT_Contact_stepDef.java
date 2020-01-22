package stepDefenetion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BIT_About_page;
import pages.BIT_BootCamps_page;
import pages.BIT_Contact_page;
import pages.BIT_HomePage_page;
import pages.BIT_Services_page;
import utils.SingletonBrowser;
import utils.Utility;

public class BIT_Contact_stepDef {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BIT_Contact_page con = new BIT_Contact_page(driver);

	@Given("User clicks on Contact")
	public void user_clicks_on_Contact() {
		con.clickContact.click();
	}

	@Then("User verifies head title of page Contact")
	public void user_verifies_head_title_of_page_Contact() {
		String actualHeader = con.clickContact.getText();
		String expectedHeader = "Contact";
		System.out.println(expectedHeader);
		System.out.println(actualHeader);
		assertEquals(expectedHeader, actualHeader);
	}

	@Then("User verifies heading titles")
	public void user_verifies_heading_titles(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(con.contactHeadingTitles);

		List<String> expectedTopMenus1 = dataTable.asList();
		List<String> expectedTopMenus = new ArrayList<String>();

		for (String string : expectedTopMenus1) {
			expectedTopMenus.add(string);

		}
		Collections.sort(actualTopMenus);
		Collections.sort(expectedTopMenus);

		System.out.println(actualTopMenus);
		System.out.println(expectedTopMenus);
		assertTrue(actualTopMenus.equals(expectedTopMenus));

	}

	@Then("User verifies contact head titles")
	public void user_verifies_contact_head_titles(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(con.contactHT);

		List<String> expectedTopMenus1 = dataTable.asList();
		List<String> expectedTopMenus = new ArrayList<String>();

		for (String string : expectedTopMenus1) {
			expectedTopMenus.add(string);

		}
		Collections.sort(actualTopMenus);
		Collections.sort(expectedTopMenus);

		System.out.println(actualTopMenus);
		System.out.println(expectedTopMenus);
		assertTrue(actualTopMenus.equals(expectedTopMenus));

	}

	@Then("User verifies head titles of registration table")
	public void user_verifies_head_titles_of_registration_table(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(con.contactRegHT);

		List<String> expectedTopMenus1 = dataTable.asList();
		List<String> expectedTopMenus = new ArrayList<String>();

		for (String string : expectedTopMenus1) {
			expectedTopMenus.add(string);

		}
		Collections.sort(actualTopMenus);
		Collections.sort(expectedTopMenus);

		System.out.println(actualTopMenus);
		System.out.println(expectedTopMenus);
		assertTrue(actualTopMenus.equals(expectedTopMenus));

	}
}
