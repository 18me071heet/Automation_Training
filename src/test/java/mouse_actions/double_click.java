package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    driver.switchTo().frame("iframeResult");
	    
	    
	  WebElement text1 = driver.findElement(By.xpath("//input[@id='field1']")); 
	  WebElement text2 = driver.findElement(By.xpath("//input[@id='field2']"));
	  WebElement copy = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
			  
			  text1.clear();
			  text1.sendKeys("Selenium");
			  
			  Actions act = new Actions(driver);
			  act.doubleClick(copy).perform();
			  
			  
			  String text = text2.getAttribute("value");
			  
			  System.out.println(text);
			  
			  if(text.equals("Selenium")) {
				  
				  System.out.println("Same matching");
			  }
			  
			  else {
				  
				  System.out.println("No matching"); 
			  }
	}

}
