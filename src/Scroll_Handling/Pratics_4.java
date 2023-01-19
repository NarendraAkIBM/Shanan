package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratics_4 {//
	public static void main(String[] args)throws Throwable {//
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amezon.com/");
		//java script executoer
		JavascriptExecutor
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4000);");
		//scroll up
		Thread.sleep(2000);
		jse.executeAsyncScript("window.scrollBy(0,-2000);");
		
		
		
		
		
		
		
		
	}

}
