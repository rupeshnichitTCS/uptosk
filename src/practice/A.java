package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.sbi.co.in/web/personal-banking/loans/gold-loan");
//	Point p=new Point(400, 400);
	//driver.manage().window().setPosition(p);
	//Dimension d=new Dimension(200,500);
	//driver.manage().window().setSize(d);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	
}
}
