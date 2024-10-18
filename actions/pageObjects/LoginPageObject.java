package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import commons.BasePage;

public class LoginPageObject extends BasePage{
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//input[@name='uid']")
	private WebElement loginTextbox;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwrordTextbox;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	private WebElement loginButton;
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public void enterToUserIDTextbox(String userID) {
		// TODO Auto-generated method stub
		
	}
	public void enterToPassword(String password) {
		// TODO Auto-generated method stub
		
	}
	public void clickToLoginButton() {
		// TODO Auto-generated method stub
		
	}

}
