package Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	    //select month
WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//crete object of actions class
Actions act=new Actions(driver);
//click on month
act.click(month).perform();
//move upside by one
act.sendKeys(Keys.ARROW_UP).perform();
//move on step down
act.sendKeys(Keys.ARROW_DOWN).perform();

//click on october
act.sendKeys(Keys.ENTER).perform();

	}

}
