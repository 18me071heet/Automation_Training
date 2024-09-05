package listner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo {

	WebDriver driver;
	
	@Test(priority=1)
	void setup() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=17254523284975909880&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9145648&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	void getURL() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=17254523284975909880&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9145648&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
	}
	
	@Test(priority=3)
	void getTitle() {
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	
	@Test(priority=4,dependsOnMethods= {"getTitle"})
	void logo() {
		
		boolean logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		Assert.assertEquals(logo, true);
				
	}
}
