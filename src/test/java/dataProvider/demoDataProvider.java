package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demoDataProvider {

	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
		
	@Test(dataProvider="dp")
	void logIn(String email,String pwd) throws InterruptedException {
		
	     	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		
			 driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
			 driver.findElement(By.xpath("//input[@value='Login']")).click();
			 
			 boolean status = driver.findElement(By.xpath(" //h2[normalize-space()='My Account']")).isDisplayed();
			 
					 if(status==true) {
						 driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
						 Assert.assertTrue(true);
					 }
					 else {
						 Assert.assertTrue(false);

					 }
	}
	
	@AfterClass
	void logOut() {
		driver.quit();
	}
	
	@DataProvider(name="dp")
	Object[][] loginData()
	{
		
		Object data[][] =
			{
				{"abc@gmail.com","test123"},
		        {"abc@gmail.com","1234"},
			    {"abc@gmail.com","4567"},
			    {"18me2.heet.nanda@gmail.com","12345"}
	
};

     return data;

	}
}
