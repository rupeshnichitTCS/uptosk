package TestNg_program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A1 {
	@Test 
	public void Tc1() {
		Reporter.log("running Tc1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("running Tc2",true);
		
	}
   @Test
   public void TC3() {
	Reporter.log("running Tc3",true);
}
}
