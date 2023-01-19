package Popups_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

public class Child_browser {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// click on cancel button
		driver.findElement(By.xpath("//Button[text()='✕']")).click();
		// serch any mobile
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20000",Keys.ENTER);
		Thread.sleep(4000);
		// click on first phone
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		
	}

}
 
