package com.xyxbank.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyxbank.genericPage.BaseClass;
import com.xyxbank.pages.BankManagerLoginPage;

public class BankManagerLoginTest extends BaseClass {

	BankManagerLoginPage manager;

	public BankManagerLoginTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		manager = new BankManagerLoginPage();

	}

	@Test(priority = 1)
	public void testBankManagerLogin() throws Exception {

		Logger.info("click on Bank Manager Login");
		try {
			manager.clickOnBankManagerLogin();
		} catch (Exception e) {
			captureScreen(driver, "Bank Manager Login");
		}

	}

	@Test(priority = 2)
	public void testAddCustomerButton() throws Exception {
		if (manager.validateAddCustomer()) {
			Assert.assertTrue(true);
			Logger.info("add customer button is displayed on manager page ");
		} else {
			captureScreen(driver, "add customer button");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testAddCustomer() throws Exception {

		Logger.info("click on add customer");
		try {
			manager.clickOnAddCustomer();
		} catch (Exception e) {
			captureScreen(driver, "add customer");
		}

	}

	@Test(priority = 4)
	public void testFirstName() throws Exception {

		Logger.info("enter the first name");
		try {
			manager.enterFirstName(prop.getProperty("firstName"));
		} catch (Exception e) {
			captureScreen(driver, "first name");
		}

	}

	@Test(priority = 5)
	public void testLastName() throws Exception {

		Logger.info("enter the last name");
		try {
			manager.enterLastName(prop.getProperty("lastName"));
		} catch (Exception e) {
			captureScreen(driver, "last name");
		}

	}

	@Test(priority = 6)
	public void testPostalCode() throws Exception {

		Logger.info("enter the postal code");
		try {
			manager.enterPostalCode(prop.getProperty("postCode"));
		} catch (Exception e) {
			captureScreen(driver, "post code");
		}

	}

	@Test(priority = 7)
	public void testAdd() throws Exception {

		Logger.info("click on add customer button and accept the alert");
		try {
			manager.clickOnAdd();
		} catch (Exception e) {
			captureScreen(driver, "add");
		}

	}

	@Test(priority = 8)
	public void testCustomers() throws Exception {

		Logger.info("click on customers");
		try {
			manager.clickOnCustomers();
		} catch (Exception e) {
			captureScreen(driver, "customers");
		}

	}

	@Test(priority = 9)
	public void testCustomerName() throws Exception {
		if (manager.validateCustomerName()) {
			Assert.assertTrue(true);
			Logger.info("recently added customer name is displayed in list ");
		} else {
			captureScreen(driver, "add customer button");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 10)
	public void testHome() throws Exception {

		Logger.info("click on home");
		try {
			manager.clickOnHome();
		} catch (Exception e) {
			captureScreen(driver, "home");
		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
