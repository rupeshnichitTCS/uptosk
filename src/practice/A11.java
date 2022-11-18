package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c.addArguments("---disable-notifications");
		c.addArguments("strat-maximized");
		WebDriver driver=new  ChromeDriver(c);
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		
	}

}
