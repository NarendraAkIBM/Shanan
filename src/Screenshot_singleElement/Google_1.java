package Screenshot_singleElement;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileLock;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Google_1 {//


	public static void main(String[]args) throws IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	WebElement abc	    =driver.findElement(By.xpath("//img[@class='lnXdpd' ]"));
	      File src   =abc.getScreenshotAs(OutputType.FILE);
	      File dest =new File("C:\\Users\\DELL\\Desktop\\Screenshot\\Google.jpg");
	      Files.copy(src, dest);
	
	}

}
