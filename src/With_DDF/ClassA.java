package With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {private static Object Duration;

//
	public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Documents\\17-Sept.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	// enter UN
	   String un = sh.getRow(0).getCell(0).getStringCellValue();
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
	   // enter pwd
	 String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	   //enter login button
	      driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
	      
	
	
	}


}

