package POM_designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {//
	@FindBy(xpath="//input[@id='username']")private WebElement un;
	@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath="//a[@id='loginButton']")private WebElement loginbtn;
	//use constructor
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// getters and setters
	public void enterUN( ) {
		un.sendKeys("admin");
}
	public void enterPWD() {
		pwd.sendKeys("manager");
		
	}
	public void clickLoginBtn() {
		loginbtn.click();
		
	}
}