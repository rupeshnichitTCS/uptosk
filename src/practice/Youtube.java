package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.get("https://www.youtube.com/");
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("tarakmehata ka ulta chama");
	 driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	 driver.findElement(By.xpath("(//div[@class='style-scope ytd-video-renderer']//a)[@id='thumbnail']")).click();
	 
}
}
