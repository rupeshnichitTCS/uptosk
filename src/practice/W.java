package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nextstep.tcs.com/campus/#/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a)[5]")).click();
		
	}

}
