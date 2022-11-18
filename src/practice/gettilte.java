package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettilte {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		String tile = d.getCurrentUrl();
		System.out.println(tile);
	}
	

}