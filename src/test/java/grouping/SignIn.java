package grouping;

import org.testng.annotations.Test;

public class SignIn {
	
	
	@Test(priority=1,groups= {"Smoke"})
	void signInbyEmail() {
		
		System.out.println("Sign in by email");
		
	}

	@Test(priority=2,groups= {"Smoke","Functional"})
	void signInByGoogle() {
		
		System.out.println("Sign in by google");

	}
	
	@Test(priority=3,groups= {"Functional"})
	void signInbyFacebook() {
		
		System.out.println("Sign in by facebook");

		
	}
}
