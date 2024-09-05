package asserts;


import org.testng.Assert;
import org.testng.annotations.Test;


public class assertDemo {
	
	/*@Test
	void title() {
	
		String exp_title ="amazon";
		String act_title ="amazons";
		
		if(exp_title.equals(act_title)) {
			System.out.println("Passed");
			Assert.assertTrue(true);
		    
		}
		
		else {
			System.out.println("Failed");
			Assert.assertTrue(false);
		}
	} */
	
	@Test
	void test() {
		
		//Assert.assertEquals("xyz", "xyz"); // passed
		//Assert.assertEquals("abc", 123);   // failed
		
		//Assert.assertNotEquals(123, 123);   // failed
		//Assert.assertNotEquals(123, 456);   // passed
		
		//Assert.assertTrue(true); // passed
	//	Assert.assertTrue(false); // failed
		
		Assert.assertFalse(false);  // passed
		
	}

}
