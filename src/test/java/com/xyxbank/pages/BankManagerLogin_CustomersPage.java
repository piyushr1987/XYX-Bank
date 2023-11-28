package com.xyxbank.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyxbank.genericPage.BaseClass;

public class BankManagerLogin_CustomersPage extends BaseClass {

	public BankManagerLogin_CustomersPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
	private WebElement btnBankManagerLogin;

	@FindBy(xpath = "//div[@class='center']/button[3]")
	private WebElement customers;

	@FindBy(xpath = "//input[@placeholder='Search Customer']")
	private WebElement searchCustomers;

	@FindBy(xpath = "//table[@class='table table-bordered table-striped']//tbody//tr[1]//td[5]")
	private WebElement btnDelete;

	@FindBy(xpath = "//button[@class='btn home']")
	private WebElement btnHome;

	public void clickOnBankManagerLogin() {
		btnBankManagerLogin.click();
	}

	public boolean validateCustomers() {
		if (customers.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public void clickOnCustomers() {
		customers.click();
	}

	public void enterCustomerName(String name) {
		searchCustomers.sendKeys(name);
	}

	public void clickOnDelete() {
		btnDelete.click();
	}

	public void clickOnHome() {
		btnHome.click();
	}

	public boolean validateBankManagerLogin() {
		if (btnBankManagerLogin.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

}
