package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class A5 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mjp.maharashtra.gov.in/en/node/4");
		TakesScreenshot tes=(TakesScreenshot)driver;
		File src = tes.getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\Users\\DELL\\Desktop\\screenshot\\mjp.jpg");
		Files.copy(src, desti);
	}

}
