package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BIT_Contact_Click_page {

WebDriver driver;

public BIT_Contact_Click_page(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void goToHomePage(WebDriver driver) {
String url = System.getProperty("url");
if(url == null) {
url = "https://bostonivytech.com/";
}
driver.get(url);
}


@FindBy (css = "[id = 'menu-item-150']")
public WebElement clickContact;



@FindBy (css = "[name='your-name']")
public WebElement typesName;



@FindBy (css = "[name='your-email']")
public WebElement fillsEmail;


@FindBy (css = "[name='your-subject']")
public WebElement entersSubject;



@FindBy (css = "[name='your-message']")
public WebElement sendsMessage;



@FindBy (css = "[class='wpcf7-form-control wpcf7-submit']")
public WebElement sendButton;



@FindBy (css = " [class *= 'wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ok']")
public WebElement verifyMessage;



}
