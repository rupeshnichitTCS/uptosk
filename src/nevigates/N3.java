package nevigates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class N3 {
public static void main(String[]args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.get("https://www.onlinesbi.sbi/");
	Thread.sleep(3000);
	driver.get("https://www.sbi.co.in/web/personal-banking/loans/gold-loan");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.close();
	
	
}
}
