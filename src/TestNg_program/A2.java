package TestNg_program;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A2 {
	@Test 
	public void Tc4() {
		Reporter.log("running Tc4",true);
	}
	@Test
	public void TC5() {
		Reporter.log("running Tc5",true);
		Assert.fail();
	}
   @Test
   public void TC6() {
	Reporter.log("running Tc6",true);
}
}



