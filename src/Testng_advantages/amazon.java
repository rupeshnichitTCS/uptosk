package Testng_advantages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class amazon {
@Test
 public void m1() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
@Test
public void m2() {
System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("i phone 12",Keys.TAB.ENTER);

		
}
@Test
public void m3() {
System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
}
}
