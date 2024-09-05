package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameterizedDemo {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setUp(String br) {
		
		switch(br) {
		
		case "chrome": driver=new ChromeDriver(); break;
		case "edge": driver=new EdgeDriver(); break;
		case "firefox": driver=new FirefoxDriver(); break;
		default: System.out.println("Invalid Browser"); return;

		}
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test
	void testLogo() {
		
		boolean logo = driver.findElement(By.xpath(" //img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
		
	}

	@Test
	void testTitle() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
		
	}
	
	@Test
	void currentUrl() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void close() {
		
		driver.quit();
	}
}
