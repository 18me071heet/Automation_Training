package day1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=1595725753133142325&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9145648&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
    Thread.sleep(3000);
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    
  //  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
  //  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin");
  //  driver.findElement(By.name("login")).click();
    
  //  Thread.sleep(3000);
    
   // driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']")).click();
   
   // System.out.println(driver.getTitle());
    
    List< WebElement> headerlinks = driver.findElements(By.className("nav-a"));
     System.out.println(headerlinks.size());
    
    Boolean statusLogo = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
    System.out.println(statusLogo);
    
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("toys");
    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    driver.navigate().back();
    driver.findElement(By.xpath("//img[@alt=\"ANNI DESIGNER Women's Cotton Blend Straight Printed Kurta with Palazzo\"]")).click();
    driver.navigate().back();
//    driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
   // driver.findElement(By.linkText("Start here")).click();
    System.out.println(driver.getTitle());
    
    
    
    
	
		
	
		
	}

}
