package testNGbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNGbasicsStructure {
	WebDriver driver;
	String validProduct = "samsung";
	String invalidProduct = "&%*&%*^%648658758758712344";
	String link = "Start here.";
	String expectedPageTitle = "Amazon Registration";

	@Test // Test annotation
	void positiveSearchFunctionality() {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxt).build().perform();
		action.click().build().perform();
		action.sendKeys(validProduct).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		// verification point
//		if(driver.getCurrentUrl().contains(product)) {
//			System.out.println("Search Functionality: Passed");
//		}else{
//			System.err.println("Search Functionality: Failed");
//		}
		
		// validation point
		Assert.assertTrue(driver.getCurrentUrl().contains(validProduct));
	}
	
	@Test
	void negativeSearchFunctionality() {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxt).build().perform();
		action.click().build().perform();
		action.sendKeys(invalidProduct).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(15))
								.pollingEvery(Duration.ofSeconds(1))
								.ignoring(NoSuchElementException.class);
		
		WebElement noSearchResultMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));

		fluentWait.until(ExpectedConditions.visibilityOf(noSearchResultMsg));

//		if (noSearchResultMsg.isDisplayed()) {
//			System.out.println("Search Functionality: Passed");
//		} else {
//			System.err.println("Search Functionality: Failed");
//		}
		
//		Assert.assertTrue(noSearchResultMsg.isDisplayed());
		Assert.assertFalse(noSearchResultMsg.isDisplayed());
	}
	
	@Test
	void handlingDynamicDropDown() {
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		action.moveToElement(accountList).build().perform();
		action.moveToElement(driver.findElement(By.linkText(link))).click().build().perform();
		
		Assert.assertEquals(driver.getTitle(), expectedPageTitle);
	}
	
	@BeforeMethod // pre-requisite annotation
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.key", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.com");
	}

	@AfterMethod // post-requisite annotation
	public void afterMethod() {
		driver.quit();
	}
	
	// Assignment: 1. Any automation scripts any application -> convert into TestNG framework (@Test/@BeforeMethod/@AfterMethod/Assert for validation point)
				// 2. Submit test execution report

}
