package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests/",
		glue = {"stepDefinitions"},
		format = {"pretty", "html:target/html"},
		tags = "@AmazonSearch"
		)

public class TestRunner {

}
