package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonHomePage extends BasePage {

//	protected WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		super(driver);	
//		this.driver = driver;
	}
	
//	@FindBy(css = "#twotabsearchtextbox")
	@FindBy(how = How.CSS, using = "#twotabsearchtextbox")
	public WebElement searchText;
	
//	@FindBy(css = ".nav-search-submit > input:nth-child(2)")
	@FindBy(how = How.CSS, using = ".nav-search-submit > input:nth-child(2)")
	public WebElement searchBtn;
	
	@FindBy(how = How.CSS, using = "#nav-orders > span:nth-child(2)")
	public WebElement orderBtn;
	
	public SearchResultPage searchBook(String searchStr) {
		searchText.sendKeys(searchStr);
		searchBtn.click();
		return new SearchResultPage(driver); 
	}
	
	public LogInPage clickOrder() {
		orderBtn.click();
		return new LogInPage(driver);
	}

	
//	@FindBy(how = How.CSS, using = "#twotabsearchtextbox")
//	public WebElement searchText;
//	
//	@FindBy(how = How.CSS, using = ".nav-search-submit > input:nth-child(2)")
//	public WebElement searchBtn;
//	
//	public SearchResultPage amazonSearch(String searchStr) {
//		searchText.sendKeys(searchStr);
//		searchBtn.click();
//		return new SearchResultPage(driver);
//	}
	
//	public void amazonSearch(String searchStr) {
//		searchText.sendKeys(searchStr);
//		searchBtn.click();
//		return;
//	}
	
}
	