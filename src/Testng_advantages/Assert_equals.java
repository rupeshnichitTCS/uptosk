package Testng_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals {
	@Test
	public void Tc1() {
		Reporter.log("test case 1",true);
		String expR="Anky";
		String actR="Anky";
		Assert.assertEquals(expR,actR);
	}
}
