package pages;


	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class BIT_Services_page {
		WebDriver driver;
		
		
		public BIT_Services_page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public void goToHomePage(WebDriver driver) {
			String url = System.getProperty("url");
			if (url == null) {
				url = "https://bostonivytech.com/";
			}
			driver.get(url);
		}

		
		
		@FindBy (css = "[id = 'menu-item-289']")
		public WebElement clickServices;
		
		@FindBy (css = "[class='elementor-icon-box-title'] span")
		public WebElement servicesHeadTitle;
		
		@FindBy (css = "[class *='elementor-head'] ")
	    public List<WebElement> servicesHeadlines;
		
		@FindBy (css = "[class *='elementor-text']")
	    public List<WebElement> servicesArticles;
		
		 @FindBy (css = " [class *= 'footer-section']")
		    public List<WebElement> footerSections;
	}


