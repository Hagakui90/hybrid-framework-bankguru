package com.bankguru.payment;

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

	@FindBy(xpath = "//td[text()='Customer Name']/following-sibling::td")
	private WebElement customerNameText;
	
	public String getCustomerNameText() {
		waitForElementInVisible(driver, customerNameText);
		return getElementText(driver, customerNameText);
	}

}
