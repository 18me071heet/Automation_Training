package asssignment;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	    
	    String windowId = driver.getWindowHandle();
	    System.out.println(windowId);
	    
	    
	    driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("cars");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    List<WebElement> links = driver.findElements(By.id("wikipedia-search-result-link"));
	    System.out.println(links.size());
	    
	   /* for(int i=0 ; i<links.size();i++) {
	    	
	    	links.get(i).click();
	    }
	    
	    */
	    
	   /* for(WebElement link:links) {
	    	
	    	link.click();
	    }
	    */
	    
	    driver.get("https://en.wikipedia.org/wiki/Car");
	    String windowId2 = driver.getWindowHandle();
	    System.out.println(windowId2);
	    
	    Set<String> windowIDs = driver.getWindowHandles();
	    
	    for(String winId: windowIDs) {
	    	
	    	String title =  driver.switchTo().window(winId).getTitle();
	    	
	    	if(title.equals("Car - Wikipedia")) {
	    		
	    		driver.close();
	    	}
	    	
	    }
	    

	}

}
