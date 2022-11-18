package Scroll_Handling_by_JSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javastrip_executor {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    //open the application
	driver.get("https://www.amazon.com/");
    //typecast
	JavascriptExecutor jse=(JavascriptExecutor)driver;
    //scroll down
	jse.executeScript("window.scrollBy(0,5000);");
	Thread.sleep(4000);
    //scroll up
jse.executeScript("window.scrollBy(0,-2500);");


/*
# java script executor is interface

# Procedure for scroll down and scroll up
1) Right click on web page and inspect it
2) click on console and clear the console
3) write in console windows.scrollBy(x,y)
4) copy this and paste in script

Syntax javascriptExecutor("paste whatever is");

*/
	
}


}
