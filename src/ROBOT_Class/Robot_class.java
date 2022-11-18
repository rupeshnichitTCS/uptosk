package ROBOT_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {
	public static void main(String[] args) throws Throwable {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver =new ChromeDriver();
//open the application
 driver.get("https://www.amazon.com/");
 //create object of Robot class
 Robot r= new Robot();
 r.keyPress(KeyEvent.VK_PAGE_DOWN);
 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
 Thread.sleep(5000);
 r.keyPress(KeyEvent.VK_PAGE_DOWN);
 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
 /*
  Robot class:- To avoid the drawback of keys class we have Robot class ,we can Automate 
              special characters also
              
          Syntax:-  Robot ref= new Robot();
          rfe.keypress(keyEvent.vk_Stock);
          rfe.keyrelese(keyEvent.vk_Stock);
          
     Robot class is present in java.awt.pakage     
              
  */
 
 
 
 
	}

}
