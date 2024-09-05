package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dpd_sl_7hz2t19t5c_e%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D1595725753133142325%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9145648%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&ref_=topnav_lang");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	    
	    WebElement hindi = driver.findElement(By.xpath("//div[3]//div[1]//label[1]//i[1]"));
	    WebElement marathi = driver.findElement(By.xpath("//div[3]//div[1]//label[1]//i[1]"));
	    
	    
	    
	    System.out.println(hindi.isSelected());
	    System.out.println(marathi.isSelected());
	    
	    
	    
	    System.out.println("After selected hindi");
	    hindi.click();
	    System.out.println(hindi.isSelected());
	    
	    marathi.click();
	    System.out.println(marathi.isSelected());

	    
	    
	}

}
