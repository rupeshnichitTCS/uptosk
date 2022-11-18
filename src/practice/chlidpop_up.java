package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chlidpop_up {
	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		 // by deflaut selenium control its on main windows we need take all windows sequentially 
		 Thread.sleep(5000);
Set<String> allwindows = driver.getWindowHandles();
//using interface of Array list we can store all windows sqeuvenslly
ArrayList<String>al=new ArrayList<String>(allwindows);
// i want to print address of main windows
String mainwindows = al.get(0);
System.out.println(mainwindows);
// i want print addres of chlid windows
String chlidwindows = al.get(1);
System.out.println(chlidwindows);

		 
		 
		 
		 
	}

}
