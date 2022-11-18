package Actitime_without_ddf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		//set properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//enter user name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//enter pass
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//click on login page
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//verify the text present at homepage
		String expT = "Enter Time-Track";
		String actT = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		if(actT.equals(expT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
		
	}

}
