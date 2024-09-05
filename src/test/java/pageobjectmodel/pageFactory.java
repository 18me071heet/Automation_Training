package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageFactory {
	
	WebDriver driver;
	
	
	pageFactory(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//input[@placeholder='Username']"))
			WebElement txt_username;
	
	@FindBy(xpath=("//input[@placeholder='Password']"))
	        WebElement txt_password;
	
	@FindBy(xpath=("//button[normalize-space()='Login']"))
	        WebElement btn_login;
	
	public void setUserName(String user) {
		
		txt_username.sendKeys(user);
		
	}
	
	
    public void setPassword(String password) {
		
    	txt_password.sendKeys(password);
		
     }
		
	
		public void loginClick() {
			
			btn_login.click();
			
		}


}
