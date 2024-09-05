package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

	    WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
	    WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
	    WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
	    WebElement us = driver.findElement(By.xpath("//div[@id='box103']"));
					  
		 Actions act = new Actions(driver);
		 act.dragAndDrop(madrid,spain).perform();
		 act.dragAndDrop(washington,us).perform();
					  
					  
					  
					  
	}

}
