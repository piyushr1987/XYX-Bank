package com.xyxbank.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyxbank.genericPage.BaseClass;

public class BankManagerLoginPage extends BaseClass {

	public BankManagerLoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
	private WebElement btnBankManagerLogin;

	@FindBy(xpath = "//div[contains(@class,'center')]/button[1]")
	private WebElement btnAddCustomer;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement txtFirstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement txtLastName;

	@FindBy(xpath = "//input[@placeholder='Post Code']")
	private WebElement txtPostalCode;

	@FindBy(xpath = "//button[text()='Add Customer']")
	private WebElement btnAdd;

	@FindBy(xpath = "//div[contains(@class,'center')]/button[3]")
	private WebElement btnCustomer;

	@FindBy(xpath = "//table[@class='table table-bordered table-striped']//tbody/tr[5]/td[1]")
	private WebElement CustomerName;

	@FindBy(xpath = "//button[@class='btn home']")
	private WebElement btnHome;

	public void clickOnBankManagerLogin() {

		Actions act = new Actions(driver);
		act.moveToElement(btnBankManagerLogin).click().build().perform();
		// btnBankManagerLogin.click();
	}

	public boolean validateAddCustomer() {
		return btnAddCustomer.isDisplayed();

	}

	public void clickOnAddCustomer() {
		btnAddCustomer.click();
	}

	public void enterFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void enterPostalCode(String pcode) {
		txtPostalCode.sendKeys(pcode);
	}

	public void clickOnAdd() {
		btnAdd.click();
		driver.switchTo().alert().accept();
	}

	public void clickOnCustomers() {
		btnCustomer.click();

	}

	public boolean validateCustomerName() {
		return CustomerName.isDisplayed();

	}

	public void clickOnHome() {
		btnHome.click();
	}

}
