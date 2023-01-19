package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratics_3 {//
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// open the application
		driver.get("https://lic.com/");
		JavascriptExecutor
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4000);");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-2000);");
		
	}

}
