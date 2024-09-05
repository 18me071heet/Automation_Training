package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class date_picker_practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		
		String expected_month = "November";
		String expected_year = "2025";
		String expected_date ="17";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
		
		Thread.sleep(3000);
		
		while(true) {
			
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(current_month.equals(expected_month) && current_year.equals(expected_year)){
				
				break;
				
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		
		for(WebElement dt:dates) {
			
			if (dt.getText().equals(expected_date)) {
				
				dt.click();
				break;
			}
		}
		
		
	}

}
