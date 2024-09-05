package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	   WebElement fromcountryEle = driver.findElement(By.xpath("//select[@name='fromPort']"));
	   Select dropfrom = new Select(fromcountryEle);
	   dropfrom.selectByVisibleText("Portland");

	   WebElement tocountryEle = driver.findElement(By.xpath("//select[@name='toPort']"));
	   Select dropTo = new Select(tocountryEle);
	   dropTo.selectByVisibleText("Berlin");
	   
	   driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	   
	   
	   //total rows
	   
	int rows=  driver.findElements(By.tagName("tr")).size();
	
	   
	 System.out.println(rows);
	 
	 
	 int column=  driver.findElements(By.tagName("th")).size();
	 System.out.println(column);
	 
	/* for(int r=2;r<=rows;r++) {
		 
		 for(int c=1;c<=column;c++) {
			 
			 String value = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//th["+c+"]")).getText();
			 System.out.print(value + "\t");
		 }
		 
		 System.out.println();
		 */
		 
	/*	 for(int r=2;r<=rows;r++) {
			 
			 String value = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			 
			 if(value.equals("$200.98")) {
				 
				 driver.findElement(By.xpath(" //table[@class='table']//tr[3]//td[1]")).click();
			 }
			// System.out.print(value + "\t");
		 }
		 
		 */
		 driver.findElement(By.xpath(" //table[@class='table']//tr[3]//td[1]")).click();
		 driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Heet");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(" //input[@id='address']")).sendKeys("Dwarkesh");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(" //input[@id='city']")).sendKeys("Jamnagar");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Gujarat");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("361001");
		 Thread.sleep(2000);
		 
		   WebElement cardType = driver.findElement(By.xpath(" //select[@id='cardType']"));
		   Select card = new Select(cardType);
		   card.selectByVisibleText("American Express");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("88888888");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("11");
				   driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2000");
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Heet");
				   driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
				   
				   driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
				   
				  String text=  driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
		 
		 System.out.println(text);
		 
		 
		 
	 }
	 
	}

