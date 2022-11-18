package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mi moblie",Keys.ENTER);
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[text()='Redmi 9A Sport (Coral Green, 32 GB)']")).click();
		Thread.sleep(4000);

		Set<String> allwindows = driver.getWindowHandles();
		Thread.sleep(4000);
		ArrayList<String> al=new ArrayList<String>(allwindows);
		String mainwindows = al.get(0);
		System.out.println(mainwindows);
		String chlidwindows = al.get(1);
		System.out.println(chlidwindows);
		
		
		
		
	}

}
