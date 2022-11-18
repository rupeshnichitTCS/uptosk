package Multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		int count=0;
		//click on cancle elements
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//we need to handeal multiple elements
		List<WebElement> allelements = driver.findElements(By.xpath("//div"));
		//we need to used for each loop
		for(WebElement i:allelements) {
			String text = i.getText();
			System.out.println(text);
			count++;
			
		}
		System.out.println(count);
	}

}
