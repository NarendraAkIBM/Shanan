package Useof_findby_annotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_A {//
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// open the application
		driver.get("https://demo.actitime.com/login.do");
		// enter un
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		// we need the refresh the page
		driver.navigate().refresh();
		// write the proper username
		UN.sendKeys("admin");
		
	}

}
