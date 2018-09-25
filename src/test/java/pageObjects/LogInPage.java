package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage extends BasePage {

	WebDriver driver;
	public LogInPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(how = How.CSS, using = "#ap_email")
	WebElement userText;
	
	@FindBy(how = How.CSS, using = ".a-button-input")
	WebElement continueBtn;
	
	@FindBy(how = How.CSS, using = "#ap_password")
	WebElement passwdText;
	
	@FindBy(how = How.CSS, using = "#signInSubmit")
	WebElement submitBtn;
	
	public void inputLogInInfo(String username, String passwd) {
		userText.sendKeys(username);
		continueBtn.click();
		passwdText.sendKeys(passwd);
		submitBtn.click();
	}

}
