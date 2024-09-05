package pagination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    
	    for(int p=1;p<=4;p++) {
	    	
	    	
	    	  
	    	if(p>1) {
	    		
	    		WebElement total_rows = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
	    		total_rows.click();
	    		
	    		Thread.sleep(3000);
	    		
	    	}
	    	
	    	int rows_size = driver.findElements(By.xpath("//div[@class='table-container']//tbody//tr")).size();
	    	
	    	System.out.println(rows_size);
	    	
	    	for(int r=1;r<=rows_size;r++) {
	    		
	    		String name = driver.findElement(By.xpath(" //div[@class='table-container']//tbody//tr["+r+"]/td[2]")).getText();

	    		String price = driver.findElement(By.xpath(" //div[@class='table-container']//tbody//tr["+r+"]/td[3]")).getText();
	    		
	    		
	    		System.out.println(name+"\t" + price+"\t");
	    		
	    	}
	    }
	    
	    
	}

}
