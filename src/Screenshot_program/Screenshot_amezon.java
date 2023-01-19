package Screenshot_program;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_amezon {//
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
	   File  src =ts.getScreenshotAs(OutputType.FILE);
	   File dest=new File("C:\\Users\\DELL\\Desktop\\Screenshot\\google.png");
	   Files.copy(src, dest);
	
	}

}
