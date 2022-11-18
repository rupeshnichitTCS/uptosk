package TestNg_program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class privority {
	@Test(priority = 2)
	public void TC1() {
		Reporter.log("running Tc1",true);
	}
	@Test(priority = 3)
	public void TC2() {
		Reporter.log("running Tc2",true);
	}
	@Test(priority = 1)
	public void TC3() {
		Reporter.log("running Tc3",true);
	}


}
//output Tc no 3 1 2