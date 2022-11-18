package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withddf {
	public static void main(String[] args) throws Throwable {
		FileInputStream fir= new FileInputStream("C:\\Users\\DELL\\Documents\\yogesh.xlsx");
		Sheet sh = WorkbookFactory.create(fir).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String surch = sh.getRow(0).getCell(0).getStringCellValue();
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys(surch);
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    driver.findElement(By.xpath("(//div[@class='col col-7-12']/descendant::div)[1]")).click();
	    Set<String> allwindows = driver.getWindowHandles();
	     ArrayList<String> al=new ArrayList<String>(allwindows);
	     //I want to print address of main window
	     String mainwindows = al.get(0);
	     String child = al.get(1);
	     driver.switchTo().window(child);
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
	     String tile = driver.getTitle();
	     
	     String exp="Flipkart.com: Secure Payment: Login > Select Shipping Address > Review Order > Place Order";
	    
	     driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("7798314474");
	     String act = driver.getTitle();
	     if(exp.equals(act)) {
	    	 System.out.println("Tc is pass");
	     }
	     else {
	    	 System.out.println("Tc is fail");

	     }
	     		
	}

}
