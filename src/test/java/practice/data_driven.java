package practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class data_driven {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculatorsoup.com/calculators/financial/compound-interest-calculator.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

		String path = System.getProperty("user.dir")+".\\testData\\DDT.xlsx";
		
		int rows = excel_utils_practice.getrowCount(path, "Sheet1");
		
		for(int r=1;r<=rows;r++) {
			
			String calcualte = excel_utils_practice.getcellData(path, "Sheet1", r, 0);
			String principal = excel_utils_practice.getcellData(path, "Sheet1", r, 1);
			String roi = excel_utils_practice.getcellData(path, "Sheet1", r, 2);
			String compound = excel_utils_practice.getcellData(path, "Sheet1", r, 3);
			String time = excel_utils_practice.getcellData(path, "Sheet1", r, 4);
			String value = excel_utils_practice.getcellData(path, "Sheet1", r, 5);
			
			Select cal = new Select(driver.findElement(By.xpath("//select[@id='given_data']")));
			cal.selectByVisibleText(calcualte);
			
			driver.findElement(By.xpath(" //input[@id='P']")).sendKeys(principal);
			driver.findElement(By.xpath("//input[@id='R']")).sendKeys(roi);
			

			Select com = new Select(driver.findElement(By.xpath(" //select[@id='n']")));
			com.selectByVisibleText(compound);
			
			driver.findElement(By.xpath("//input[@id='t']")).sendKeys(time);
			
			driver.findElement(By.xpath("//input[@id='calculateButton']")).click();
			
			String act_value = driver.findElement(By.xpath("//div[@id='answer']")).getText();
			
			if(Double.parseDouble(act_value)==Double.parseDouble(value)) {
				
				System.out.println("Test Passed");
				excel_utils_practice.setcellData(path, "Sheet1", r, 6, "Passed");
			}
			
			else {
				
				System.out.println("Test Failed");
				excel_utils_practice.setcellData(path, "Sheet1", r, 6, "Failed");
				
			}

			driver.findElement(By.xpath("//input[@id='calculateButton']")).click();

			
		}
				
	}

}
