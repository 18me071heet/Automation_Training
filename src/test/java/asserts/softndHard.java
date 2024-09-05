package asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softndHard {
	
	@Test
	void hardAssertion() {
		
		System.out.println("Login");
		System.out.println("Home Page");
		
		Assert.assertEquals(123, 124); // failed so that below remaining stages execution will not done.
		
		System.out.println("Searching");
		System.out.println("Logout");
		
		
	}
	
	@Test
	void softAssertion() {
		
		System.out.println("Login");
		System.out.println("Home Page");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(123, 124);   // Soft Assertion
		
		// Uper condition is fail still it is execute remaining stages.
		
		
		System.out.println("Searching");
		System.out.println("Logout");
		
		sa.assertAll(); // Mandatory Step
		
	}
	

}
