package chromeOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ignitoMode {

	public static void main(String[] args) {
		
		ChromeOptions os = new ChromeOptions();
		os.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(os);
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13780557643146505510&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9154062&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		

		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("toys");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();	

	}

}
