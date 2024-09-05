package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	  WebElement components= driver.findElement(By.xpath("//a[normalize-space()='Components']"));
	  WebElement monitors= driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
	  
	  Actions act =new Actions(driver);
	  
	  act.moveToElement(components).moveToElement(monitors).click().perform();
	    
	}

}
