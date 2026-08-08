package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	public LoginPage (WebDriver driver) {
		this.driver = driver;	
	}
	//xpath or id
	By txtusername = By.id("email");
	By txtpassword = By.id("password");
	By clicklogin = By.id("submit-button");
	
	public void enterusername (String username) {
		driver.findElement(txtusername).sendKeys(username);
	}
	public void enterpassword (String password) {
		driver.findElement(txtpassword).sendKeys(password);
	}
	public void clicksubmit () {
		driver.findElement(clicklogin).click();
	}
	
	public void login (String username, String password) {
		enterusername(username);
		enterpassword(password);
		clicksubmit();
	}
		
	

	

}
