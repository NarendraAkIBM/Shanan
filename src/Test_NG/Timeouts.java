package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
	@Test
	public void TC1() {
		Reporter.log("this is program for timeouts",true);
	}
@Test(timeOut =60000 )
public void TC2() {
	Reporter.log("this is my second tc",true);
}
}
