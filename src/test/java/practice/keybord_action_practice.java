package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keybord_action_practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.xpath(" //textarea[@id='inputText1']"));
		input.sendKeys("Hello This is for Testing");
		
		Actions act =new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		

	}

}
