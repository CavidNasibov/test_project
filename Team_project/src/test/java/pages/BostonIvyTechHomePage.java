package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BostonIvyTechHomePage {
WebDriver driver; 
	public BostonIvyTechHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void goToHomePage(WebDriver driver) {
		String url = System.getProperty("url");
		if (url == null) {
			url = "https://bostonivytech.com/";
		}
		driver.get(url);
	}

	




}
