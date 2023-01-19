package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {//
	@Test(enabled = false)
	public void TC1() {
		Reporter.log("this is first progrm in testng",true);
	}
@Test
public void TC2() {
	Reporter.log("this is my second program in testng",true);
}
}
