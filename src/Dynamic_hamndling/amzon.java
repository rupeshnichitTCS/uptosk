package Dynamic_hamndling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("moblie under 20000",Keys.ENTER);
		String price = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none _bXVsd_block_1vI8- _bXVsd_row_3CEm0 _bXVsd_itemsBaseline_3lQs7']/span)[1]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none _bXVsd_block_1vI8- _bXVsd_row_3CEm0 _bXVsd_itemsBaseline_3lQs7']/span)[1]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		String price2 = driver.findElement(By.xpath("(//div[@class='a-column a-span11 a-text-left a-spacing-top-large']//span)[3]")).getText();
		 System.out.println(price2);
		 String ratting = driver.findElement(By.xpath("a-fixed-left-grid-inner")).getText();
		 System.out.println(ratting);
	
	}

}
