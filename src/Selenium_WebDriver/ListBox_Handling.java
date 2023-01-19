package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Handling {//
	public static void main(String[] args)throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//click on creat new account button
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		// select Day listbox
		Thread.sleep(4000);
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		//creat object for select class
		Select s=new Select(Day);
		Thread.sleep(4000);
		//use select class method
		s.selectByVisibleText("15");
		// select month
		Thread.sleep(4000);
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select m= new Select(month);
		m.selectByValue("2");
		Thread.sleep(1000);
		m.selectByValue("3");
		Thread.sleep(1000);
		m.selectByValue("4");
		Thread.sleep(1000);
		m.selectByValue("5");
		Thread.sleep(1000);
		m.selectByValue("6");
		Thread.sleep(1000);
		m.selectByValue("7");
		Thread.sleep(1000);
		
		m.selectByValue("8");
		Thread.sleep(1000);
		m.selectByValue("9");
		Thread.sleep(1000);
		m.selectByValue("10");
		Thread.sleep(1000);
		m.selectByValue("11");
		Thread.sleep(1000);
		m.selectByValue("12");
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		Select y=new Select(Year);
		y.selectByValue("1995");
		
		
	}

}
