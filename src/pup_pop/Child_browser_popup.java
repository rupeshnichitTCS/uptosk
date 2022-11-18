package pup_pop;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// imp more practies
public class Child_browser_popup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    //open the application
	    driver.get("https://www.flipkart.com/");
	    //click on cancel button
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    //search for mobiles
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
	    //click on mobile 
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	    //by default selenium control ids on main window we need take all windows
	    Thread.sleep(5000);
	    Set<String> allwindows = driver.getWindowHandles();
	    //usinf arraylist we can store all windows sequentially
	    Thread.sleep(5000);
	    ArrayList<String> al=new ArrayList<String>(allwindows);
	    //I want to print address of main window
	    String mainwin = al.get(0);
	    Thread.sleep(5000);
	    System.out.println(mainwin);
	    //I want to print session id of child window
	    String childwin = al.get(1);
	    System.out.println(childwin);
	}
}
