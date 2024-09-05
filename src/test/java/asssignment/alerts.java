package asssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	    driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
	    
	    Thread.sleep(3000);
	    
	    Alert myalert = driver.switchTo().alert();
	    Thread.sleep(3000);

	    System.out.println(myalert.getText());
	  
	    myalert.accept();
	  
	    
	    
        driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
	    
	    Thread.sleep(3000);
	    
	    Alert myalert2 = driver.switchTo().alert();
	    Thread.sleep(3000);
	    myalert2.dismiss();
	    
	    
	   
       driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
	    
	    Thread.sleep(3000);
	    
	    Alert myalert3 = driver.switchTo().alert();
	    myalert3.sendKeys("hello automation");
	    myalert3.accept();
	    
	    
	    
	    

	}

}
