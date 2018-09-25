package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.Before;
import cucumber.api.java.After;

public class Hooks {
	TestContext testContext;
	public Hooks(TestContext context) {
		testContext = context;
	}
	
	@Before
	public void beforeScenario() {
		System.out.println("This is before hook!");
	}
	
	@After
	public void afterScenario() {
		
		System.out.println("This is after hook!");
	}

}
