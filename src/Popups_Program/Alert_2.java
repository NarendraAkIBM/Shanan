package Popups_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_2 {//
	public static void main(String[] args)  {//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		// click on button
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
	Alert alt=	driver.switchTo().alert();
	alt.accept();
	//alt.dismiss();
	 
	
		
		
	}

}
