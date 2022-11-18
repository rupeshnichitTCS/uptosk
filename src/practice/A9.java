package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9 {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.worldometers.info/coronavirus/country/uk/");
	 String CoronavirusCases = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
	 System.out.println(CoronavirusCases);
	 String Deaths = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
	 System.out.println(Deaths);
	 String Recovered = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
	 System.out.println(Recovered);
	 
	 
}

}
