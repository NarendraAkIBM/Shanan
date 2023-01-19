package Self_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_1 {//
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// open the app
		driver.get("https://amezon.com/");
		// serch for the product
		driver.findElement(By.name("field-keywords")).sendKeys("iphone mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
