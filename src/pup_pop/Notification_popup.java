package pup_pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   //create object of browsr setting class
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		//open the browser
		WebDriver driver=new ChromeDriver(c);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.hdfc.com/");
		
		
		 
	}


}
