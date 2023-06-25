package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class MouseAndKeyboardOperation {

	// Mouse & Keyboard operation/interaction -> Actions class - pass driver instance into it
	
	// To trigger any action -
		// 1. Identify WebElement
		// 2. Action/s
		// 3. Build & Perform action
	
	WebDriver driver;
	
	MouseAndKeyboardOperation(){
		System.setProperty("webdriver.chrome.key", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}
	
	void searchFunctionality(String product) throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
//		searchTxt.sendKeys(product);
		Thread.sleep(3000);
//		action.moveToElement(searchTxt).click().sendKeys(product).build().perform();
		action.moveToElement(searchTxt).build().perform(); // mouse operation
		Thread.sleep(3000);
		action.click().build().perform(); // mouse operation
		Thread.sleep(3000);
		action.sendKeys(product).build().perform(); // keyboard operation
		
//		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
//		searchBtn.click();
		
		Thread.sleep(3000);
//		action.moveToElement(searchBtn).build().perform();
//		Thread.sleep(3000);
//		action.click().build().perform();
//		Thread.sleep(3000);
		
		action.sendKeys(Keys.ENTER).build().perform();
		
		if(driver.getCurrentUrl().contains(product)) {
			System.out.println("Search Functionality: Passed");
		}else{
			System.err.println("Search Functionality: Failed");
		}
	}
	
	void searchFunctionality(String product1, String product2) throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		
		Thread.sleep(3000);
		action.moveToElement(searchTxt).click().sendKeys(product1).build().perform();
		Thread.sleep(3000);
		action.doubleClick().sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		action.sendKeys(product2).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().contains(product2)) {
			System.out.println("Search Functionality: Passed");
		}else{
			System.err.println("Search Functionality: Failed");
		}
	}
	
	void handlingDynamicDropDown(String link, String expectedPageTile) throws InterruptedException {
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(accountList).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.linkText(link))).click().build().perform();
		Thread.sleep(3000);
		if(driver.getTitle().equals(expectedPageTile)) {
			System.out.println(link+": Link test in account list: Passed");
		}else{
			System.err.println(link+": link test in account list: Failed");
		}
	}
	
	void dragAndDropOperation() throws InterruptedException { // drag object and drop location has to be in same page
		driver.get("https://jqueryui.com/droppable/");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement dragObj = driver.findElement(By.id("draggable"));
		WebElement dropLoc = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		// 1.
//		action.moveToElement(dragObj).clickAndHold().moveToElement(dropLoc).release().build().perform(); 
		
		// 2. 
//		Thread.sleep(3000);
//		action.moveToElement(dragObj).clickAndHold().build().perform();
//		Thread.sleep(3000);
//		action.moveToElement(dropLoc).release().build().perform(); 
//		Thread.sleep(3000);
		
		// 3.
//		action.clickAndHold(dragObj).release(dropLoc).build().perform();
		
		// 4.
		action.dragAndDrop(dragObj, dropLoc).build().perform();
		
		WebElement dropConfirmation = driver.findElement(By.xpath("//p[text()='Dropped!']"));
		if(dropConfirmation.isDisplayed()) {
			System.out.println("Drag & Drop operation: Passed");
		}else{
			System.err.println("Drag & Drop operation: Failed");
		}
	}
	
	
	void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		MouseAndKeyboardOperation mk = new MouseAndKeyboardOperation();
//		mk.searchFunctionality("samsung");
		
//		mk.searchFunctionality("samsung", "apple");
		
//		mk.handlingDynamicDropDown("Start here.","Amazon Registration");
		
//		mk.handlingDynamicDropDown("Register for a free Business Account","Amazon Business");
		
		mk.dragAndDropOperation();
		
		mk.closeBrowser();

	}

}
