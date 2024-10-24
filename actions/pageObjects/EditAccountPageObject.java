package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPageObject extends Guru99BankSideBarPageObject{
	WebDriver driver;
	@FindBy(xpath = "//input[@name='accountno']")
	@CacheLookup
	private WebElement accountNoTextbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	private WebElement submitButton;
	
	public EditAccountPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
