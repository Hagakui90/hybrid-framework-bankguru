package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static LoginPageObject getLoginPageObject(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static ManagerPageObject getManagerPage(WebDriver driver) {
		return new ManagerPageObject(driver);
	}

	public static AddCustomerPageObject getAddCustomerPage(WebDriver driver) {
		return new AddCustomerPageObject(driver);
	}

	public static InfoCustomerPageObject getInfoCustomerPageObject(WebDriver driver) {
		return new InfoCustomerPageObject(driver);
	}
	
	public static EditCustomerPageObject getEditCustomerPage(WebDriver driver) {
		return new EditCustomerPageObject(driver);
	}

	public static NewAccountPageObject getNewAccountPage(WebDriver driver) {
		return new NewAccountPageObject(driver);
	}

	public static EditAccountPageObject getEditAccountPage(WebDriver driver) {
		return new EditAccountPageObject(driver);
	}

	public static DeleteAccountPageObject getDeleteAccountPage(WebDriver driver) {
		return new DeleteAccountPageObject(driver);
	}

}
