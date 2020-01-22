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
import pages.BIT_HomePage_page;
import pages.BIT_Services_page;
import utils.SingletonBrowser;
import utils.Utility;

public class BIT_Services_stepDef {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BIT_Services_page services = new BIT_Services_page(driver);

	@Given("User clicks on Services")
	public void user_clicks_on_Service() throws InterruptedException {

		services.clickServices.click();
	}

	@Then("User verifies head title of page OUR SERVICES")
	public void user_verifies_head_title_of_page_OUR_SERVICES() {
		String actualHeader = services.servicesHeadTitle.getText();
		String expectedHeader = "OUR SERVICES";
		System.out.println(expectedHeader);
		System.out.println(actualHeader);
		assertEquals(expectedHeader, actualHeader);
	}

	@Then("User verifies headlines of page like QA Engineer Boot Camps,Software Testing and Onsite Trainings")
	public void user_verifies_headlines_of_page_like_QA_Engineer_Boot_Camps_Software_Testing_and_Onsite_Trainings(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(services.servicesHeadlines);

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

	@Then("User check article of QA Engineer Boot Camps,Software Testing and Onsite Trainings")
	public void user_check_article_of_QA_Engineer_Boot_Camps_Software_Testing_and_Onsite_Trainings(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(services.servicesArticles);

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
