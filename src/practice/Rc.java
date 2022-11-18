package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rc {
	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 //open the application
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 
		 
	}

}
