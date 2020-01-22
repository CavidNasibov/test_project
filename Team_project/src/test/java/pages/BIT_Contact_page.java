package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BIT_Contact_page {
	WebDriver driver;

	public BIT_Contact_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void goToHomePage(WebDriver driver) {
		String url = System.getProperty("url");
		if (url == null) {
			url = "https://bostonivytech.com/";
		}
		driver.get(url);
	}

	@FindBy(css = "[id = 'menu-item-150']")
	public WebElement clickContact;

	@FindBy(css = "[class *= 'populated'] h1 > span")
	public WebElement contactHeadTitle;

	@FindBy(css = "[class *='elementor-heading']")
	public List<WebElement> contactHeadingTitles;

	@FindBy(css = "[class ='elementor-icon-box-title'] ")
	public List<WebElement> contactHT;

	@FindBy(css = "[class ='elementor-icon-box-description']")
	public List<WebElement> contactInformation;

	@FindBy(css = "form > p> label")
	public List<WebElement> contactRegHT;


}
