package Test_NG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_1 {
@Test
	public void TC1(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
// implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// delete all cookies
driver.manage().deleteAllCookies();
driver.get("https://login-v2.upstox.com/");
Reporter.log("hii am from testng",true);
Reporter.log("yes ts is pass");
}
}
