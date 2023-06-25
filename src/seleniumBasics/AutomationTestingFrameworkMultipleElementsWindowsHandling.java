package seleniumBasics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingFrameworkMultipleElementsWindowsHandling {
	WebDriver driver;
	
	AutomationTestingFrameworkMultipleElementsWindowsHandling(){
		System.setProperty("webdriver.chrome.key", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}
	
	void closeBrowser() {
		driver.quit();
	}
	
	void searchFunctionality(String product) {
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		WebElement searchResult = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		if(searchResult.isDisplayed()) {
			String acutalProductSearchTxt = driver.findElement(By.
					xpath("//span[contains(text(),'results for')]/following-sibling::span[2]")).getText();
			boolean result = acutalProductSearchTxt.contains(product); 
			if(result) {
				System.out.println("Search Functionality Test: Passed");
			}		
		}else {
			System.err.println("Search Functionality Test: Failed");
		}	
	}
	
	void negativeLoginFunctionality(String username, String password) {
		driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		String usernameValidationXpath = "//span[text()='"+username+"']";
		WebElement usernameDisplayElement = driver.findElement(By.xpath(usernameValidationXpath));
		if(usernameDisplayElement.isDisplayed()) {
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.id("signInSubmit")).click();
		}else {
			System.err.println("Negative Login Functionality: Failed - username not visible");
		}
		WebElement loginFailedErrorMsg = driver.findElement(By.cssSelector("#auth-error-message-box"));
		if(loginFailedErrorMsg.isDisplayed()) {
			System.out.println("Negative Login Functionality: Passed");
		}else {
			System.err.println("Negative Login Functionality: Failed");
		}
		
	}
	
	// findElement() Vs findElements()
	
	void validatingHomePageHeaderMenuLinks() {
		List<WebElement> homePageheaderMenuLinks = driver.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println("Number of Menu links: "+homePageheaderMenuLinks.size());
//		Iterator<WebElement> it = homePageheaderMenuLinks.iterator();
//		it.next(); // first link -> ElementNotInteractableException: element not interactable
//		
//		while(it.hasNext()) {
//			WebElement link = it.next(); 
//			link.click(); // StaleElementReferenceException: stale element reference: element is not attached to the page document
//			String linkPageUrl = driver.getCurrentUrl();
//			System.out.println(linkPageUrl);
//			if(linkPageUrl.contains("amazon.com")) {
//				System.out.println(linkPageUrl+ " - Menu link test: Passed");
//			}else {
//				System.out.println(linkPageUrl+ " - Menu link test: Failed");
//			}
//			driver.navigate().back();
//		}
		
		for(WebElement link: homePageheaderMenuLinks) {
			System.out.print(link.getText()+"\t");
			System.out.print(link.getAttribute("href"));
			System.out.println();
		}
		
	}
	
	void handlingMultipleWindows() {
		driver.get("https://the-internet.herokuapp.com/windows");
//		String withSingleWindowParentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		// new tab/window will be opened - but driver control still in old/parent window/tab
//		String withMultipleWindowsParentWindowHandle = driver.getWindowHandle();
//		System.out.println(withSingleWindowParentWindowHandle);
//		System.out.println(withMultipleWindowsParentWindowHandle);
//		System.out.println(withSingleWindowParentWindowHandle.equals(withMultipleWindowsParentWindowHandle));
		
		// to switch to new window -> grab all window handle
		Set<String> handles = driver.getWindowHandles();
//		for(String handle: handles) {
//			System.out.println(handle);
//		}
		Iterator<String> it = handles.iterator();
		String parentWindowHandle = it.next();
		String childWindowHandle = it.next();
		
		driver.switchTo().window(childWindowHandle);
		System.out.println("Child window title: "+driver.getTitle());
		driver.close(); // quit() Vs close() -> ???
		// child window is closed - only parent window left - but still need to switch back to parent window
		driver.switchTo().window(parentWindowHandle);
		System.out.println("Parent window title: "+driver.getTitle());
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		AutomationTestingFrameworkMultipleElementsWindowsHandling ats = new AutomationTestingFrameworkMultipleElementsWindowsHandling();
//		ats.searchFunctionality("samsung");
//		ats.negativeLoginFunctionality("test@gmail.com", "test@123");
//		Thread.sleep(5000);
//		ats.validatingHomePageHeaderMenuLinks();
		ats.handlingMultipleWindows();
		
		
		ats.closeBrowser();
	}

}
