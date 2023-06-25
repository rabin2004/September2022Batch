package testNGbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

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

public class DataDrivenTesting {
	WebDriver driver;

	final String URL = "https://www.amazon.com/";
	
	// data can be defined -> 1. same class  | 2. different class in same pkg | 3. different pkg
	// dataProviderClass -> to define data providing class
	// dataProvider -> to define location of data providing method

	@DataProvider // annotation for TestNg to recognize data
	public String[] positiveLocalSearchData() {
		String[] data = {	"samsung",
							"apple",
							"surface pro",
							"google pixel"
		};
		return data;
	}
	
	@Test (enabled=true, priority=1, dataProvider="positiveLocalSearchData")
	void positiveSearchFunctionalityUsingEnterKey(String validProduct) {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxt).build().perform();
		action.click().build().perform();
		action.sendKeys(validProduct).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		Assert.assertTrue(driver.getTitle().contains(validProduct));
	}
	
	@Test (enabled=true, priority=0, dataProviderClass=PositiveSearchFunctionalityData.class, 
			dataProvider="positiveSearchData")
	void positiveSearchFunctionalityUsingSearchBtn(String validProduct) {
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxt.sendKeys(validProduct);
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		
		Assert.assertTrue(driver.getTitle().contains(validProduct));
	}
	
	@Test (enabled=true, priority=3, dataProviderClass=practicePkg.NegativeSearchFunctionalityData.class,
			dataProvider="negativeSearchData")
	void negativeSearchFunctionalityUsingEnterKey(String invalidProduct) {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxt).build().perform();
		action.click().build().perform();
		action.sendKeys(invalidProduct).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement noSearchResultMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));

		Assert.assertTrue(noSearchResultMsg.isDisplayed());
	}
	
	@Test (enabled=true, priority=2, dataProviderClass=practicePkg.NegativeSearchFunctionalityData.class,
			dataProvider="negativeSearchData")
	void negativeSearchFunctionalityUsingSearchBtn(String invalidProduct) {
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxt.sendKeys(invalidProduct);
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		WebElement noSearchResultMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));

		Assert.assertTrue(noSearchResultMsg.isDisplayed());
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
}
