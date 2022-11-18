package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	Thread.sleep(3000);
	d.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("mi moble");
	Thread.sleep(3000);
	d.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
	Thread.sleep(3000);
	d.findElement(By.cssSelector("img[alt='Xiaomi 12 Pro | 5G (Noir Black, 12GB RAM, 256GB Storage) | Snapdragon 8 Gen 1 | 50+50+50MP Flagship Cameras (OIS) | 10bit 2K+ Curved AMOLED Display | Sound by Harman Kardon']")).click();
	Thread.sleep(3000);
	d.findElement(By.cssSelector("input[id='buy-now-button']")).click();
	d.close();
}
}
