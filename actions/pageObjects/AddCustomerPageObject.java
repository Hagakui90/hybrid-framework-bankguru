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

	public AddCustomerPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public String getAddCustomerTextHeading() {
		waitForElementInVisible(driver, newCustomerHeading);
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

}
