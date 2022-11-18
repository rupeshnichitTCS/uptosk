package pom_withpage_factory_usingTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	@FindBy(xpath = "//td[text()='Enter Time-Track']") private WebElement text;
	
    public Home_page(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    
    public String verifytext() {
    	String actT = text.getText();
    	return actT;
    }

}
