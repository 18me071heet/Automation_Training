package testAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class annotationDemo2 {
	
	@BeforeClass
	void login() {
		
		System.out.println("Login");
	}
	
	@AfterClass
	void logout() {
		System.out.println("logout");
	}
	
	@Test(priority=1)
	void search() {
		
		System.out.println("Searching");
	}
	
	@Test(priority=2)
	void advancesearch() {
		
		System.out.println("Advance Searching");
	}

}
