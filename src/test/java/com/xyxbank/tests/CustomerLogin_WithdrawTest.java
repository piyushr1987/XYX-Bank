package com.xyxbank.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyxbank.genericPage.BaseClass;
import com.xyxbank.pages.CustomerLogin_WithdrawPage;

public class CustomerLogin_WithdrawTest extends BaseClass {

	CustomerLogin_WithdrawPage withdraw;

	public CustomerLogin_WithdrawTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		withdraw = new CustomerLogin_WithdrawPage();

	}

	@Test(priority = 1)
	public void testCustomerLogin() throws Exception {

		Logger.info("click on Customer Login");
		try {
			withdraw.clickOnCustomerLogin();
		} catch (Exception e) {
			captureScreen(driver, "Customer Login");
		}

	}

	@Test(priority = 2)
	public void testYourNameDropDown() throws Exception {
		if (withdraw.validateYourNameDropDown()) {
			Assert.assertTrue(true);
			Logger.info("Your Name DropDown is displayed on customer page ");
		} else {
			captureScreen(driver, "Your Name DropDown");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testCustomerName() throws Exception {

		Logger.info("select the customer name");
		try {
			withdraw.selectCustomerName(prop.getProperty("witUserName"));
		} catch (Exception e) {
			captureScreen(driver, "Customer name");
		}

	}

	@Test(priority = 4)
	public void testLogin() throws Exception {

		Logger.info("click on login");
		try {
			withdraw.clickOnLogin();
		} catch (Exception e) {
			captureScreen(driver, "login");
		}

	}

	@Test(priority = 5)
	public void testCustomerNameAccountPage() throws Exception {

		WebElement customerName = driver.findElement(By.xpath("//*[text()='Albus Dumbledore']"));
		if (customerName.isDisplayed()) {
			Assert.assertTrue(true);
			Logger.info("customer name is displayed on  Account Page ");
		} else {
			captureScreen(driver, "customer name");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testCustomerAccountNumber() throws Exception {

		Logger.info("select the customer account");
		try {
			withdraw.selectCustomerAccountNumber(prop.getProperty("witAccountNumber"));
		} catch (Exception e) {
			captureScreen(driver, "Customer account");
		}

	}

	@Test(priority = 7)
	public void testCurrency() throws Exception {

		WebElement currency = driver.findElement(By.xpath("//div[@ng-hide='noAccount'][1]/strong[3]"));
		if (currency.isDisplayed()) {
			Assert.assertTrue(true);
			Logger.info("currency as Pound is displayed on account page ");
		} else {
			captureScreen(driver, "currency");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 8)
	public void testWithdraw() throws Exception {

		Logger.info("click on withdraw");
		try {
			withdraw.clickOnWithdraw();
		} catch (Exception e) {
			captureScreen(driver, "withdraw");
		}

	}

	@Test(priority = 9)
	public void testAmount() throws Exception {

		Logger.info("enter the amount");
		try {
			withdraw.enterAmount(prop.getProperty("depAmount"));
		} catch (Exception e) {
			captureScreen(driver, "amount");
		}

	}

	@Test(priority = 10)
	public void testSubmit() throws Exception {

		Logger.info("click on submit");
		try {
			withdraw.clickOnSubmit();
		} catch (Exception e) {
			captureScreen(driver, "submit");
		}

	}

	@Test(priority = 11)
	public void testErrorMessage() throws Exception {

		WebElement error = driver.findElement(By.xpath("//span[@ng-show='message']"));
		String actMessage = error.getText();
		String expMessage = prop.getProperty("errorMessage");

		if (actMessage.equalsIgnoreCase(expMessage)) {
			Assert.assertTrue(true);
			Logger.info("actual and expected error message is matched");
		} else {
			captureScreen(driver, "currency");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 12)
	public void testLogOut() throws Exception {

		Logger.info("click on log out");
		try {
			withdraw.clickOnLogOut();
		} catch (Exception e) {
			captureScreen(driver, "log out");
		}

	}

	@Test(priority = 13)
	public void testHome() throws Exception {

		Logger.info("click on home");
		try {
			withdraw.clickOnHome();
		} catch (Exception e) {
			captureScreen(driver, "home");
		}

	}

	@Test(priority = 14)
	public void testHomePage() throws Exception {

		if (withdraw.validateHomePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to home page");
		} else {
			captureScreen(driver, "home page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
