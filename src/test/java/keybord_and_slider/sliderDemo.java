package keybord_and_slider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    WebElement min_slider = driver.findElement(By.xpath(" //div[@class='price-range-block']//span[1]"));
	    
	 //   WebElement max_slider = driver.findElement(By.xpath(" //span[@class='ui-slider-handle "));
	    
	    System.out.println(min_slider.getLocation());
	    
	    Actions act = new Actions(driver);
	    
	    Thread.sleep(3000);
	    
	     act.dragAndDropBy(min_slider, 150, 250).perform();
	   
	     Thread.sleep(2000);
	   
	     act.dragAndDropBy(min_slider, -40, 250).perform();
	}

}
