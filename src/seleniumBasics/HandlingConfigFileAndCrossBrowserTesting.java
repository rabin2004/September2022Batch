package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.*;
import java.io.*;

public class HandlingConfigFileAndCrossBrowserTesting {
	
	// Handling config.properties file:
		// 1. Properties class - handle .propeties file
		// 2. FileInputStream class - find file and read through file
		// 3. load file read into Properties class
	
	WebDriver driver;
	
	HandlingConfigFileAndCrossBrowserTesting() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				new File("C:\\Users\\User\\eclipse-workspace\\SeptemberBatch\\src\\seleniumBasics\\config.properties"));
		prop.load(fis);
		
		
		// cross browser testing
		String browser = prop.getProperty("browserName").toLowerCase();
		
		switch(browser) {
		case "chrome":
			System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
			driver = new ChromeDriver();
			System.out.println("Testing in Chrome");
			break;
			
		case "firefox":
			System.setProperty(prop.getProperty("ffKey"), prop.getProperty("ffPath"));
			driver = new FirefoxDriver();
			System.out.println("Testing in Firefox");
			break;
			
		case "ie":
			System.setProperty(prop.getProperty("ieKey"), prop.getProperty("iePath"));
			driver = new InternetExplorerDriver();
			System.out.println("Testing in InternetExplorer");
			break;
			
		case "edge":
			System.setProperty(prop.getProperty("edgeKey"), prop.getProperty("edgePath"));
			driver = new EdgeDriver();
			System.out.println("Testing in Edge");
			break;
			
		default:
			System.err.println("Broswer not supported!");
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("testURL"));
	}
	
	void searchFunctionality(String product) throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxt).build().perform();
		Thread.sleep(3000);
		action.click().build().perform();
		Thread.sleep(3000);
		action.sendKeys(product).build().perform();
		
		action.sendKeys(Keys.ENTER).build().perform();
		
		if(driver.getCurrentUrl().contains(product)) {
			System.out.println("Search Functionality: Passed");
		}else{
			System.err.println("Search Functionality: Failed");
		}
	}
	
	 void closeBrowser() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		HandlingConfigFileAndCrossBrowserTesting hc = new HandlingConfigFileAndCrossBrowserTesting();
		hc.searchFunctionality("samsung");
		
		hc.closeBrowser();
	
	}
	
	// Assignment:
			// 1. Project - any one app -> 5 features -> scenario for each feature -> automation of each

}
