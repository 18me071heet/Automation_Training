package keybord_and_slider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    WebElement textArea = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	    textArea.sendKeys("Hello How are you ?");
	    
	    Actions act = new Actions(driver);
	    
	    Thread.sleep(2000);
	    
	    act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	    act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	    Thread.sleep(2000);
	    
	    
	    act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	    Thread.sleep(2000);
	    
	    act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	    
	}

}
