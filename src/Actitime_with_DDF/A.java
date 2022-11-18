package Actitime_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	
	//excel Fetching
	FileInputStream fir=new FileInputStream("C:\\Users\\DELL\\Documents\\Acti.xlsx");
	Sheet sh = WorkbookFactory.create(fir).getSheet("Sheet1");
	//set properties
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	//Enter UN
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
	//Enter password 
	String PWD = sh.getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PWD);
	//click on login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	////verify the text present at home page
	String expT = sh.getRow(2).getCell(0).getStringCellValue();
	String actT = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
	if(actT.equals(expT)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("TC is fail");
	}
	
}
}
