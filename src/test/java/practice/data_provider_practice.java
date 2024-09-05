package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider_practice {

	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		driver =new ChromeDriver();
		
	}
	
	@Test(dataProvider="dp")
	void login(String name,String pwd) throws InterruptedException {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(name);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	
	@Test
	void logo() {
		
		boolean myAccount = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		Assert.assertTrue(myAccount);
	}
	
	@AfterClass
	void quit() {
		
		driver.quit();
	}
	
	
	@DataProvider(name="dp")
	Object[] Logindata(){
		
		Object data[][]= {
				
				{"heet@gmail.com","admin"},{"test@gmail.com","test"},{"oops@gmail.com","oops"},{"18me2.heet.nanda@gmail.com","12345"}
	};
		
	
	
	return data;
	
	}

}
