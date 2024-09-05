package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class scrollPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13780557643146505510&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9154062&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    
        // Using Pixel Number 
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	  //  js.executeScript("window.scrollBy(0,1100)", "");
	    
	    
	 // System.out.println(js.executeScript("return window.pageYoffset;"));
	    
	    
	    
	    // Using Element find
	    
	   // WebElement element = driver.findElement(By.xpath(" //span[normalize-space()='Trendy home decor']"));
	   // js.executeAsyncScript("arguments[0].scrollIntoView();",element);
	    // System.out.println(js.executeScript("return window.pageYoffset;"));
	    
	    // Scroll till end of the page
	    
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    Thread.sleep(5000);
	    
	    js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	}

}
