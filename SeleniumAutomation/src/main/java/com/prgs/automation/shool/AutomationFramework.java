package com.prgs.automation.shool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationFramework {
	WebDriver driver;
	
	public AutomationFramework() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sgannu/prgs/prgs-training-batch2/SeleniumAutomation/lib/chromedriver");
		 driver = new ChromeDriver();
	}

	public WebDriver launchBrowser(String baseUrl) {
        driver.get(baseUrl);
        
		return driver;
	}

	public void close() {
	    driver.close();		
	}

}
