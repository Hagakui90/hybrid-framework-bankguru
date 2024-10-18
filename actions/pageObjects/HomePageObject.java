package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BasePage;

public class HomePageObject extends BasePage {
	WebDriver driver;
	
	@FindBy(xpath = "//td[contains(text(),'Manger Id')]")
	private WebElement heading3Text;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	public String getManagerIdTextAttributeValue() {
		waitForElementVisible(driver, heading3Text);
		return getElementText(driver, heading3Text);
	}

}
