package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Month {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 //open the application
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		 //select the dd which we need to handle
		 Thread.sleep(4000);
		 //store list box in reference variable
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 //create object of select class
		 Select s=new Select(month);
		// s.selectByVisibleText("Jul");
		 //select by value
		 s.selectByValue("12");
		 //select by index
			// s.selectByIndex(0);
			 
		
	}

}
