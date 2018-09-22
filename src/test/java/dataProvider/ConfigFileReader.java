package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = "configs//book_order.properties";
	
	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("book_order.properties not found at " + propertyFilePath);
		}
	}
	
	public String getAmazonUrl() {
		String amazonUrl = properties.getProperty("amazonUrl");
		if(amazonUrl != null)
			return amazonUrl;
		else
			throw new RuntimeException("Url not specified in configuration file.");
	}
	
	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equals("chrome"))
			return DriverType.CHROME;
		else
			throw new RuntimeException("Browser name key value not match:" + browserName);
	}

}
