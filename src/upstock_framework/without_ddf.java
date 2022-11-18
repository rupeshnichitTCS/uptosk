package upstock_framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_ddf {
	public static void main(String[] args) {
		//set property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//delete all cookies
		driver.manage().deleteAllCookies();
		//maxzimize broswer
		driver.manage().window().maximize();
		//open url
		driver.get("https://login-v2.upstox.com/");
		// enter un
		driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("2ZB2T4");
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Samar@1988");
		//click on login button
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		// enter date of brith 
		driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1988");
		//click on i am not goog
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		//verify user at home page
	String expt = "Upstox Pro";
	String actT = driver.getTitle();
	if(actT.equals(expt)) {
		System.out.println("TC case is pass");
	}
	else {
		System.out.println("TC case is fail");
	}
		
	}

}
