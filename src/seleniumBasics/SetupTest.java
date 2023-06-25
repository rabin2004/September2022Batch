package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SetupTest {

	public static void main(String[] args) {
		// 1. Set property -> browser | -> location of webDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe"); // windows OS -> \\, .exe | mac OS -> whatever path, no extension required 
		
		// 2. WebDriver class -> instance of ChromeDriver class and refer to parent class WebDriver - Polymorphism
//		ChromeDriver driver = new ChromeDriver(); // instance/object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		// 3. Loading web application - URL of the application
		driver.get("http://demo.guru99.com/test/newtours/");
		
		// 4. Test web application -> define later
		
		// 5. Close the driver/browser
		driver.quit(); // quit() Vs close() ???
	}

}
