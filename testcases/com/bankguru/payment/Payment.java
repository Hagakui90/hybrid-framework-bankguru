package com.bankguru.payment;

import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.AddCustomerPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Payment extends BaseTest {
	private WebDriver driver;
	private HomePageObject homePage;
	private LoginPageObject loginPage;
	private AddCustomerPageObject addCustomerPage;
	private InfoCustomerPageObject infoCustomerPage;
	private String emailAddress = "Dannie" + generateFakeNumber() + "@mail.us";

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		loginPage = new LoginPageObject(driver);

		loginPage.enterToUserIDTextbox("mngr597812");
		loginPage.enterToPassword("qUtUzAb");

		loginPage.clickToLoginButton();
		homePage = new HomePageObject(driver);
		Assert.assertEquals(homePage.getManagerIdText(), "Manger Id : mngr597812");
	}

	@Test
	public void P1_Create_New_Customer_Successfully() {
		homePage.clickToAddNewCustomerLink();
		addCustomerPage = new AddCustomerPageObject(driver);
		Assert.assertEquals(addCustomerPage.getAddCustomerTextHeading(), "Add New Customer");

		addCustomerPage.enterToCustomerNameTextbox("Dannie Zemlak IV");
		addCustomerPage.enterToGenderRadioCheckbox("Female");
		addCustomerPage.enterDateOfBirthPicker("10-06-1990");

		addCustomerPage.enterAddressTextbox("413 W Fireweed Ln");
		addCustomerPage.enterCityTextbox("Anchorage");
		addCustomerPage.enterStateTextbox("Alaska");
		addCustomerPage.enterPINTextbox("783123");
		addCustomerPage.enterMobileNumberTextbox("0842769114");
		addCustomerPage.enterEmailTextbox(emailAddress);
		addCustomerPage.enterPasswordTextbox("3454634");

		addCustomerPage.clickToSubmitButton();
		
		infoCustomerPage = new InfoCustomerPageObject(driver);
		Assert.assertEquals(infoCustomerPage.getCustomerNameText(), "Dannie Zemlak IV");

	}

	@Test
	public void P2_Edit_Customer_Successfully() {

	}

	@Test
	public void P3_Add_New_Account_Then_Verify_Current_Amount() {

	}

	@Test
	public void P4_Edit_Account_And_Check_Type_Of_Account() {

	}

	@Test
	public void P5_Transfer_Money_Into_Current_Account_And_Check_Customer_Account_Blance_Equal_55000() {

	}

	@Test
	public void P6_Transfer_Money_Into_Current_Account_And_Check_Customer_Account_Blance_Equal_40000() {

	}

	@Test
	public void P7_Transfer_Money_Into_Current_Account_And_Check_Customer_Account_Blance_Equal_10000() {

	}

	@Test
	public void P8_Check_Current_Account_Blance_Equal_30000() {

	}

	@Test
	public void P9_Delete_All_Customer_Accounts() {

	}

	public void P10_Delete_Exist_Accounts() {

	}

	@AfterClass
	public void afterClass() {

	}

}
