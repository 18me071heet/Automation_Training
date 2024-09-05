package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	   WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	   
	   Actions act = new Actions(driver);
	   act.contextClick(button).perform();
	   
	   driver.findElement(By.xpath("//span[normalize-space()='Paste']")).click();
	   
	   driver.switchTo().alert().accept();
	    
	    		
	}

}
