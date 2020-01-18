package stepDefenetion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BIT_HomePage_page;

import utils.SingletonBrowser;
import utils.Utility;
import utils.sortString;

public class BIT_HomePage_StepDef {

	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BIT_HomePage_page bt = new BIT_HomePage_page(driver);

	@Given("User is on bostonIvyTech home page")
	public void user_is_on_bostonIvyTech_home_page() {
		bt.goToHomePage(driver);
	}

	@Then("User  verifies  bostonIvyTech title {string}")
	public void user_verifies_bostonIvyTech_title(String string) {

		assertTrue(driver.getTitle().contains("Boston Ivy Tech – Your Signature in IT"));
		
	}

	@Given("User verifies primary-menu options")
	public void user_verifies_primary_menu_options(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		   List<String> actualTopMenus=Utility.webElementToStringList(bt.primaryMenu) ;
		    
		    
		    List<String> expectedTopMenus1=dataTable.asList();
		    List<String> expectedTopMenus=new ArrayList<String>();
		    
		    for (String string : expectedTopMenus1) {
		    	expectedTopMenus.add(string);
			
		    }
		    Collections.sort(actualTopMenus);
		    Collections.sort(expectedTopMenus);
		    System.out.println(actualTopMenus);
		    System.out.println(expectedTopMenus);
		    assertTrue(actualTopMenus.equals(expectedTopMenus));
		}
	@Then("User verifies all head titles")
	public void user_verifies_all_head_titles(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		   List<String> actualTopMenus=Utility.webElementToStringList(bt.allHeadTitles) ;
		  
		   
		    List<String> expectedTopMenus1=dataTable.asList();
		    List<String> expectedTopMenus=new ArrayList<String>();
		    
		    for (String string : expectedTopMenus1) {
		    	expectedTopMenus.add(string);
			
		    }
		    
		    Collections.sort(actualTopMenus);
		    Collections.sort(expectedTopMenus);
		    System.out.println(actualTopMenus);
		    System.out.println(expectedTopMenus);
		    assertTrue(actualTopMenus.equals(expectedTopMenus));
	}

//	@Then("User verifies all icon-box-title")
	public void user_verifies_all_icon_box_title(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		   List<String> actualTopMenus=Utility.webElementToStringList(bt.iconBoxTitle) ;
		  
		   
		    List<String> expectedTopMenus1=dataTable.asList();
		    List<String> expectedTopMenus=new ArrayList<String>();
		    
		    for (String string : expectedTopMenus1) {
		    	expectedTopMenus.add(string);
			
		    }
		    
		    Collections.sort(actualTopMenus);
		    Collections.sort(expectedTopMenus);
		    System.out.println(actualTopMenus);
		    System.out.println(expectedTopMenus);
		    assertTrue(actualTopMenus.equals(expectedTopMenus));
	}
//	@Then("User verifies all elementor-testimonial-contents")
	public void user_verifies_all_elementor_testimonial_contents(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		   List<String> actualTopMenus=Utility.webElementToStringList(bt.elementTestContent) ;
		   
		
		   
		    List<String> expectedTopMenus1=dataTable.asList();
		    List<String> expectedTopMenus=new ArrayList<String>();
		    
		    for (String string : expectedTopMenus1) {
		    	expectedTopMenus.add(string);
		       
		    	
		    }
		    
		    Collections.sort(actualTopMenus);
		    Collections.sort(expectedTopMenus);
		    System.out.println(actualTopMenus);
		    System.out.println(expectedTopMenus);
		    assertTrue(actualTopMenus.equals(expectedTopMenus));
	}
	
	
//	@Then("User verifies all icon-box-descriptions")
	public void user_verifies_all_icon_box_descriptions(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		   List<String> actualTopMenus=Utility.webElementToStringList(bt.iconBoxDescription) ;
		   
		    List<String> expectedTopMenus1=dataTable.asList();
		    List<String> expectedTopMenus=new ArrayList<String>();
		    
		    for (String string : expectedTopMenus1) {
		    	expectedTopMenus.add(string);
		    	
		    }
		    
		    for (int i = 0; i < actualTopMenus.size(); i++) {
		    	assertTrue(actualTopMenus.get(i).contains(expectedTopMenus1.get(i)));
			}
		    Collections.sort(actualTopMenus);
		    Collections.sort(expectedTopMenus);
		    System.out.println(actualTopMenus);
		    System.out.println(expectedTopMenus);
//		    assertTrue(actualTopMenus.equals(expectedTopMenus)); 
	}
//	@And("User verifies footer sections")
	public void user_verifies_footer_sections(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		   List<String> actualTopMenus=Utility.webElementToStringList(bt.footerSections) ;
		   
		    List<String> expectedTopMenus1=dataTable.asList();
		    List<String> expectedTopMenus=new ArrayList<String>();
		    
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





