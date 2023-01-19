package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {//
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver Driver =new  ChromeDriver();
	Driver.get("https://www.amazon.com/");
	
	String expT="Amazon.com Spend less .Smile more.";
	Thread.sleep(4000);
	String actT = Driver.getTitle();
	if(expT.equals(actT)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("TC is fail");
	}
		
	Driver.manage().window().fullscreen();
	Driver.manage().window().minimize();
	String title =Driver.getTitle();
	System.out.println(title);
	String currenturl  = Driver.getCurrentUrl();
	System.out.println(currenturl);
		
		
	}

}
