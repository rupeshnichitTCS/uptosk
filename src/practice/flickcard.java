package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flickcard {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mi moblie");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.className("_bXVsd_image_1pfbQ")).click();
	Thread.sleep(3000);
	driver.findElement(By.className("a-truncate-cut")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("submit.addToCart")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("proceedToRetailCheckout")).click();
}
}
