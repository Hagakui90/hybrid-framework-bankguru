package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static LoginPageObject getLoginPageObject(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static HomePageObject getHomePageObject(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static AddCustomerPageObject getAddCustomerPageObject(WebDriver driver) {
		return new AddCustomerPageObject(driver);
	}

	public static InfoCustomerPageObject getInfoCustomerPageObject(WebDriver driver) {
		return new InfoCustomerPageObject(driver);
	}

}
