package POM_pratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitime {
	//Blc
	//take members variables as privet
	@FindBy(xpath = "//input[@id='username']")private WebElement un;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement login;
	//take constructor as public
	public actitime(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//take method as public
	public void enterun() {
		un.sendKeys("admin");
	}
	public void enterpwd() {
		pwd.sendKeys("manager");
	}
	public void clicklogin() {
		login.click();
	}

}
