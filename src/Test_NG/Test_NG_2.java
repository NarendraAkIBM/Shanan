package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_NG_2 {//
	@Test
	public void test1(){
		Reporter.log("hii am from testNG2",true);
	}
	@Test
public void test2() {
	Reporter.log("hii am to fast",true);
}
}
