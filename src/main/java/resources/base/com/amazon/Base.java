package resources.base.com.amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import utilities.test.com.amazon.Utilities;

/**
 * @author priyankakodeboina
 *
 */

public class Base {

	
	public static WebDriver driver;
	public static Properties prop;
	
	//To read url and browser properties from BaseConfig.properties file into object prop
	
	public Base()
	{
		try
		{
			prop = new Properties();
			FileInputStream fs = new FileInputStream("/Users/priyankakodeboina/Documents/Selenium_POM_Assignment"
				+ "/Selenium-POM/src/main/java/resources/base/com/amazon/BaseConfig.properties");
			prop.load(fs);
		}
			catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	//Initializes browser
	
		public static void browserInitialization() {
			
			String browserName = prop.getProperty("browser");
			
			if (browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "/Users/priyankakodeboina/Documents/Selenium/Webdrivers/chromedriver");
				driver = new ChromeDriver();
			}
			
			if (browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "/Users/priyankakodeboina/Documents/Selenium/Webdrivers/geckodriver");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Utilities.IMPLICIT_WAIT,TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
					
			
		}
	
}
