package practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setpos2 {
	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.onlinesbi.sbi/");
		 Thread.sleep(3000);
		 Point p=new Point(200,400);
		 driver.manage().window().setPosition(p);
		 
	}

}
