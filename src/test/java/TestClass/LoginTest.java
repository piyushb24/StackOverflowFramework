package TestClass;

import org.testng.annotations.Test;

import BaseClass.BaseTest;
import PageClass.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void verifylogin() {
		LoginPage login = new LoginPage(driver);
		login.enterusername("piyushbhandarkar13@gmail.com");
		login.enterpassword("Itachi@1508");
		login.clicksubmit();
		//test 

	}
	

}
