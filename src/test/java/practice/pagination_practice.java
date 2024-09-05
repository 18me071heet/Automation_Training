package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagination_practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    WebElement userName = driver.findElement(By.xpath(" //input[@id='input-username']"));
	    userName.clear();
	    userName.sendKeys("demo");
	    
	    
	    WebElement password = driver.findElement(By.xpath("  //input[@id='input-password']"));
        password.clear();
        password.sendKeys("demo");
        
        WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        login.click();
        
        Alert myalert = driver.switchTo().alert();
	    Thread.sleep(3000);
	    myalert.accept();
	    
	    
	    driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
	    driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
	    
	    String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
	    
	    
	    int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	    
	    for(int p=1;p<=5;p++) {
	    	
	    	  if(p>1) {
				  
				  WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				  active_page.click();
				  
				
				  
				  Thread.sleep(3000);
			  }
	    	  
	    	
	    		  
	    		  
	    		 int total_rows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
	    	  
	    		  for(int r=1;r<=total_rows;r++) {
	    
	    			  
	    			  String customer_name = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
	    			  String date_added = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
	    			  
	    			  System.out.println(customer_name+"\t"+date_added);
	    			  
	}

	    }
	}
}

	
	


