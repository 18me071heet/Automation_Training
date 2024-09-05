package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click_practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath(" //span[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(button).perform();
		
		driver.findElement(By.xpath(" //span[normalize-space()='Cut']")).click();
		
		driver.switchTo().alert().accept();
		

	}

}
