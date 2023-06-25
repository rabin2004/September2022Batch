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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNGAnnotationsUnderstanding {
	WebDriver driver;
	String validProduct = "samsung";
	String invalidProduct = "&%*&%*^%648658758758712344";
	String link = "Start here.";
	String expectedPageTitle = "Amazon Registration";
	final String URL = "https://www.amazon.com/";
	
	// test method -> default execution is alphabetic order by test method name
	// priority -> sequence of test method execution can be changed, from 0....
	// dependsOnMethod -> creating test method dependency -> if method dependent on fails - depending method will be skipped
	
	// ignored Vs skipped method - ????
	
	@Test (priority=0)
	void homePageTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "http://www.amazon.com/");
	}

	@Test (enabled=true, priority=1, dependsOnMethods="homePageTest")
	void positiveSearchFunctionalityUsingEnterKey() {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxt).build().perform();
		action.click().build().perform();
		action.sendKeys(validProduct).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(validProduct));
	}
	
	@Test (enabled=true, priority=4, dependsOnMethods="homePageTest")
	void positiveSearchFunctionalityUsingSearchBtn() {
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxt.sendKeys(validProduct);
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(validProduct));
	}
	
	@Test (enabled=true, priority=3, dependsOnMethods="homePageTest")
	void negativeSearchFunctionalityUsingEnterKey() {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxt).build().perform();
		action.click().build().perform();
		action.sendKeys(invalidProduct).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement noSearchResultMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));

		Assert.assertTrue(noSearchResultMsg.isDisplayed());
	}
	
	@Test (enabled=true, priority=2, dependsOnMethods="homePageTest")
	void negativeSearchFunctionalityUsingSearchBtn() {
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxt.sendKeys(invalidProduct);
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		WebElement noSearchResultMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));

		Assert.assertTrue(noSearchResultMsg.isDisplayed());
	}
	
	@Test (enabled=false) // -> ignored method
	void testingAccountListDropDownLinks() {
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		action.moveToElement(accountList).build().perform();
		action.moveToElement(driver.findElement(By.linkText(link))).click().build().perform();
		
		Assert.assertEquals(driver.getTitle(), expectedPageTitle);
	}
	
	@BeforeClass
	public void loadApp() {
		System.setProperty("webdriver.chrome.key", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(URL);
	}
	
	@BeforeMethod
	public void homePageCheck() {
		if(driver.getCurrentUrl().equals(URL)) {
			System.out.println("Already in homepage!");
		}else {
			WebElement amazonIcon = driver.findElement(By.id("nav-logo-sprites"));
			amazonIcon.click();
		}
	}

	@AfterClass
	public void closeApp() {
		driver.quit();
	}
	
	// Assignment: 1. Any automation scripts any application -> convert into TestNG framework -- all concepts
				// 2. Submit test execution report
}
