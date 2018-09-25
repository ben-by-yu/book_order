package stepDefinitions;

//import java.awt.List;
import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.LogInPage;

public class LogInSteps {
	
	WebDriver driver;
	TestContext testContext;
	WebDriverManager webDriverManager;
	PageObjectManager pageObjectManager;
	LogInPage logInPage;
	
	public LogInSteps(TestContext context) {
		testContext = context;
		webDriverManager = testContext.getWebDriverManager();
		pageObjectManager = testContext.getPageObjectManager();
	}
	
	@And("^user input username and password$")
	public void user_input_username_and_password(DataTable userCredential) {
		List<List<String>> data = userCredential.raw();
		logInPage = pageObjectManager.getLogInPage();
		logInPage.inputLogInInfo(data.get(0).get(0), data.get(0).get(1));
	}
	
	@Then("^user should be logged in$")
	public void user_should_be_logged_in() {
		System.out.println("Now I should be logged in!");
	}

}
