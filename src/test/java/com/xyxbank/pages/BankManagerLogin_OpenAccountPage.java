package com.xyxbank.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.xyxbank.genericPage.BaseClass;

public class BankManagerLogin_OpenAccountPage extends BaseClass {

	public BankManagerLogin_OpenAccountPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
	private WebElement btnBankManagerLogin;

	@FindBy(xpath = "//div[@class='center']/button[2]")
	private WebElement openAccount;

	@FindBy(xpath = "//select[@id='userSelect']")
	private WebElement customerName;

	@FindBy(xpath = "//select[@id='currency']")
	private WebElement currency;

	@FindBy(xpath = "//button[text()='Process']")
	private WebElement btnProcess;

	@FindBy(xpath = "//button[@class='btn home']")
	private WebElement btnHome;

	public void clickOnBankManagerLogin() {
		btnBankManagerLogin.click();
	}

	public boolean validateBankManagerPage() {
		return driver.getCurrentUrl().contains("/#/manager");

	}

	public void clickOnOpenAccount() {
		openAccount.click();
	}

	public void selectCustomer(String account) {
		Select sel = new Select(customerName);
		sel.selectByVisibleText(account);
	}

	public void selectCurrency(String value) {
		Select sel = new Select(currency);
		sel.selectByVisibleText(value);
	}

	public void clickOnProcess() {
		btnProcess.click();
		driver.switchTo().alert().accept();

	}

	public boolean validateAlert() {
		String actMessage = driver.switchTo().alert().getText();
		String expMessage = prop.getProperty("alertMessage");
		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public void clickOnHome() {
		btnHome.click();
	}

}
