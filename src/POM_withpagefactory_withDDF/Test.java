package POM_withpagefactory_withDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws Throwable {
		 //fetch data from excel Sheet
		FileInputStream fir=new FileInputStream("C:\\\\Users\\\\DELL\\\\Documents\\\\Acti.xlsx");
		Sheet sh = WorkbookFactory.create(fir).getSheet("Sheet1");
		//set properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.actitime.com/login.do");
		//enter un
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		Login_page l1=new Login_page(driver);
		l1.enterun(username);
		//enter password
		String password = sh.getRow(1).getCell(0).getStringCellValue();
		l1.enterpass(password);
		//click login buttoun
		l1.clickonloginbutton();
		//object2nd
		String expT = sh.getRow(2).getCell(0).getStringCellValue();
		Home1_page l2=new Home1_page(driver);
				l2.verifytext1(expT);
				
				
		
	}

}
