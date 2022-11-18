package TestNg_program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable {
	@Test(enabled = false)
	public void Tc1() {
		Reporter.log("runnig tc1",true);
	}
	@Test
	public void tc2() {
		Reporter.log("runing tc2",true);
	}

}
