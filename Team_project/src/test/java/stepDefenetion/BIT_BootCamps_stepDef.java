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
import pages.BIT_HomePage_page;
import pages.BIT_Services_page;
import utils.SingletonBrowser;
import utils.Utility;

public class BIT_BootCamps_stepDef {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BIT_BootCamps_page boot = new BIT_BootCamps_page(driver);

	@Given("User clicks on Boot Camps")
	public void user_clicks_on_Boot_Camps() {
		boot.clickBootCamps.click();
	}

	@Then("User verifies head title of page OUR BOOT CAMP")
	public void user_verifies_head_title_of_page_OUR_BOOT_CAMP() {
		String actualHeader = boot.bootCampsHeadTitle.getText();
		String expectedHeader = "OUR BOOT CAMP";
		System.out.println(expectedHeader);
		System.out.println(actualHeader);
		assertEquals(expectedHeader, actualHeader);
	}

	@Then("User verifies headlines of page")
	public void user_verifies_headlines_of_page(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(boot.bootCampsHeadlines);

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

	@Then("User verifies headline explenations")
	public void user_verifies_headline_explenations(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(boot.bootCampsArticles);

		List<String> expectedTopMenus1 = dataTable.asList();
		List<String> expectedTopMenus = new ArrayList<String>();

		for (String string : expectedTopMenus1) {
			expectedTopMenus.add(string);

		}
		for (int i = 0; i < actualTopMenus.size(); i++) {
			assertTrue(actualTopMenus.get(i).contains(expectedTopMenus1.get(i)));
		}

		System.out.println(actualTopMenus);
		System.out.println(expectedTopMenus);

	}

	@Then("User check description of applications")
	public void user_check_description_of_applications(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(boot.bootCampsAppDesc);

		List<String> expectedTopMenus1 = dataTable.asList();
		List<String> expectedTopMenus = new ArrayList<String>();

		for (String string : expectedTopMenus1) {
			expectedTopMenus.add(string);

		}
		for (int i = 0; i < actualTopMenus.size(); i++) {
			assertTrue(actualTopMenus.get(i).contains(expectedTopMenus1.get(i)));
		}

		System.out.println(actualTopMenus);
		System.out.println(expectedTopMenus);

	}

}
