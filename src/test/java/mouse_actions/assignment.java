package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    WebElement text1 = driver.findElement(By.xpath("//input[@id='field1']"));
	    WebElement text2 = driver.findElement(By.xpath("//input[@id='field2']"));
	    WebElement copy = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	    		  
	    		  text1.clear();
	    		  Thread.sleep(2000);
	    		  text1.sendKeys("Business");
	    		  
	    		  Actions act = new Actions(driver);
	    		  act.doubleClick(copy).perform();
	    		  
	    		  String text = text2.getAttribute("value");
	    		  System.out.println(text);
	    		  
	    		  if(text.equals("Business")) {
	    			  
	    			  System.out.println("passed");
	    		  }
	    		  
	    		  else
	    		  {
	    			  System.out.println("not matching");
	    		  }
	    		  
	    
	}

}
