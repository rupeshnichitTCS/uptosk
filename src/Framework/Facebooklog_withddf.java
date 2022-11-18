package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebooklog_withddf {
	public static void main(String[] args) throws Throwable {
		FileInputStream fir=new FileInputStream("C:\\Users\\DELL\\Documents\\Actitime.xlsx");
		Sheet sh = WorkbookFactory.create(fir).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(c);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String UN = sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UN);
		String Pass = sh.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Pass);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String text = driver.getTitle();
		System.out.println(text);
		
		
	
	
	}

}
