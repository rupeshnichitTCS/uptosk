package Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Downloads/WebTable%20by%20ANKUSH%20(1).html");
	 //print only student name
	String sn = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
	System.out.println(sn);
	 //print city
	 String Cn = driver.findElement(By.xpath("//table[@id='2244']//th[3]")).getText();
	 System.out.println(Cn);
	 String sr = driver.findElement(By.xpath("//table[@id='2244']//th[1]")).getText();
	 System.out.println(sr);
	//print sachin 
	 String sch = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[2]")).getText();
	 System.out.println(sch);
	    //print row2
String row = driver.findElement(By.xpath("//table[@id='2244']//tr[2]")).getText();
System.out.println(row);
//print row5 
String r5 = driver.findElement(By.xpath("//table[@id='2244']//tr[5]")).getText();
System.out.println(r5);
}
}
