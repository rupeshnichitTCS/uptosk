package Drop_down;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	// data driven frame work
	public static void main(String[] args) throws Throwable {
		FileInputStream fir=new FileInputStream("C:\\Users\\DELL\\Documents\\facebook.xlsx");
		
		Sheet sh = WorkbookFactory.create(fir).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(day);
		s.selectByValue("4");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1=new Select(month);
		s1.selectByValue("7");
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1998");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		String name = sh.getRow(4).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
		String lastname = sh.getRow(4).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		String number = sh.getRow(4).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(number);
		String pass = sh.getRow(4).getCell(3).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(pass);
	
	
	
	}

}
