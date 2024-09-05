package grouping;

import org.testng.annotations.Test;

public class payment {
	
	@Test(priority=1, groups= {"Smoke"})
	void paymentbyGpay() {
		
		System.out.println("Payment by Gpay");
		
	}

	@Test(priority=2,groups= {"Functional"})
	void paymentbyPaytm() {
		
		System.out.println("Payment by Paytm");

	}
}
