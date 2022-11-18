package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class perticulerelement {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement perticulr = driver.findElement(By.xpath("(//img)[99]"));
		File src = perticulr.getScreenshotAs(OutputType.FILE);
		File dec=new File("C:\\Users\\DELL\\Desktop\\screenshot\\crik.jpg");
		Files.copy(src, dec);
	}

}
