package pagination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPagination {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	  WebElement userName = driver.findElement(By.xpath("//input[@id='input-username']"));
	  userName.clear();
	  userName.sendKeys("demo");
	
	  WebElement userPass = driver.findElement(By.xpath(" //input[@id='input-password']"));
	  userPass.clear();
	  userPass.sendKeys("demo");
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
	  driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
	  driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
	  
	  //Showing 1 to 10 of 2206 (221 Pages)
	  
	  String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
	  System.out.println(text);
	  
	  int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
	  System.out.println(total_pages);
	  
	  for(int p=1;p<=10;p++) {
		  
		  if(p>1) {
			  
			  WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
			  active_page.click();
			  
			
			  
			  Thread.sleep(3000);
		  }
		  
		  int rows = driver.findElements(By.xpath(" //table[@class='table table-bordered table-hover']//tbody//tr")).size();
		  
		  for(int r=1;r<=rows;r++) {
			  
			  String custo_name = driver.findElement(By.xpath(" //table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
			  String email = driver.findElement(By.xpath(" //table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
			  String group = driver.findElement(By.xpath(" //table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[4]")).getText();
			  
			  System.out.println(custo_name+"\t" + email+"\t" + group+"\t");
			  
		  }
	  }
	  
	  
	  
	
	}

}
