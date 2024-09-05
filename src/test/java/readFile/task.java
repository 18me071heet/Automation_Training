package readFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	    
	    String filePath = System.getProperty("user.dir")+"\\testData\\cal.xlsx";
	    
	    int rows = excelUtils.getrowCount(filePath, "trial");
	    
	    for(int r=1;r<=rows;r++) {
	    	
	    	// reading data from file
	    	
	    	String price = excelUtils.getcellData(filePath, "trial", r, 0);
	    	String roi = excelUtils.getcellData(filePath, "trial", r, 1);
	    	String per1 = excelUtils.getcellData(filePath, "trial", r, 2);
	    	String per2 = excelUtils.getcellData(filePath, "trial", r, 3);
	    	String frequency = excelUtils.getcellData(filePath, "trial", r, 4);
	        String expected = excelUtils.getcellData(filePath, "trial", r, 5);
	    	
	    	// passing data to field
	    	
	    	Thread.sleep(2000);
	    	
	    	
	    	 driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(price);
	    	 driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
	    	 Thread.sleep(2000);
	    	 driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
	    	 
	    	 Select period2 = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
	    	 period2.selectByVisibleText(per2);
	    	 
	    		
	    	 Select frequ = new Select(driver.findElement(By.xpath(" //select[@id='frequency']")));
	    	 frequ.selectByVisibleText(frequency);
	    	 
	    	 driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
	    	 
	    	 // Validation
	    	 
	    	 String act_value = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
	    	 
	    	 if(Double.parseDouble(expected)==Double.parseDouble(act_value)) {
	    		 
	    		 System.out.println("Test passed");
	    		 
	    		 excelUtils.setcellData(filePath, "trial", r, 7,"Passed");
	    		 
	    	 }
	    	 
	    	 else {
	    		 System.out.println("Test failed");
	    		 excelUtils.setcellData(filePath, "trial", r, 7,"Failed");
	    	 }
	    	 
	    	 
	    	 driver.findElement(By.xpath("//img[@class='PL5'")).click();
	    	 
	    }
		
	    driver.quit();
	}

}
