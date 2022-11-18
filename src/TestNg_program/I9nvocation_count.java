package TestNg_program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class I9nvocation_count {
	@Test(invocationCount = 10)
	public void TC1() {
		Reporter.log("running tc1",true);
	}

}
