
package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_classA {//
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		// choose the target element
		WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
	// create object for action class
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		// right click on target element 
		Thread.sleep(4000);
		act.contextClick(target).perform();
		// left click on
		Thread.sleep(4000);
		act.click(target).perform();
		// double click on
		act.moveToElement(target).doubleClick().perform();
		
		
		
				
				
				
	}			
	}
		