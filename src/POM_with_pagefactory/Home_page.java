package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement Text;
	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void textverify() {
		String expT="Enter Time-Track";
		String actT = Text.getText();
		System.out.println(Text);
		if(actT.equals(expT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}


}
