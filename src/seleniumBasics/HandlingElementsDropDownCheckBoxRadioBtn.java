package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingElementsDropDownCheckBoxRadioBtn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.key", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // default browser size
		// maximize window size
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String URL = "https://demo.guru99.com/test/newtours/index.php";
		driver.get(URL);
		String actualHomePageUrl = driver.getCurrentUrl();
		if(actualHomePageUrl.equals(URL)) {
			System.out.println("Correct homepage url");
		}else {
			System.err.println("Wrong location");
		}
		
		String actualHomePageTitle = driver.getTitle();
		String expectedHomePageTitle = "Welcome: Mercury Tours";
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Correct homepage title");
		}else {
			System.err.println("Wrong title");
		}
		
		// Handling menu links
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(5000);
	
		String expectedFlightPageUrl = "https://demo.guru99.com/test/newtours/reservation.php";
		String actualFlightPageUrl = driver.getCurrentUrl();
		if(actualFlightPageUrl.equals(expectedFlightPageUrl)) {
			System.out.println("Correct flightpage url");
		}else {
			System.err.println("Wrong location");
		}
		
		String actualFlightPageTitle = driver.getTitle();
		String expectedFlightPageTitle = "Find a Flight: Mercury Tours";
		if(actualFlightPageTitle.equals(expectedFlightPageTitle)) {
			System.out.println("Correct flightpage title");
		}else {
			System.err.println("Wrong title");
		}
		
		// Handling radio button
		WebElement oneWayRadipoBtn = driver.findElement(By.cssSelector("body > div:nth-child(5) "
				+ "> table > tbody > tr > "
				+ "td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > "
				+ "td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > "
				+ "tr:nth-child(2) > td:nth-child(2) > b > font > input[type=radio]:nth-child(2)"));
		WebElement roundTripRadioBtn = driver.findElement(By.xpath("/html/body/div[2]/table/tbody"
				+ "/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form"
				+ "/table/tbody/tr[2]/td[2]/b/font/input[1]"));
		Thread.sleep(2000);
		oneWayRadipoBtn.click();
		Thread.sleep(2000);
		roundTripRadioBtn.click();
		Thread.sleep(2000);
		oneWayRadipoBtn.click();
		
		// copy selector -> #twotabsearchtextbox
		// copy Xpath -> //*[@id="twotabsearchtextbox"]
		// copy full Xpath -> /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input
		
		// Handling drop down: 
		// -> 1. static drop down | 2. dynamic drop down - mouse over - later during mouse/keyboard action
			// Static drop down: - click to visualize more option -> option selection -> a. visible txt | b. index of option | c. value of an option
			// Static drop down can be handled using -> Select class - will have select tagname
		WebElement passengerCountDropDwn = driver.findElement(By.name("passCount"));
		Select select = new Select(passengerCountDropDwn);
		Thread.sleep(2000);
		select.selectByVisibleText("4");
		Thread.sleep(2000);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("2");
		
		WebElement departingFromCity = driver.findElement(By.name("fromPort"));
		Select select1 = new Select(departingFromCity);
		Thread.sleep(2000);
		select1.selectByVisibleText("New York");
		Thread.sleep(2000);
		select1.selectByValue("Seattle");
		Thread.sleep(2000);
		select1.selectByIndex(2);
		Thread.sleep(2000);
//		select1.deselectAll(); // UnsupportedOperationException: You may only deselect all options of a multi-select
		
		// Visiting different website
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		
		// Handling checkbox
		WebElement checkBx1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkBx2 = driver.findElement(By.id("vfb-6-1"));
		WebElement checkBx3 = driver.findElement(By.id("vfb-6-2"));
		Thread.sleep(2000);
		checkBx1.click(); // click() again will deselect checkbox
		Thread.sleep(2000);
		checkBx1.click();
		Thread.sleep(2000);
		
		checkBx2.click();
		Thread.sleep(2000);
		checkBx2.click();
		Thread.sleep(2000);
		
		checkBx3.click();
		Thread.sleep(2000);
		checkBx3.click();
		Thread.sleep(2000);
		
		// get() Vs navigate().to()
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	// Assignment: 	1. Demo Mercury tour app - login/flight finder/registration flow (Multiple data)
				//	2. Amazon - invalid login flow/Sign up flow/Search flow/Add product to cart flow

}
