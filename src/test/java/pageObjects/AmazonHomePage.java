package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage extends BasePage {

	WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		super(driver);	
		this.driver = driver;		
	}
	
	@FindBy(how = How.CSS, using = "#twotabsearchtextbox")
	public WebElement searchText;
	
	@FindBy(how = How.CSS, using = ".nav-search-submit > input:nth-child(2)")
	public WebElement searchBtn;
	
	@FindBy(how = How.CSS, using = "#nav-orders > span:nth-child(2)")
	public WebElement orderBtn;
	
	@FindBy(how = How.CSS, using = "#nav-flyout-ya-signin > a:nth-child(1) > span:nth-child(1)")
	public WebElement signInBtn;
	
	public SearchResultPage searchBook(String searchStr) {
		searchText.sendKeys(searchStr);
		searchBtn.click();
		return new SearchResultPage(driver); 
	}
	
	public LogInPage clickOrder() {
		orderBtn.click();
		return new LogInPage(driver);
	}

	public LogInPage clickSignIn() {
		Actions actions = new Actions(this.driver);
		actions.moveToElement(this.driver.findElement(By.cssSelector("#nav-link-accountList"))).perform();
		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#nav-flyout-ya-signin > a:nth-child(1) > span:nth-child(1)")));
		signInBtn.click();
		return new LogInPage(driver);	
	}
	
}
	