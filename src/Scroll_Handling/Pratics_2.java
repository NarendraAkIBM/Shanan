package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratics_2 {//
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// open the app
		driver.get("http://phonepay.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		// scroll down
		jse.executeScript("window.scrollBy(0,6000);");
		// scroll up
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-4000);");
		
		
		
		
	}

}
