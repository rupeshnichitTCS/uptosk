package upstock_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class with_ddf {
	public static void main(String[] args) throws Throwable {
		  //navigate to sheet 
		FileInputStream fir=new FileInputStream("C:\\Users\\DELL\\Documents\\upstok.xlsx");
		Sheet sh = WorkbookFactory.create(fir).getSheet("Sheet1");
		// set property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// open application
		driver.get("https://login-v2.upstox.com/");
		//enter un
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys(UN);
		//enter pass
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		String dob = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='yob']")).sendKeys(dob);
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		//verify user at home page
	String expt = "Upstox Pro";
	String actT = driver.getTitle();
	if(actT.equals(expt)) {
		System.out.println("TC case is pass");
	}
	else {
		System.out.println("TC case is fail");
	}
		
	}



		
		
		
	}


