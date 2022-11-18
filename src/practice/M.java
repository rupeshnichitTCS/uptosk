package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class M {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		Thread.sleep(3000);
		WebElement particlur = driver.findElement(By.xpath("//div[@class='banking_section']"));
		File src = particlur.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\DELL\\Desktop\\screenshot\\logo3.jpg");
		Files.copy(src, des);
	}

}
