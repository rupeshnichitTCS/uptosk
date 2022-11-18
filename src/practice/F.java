package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("vithal vithal");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	
	
	}

}
