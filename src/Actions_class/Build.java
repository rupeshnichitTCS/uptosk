package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Build {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver rupesh=new ChromeDriver();
		 rupesh.get("https://www.google.com/");
		 //inspect the element where we need to move cursor
		 WebElement trget = rupesh.findElement(By.xpath("//a[text()='Gmail']"));
		//create object of actions class
		 Actions yogesh=new  Actions(rupesh);
		 yogesh.moveToElement(trget).contextClick().click().build().perform();
		 
		 
		 
	}

}
