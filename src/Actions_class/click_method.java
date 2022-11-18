package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//inspect the elements where we need to move cursor
		WebElement trget = driver.findElement(By.xpath("//a[text()='Gmail']"));
		//crate object of Actions class
		Actions act=new Actions(driver);
		act.click(trget).perform();
	}

}
