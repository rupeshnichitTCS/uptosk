package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//maximize the browser
		Thread.sleep(4000);

		driver.manage().window().maximize();
		 //switch to first frame
		driver.switchTo().frame("packageListFrame");
	    //take any element on first frame and print it
		String text1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.ie']")).getText();

		System.out.println(text1);
	    //now we need to switch from 1st frame to main webpage
		driver.switchTo().defaultContent();//now again we came to main webpage
		//switch to 2nd frame
		Thread.sleep(4000);
		driver.switchTo().frame("packageFrame");
	    //take any element on 2nd frame and print it
		Thread.sleep(4000);
		String text2 = driver.findElement(By.xpath("//a[text()='AcceptedW3CCapabilityKeys']")).getText();
		System.out.println(text2);
		//go to 3rd frame
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.switchTo().frame("classFrame");
		Thread.sleep(4000);
		//take any ele and print
		String text3 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		System.out.println(text3);
		

		

		
	}

}
