package Test_NG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_5 {//
	@Test
	public void test5() {
		Reporter.log("i am from tc5",true);
	}
	@Test
	public void test6() {
		Reporter.log("yes i am from tc 6",true);
		Assert.fail();
	}
	

}
