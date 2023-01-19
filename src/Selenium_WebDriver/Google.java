package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {//
	public static void main(String[] args) {
		// set the properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://actitime.com/");
		// enter username
		driver.findElement(By.id("username")).sendKeys("admin");
		// enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
	}

}
