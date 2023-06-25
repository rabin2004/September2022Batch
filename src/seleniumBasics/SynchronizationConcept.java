package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;

public class SynchronizationConcept {

	// Synchronization -> synch between application loading and automation execution
	
			// Types of synchronization:
				// 1. Static wait -> pause in execution, Thread.sleep(5000);
			
				// 2. Dynamic wait -> pause execution for defined amount of time until element is found, if found continue execution
						// a. Implicit wait: -> global wait, defined once applicable for all elements where action is going to be performed -> implicitlyWait()
						// b. Explicit wait: -> defined for a specific element -> WebDriverWait class
								
								// Fluent wait: -> polling/frequency of search can be adjusted -> FluentWait class
		// E.g
		//Implicit wait -> 15 seconds -> default frequency of search every 5 seconds
		//Explicit wait -> 30 seconds -> default frequency of search every 5 seconds
		// 0-5-10-15-20-25-30 -> 1 element 16th sec - 4 sec wastage
		// Fluent wait -> 30 seconds/polling:2sec ->
			// 0-2-4-6-8-10.... -> 1 element 16th sec - no wastage
	
	WebDriver driver;
	
	SynchronizationConcept(){
		System.setProperty("webdriver.chrome.key", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit wait:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com");
	}
	
	void closeBrowser() {
		driver.quit();
	}
	
	void positiveSearchFunctionality(String product) {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxt).build().perform();
		action.click().build().perform();
		action.sendKeys(product).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		if(driver.getCurrentUrl().contains(product)) {
			System.out.println("Search Functionality: Passed");
		}else{
			System.err.println("Search Functionality: Failed");
		}
	}
	
	void negativeSearchFunctionality(String product) {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxt).build().perform();
		action.click().build().perform();
		action.sendKeys(product).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		// Explicit wait
//		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
//		WebElement noSearchResultMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));
		
//		explicitWait.until(ExpectedConditions.visibilityOf(noSearchResultMsg));
		
		// Fluent Wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(15))
								.pollingEvery(Duration.ofSeconds(1))
								.ignoring(NoSuchElementException.class);
		
		
		WebElement noSearchResultMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));
		
//		fluentWait.until(ExpectedConditions.
//				presenceOfElementLocated(By.xpath("//span[text()='No results for ']")));
		
		fluentWait.until(ExpectedConditions.invisibilityOf(noSearchResultMsg)); // (tried for 15 second(s) with 1000 milliseconds interval)

		if (noSearchResultMsg.isDisplayed()) {
			System.out.println("Search Functionality: Passed");
		} else {
			System.err.println("Search Functionality: Failed");
		}
	}

	public static void main(String[] args) {
		SynchronizationConcept sc = new SynchronizationConcept();
//		sc.positiveSearchFunctionality("samsung");
		
		sc.negativeSearchFunctionality("&%*&%*^%648658758758712344");
		
		sc.closeBrowser();
	}
}
