package Keys_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Key_class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz",Keys.TAB,"123456",Keys.ENTER);
		/*
		Keys class:- Handling keys class works inside the sendkeys method 
		
		# Limitation of keys class
		- it can be used inside the sendkeys method
		- it wil not responsible for special characters
		
		remove drawback used Robot   class
		
		*/
		
		
		
	}

}
