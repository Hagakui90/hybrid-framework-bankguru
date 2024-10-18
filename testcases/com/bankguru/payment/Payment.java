package com.bankguru.payment;

import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Payment extends BaseTest{
	private WebDriver driver;
	private HomePageObject homePage;
	private LoginPageObject loginPage;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		loginPage = new LoginPageObject(driver);
		
		loginPage.enterToUserIDTextbox("mngr597812");
		loginPage.enterToPassword("qUtUzAb");
		
		loginPage.clickToLoginButton();
		homePage = new HomePageObject(driver);
		System.out.println(homePage.getManagerIdTextAttributeValue());
		Assert.assertEquals(homePage.getManagerIdTextAttributeValue(), "Manger Id : mngr597812");
	}

	@Test
	public void P1_Create_New_Customer_Successfully() {
		
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
