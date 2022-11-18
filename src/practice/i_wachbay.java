package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Xpath.xpath_by_attribute;

public class i_wachbay {
	private static String xpath;

	public static void main(String[] args) throws Throwable {
		FileInputStream fie=new FileInputStream("C:\\Users\\DELL\\Documents\\iwach.xlsx");
		Sheet sh = WorkbookFactory.create(fie).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String surch = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(surch);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//div[@class='col col-7-12']//div)[5]")).click();
		Set<String> allelement = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allelement);
		String mainwindows = al.get(0);
		String child = al.get(1);
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
		String act = driver.getTitle();
		String expt="Flipkart.com: Secure Payment: Login > Select Shipping Address > Review Order > Place Order";
		if(act.equals(expt)) {
			System.out.println("Tc is pass ");
		}
		else {
			System.out.println("Tc is Felis");
		}
		
		
		
		
	}

}
