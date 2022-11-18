package pom_withpage_factory_usingTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	@FindBy(xpath = "//input[@id='username']") private WebElement UN;
	@FindBy(xpath = "//input[@name='pwd']") private WebElement Pass;
	@FindBy(xpath = "//div[text()='Login ']") private WebElement loginbutton;
	
	//initialization

	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void EnterUn(String username) {
		UN.sendKeys(username);
	}
	public void Enterpass(String password) {
		Pass.sendKeys(password);
	}
	public void click_login_button() {
		loginbutton.click();
	}
	
 

}
