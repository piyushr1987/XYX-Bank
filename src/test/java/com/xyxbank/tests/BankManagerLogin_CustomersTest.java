package com.xyxbank.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyxbank.genericPage.BaseClass;
import com.xyxbank.pages.BankManagerLogin_CustomersPage;

public class BankManagerLogin_CustomersTest extends BaseClass {

	BankManagerLogin_CustomersPage customers;

	public BankManagerLogin_CustomersTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		customers = new BankManagerLogin_CustomersPage();

	}

	@Test(priority = 1)
	public void testBankManagerLogin() throws Exception {

		Logger.info("click on Bank Manager Login");
		try {
			customers.clickOnBankManagerLogin();
		} catch (Exception e) {
			captureScreen(driver, "Bank Manager Login");
		}

	}

	@Test(priority = 2)
	public void testCustomersMenu() throws Exception {
		if (customers.validateCustomers()) {
			Assert.assertTrue(true);
			Logger.info("customers menu is displayed on bank manager page ");
		} else {
			captureScreen(driver, "customers menu");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testCustomers() throws Exception {

		Logger.info("click on customers");
		try {
			customers.clickOnCustomers();
		} catch (Exception e) {
			captureScreen(driver, "customers");
		}

	}

	@Test(priority = 4)
	public void testCustomerName() throws Exception {

		Logger.info("enter the name of cutomers which you want to delete");
		try {
			customers.enterCustomerName(prop.getProperty("deleteCustomerName"));
		} catch (Exception e) {
			captureScreen(driver, "customer name");
		}

	}

	@Test(priority = 5)
	public void testDelete() throws Exception {

		Logger.info("click on delete");
		try {
			customers.clickOnDelete();
		} catch (Exception e) {
			captureScreen(driver, "delete");
		}

	}

	@Test(priority = 6)
	public void testHome() throws Exception {

		Logger.info("click on home");
		try {
			customers.clickOnHome();
		} catch (Exception e) {
			captureScreen(driver, "home");
		}

	}

	@Test(priority = 7)
	public void testBankManagerLoginMenu() throws Exception {
		if (customers.validateBankManagerLogin()) {
			Assert.assertTrue(true);
			Logger.info("Bank Manager Login menu is displayed on home page ");
		} else {
			captureScreen(driver, "Bank Manager Login menu");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
