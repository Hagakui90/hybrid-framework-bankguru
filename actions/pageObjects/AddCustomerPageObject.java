package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BasePage;

public class AddCustomerPageObject extends BasePage {
	WebDriver driver;

	@FindBy(css = "p.heading3")
	private WebElement newCustomerHeading;

	@FindBy(xpath = "//td[text()='Customer Name']/following-sibling::td/input")
	private WebElement customerNameTextbox;

	@FindBy(xpath = "//td[text()='Gender']/parent::tr//input[@value='m']")
	private WebElement maleRadio;

	@FindBy(xpath = "//td[text()='Gender']/parent::tr//input[@value='f']")
	private WebElement femaleRadio;

	@FindBy(xpath = "//input[@type='date']")
	private WebElement dateOfBirthPicker;
	
	@FindBy(xpath = "//td[text()='Address']/parent::tr//textarea")
	private WebElement addressTextbox;
	
	@FindBy(xpath = "//td[text()='City']/parent::tr//input")
	private WebElement cityTextbox;
	
	@FindBy(xpath = "//td[text()='State']/parent::tr//input")
	private WebElement stateTextbox;
	
	@FindBy(xpath = "//td[text()='PIN']/parent::tr//input")
	private WebElement pinTextbox;
	
	@FindBy(xpath = "//td[text()='Mobile Number']/parent::tr//input")
	private WebElement mobileNumberTextbox;
	
	@FindBy(xpath = "//td[text()='E-mail']/parent::tr//input")
	private WebElement emailTextbox;
	
	@FindBy(xpath = "//td[text()='Password']/parent::tr//input")
	private WebElement passwordTextbox;
	
	@FindBy(css = "input[type='submit']")
	private WebElement submitButton;
	
	public AddCustomerPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public String getAddCustomerTextHeading() {
		waitForElementVisible(driver, newCustomerHeading);
		return getElementText(driver, newCustomerHeading);

	}

	public void enterToCustomerNameTextbox(String customerName) {
		waitForElementVisible(driver, customerNameTextbox);
		sendkeyToElement(driver, customerNameTextbox, customerName);
	}

	public void enterToGenderRadioCheckbox(String valueRadio) {
		if (valueRadio.equalsIgnoreCase("Male")) {
			waitForElementClickable(driver, maleRadio);
			checkToElement(driver, maleRadio);
		} else if (valueRadio.equalsIgnoreCase("Female")) {
			waitForElementClickable(driver, femaleRadio);
			checkToElement(driver, femaleRadio);
		} else {
			throw new RuntimeException("Gender is not valid.");
		}
	}

	public void enterDateOfBirthPicker(String dateOfBirth) {
		waitForElementClickable(driver, dateOfBirthPicker);
		sendkeyToElement(driver, dateOfBirthPicker, dateOfBirth);
	}

	public void enterAddressTextbox(String address) {
		waitForElementVisible(driver, addressTextbox);
		sendkeyToElement(driver, addressTextbox, address);
	}

	public void enterCityTextbox(String city) {
		waitForElementVisible(driver, cityTextbox);
		sendkeyToElement(driver, cityTextbox, city);
	}
	

	public void enterStateTextbox(String state) {
		waitForElementVisible(driver, stateTextbox);
		sendkeyToElement(driver, stateTextbox, state);		
	}

	public void enterPINTextbox(String pin) {
		waitForElementVisible(driver, pinTextbox);
		sendkeyToElement(driver, pinTextbox, pin);		
	}

	public void enterEmailTextbox(String emailAddress) {
		waitForElementVisible(driver, emailTextbox);
		sendkeyToElement(driver, emailTextbox, emailAddress);
	}

	public void enterMobileNumberTextbox(String mobileNumber) {
		waitForElementVisible(driver, mobileNumberTextbox);
		sendkeyToElement(driver, mobileNumberTextbox, mobileNumber);	
	}

	public void enterPasswordTextbox(String password) {
		waitForElementVisible(driver, passwordTextbox);
		sendkeyToElement(driver, passwordTextbox, password);		
	}

	public void clickToSubmitButton() {
		waitForElementClickable(driver, submitButton);
		clickToElement(driver, submitButton);
	}

}
