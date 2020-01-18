package pages;



	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class BIT_BootCamps_page {
		WebDriver driver;
		
		
		public BIT_BootCamps_page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public void goToHomePage(WebDriver driver) {
			String url = System.getProperty("url");
			if (url == null) {
				url = "https://bostonivytech.com/";
			}
			driver.get(url);
		}

		
		
		@FindBy (css = "[id = 'menu-item-288']")
		public WebElement clickBootCamps;
		
		@FindBy (css = "[class *='box-title'] span")
		public WebElement bootCampsHeadTitle;
		
		@FindBy (css = "[class *='size-default']")
	    public List<WebElement> bootCampsHeadlines;
		
		@FindBy (css = "[class *='elementor-text']")
	    public List<WebElement> bootCampsArticles;
		
		@FindBy (css = "[class *= 'elementor-image-box-description']")
	    public List<WebElement> bootCampsAppDesc;
		 
	
	}



	

	

	//app descriptios [class *= 'elementor-image-box-description']
	// click app [class *= 'elementor-image'] a

