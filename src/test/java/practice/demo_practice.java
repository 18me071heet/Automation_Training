package practice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demo_practice {


	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=17254523284975909880&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9145648&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		
	}
	
	@Test(priority=2)
	void currentUrl() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=17254523284975909880&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9145648&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	}
	
	@Test(priority =3,dependsOnMethods= {"currentUrl"} )
	void pageName() {
		
		Assert.assertEquals(driver.getTitle(), "OrangeHrm");
	}
	
	@Test(priority=4,dependsOnMethods= {"pageName"})
	void logo() {
		
	
		
	boolean logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
	Assert.assertEquals(logo, true);
	}
}
