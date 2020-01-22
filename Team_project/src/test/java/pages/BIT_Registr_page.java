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

public class BIT_Registr_page {

	WebDriver driver;

	public BIT_Registr_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void goToHomePage(WebDriver driver) {
		String url = System.getProperty("url");
		if (url == null) {
			url = "https://bostonivytech.com/";
		}
		driver.get(url);
	}

	@FindBy(css = "[data-id='6d0d9cb'] [class *='text']")
	public WebElement clickRegister;

	@FindBy(css = "[id='1']")
	public WebElement typesFirstname;

	@FindBy(css = "[id='3']")
	public WebElement typeMiddlename;

	@FindBy(css = "[id='2']")
	public WebElement typesLastname;

	@FindBy(css = "[value='Male']")
	public WebElement chooseGender;

	@FindBy(css = "[name='_aol_app_5']")
	public WebElement typesEmail;

	@FindBy(css = "[name='_aol_app_6']")
	public WebElement typesPhoneNumber;

	public static void workStatus(WebDriver driver, String decision1) {

		driver.findElement(By.cssSelector("[id='7'] [id='" + decision1 + "']")).click();
		;

	}

	public static void pastExperience(WebDriver driver, String decision2) {

		driver.findElement(By.cssSelector("[id='8'] [id='" + decision2 + "']")).click();
		;

	}

	@FindBy(css = "[id='aol_app_submit_button']")
	public WebElement submitButton;

	@FindBy(css = "[class='alert alert-success']")
	public WebElement status;

}
