package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {//
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//object 1st
		Login_page l=new Login_page(driver);
		l.enterun();
		l.enterpassword();
		l.clickonlogin();
		//object 2nd 
		Home_page h=new Home_page(driver);
	    h.textverify();
	}
	

}
