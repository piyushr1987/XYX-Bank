package com.xyxbank.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyxbank.genericPage.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='btn home']")
	private WebElement btnHome;

	@FindBy(xpath = "//button[text()='Customer Login']")
	private WebElement btnCustomerLogin;

	@FindBy(xpath = "//button[text()='Bank Manager Login']")
	private WebElement btnBankManagerLogin;

	public boolean validateHomeButton() {
		return btnHome.isDisplayed();

	}

	public boolean validateCustomerLoginButton() {
		return btnCustomerLogin.isDisplayed();

	}

	public boolean validateBankManagerLoginButton() {
		return btnBankManagerLogin.isDisplayed();

	}

}
