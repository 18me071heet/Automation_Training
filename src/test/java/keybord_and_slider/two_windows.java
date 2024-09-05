package keybord_and_slider;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class two_windows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13780557643146505510&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9154062&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    WebElement fashionaPage = driver.findElement(By.xpath("//a[normalize-space()='Fashion']"));
	    
	    Actions act = new Actions(driver);
	    
	    act.keyDown(Keys.CONTROL).click(fashionaPage).keyUp(Keys.CONTROL).perform();
	    
	    List<String> id = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(id.get(1));
	    
	    
	}

}
