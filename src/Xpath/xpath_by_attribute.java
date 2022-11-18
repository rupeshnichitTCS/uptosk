package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		// enter usename(use formula xpath by attribute)
		// formula //tagname[@An='Av']
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//enter password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		// //click on login btn(use formula xpath by text())
		// formula //tag name[text()='je text ahe te yete liha']
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
	}

}
