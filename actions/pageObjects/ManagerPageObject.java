package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerPageObject extends Guru99BankSideBarPageObject {
	WebDriver driver;
	
	@FindBy(xpath = "//td[contains(text(),'Manger Id')]")
	private WebElement heading3Text;
	
	@FindBy(xpath = "//a[text()='New Customer']")
	private WebElement newCustomerLink;
	
	public ManagerPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	public String getManagerIdText() {
		waitForElementVisible(driver, heading3Text);
		return getElementText(driver, heading3Text);
	}


}
