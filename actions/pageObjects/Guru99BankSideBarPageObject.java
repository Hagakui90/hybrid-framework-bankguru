package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BasePage;

public class Guru99BankSideBarPageObject extends BasePage {
	WebDriver driver;

	@FindBy(xpath = "//a[text()='Manager']")
	@CacheLookup
	private WebElement managerMenu;

	@FindBy(xpath = "//a[text()='New Customer']")
	@CacheLookup
	private WebElement newCustomerMenu;

	@FindBy(xpath = "//a[text()='Edit Customer']")
	@CacheLookup
	private WebElement editCustomerMenu;

	@FindBy(xpath = "//a[text()='Delete Customer']")
	@CacheLookup
	private WebElement deleteCustomerMenu;

	@FindBy(xpath = "//a[text()='New Account']")
	@CacheLookup
	private WebElement newAccountMenu;

	@FindBy(xpath = "//a[text()='Edit Account']")
	@CacheLookup
	private WebElement editAccountMenu;

	@FindBy(xpath = "//a[text()='Delete Account']")
	@CacheLookup
	private WebElement deleteAccountMenu;

	@FindBy(xpath = "//a[text()='Deposit']")
	@CacheLookup
	private WebElement depositMenu;

	@FindBy(xpath = "//a[text()='Withdrawal']")
	@CacheLookup
	private WebElement withdrawalMenu;

	@FindBy(xpath = "//a[text()='Fund Transfer']")
	@CacheLookup
	private WebElement fundTransferMenu;

	@FindBy(xpath = "//a[text()='Change Password']")
	@CacheLookup
	private WebElement changePasswordMenu;

	@FindBy(xpath = "//a[text()='Balance Enquiry']")
	@CacheLookup
	private WebElement balanceEnquiryMenu;

	@FindBy(xpath = "//a[text()='Mini Statement']")
	@CacheLookup
	private WebElement miniStatementMenu;

	@FindBy(xpath = "//a[text()='Customised Statement']")
	@CacheLookup
	private WebElement customisedStatementMenu;

	@FindBy(xpath = "//a[text()='Log out']")
	@CacheLookup
	private WebElement logoutMenu;

	public Guru99BankSideBarPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public ManagerPageObject clickToManagerMenu() {
		waitForElementVisible(driver, managerMenu);
		clickToElement(driver, managerMenu);
		return PageGeneratorManager.getManagerPage(driver);
	}

	public AddCustomerPageObject clickToAddNewCustomerMenu() {
		waitForElementVisible(driver, newCustomerMenu);
		clickToElement(driver, newCustomerMenu);
		return PageGeneratorManager.getAddCustomerPage(driver);
	}

	public EditCustomerPageObject clickToEditCustomerMenu() {
		waitForElementVisible(driver, editCustomerMenu);
		clickToElement(driver, editCustomerMenu);
		return PageGeneratorManager.getEditCustomerPage(driver);
	}

	public NewAccountPageObject clickToNewAccountMenu() {
		waitForElementVisible(driver, newAccountMenu);
		clickToElement(driver, newAccountMenu);
		return PageGeneratorManager.getNewAccountPage(driver);
	}

	public EditAccountPageObject clickToEditAccountMenu() {
		waitForElementVisible(driver, newAccountMenu);
		clickToElement(driver, newAccountMenu);
		return PageGeneratorManager.getEditAccountPage(driver);
	}
	
	public DeleteAccountPageObject clickToDeleteAccountMenu() {
		waitForElementVisible(driver, newAccountMenu);
		clickToElement(driver, newAccountMenu);
		return PageGeneratorManager.getDeleteAccountPage(driver);
	}

}
