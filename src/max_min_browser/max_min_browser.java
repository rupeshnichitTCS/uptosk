package max_min_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class max_min_browser {
public static void main(String[]args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	//maximize
	driver.manage().window().maximize();
	// minimize
	
	Thread.sleep(8000);
	driver.manage().window().minimize();
	
}
}
