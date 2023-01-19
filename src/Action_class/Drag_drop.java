package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {//
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//xpath of first element
		       WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		    WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		      // creat object for action class
		    Actions act=new Actions(driver);
		    Thread.sleep(4000);
		    act.dragAndDrop(ele1, ele2).build().perform();
				
			
	}

}
