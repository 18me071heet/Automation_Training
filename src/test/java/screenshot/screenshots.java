package screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13780557643146505510&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9154062&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("pillows");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    Thread.sleep(3000);
	    
	    // Takes full page Screenshot
	    
	    TakesScreenshot ts = (TakesScreenshot) driver;
	 //   File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	  //  File targetFile = new File(System.getProperty("user.dir")+"\\screenshotss\\image.png");
	  //  sourceFile.renameTo(targetFile);
	    
	    // Capture screenshot of specific section
	    
	    WebElement specificSection = driver.findElement(By.xpath(" //span[normalize-space()='Highly rated']"));
	    File sourceFile = specificSection.getScreenshotAs(OutputType.FILE);
	    File targetFile = new File(System.getProperty("user.dir")+"\\screenshotss\\image.png");
	    sourceFile.renameTo(targetFile);
	    
	    
	}

}
