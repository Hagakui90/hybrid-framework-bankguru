package commons;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	/* Web Browser */
	public void openPageUrl(WebDriver driver, String pageUrl) {
		driver.get(pageUrl);
	}

	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public String getPageSourceCode(WebDriver driver) {
		return driver.getPageSource();
	}

	public void backToPage(WebDriver driver) {
		driver.navigate().back();
	}

	public void forwardToPage(WebDriver driver) {
		driver.navigate().forward();
	}

	public void refreshCurrentPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public Alert waitForAlertPresence(WebDriver driver) {
		return new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent());
	}

	public void acceptToAlert(WebDriver driver) {
		waitForAlertPresence(driver).accept();
	}

	public void cancelAlert(WebDriver driver) {
		waitForAlertPresence(driver).dismiss();
	}

	public String getTextInAlert(WebDriver driver) {
		return waitForAlertPresence(driver).getText();
	}

	public void sendkeyToAlert(WebDriver driver, String keysToSend) {
		waitForAlertPresence(driver).sendKeys(keysToSend);
	}

	public void switchToWindowByID(WebDriver driver, String pageId) {
		Set<String> allWindowIDs = driver.getWindowHandles();

		for (String id : allWindowIDs) {
			if (!id.equals(pageId)) {
				driver.switchTo().window(id);
				sleepInSecond(2);
			}
		}

	}

	public void switchToWindowByName(WebDriver driver, String expectedPageTitle) {
		Set<String> allWindowIDs = driver.getWindowHandles();

		for (String id : allWindowIDs) {
			driver.switchTo().window(id);

			String currentlyPageTitle = driver.getTitle();

			if (currentlyPageTitle.equals(expectedPageTitle)) {
				break;
			}

		}

	}

	public void closeAllTabWithoutParent(WebDriver driver, String parentID) {
		// Get hết ra các id đang có
		Set<String> allWindowIDs = driver.getWindowHandles();

		// Duyệt qua các giá trị trong all windows
		for (String id : allWindowIDs) {
			if (!id.equals(parentID)) {
				driver.switchTo().window(id);
				driver.close();
			}
			driver.switchTo().window(parentID);
		}

	}

	public Set<Cookie> getAllCookies(WebDriver driver) {
		return driver.manage().getCookies();
	}

	public void setCookies(WebDriver driver, Set<Cookie> cookies) {
		for (Cookie cookie : cookies) {
			driver.manage().addCookie(cookie);
		}
		sleepInSecond(3);
	}

	public void sleepInSecond(long timeInSecond) {
		try {
			Thread.sleep(timeInSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/* Web Element */

	public void clickToElement(WebDriver driver, WebElement element) {
		element.click();
	}

	public void sendkeyToElement(WebDriver driver, WebElement element, String valueToSend) {
		//element.clear();
		element.sendKeys(valueToSend);
	}

	public void selectItemInDefaultDropdown(WebDriver driver, WebElement element, String itemValue) {
		new Select(element).selectByVisibleText(itemValue);
	}

	public String getFirstSelectedTextInDefaultDropdown(WebDriver driver, WebElement element) {
		return new Select(element).getFirstSelectedOption().getText();
	}

	public boolean isDefaultDropdownMultiple(WebDriver driver, WebElement element) {
		return new Select(element).isMultiple();
	}

	public void waitForListElementPresence(WebDriver driver, List<WebElement> elements) {
	//	new WebDriverWait(driver, 30).until(ExpectedConditions.pr);
	}
	/**Apply for Page Factory using WebElement
	 * @param driver
	 * @param elements
	 * @param textExpectedItem
	 */
	public void selectItemInCustomDropdown(WebDriver driver, WebElement parentElement, List<WebElement> childElements, String textExpectedItem) {
		parentElement.click(); 
		sleepInSecond(1);
	  
	  List<WebElement> allItems = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(childElements));
	  
	  for (WebElement item : allItems) {
	  
		  String textActualItem = item.getText(); 
		  if (textActualItem.equals(textExpectedItem)) { 
			  item.click(); 
			  break;
		  } 
		 }
	  }

	public String getElementText(WebDriver driver, WebElement element) {
		return element.getText();
	}

	public String getElementAttribute(WebDriver driver, WebElement element, String attributeName) {
		return element.getAttribute(attributeName);
	}

	public String getElementCssValue(WebDriver driver, WebElement element, String cssPropertyName) {
		return element.getCssValue(cssPropertyName);
	}

	public String convertRGBAToHexaColor(WebDriver driver, WebElement element) {
		return Color.fromString(getElementCssValue(driver, element, "background-color")).asHex();
	}

	public int getListElementSize(WebDriver driver, List<WebElement> elements) {
		return elements.size();
	}

	/**
	 * Apply for checkbox and radio button
	 * 
	 * @param driver
	 * @param locator
	 */
	public void checkToElement(WebDriver driver, WebElement element) {
		if (!element.isSelected()) {
			element.click();
		}
	}

	/**
	 * Apply only for checkbox
	 * 
	 * @param driver
	 * @param WebElemnt
	 */
	public void uncheckToElement(WebDriver driver, WebElement element) {
		if (element.isSelected()) {
			element.click();
		}
	}

	public boolean isElementDisplayed(WebDriver driver, WebElement element) {
		return element.isDisplayed();
	}

	public boolean isElementSelected(WebDriver driver, WebElement element) {
		return element.isSelected();
	}

	public boolean isElementEnabled(WebDriver driver, WebElement element) {
		return element.isEnabled();
	}

	public void switchToIframe(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public void hoverToElement(WebDriver driver, WebElement element) {
		new Actions(driver).moveToElement(element).perform();
	}

	public void doubleClickToElement(WebDriver driver, WebElement element) {
		new Actions(driver).doubleClick(element).perform();
	}

	public void rightClickToElement(WebDriver driver, WebElement element) {
		new Actions(driver).contextClick(element).perform();
	}

	public void dragAndDropElement(WebDriver driver, WebElement elementSource, WebElement elementTarget) {
		new Actions(driver).dragAndDrop(elementSource, elementTarget).perform();
	}

	public void sendKeyboardToElement(WebDriver driver, WebElement element, Keys key) {
		new Actions(driver).sendKeys(element, key).perform();
	}

	public Object executeForBrowser(WebDriver driver, String javaScript) {
		return ((JavascriptExecutor) driver).executeScript(javaScript);
	}

	public String getInnerText(WebDriver driver) {
		return (String) ((JavascriptExecutor) driver).executeScript("return document.documentElement.innerText;");
	}

	public boolean areExpectedTextInInnerText(WebDriver driver, String textExpected) {
		String textActual = (String) ((JavascriptExecutor) driver).executeScript("return document.documentElement.innerText.match('" + textExpected + "')[0];");
		return textActual.equals(textExpected);
	}

	public void scrollToBottomPage(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void navigateToUrlByJS(WebDriver driver, String url) {
		((JavascriptExecutor) driver).executeScript("window.location = '" + url + "'");
	}

	public void hightlightElement(WebDriver driver, WebElement element) {
		String originalStyle = element.getAttribute("style");
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', arguments[1])", element, "border: 2px solid red; border-style: dashed;");
		sleepInSecond(1);
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', arguments[1])", element, originalStyle);
	}

	public void clickToElementByJS(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

	public void scrollToElementOnTop(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void scrollToElementOnDown(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
	}

	public void sendkeyToElementByJS(WebDriver driver, WebElement element, String value) {
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', '" + value + "')", element);
	}

	public void removeAttributeInDOM(WebDriver driver, WebElement element, String attributeRemove) {
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('" + attributeRemove + "');", element);
	}

	public String getElementValidationMessage(WebDriver driver, WebElement element) {
		return (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage;", element);
	}

	public boolean isImageLoaded(WebDriver driver, WebElement element) {
		boolean status = (boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != 'undefined' && arguments[0].naturalWidth > 0", element);
		return status;
	}

	public void waitForElementVisible(WebDriver driver, WebElement element) {
	}

	public void waitForListElementVisible(WebDriver driver, List<WebElement> element) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public void waitForElementInVisible(WebDriver driver, WebElement element) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOf(element));
	}

	public void waitForListElementInVisible(WebDriver driver, List<WebElement> element) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfAllElements(element));
	}

	public void waitForElementClickable(WebDriver driver, WebElement element) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
