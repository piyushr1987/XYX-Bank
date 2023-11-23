package com.xyxbank.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.xyxbank.genericPage.BaseClass;

public class CustomerLogin_DepositPage extends BaseClass {

	public CustomerLogin_DepositPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Customer Login']")
	private WebElement btnCustomerLogin;

	@FindBy(xpath = "//select[@id='userSelect']")
	private WebElement drpUserSelect;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement btnLogin;

	@FindBy(xpath = "//select[@id='accountSelect']")
	private WebElement drpAccountNoSelect;

	@FindBy(xpath = "//button[normalize-space()='Deposit']")
	private WebElement btnDeposit;

	@FindBy(xpath = "//input[@placeholder='amount']")
	private WebElement txtAmount;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSubmit;

	@FindBy(xpath = "//button[@class='btn logout']")
	private WebElement btnLogOut;

	@FindBy(xpath = "//button[@class='btn home']")
	private WebElement btnHome;

	public void clickOnCustomerLogin() {
		btnCustomerLogin.click();
	}

	public boolean validateYourNameDropDown() {
		return drpUserSelect.isDisplayed();

	}

	public void selectCustomerName(String name) {
		Select sel = new Select(drpUserSelect);
		sel.selectByVisibleText(name);
	}

	public void clickOnLogin() {
		btnLogin.click();
	}

	public void selectCustomerAccountNumber(String accNo) {
		Select sel = new Select(drpAccountNoSelect);
		sel.selectByVisibleText(accNo);
	}

	public void clickOnDeposit() {
		btnDeposit.click();
	}

	public void enterAmount(String amount) {
		txtAmount.sendKeys(amount);
	}

	public void clickOnSubmit() {
		btnSubmit.click();
	}

	public void clickOnLogOut() {
		btnLogOut.click();
	}

	public void clickOnHome() {
		btnHome.click();
	}

	public boolean validateHomePage() {
		return driver.getCurrentUrl().contains("login");

	}

}
