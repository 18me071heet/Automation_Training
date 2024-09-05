package practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;

import jdk.javadoc.internal.doclets.formats.html.taglets.InheritableTaglet.Output;

public class screen_short_practise {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=4484943927846223653&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061748&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Cars");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File tagefile = new File(System.getProperty("user.dir")+"\\screenshotss\\ss.png");
		sourceFile.renameTo(tagefile);
		
		WebElement specific_section = driver.findElement(By.xpath("//span[normalize-space()='Highly rated']"));
		File SourceFile2 = specific_section.getScreenshotAs(OutputType.FILE);
		File targetFile2 =  new File(System.getProperty("user.dir")+"\\screenshotss\\highly_rated_ss.png");
		SourceFile2.renameTo(targetFile2);
		
		
		
	}

}
