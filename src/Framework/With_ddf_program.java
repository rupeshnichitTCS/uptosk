package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_ddf_program {
	public static void main(String[] args) throws Throwable, Throwable {
		//fetch data from excel
		FileInputStream fir=new FileInputStream("C:\\Users\\DELL\\Documents\\Actitime.xlsx");
		 Sheet sh = WorkbookFactory.create(fir).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//impliciit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 //delete all coockies
	driver.manage().deleteAllCookies();
	 //maximize
	driver.manage().window().maximize();
	 //open the application
	driver.get("https://demo.actitime.com/login.do");
	 //enter usename
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
	//enter password
	String pass = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//enter something in homepage
	String Add = sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys(Add);
	//verify tite of home page
	String expT = sh.getRow(0).getCell(3).getStringCellValue();
	String actT = driver.getTitle();
	//verify the tile of home page
	if(expT.equals(actT)) {
		System.out.println("Tc is pass");
	}
	else {
		System.out.println("Tc is fails");
	}
	
	
	

	
	}

}
