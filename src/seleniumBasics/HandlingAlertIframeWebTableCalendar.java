package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HandlingAlertIframeWebTableCalendar {
	
	WebDriver driver;
	
	HandlingAlertIframeWebTableCalendar(){
		System.setProperty("webdriver.chrome.key", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.amazon.com");
	}
	
	void closeBrowser() {
		driver.quit();
	}
	
	void handlingAlert() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("test12");
		driver.findElement(By.name("submit")).click();
		
		// java pop-up/pop-up/alert/java alert - dialogue box open
		// if alert not handle and tried to do something else
//		driver.findElement(By.name("res")).click(); // UnhandledAlertException: unexpected alert open: {Alert text : Do you really want to delete this Customer?}
		
		// handling alert -> 1. accept 2. deny 3. get alert txt
		String actualAlert1Txt = driver.switchTo().alert().getText();
		String expectedAlert1Txt = "Do you really want to delete this Customer?";
		if(actualAlert1Txt.equals(expectedAlert1Txt)) {
			System.out.println("Handling Alert-1 test: Passed");
		}else {
			System.out.println("Handling Alert-1 test: Failed");
			System.out.println("Actual alert txt: "+actualAlert1Txt);
			System.out.println("Expected alert txt: "+expectedAlert1Txt);
		}
		
		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		
		// 2nd alert
//		String actualAlert2Txt = driver.switchTo().alert().getText();
//		String expectedAlert2Txt = "Customer Successfully Deleted!";
//		if(actualAlert2Txt.equals(expectedAlert2Txt)) {
//			System.out.println("Handling Alert-2 test: Passed");
//		}else {
//			System.err.println("Handling Alert-2 test: Failed");
//			System.out.println("Actual alert txt: "+actualAlert2Txt);
//			System.out.println("Expected alert txt: "+expectedAlert2Txt);
//		}
//		
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss(); // once alert is closed - driver control comes back to browser
		Thread.sleep(3000);
		driver.findElement(By.name("res")).click();
	}
	
	void handlingIframe() {
		driver.get("https://jqueryui.com/droppable/");
		
		// without handling iframe
//		driver.findElement(By.id("draggable")); // element inside iframe -> NoSuchElementException
		
		// handling iframe -> 1. index 2. String 3. WebElement
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of iframes: "+iframes.size());
		System.out.println(iframes);
		
//		driver.switchTo().frame(0);
//		WebElement dragElement = driver.findElement(By.id("draggable"));
//		if(dragElement.isDisplayed()) {
//			System.out.println("Handling iframe test: Passed");
//		}else {
//			System.err.println("Handling iframe test: Failed");
//		}
		
		WebElement singleIframe = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(singleIframe);
		WebElement dragElement = driver.findElement(By.id("draggable"));
		if(dragElement.isDisplayed()) {
			System.out.println("Handling iframe test: Passed");
		}else {
			System.err.println("Handling iframe test: Failed");
		}
	}
	
	void handlingWebTable() {
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement offerTable = driver.findElement(By.xpath("//table[@width='270']/tbody"));
		
//		String offerDestination1 = offerTable.findElement(By.xpath("//tr[1]/td[1]/font")).getText();
//		System.out.println(offerDestination1);
		
//		for(int i=1; i<=5; i++) {
//			String iString = String.valueOf(i);
//			String offerDestination = offerTable.findElement(By.xpath("//tr["+iString+"]/td[1]/font"))
//					.getText();
//			System.out.println("Offer "+iString+": "+offerDestination);
//		}
//		
//		for(int i=1; i<=5; i++) {
//			String iString = String.valueOf(i);
//			String offerAmount = offerTable.findElement(By.xpath("//tr["+iString+"]/td[2]/div/font"))
//					.getText();
//			System.out.println("Offer amount "+iString+": "+offerAmount);
//		}
		
		String[] expectedOfferDestination = {	"Atlanta to Las Vegas",
												"Boston to San Francisco",
												"Los Angeles to Chicago",
												"New York to Chicago",
												"Phoenix to San Francisco"};			
		
		for(int i=1; i<=5; i++) {
			String iString = String.valueOf(i);
			String offerDestination = offerTable.findElement(By.xpath("//tr["+iString+"]/td[1]/font"))
					.getText();
			String offerAmount = offerTable.findElement(By.xpath("//tr["+iString+"]/td[2]/div/font"))
					.getText();
			if(expectedOfferDestination[i-1].equals(offerDestination)) {
				System.out.println("Valid offer:");
				System.out.println("Offer "+iString+": "+offerDestination+"\t\t"+offerAmount);
			}else {
				System.err.println("Invalid offer:");
				System.out.println("Offer "+iString+": "+offerDestination+"\t\t"+offerAmount);
			}
		}
	}
	
	void handlingCalendar() {
		driver.get("https://www.timeanddate.com/calendar/?country=1");
		//table[@id='mct1']/tbody/tr[10]/td[5]/table/tbody/tr[4]/td[7]
//		1st tr -> 3 month in a row ->2, 6, 10, 14 -> difference of 4
//		1st td -> month in row of 3 -> 1, 3, 5 -> odd numbers
//		2nd tr -> 2 to 7 - weeks of the month
//		2nd td -> 1 to 7 - days of the week
		
		String dateSelected = "01/20/2022";
		
		String month = dateSelected.substring(0, 2);
		String day = dateSelected.substring(3, 5);
		
		if(month.equals("01") || month.equals("02") || month.equals("03")) {
			if(month.equals("01")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[2]/td[1]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("02")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[2]/td[3]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("03")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[2]/td[5]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}
			
		}
		
		if(month.equals("04") || month.equals("05") || month.equals("06")) {
			if(month.equals("05")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[6]/td[1]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("05")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[6]/td[3]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("06")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[6]/td[5]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}
			
		}
		
		if(month.equals("07") || month.equals("08") || month.equals("09")) {
			if(month.equals("07")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[10]/td[1]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("08")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[10]/td[3]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("09")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[10]/td[5]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}
			
		}
		
		if(month.equals("10") || month.equals("11") || month.equals("12")) {
			if(month.equals("10")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[14]/td[1]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("11")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[14]/td[3]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}else if(month.equals("12")) {
				WebElement monthTable = driver.findElement(By.
						xpath("//table[@id='mct1']/tbody/tr[14]/td[5]/table/tbody"));
				for(int i=2; i<=7; i++) {
					for(int j=1; j<=7; j++) {
						String daySelected = monthTable.findElement(By.xpath
								("//tr["+String.valueOf(i)+"]/td["+String.valueOf(j)+"]"))
						.getText();
						if(day.equals(daySelected)) {
							System.out.println("Book appointment");
							System.out.println("Appointment booked for "+daySelected);
						}
					}
				}
			}
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		HandlingAlertIframeWebTableCalendar ha = new HandlingAlertIframeWebTableCalendar();
//		ha.handlingAlert();
		
//		ha.handlingIframe();
		
		ha.handlingWebTable();
		
		ha.closeBrowser();
	}
	
	// Assignment: 1. Handling alert/iframe/webTable/Calendar
				// 2. Project - any one app -> 5 features -> scenario for each feature -> automation of each

}
