package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BasePage;

public class InfoCustomerPageObject extends BasePage{
	WebDriver driver;

	public InfoCustomerPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(css = "p.heading3")
	private WebElement headingText;

	@FindBy(xpath = "//td[text()='Customer Name']/following-sibling::td")
	private WebElement customerNameText;
	
	@FindBy(xpath = "//td[text()='Birthdate']/following-sibling::td")
	private WebElement birthdateText;
	
	@FindBy(xpath = "//td[text()='Pin']/following-sibling::td")
	private WebElement pinText;
	
	@FindBy(xpath = "//td[text()='Mobile No.']/following-sibling::td")
	private WebElement mobileNumberText;
	
	@FindBy(xpath = "//td[text()='Email']/following-sibling::td")
	private WebElement emailText;
	
	public String getCustomerNameText() {
		waitForElementVisible(driver, customerNameText);
		return getElementText(driver, customerNameText);
	}

	public String getBirthdateText() {
		waitForElementVisible(driver, birthdateText);
		return getElementText(driver, birthdateText);
	}

	public String getPinText() {
		waitForElementVisible(driver, pinText);
		return getElementText(driver, pinText);
	}

	public String getMobileNumberText() {
		waitForElementVisible(driver, mobileNumberText);
		return getElementText(driver, mobileNumberText);
	}

	public String getEmailText() {
		waitForElementVisible(driver, emailText);
		return getElementText(driver, emailText);
	}

	public String getHeadingText() {
		waitForElementVisible(driver, headingText);
		return getElementText(driver, headingText);
	}

}
