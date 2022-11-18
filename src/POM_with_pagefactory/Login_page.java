package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	//declaration
	@FindBy(xpath = "//input[@id='username']")private WebElement UN;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement loginBTN ;
	//initialization
	 public  Login_page(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		 
	 }
	 public void enterun() {
		 UN.sendKeys("admin");
	 }
	 public void enterpassword() {
		 
		 PWD.sendKeys("manager");
	 }
	 public void clickonlogin() {
		 loginBTN.click();
	 }
	 
}
