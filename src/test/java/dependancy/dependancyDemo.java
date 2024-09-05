package dependancy;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependancyDemo {

	@Test(priority=1)
	void openApp() {
		
		System.out.println("Opening Application");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods={"openApp"})
	void Login() {
		
		System.out.println("Login Application");
		Assert.assertTrue(false);
		
	}
	
	
	@Test(priority=3,dependsOnMethods={"Login"})
	void Seaching() {
		
		System.out.println("Searching Application");
	}
	
	
	@Test(priority=4,dependsOnMethods={"Login"})
	void advanceSearching() {
		
		System.out.println("Advance Searching Application");
	}
}
