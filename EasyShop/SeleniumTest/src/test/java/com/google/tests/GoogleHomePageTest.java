package com.google.tests;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
	
	private WebDriver driver; 
	String appURL = "http://google.com";

	@BeforeClass
	public void testSetUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "binaries/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() throws Exception {
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
		WebElement searchTextBox=driver.findElement(By.name("q"));
		searchTextBox.sendKeys("https://www.toolsqa.com/selenium-webdriver/");
		WebElement goButton = driver.findElement(By.cssSelector("#presscore-custom-menu-two-11 > ul > li.menu-item.menu-item-type-custom.menu-item-object-custom.menu-item-has-children.menu-item-24247.first.has-children > a > span"));
		safeJavaScriptClick(goButton);}
	public void safeJavaScriptClick(WebElement element) throws Exception {
			try {
				if (element.isEnabled() && element.isDisplayed()) {
					System.out.println("Clicking on element with using java script click");

					((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
				} else {
					System.out.println("Unable to click on element");
				}
			} catch (StaleElementReferenceException e) {
				System.out.println("Element is not attached to the page document "+ e.getStackTrace());
			} catch (NoSuchElementException e) {
				System.out.println("Element was not found in DOM "+ e.getStackTrace());
			} catch (Exception e) {
				System.out.println("Unable to click on element "+ e.getStackTrace());
			}}
			

	

@AfterClass
public void tearDown() {
	driver.quit();
}}

	

	
