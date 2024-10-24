package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import commons.BasePage;

public class LoginPageObject extends BasePage{
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//input[@name='uid']")
	@CacheLookup
	private WebElement loginTextbox;
	
	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	private WebElement passwrordTextbox;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	@CacheLookup
	private WebElement loginButton;
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	public void enterToUserIDTextbox(String userID) {
		waitForElementVisible(driver, loginTextbox);
		sendkeyToElement(driver, loginTextbox, userID);
	}
	public void enterToPassword(String password) {
		waitForElementVisible(driver, passwrordTextbox);
		sendkeyToElement(driver, passwrordTextbox, password);	
		
	}
	public ManagerPageObject clickToLoginButton() {
		waitForElementClickable(driver, loginButton);
		clickToElement(driver, loginButton);	
		return PageGeneratorManager.getManagerPage(driver);
	}
	

}
