package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BIT_About_page {
	WebDriver driver;

	public BIT_About_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void goToHomePage(WebDriver driver) {
		String url = System.getProperty("url");
		if (url == null) {
			url = "https://bostonivytech.com/";
		}
		driver.get(url);
	}

	@FindBy(css = "[id = 'menu-item-12']")
	public WebElement clickAbout;

	@FindBy(css = "[class *='title'] span")
	public WebElement aboutHeadTitle;

	@FindBy(css = "[class *='size-default'] ")
	public List<WebElement> aboutHeadlines;

	@FindBy(css = "p:nth-child(1)")
	public List<WebElement> aboutArticles;

	@FindBy(css = "[class *= 'footer-section']")
	public List<WebElement> footerSections;
}
