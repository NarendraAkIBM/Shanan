package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_Method {//
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe ");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://monestar.com/");
		//minimize method
		Thread.sleep(4000);
		Driver.manage().window().minimize();
		
	}

}
