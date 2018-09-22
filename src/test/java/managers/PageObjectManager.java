package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.AmazonHomePage;
import pageObjects.LogInPage;
import pageObjects.SearchResultPage;

public class PageObjectManager {

	private WebDriver driver;
	private AmazonHomePage amazonHomePage;
	private SearchResultPage searchResultPage;
	private LogInPage logInPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public AmazonHomePage getAmazonHomePage() {
		return (amazonHomePage == null) ? amazonHomePage = new AmazonHomePage(driver) : amazonHomePage;
	}
	
	public SearchResultPage getSearchResultPage() {
		return (searchResultPage == null) ? searchResultPage = new SearchResultPage(driver) : searchResultPage;
	}
	
	public LogInPage getLogInPage() {
		return (logInPage == null) ? logInPage = new LogInPage(driver) : logInPage;
	}
}
