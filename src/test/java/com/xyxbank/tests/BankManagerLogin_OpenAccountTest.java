package com.xyxbank.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyxbank.genericPage.BaseClass;
import com.xyxbank.pages.BankManagerLogin_OpenAccountPage;

public class BankManagerLogin_OpenAccountTest extends BaseClass {

	BankManagerLogin_OpenAccountPage open;

	public BankManagerLogin_OpenAccountTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		open = new BankManagerLogin_OpenAccountPage();

	}

	@Test(priority = 1)
	public void testBankManagerLogin() throws Exception {

		Logger.info("click on Bank Manager Login");
		try {
			open.clickOnBankManagerLogin();
		} catch (Exception e) {
			captureScreen(driver, "Bank Manager Login");
		}

	}

	@Test(priority = 2)
	public void testBankManagerPage() throws Exception {
		if (open.validateBankManagerPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to bank manager page ");
		} else {
			captureScreen(driver, "Bank Manager Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testOpenAccount() throws Exception {

		Logger.info("click on open account");
		try {
			open.clickOnOpenAccount();
		} catch (Exception e) {
			captureScreen(driver, "open account");
		}

	}

	@Test(priority = 4)
	public void testCustomer() throws Exception {

		Logger.info("select customer from drop down");
		try {
			open.selectCustomer(prop.getProperty("CustomerName"));
		} catch (Exception e) {
			captureScreen(driver, "customers");
		}

	}

	@Test(priority = 5)
	public void testCurrency() throws Exception {

		Logger.info("select currency from drop down");
		try {
			open.selectCurrency(prop.getProperty("currency"));
		} catch (Exception e) {
			captureScreen(driver, "currency");
		}

	}

	@Test(priority = 6)
	public void testProcess() throws Exception {

		Logger.info("click on process");
		try {
			open.clickOnProcess();
		} catch (Exception e) {
			captureScreen(driver, "process");
		}

	}

	@Test(priority = 7)
	public void testAlertMessage() throws Exception {

		if (open.validateAlert()) {
			Assert.assertTrue(true);
			Logger.info("actual and expected alert message is matched ");
		} else {
			captureScreen(driver, "alert message");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 8)
	public void testHome() throws Exception {

		Logger.info("click on home");
		try {
			open.clickOnHome();
		} catch (Exception e) {
			captureScreen(driver, "home");
		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
