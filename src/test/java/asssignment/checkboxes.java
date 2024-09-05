package asssignment;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	  //  driver.findElement(By.xpath("//input[@id='sunday']")).click();
	    
	    List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	    
	    for(int i=3;i<checkboxes.size();i++) {
	    	
	    	checkboxes.get(i).click();
	    }
	    
	    Thread.sleep(4000);
	    // unchecked above selectors
	    
   for(int i=3;i<checkboxes.size();i++) {
	   
	   if(checkboxes.get(i).isSelected()) {
		   checkboxes.get(i).click();
	   }
	    	
	    	
	    }
	    

	}

}
