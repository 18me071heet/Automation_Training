package date_picker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class user_defined_date {
	
	static void datePicker(WebDriver driver,String expected_year,String expected_month,String expected_date ) {
		
		   while(true) {
			   
			   String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			   String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			   
			   if(current_month.equals(expected_month) && current_year.equals(expected_year)) {
				   
				   break;
			   }
			   
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // for upcoming
			 
			// driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //for previous dates
		   }
		   
			 // Selecting Date
		   
		   
			 List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
			 
			 for(WebElement dt: dates) {
				 
				 if(dt.getText().equals(expected_date)) {
					 
					 dt.click();
					 break;
				 }
			 }
		
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    driver.switchTo().frame(0);

	    driver.findElement(By.xpath("//input[@id='datepicker']")).click(); 
	   
	   datePicker(driver,"2025","June","26");
	   
	}

}
