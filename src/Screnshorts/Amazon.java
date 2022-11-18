package Screnshorts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//how to take screnshort 
		TakesScreenshot ts=(TakesScreenshot)driver;//type cast concept
		//use getscreenshort method and stote in src
		File src=ts.getScreenshotAs(OutputType.FILE);
		// create folder where we need to store screnshot give the path  of floder with proper name and extenstion
		File dest=new File("C:\\Users\\DELL\\Desktop\\screenshot\\amazon.jpg");
		Files.copy(src, dest);
	}

}
