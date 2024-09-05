package testAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationDemo1 {

	@BeforeMethod
	void login() {
		
		System.out.println("Login page");
	}
	
	@Test
	void search() {
		
		System.out.println("Searching");
	}
	
	@Test
	void advanceSearch() {
		System.out.println("Advance Searching");

	}
	
	@AfterMethod
	void logout() {
		
		System.out.println("Logout");
	}
}
