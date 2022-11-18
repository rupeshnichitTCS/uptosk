package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_filldatemonth_yaer {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		Thread.sleep(3000);
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
         d.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		  WebElement day = d.findElement(By.xpath("//select[@id='day']"));
		 Select s=new Select(day);
			Thread.sleep(3000);
			s.selectByValue("4");
			Thread.sleep(3000);
     WebElement month = d.findElement(By.xpath("//select[@id='month']"));
    
     Select s1=new Select(month);
     
    s1.selectByVisibleText("Jul");
    Thread.sleep(3000);
    WebElement year = d.findElement(By.xpath("//select[@id='year']"));
    Thread.sleep(3000);
    Select s2=new Select(year);
    s2.selectByVisibleText("1998");
    
   
   
	}

}
