package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
	}
	
	@Test
	void testLogin() {
		
		login lg =new login(driver);
		lg.setUserName("admin");
		lg.setPassword("admin");
		lg.loginClick();
		
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
