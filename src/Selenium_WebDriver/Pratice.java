package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice {//
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("9673949722");
		driver.findElement(By.name("pass")).sendKeys("9881645456");
		driver.findElement(By.name("login")).click();
	}

}
