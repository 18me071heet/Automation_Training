package practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class data_driven_practice {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		
	    String filePath = System.getProperty("user.dir")+"\\testData\\data.xlsx";		
	    
	   
		
			 int rows = excel_utils_practice.getrowCount(filePath, "Sheet1");
		
		
		
		for(int r=1;r<=rows;r++) {
			
			String principle =excel_utils_practice.getcellData(filePath,"Sheet1", r, 0);
			String roi = excel_utils_practice.getcellData(filePath, "Sheet1", r, 1);
			String per1 = excel_utils_practice.getcellData(filePath, "Sheet1", r, 2);
			String per2 = excel_utils_practice.getcellData(filePath, "Sheet1", r, 3);
			String frequency = excel_utils_practice.getcellData(filePath, "Sheet1", r, 4);
			String exp_value = excel_utils_practice.getcellData(filePath, "Sheet1", r, 5);
			String expected =  excel_utils_practice.getcellData(filePath, "Sheet1", r, 6);
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			
			 Select period2 = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
	    	 period2.selectByVisibleText(per2);
	    	 
	    		
	    	 Select frequ = new Select(driver.findElement(By.xpath(" //select[@id='frequency']")));
	    	 frequ.selectByVisibleText(frequency);
	    	 
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			String act_value = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(act_value)==Double.parseDouble(exp_value)) {
				
				System.out.println("Test Passed");
				excel_utils_practice.setcellData(filePath, "Sheet1", r, 7, "Passed");
			}
			
			else {
				
				System.out.println("Test Failed");
				excel_utils_practice.setcellData(filePath, "Sheet1", r, 7, "Failed");

			}
			
			driver.findElement(By.xpath("//img[@class='PL5']")).click();

		}
		
	}

}
