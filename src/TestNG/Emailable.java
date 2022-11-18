package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable {
	@Test
	public void Tc1() {
		Reporter.log("running tc1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("runing tc2",true);
	}
	@Test
	public void TC3() {
		Reporter.log("runing tc3",true );
		Assert.fail();
	}
	
	

}
