package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotaions {
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open the browse",true);
	}
	@BeforeMethod
	public void loginApp() {
		Reporter.log("login to App",true);
	}
	@Test
	public void verifyID() {
		Reporter.log("verify user id",true);
		
	}
	@AfterMethod
public void logoutApp()	
	

} 	   
