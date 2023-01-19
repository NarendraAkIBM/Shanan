package Robot_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratics_1 {//
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// open the app
		driver.get("https://amezon.com/");
		// create object for robot class
		Robot r=new Robot();
		// Keypress 
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//key release
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//key release
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//key release
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//key release
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	}

}
