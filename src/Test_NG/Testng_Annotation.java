package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_Annotation {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open the Browser",true);
	}
	@BeforeMethod
	public void Logintoapp() {
		Reporter.log("Login to Appp",true);
	}
	@Test
	public void varifytext() {
		Reporter.log("Running actual test case",true);
	}
	@AfterMethod
	public void logoutapp() {
		Reporter.log("logout the app",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the Browser",true);
	
	}

}
