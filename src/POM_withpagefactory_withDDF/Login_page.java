package POM_withpagefactory_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	//initization
	@FindBy(xpath = "//input[@id='username']")private WebElement UN;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement Pass;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement clicklogin;
	//declaration
	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void enterun(String username) {
		UN.sendKeys(username);
	}
	public void enterpass(String password) {
		Pass.sendKeys(password);
	}
	public void clickonloginbutton() {
		clicklogin.click();
	}

}
