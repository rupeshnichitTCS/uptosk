package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Z {
	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    TakesScreenshot ts=(TakesScreenshot)driver;
    File scr = ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("C:\\Users\\DELL\\Desktop\\screenshot\\flipcard.jpg");
    Files.copy(scr, dest);
	}

}
