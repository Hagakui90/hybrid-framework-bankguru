package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPageObject extends Guru99BankSideBarPageObject{
	WebDriver driver;
	@FindBy(xpath = "//input[@name='cusid']")
	@CacheLookup
	private WebElement userIDTextbox;
	
	@FindBy(xpath = "//select[@name='selaccount']")
	@CacheLookup
	private WebElement accountTypeDropdown;
	
	@FindBy(xpath = "//input[@name='inideposit']")
	@CacheLookup
	private WebElement initialDepositTextbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	private WebElement submitButton;
	
	public NewAccountPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
