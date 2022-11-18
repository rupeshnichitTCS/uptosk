package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class mulibrowser {
	@Parameters("browsername")
	@Test
	public void TC(String browsername){// paramerized method
		WebDriver driver =null;//run time polymorphisum
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://www.onlinesbi.sbi/");
		
		
	}
	

}
