package Dynamic_hamndling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filpcad {
	public static void main(String[] args) throws Throwable {
		FileInputStream fir=new FileInputStream("C:\\\\Users\\\\DELL\\\\Documents\\\\Actitime.xlsx");
		Sheet sh = WorkbookFactory.create(fir).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		 String text = sh.getRow(3).getCell(0).getStringCellValue();
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys(text);
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 driver.findElement(By.xpath("//div[text()='REDMI Note 11 SE (Thunder Purple, 64 GB)']")).click();
		 Set<String> handle = driver.getWindowHandles();
		  Iterator<String> inter=handle.iterator();
		  
		  String parent = inter.next();
		  String child = inter.next();
		  driver.switchTo().window(child);
		  driver.findElement(By.xpath("//li[@class='col col-6-12']//button[1]")).click();
		  
		  
		 
	}

}
