package com.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
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

	public static WebDriver setUp(String browser) {		
		if (property.get().getProperty("BrowserType").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		} else if (property.get().getProperty("BrowserType").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		} else if (property.get().getProperty("BrowserType").equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
			
	}
	
		return getDriver();
}
	
	public static synchronized WebDriver getDriver() {
		return driver.get();
	}
	
}
