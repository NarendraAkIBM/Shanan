package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {//
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
