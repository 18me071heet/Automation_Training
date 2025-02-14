package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider_practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        System.out.println(min_slider.getLocation());
        
        Actions act =new Actions(driver);
       act.dragAndDropBy(min_slider, 100, 110).perform();
       
       WebElement max_slider = driver.findElement(By.xpath(" //span[@class='ui-slider-handle']"));
       
       System.out.println(max_slider.getLocation());
	}

}
