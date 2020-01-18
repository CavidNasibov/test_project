package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BIT_HomePage_page {
	WebDriver driver;

	public BIT_HomePage_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void goToHomePage(WebDriver driver) {
		String url = System.getProperty("url");
		if (url == null) {
			url = "https://bostonivytech.com/";
		}
		driver.get(url);
	}

	@FindBy(css = "[class *= 'main-header-menu ast'] li a")
	public List<WebElement> primaryMenu;

	
    @FindBy (css = "[class *= 'elementor-heading-title'] ")
    public List<WebElement> allHeadTitles;
    
    @FindBy (css = "[class *= 'elementor-icon-box-title'] span")
    public List<WebElement> iconBoxTitle;

    @FindBy (css = "[class= 'elementor-testimonial-content'")
    public List<WebElement> elementTestContent;
    
    @FindBy (css = " [class *= 'footer-section']")
    public List<WebElement> footerSections;
    
    @FindBy (css = "[class = 'elementor-icon-box-description']")
    public List<WebElement> iconBoxDescription;
}








