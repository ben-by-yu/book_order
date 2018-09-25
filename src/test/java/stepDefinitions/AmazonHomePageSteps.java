package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.AmazonHomePage;
import pageObjects.LogInPage;
import pageObjects.SearchResultPage;

public class AmazonHomePageSteps {

	WebDriver driver;
	AmazonHomePage amazon_home_page;
	SearchResultPage search_result_page;
	LogInPage log_in_page;
	
	ConfigFileReader configFileReader;
	WebDriverManager webDriverManager;
	PageObjectManager pageObjectManager;
	
	TestContext testContext;
	
	public AmazonHomePageSteps(TestContext context) {
		testContext = context;
		webDriverManager = testContext.getWebDriverManager();
		pageObjectManager = testContext.getPageObjectManager();
	}
	
	@Given("^user is on amazon home page$")
	public void user_is_on_amazon_home_page() {
		configFileReader = new ConfigFileReader();
		driver = webDriverManager.getDriver();
		driver.get(configFileReader.getAmazonUrl());
		amazon_home_page = pageObjectManager.getAmazonHomePage();				
	}
	
	@When("^user click on log in button$")
	public void user_click_on_log_in_button() {
		amazon_home_page.clickSignIn();
	}
	
//	@When("^user searches Fifth Season$") 
//	public void user_searches_fifth_season() {
//		System.out.println("This is step 2.");
//		amazon_home_page.searchBook("Fifth Season");
//	}
	
	@When("^user searches (.+)$") 
	public void user_searches_fifth_season(String searchStr) {
		System.out.println("This is step 2.");
		amazon_home_page.searchBook(searchStr);
	}
	
	@Then("^user should see search result$") 
	public void user_should_see_search_result() {
		System.out.println("This is step 3.");
	}
	
	@When("^user click order$")
	public void user_click_order() {
		log_in_page = amazon_home_page.clickOrder();
	}
	
	@Then("^user should see log in page$")
	public void user_should_see_log_in_page() {
		System.out.println("User should see log in page.");
	}
	
	
}
