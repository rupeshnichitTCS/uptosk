package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wthout_DDF {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 //impliciit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 //delete all coockies
		 driver.manage().deleteAllCookies();
		 //maximize 
		 driver.manage().window().maximize();
		//open the application
		 driver.get("https://demo.actitime.com/login.do");
		 //enter username
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		 //enter password
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		    //click on login btn
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
		  //add something on home page
		 driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("Rupesh");
		    //actual title
		String acttile = driver.getTitle();
		System.out.println(acttile);
		 //exp title
		String expect="actiTIME - Enter Time-Track";
	    //compare both
		if(expect.equals(acttile)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}


		 
		 
	   


		
	}

}
