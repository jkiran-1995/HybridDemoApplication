package com.omayo.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.omayo.Utlities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	public static ChromeOptions options;
	
	
	@BeforeClass
	@Parameters ("browser")
	public void setup(String browser) {
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);	
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxpath());
			driver = new FirefoxDriver();
		}
		
		driver.get(baseURL);
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
