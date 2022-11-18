package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tcs_login {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nextstep.tcs.com/campus/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("sanidhy kale");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("sanidhy");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		
		Thread.sleep(3000);
	driver.close();
		
		
		
		
	}

}
