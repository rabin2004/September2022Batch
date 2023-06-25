package testNGbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	// Annotation -> @keyword -> under annotation method will be created
	
	// 3 groups: 
		// 1. Test annotation -> @Test -> writing test automation script -> under this test method (method) will be created
		// 2. Pre-requisite annotation -> @Before...
		// 3. Post-requisite annotation -> @After....
	
	// @BeforeMethod: execute before every test method
	// @AfterMethod: execute after every test method
	// @BeforeClass: execute before all test method execute of the class begin
	// @AfterClass: execute after all test method execution of the class complete
	// @BeforeTest: Test=>test run(multiple classes/method) - executes before test run
	// @AfterTest: executes after test run
	// @BeforeSuite: suite=>multiple test run - executes before multiple test run collectively (suite)
	// @AfterSuite: executes after multiple test run collectively (suite)
	// @BeforeGroups: group tag=>group test method - executed before a group execution
	// @AfterGroups: executed after a group execution
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups");
	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("After Groups");
	}
	
	@Test
	public void test1() {
		System.out.println("Test-1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test-2");
	}

}
