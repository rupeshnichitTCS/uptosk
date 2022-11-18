package pom_withpage_factory_usingTestng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	Sheet sh;
	WebDriver driver;
	Login_page lp;
	Home_page hp;
	
	
	@BeforeClass
	public void openBroswer() throws Throwable {
		FileInputStream fir= new FileInputStream("C:\\Users\\DELL\\Documents\\Acti.xlsx");
		 sh = WorkbookFactory.create(fir).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//all object
		 lp=new  Login_page(driver);
		 hp=new Home_page(driver);
			
		
		
		

	}
@BeforeMethod
public void openApp() {
	
String username = sh.getRow(0).getCell(0).getStringCellValue();
lp.EnterUn(username);
String password = sh.getRow(1).getCell(0).getStringCellValue();
lp.Enterpass(password);
lp.click_login_button();
}
@Test
public void verifytext() {
	Reporter.log("runing verifytext",true);
	String expT = sh.getRow(2).getCell(0).getStringCellValue();
	String actT = hp.verifytext();
	Assert.assertEquals(expT,actT,"Tc is fail both are diffrent");
	
}
@AfterMethod
public void closeApp() {
	Reporter.log("logout from app",true);
}
@AfterClass
public void closebrowser() {
	Reporter.log("close the browser",true);
}
}
