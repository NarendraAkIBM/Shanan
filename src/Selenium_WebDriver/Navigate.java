package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {//
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		Driver.navigate().to("https://www.facebook.com/");
		//backword
		Driver.navigate().back();
		//forward
		Driver.navigate().forward();
		//refresh
		Driver.navigate().refresh();
	}

}
