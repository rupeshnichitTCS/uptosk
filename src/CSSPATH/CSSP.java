package CSSPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSP {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		 driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		 
	}

}
