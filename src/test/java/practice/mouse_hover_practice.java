package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover_practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		
		WebElement component = driver.findElement(By.xpath("//a[normalize-space()='Components']"));
		WebElement monitors = driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
		
		act.moveToElement(component).moveToElement(monitors).click().perform();
		
		


	}

}
