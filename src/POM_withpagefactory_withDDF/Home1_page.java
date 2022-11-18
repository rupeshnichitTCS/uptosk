package POM_withpagefactory_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1_page {
	@FindBy(xpath = "//td[@class='pagetitle']")WebElement verifytext;
	public Home1_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void verifytext1(String expT) {
		
		String actT = verifytext.getText();
		if(actT.endsWith(expT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}
	
	

}
