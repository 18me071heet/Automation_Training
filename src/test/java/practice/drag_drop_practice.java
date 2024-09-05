package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		
		WebElement copenhegen = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(copenhegen, denmark).perform();
		
		

	}

}
