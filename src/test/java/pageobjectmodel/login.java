package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver driver;
	
	//Constructor
	login(WebDriver driver){
		
		this.driver=driver;

}
	
	
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc =    By.xpath(" //button[normalize-space()='Login']");
	
	public void setUserName(String user) {
		
		driver.findElement(txt_username_loc).sendKeys(user);
		
	}
	
	
    public void setPassword(String password) {
		
		driver.findElement(txt_password_loc).sendKeys(password);
		
     }
		
	
		public void loginClick() {
			
			driver.findElement(btn_login_loc).click();
			
		}


		
		
}


