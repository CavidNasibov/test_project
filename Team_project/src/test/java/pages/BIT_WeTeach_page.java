package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BIT_WeTeach_page {

	WebDriver driver;

	public BIT_WeTeach_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void goToHomePage(WebDriver driver) {
		String url = System.getProperty("url");
		if (url == null) {
			url = "https://bostonivytech.com/";
		}
		driver.get(url);
	}

	public static void clickJava(WebDriver driver, String App) {

		driver.findElement(By.cssSelector("[href*='" + App + "']")).click();
		;
	}
}
