package com.bit.test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	WebDriver driver;

	@Before
	public void openBrowser() {
		
		//open blank browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akif Rahman\\Downloads\\chromedriver");
		String b = System.getProperty("browser");

		driver=new ChromeDriver();
		
		// navigate to URL
		driver.get("https://www.express.com");
		
		

		if (b.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (b.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("https://www.express.com");
	}

}
