package com.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static ThreadLocal<Properties> property = new ThreadLocal<Properties>();
	private static String configPath = "Configuration/configsetting.properties";
	
	public static void initializepropertyfile() {
		
		Properties pr = new Properties();
		
		try {
			InputStream instm = new FileInputStream(configPath);
			
				pr.load(instm);
				property.set(pr);
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public static void setUp() {
		
		if(property.get().getProperty("BrowserType").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		} else if (property.get().getProperty("BrowserType").equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			
			
	}
		
		driver.get("https://www.facebook.com/");

}
	
}
