package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.ConfigFileReader;
import enums.DriverType;

public class WebDriverManager {
	
	private WebDriver driver;
	private static DriverType driverType;
	ConfigFileReader configFileReader = new ConfigFileReader();
	
	public WebDriverManager() {
		driverType = configFileReader.getBrowser();
	}
	
	public WebDriver createLocalDriver() {
		switch(driverType) {
		case FIREFOX : driver = new FirefoxDriver();
			break;
		case CHROME : driver = new ChromeDriver();
		}
		return driver;
	}

	public WebDriver getDriver() {
		if(driver == null)
			driver = createLocalDriver();
		return driver;
	}
	
}
