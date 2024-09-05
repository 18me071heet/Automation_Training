package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click_practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		Actions act =new Actions(driver);
		
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		field1.clear();
		
		field1.sendKeys("Test");
		
		WebElement copy = driver.findElement(By.xpath(" //button[normalize-space()='Copy Text']"));
		act.doubleClick(copy).perform();
		
		String text = field2.getAttribute("value");
		
		if(text.equals("Test")) {
			
			System.out.println("Matching");
		}
		
		else
		{
			System.out.print("Not Matching");
		}
	
		
	}

}
