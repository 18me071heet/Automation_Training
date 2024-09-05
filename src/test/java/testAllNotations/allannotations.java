package testAllNotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allannotations {

	
	@BeforeMethod
	void bm() {
		System.out.println("Before Method");
		
	}
	@AfterMethod
	void am() {
		System.out.println("After Method");
		
	}
	@BeforeClass
	void bc() {
		System.out.println("Before Class");
		
	}
	@AfterClass
	void ac() {
		System.out.println("After Class");
		
	}
	@BeforeTest
	void bt() {
		System.out.println("Before Test");
		
	}
	@AfterTest
	void at() {
		System.out.println("After Test");
		
	}
	@BeforeSuite
	void bs() {
		System.out.println("Before Suite");
		
	}
	@AfterSuite
	void as() {
		System.out.println("After Suite");
		
	}
	
	@Test
	void tm1() {
		
		System.out.println("This is Test Method1");
	}
	
	@Test
	void tm2() {
		System.out.println("This is Test Method2");
	}
}
