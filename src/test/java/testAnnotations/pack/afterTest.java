package testAnnotations.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class afterTest {


 @AfterTest
	void bt() {
		System.out.println("After Test");
	}
	
	@Test
	void second() {
		System.out.println("Second");
	}
}
