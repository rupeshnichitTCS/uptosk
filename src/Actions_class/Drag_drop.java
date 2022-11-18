package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		    //inspect first element
		 WebElement elments1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		//inspect ele2
		 WebElement element2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		 //create object of Actions class
		 Actions act=new Actions(driver);
		 act.dragAndDrop(elments1, element2).perform();
		 
	}

}
