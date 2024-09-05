package testAnnotations.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeTest {
	
	@BeforeTest
	void bt() {
		System.out.println("Before Test");
	}
	
	@Test
	void first() {
		System.out.println("First");
	}

}
