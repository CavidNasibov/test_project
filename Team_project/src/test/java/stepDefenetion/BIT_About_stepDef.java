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
import utils.SingletonBrowser;
import utils.Utility;

public class BIT_About_stepDef {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BIT_About_page about = new BIT_About_page(driver);

	@Given("User clicks on About")
	public void user_clicks_on_About() {
		about.clickAbout.click();

	}

	@Then("User verifies head title of page WE ARE")
	public void user_verifies_head_title_of_page_WE_ARE() {

		String actualHeader = about.aboutHeadTitle.getText();
		String expectedHeader = "We are";
		assertEquals(expectedHeader.toUpperCase(), actualHeader);
		System.out.println(expectedHeader);
		System.out.println(actualHeader);
	}

	@Then("User verifies headlines of page like About us and Background")
	public void user_verifies_headlines_of_page_like_About_us_and_Background(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(about.aboutHeadlines);

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

	@Then("User check article of About and Background")
	public void user_check_article_of_About_and_Background(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(about.aboutArticles);

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

	@Given("User verifies footer section")
	public void user_verifies_footer_section(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		List<String> actualTopMenus = Utility.webElementToStringList(about.footerSections);

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
