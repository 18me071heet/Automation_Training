package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://theonetechnologies.com/career/apply");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath(" //input[@id='Resume']")).sendKeys("\"C:\\Users\\LENOVO\\Desktop\\automation_selenium\\training\\src\\test\\java\\javaScriptExecutor\\scrollPage.java\"");
	    
	   
	    
	    
	}

}
