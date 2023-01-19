package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcrrentrl_url {//
	public static void main(String[] args) throws Throwable {
		System.setProperty("wwebdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe ");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://irctc.com/");
		//maximaize the url
		
		Thread.sleep(3000);
		Driver.manage().window().maximize();
		// manimize the url
		Thread.sleep(4000);
		//close the url
		Driver.close();
		Driver.get("https://manestor.com/");
		//getcurrent url
		  String link =Driver.getCurrentUrl();
		System.out.println("link");
	}

}
