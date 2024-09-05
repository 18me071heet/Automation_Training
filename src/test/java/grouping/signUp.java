package grouping;

import org.testng.annotations.Test;

public class signUp {
	
	@Test(priority=1,groups= {"Functional"})
	void signUpbyEmail() {
		
		System.out.println("Sign up by email");
		
	}

	@Test(priority=2,groups= {"Smoke"})
	void signUpbyGoogle() {
		
		System.out.println("Sign up by google");

	}
	
	@Test(priority=3,groups= {"Smoke"})
	void signUpbyFacebook() {
		
		System.out.println("Sign up by facebook");

		
	}
}
