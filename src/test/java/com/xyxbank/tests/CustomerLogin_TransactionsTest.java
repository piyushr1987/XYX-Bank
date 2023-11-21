package com.xyxbank.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyxbank.genericPage.BaseClass;
import com.xyxbank.pages.CustomerLogin_TransactionsPage;

public class CustomerLogin_TransactionsTest extends BaseClass {

	CustomerLogin_TransactionsPage transcation;

	public CustomerLogin_TransactionsTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		transcation = new CustomerLogin_TransactionsPage();

	}

	@Test(priority = 1)
	public void testCustomerLogin() throws Exception {

		Logger.info("click on Customer Login");
		try {
			transcation.clickOnCustomerLogin();
		} catch (Exception e) {
			captureScreen(driver, "Customer Login");
		}

	}

	@Test(priority = 2)
	public void testCustomerLoginPage() throws Exception {
		if (transcation.validateCustomerLoginPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Customer Login page ");
		} else {
			captureScreen(driver, "Customer Login page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testCustomerName() throws Exception {

		Logger.info("select the customer name");
		try {
			transcation.selectCustomerName(prop.getProperty("userName"));
		} catch (Exception e) {
			captureScreen(driver, "Customer name");
		}

	}

	@Test(priority = 4)
	public void testLogin() throws Exception {

		Logger.info("click on login");
		try {
			transcation.clickOnLogin();
		} catch (Exception e) {
			captureScreen(driver, "login");
		}

	}

	@Test(priority = 5)
	public void testCustomerAccountPage() throws Exception {
		if (transcation.validateCustomerAccountPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Customer Account Page ");
		} else {
			captureScreen(driver, "Customer Account Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testCustomerNameAccountPage() throws Exception {

		WebElement customerName = driver.findElement(By.xpath("//*[text()='Hermoine Granger']"));
		if (customerName.isDisplayed()) {
			Assert.assertTrue(true);
			Logger.info("customer name is displayed on  Account Page ");
		} else {
			captureScreen(driver, "customer name");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testCustomerAccountNumber() throws Exception {

		Logger.info("select the customer account");
		try {
			transcation.selectCustomerAccountNumber(prop.getProperty("accountNumber"));
		} catch (Exception e) {
			captureScreen(driver, "Customer account");
		}

	}

	@Test(priority = 8)
	public void testCustomerAccountNo() throws Exception {

		WebElement customerNo = driver.findElement(By.xpath("//div[@ng-hide='noAccount'][1]/strong[1]"));
		if (customerNo.isDisplayed()) {
			Assert.assertTrue(true);
			Logger.info("customer account number is displayed on  Account Page ");
		} else {
			captureScreen(driver, "customer account no");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testCustomerAccountBalance() throws Exception {

		WebElement customerAccBalance = driver.findElement(By.xpath("//div[@ng-hide='noAccount'][1]/strong[2]"));
		if (customerAccBalance.isDisplayed()) {
			Assert.assertTrue(true);
			Logger.info("customer account balance is displayed on  Account Page ");
		} else {
			captureScreen(driver, "customer account balance");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 10)
	public void testCurrency() throws Exception {

		WebElement currency = driver.findElement(By.xpath("//div[@ng-hide='noAccount'][1]/strong[3]"));
		if (currency.isDisplayed()) {
			Assert.assertTrue(true);
			Logger.info("currency in Rupee is displayed on  Account Page ");
		} else {
			captureScreen(driver, "currency");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 11)
	public void testTransactions() throws Exception {

		Logger.info("click on Transactions");
		try {
			transcation.clickOnTransactions();
		} catch (Exception e) {
			captureScreen(driver, "Transactions");
		}

	}

	@Test(priority = 12)
	public void testTransactionsPage() throws Exception {
		if (transcation.validateTransactionsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Transactions Page ");
		} else {
			captureScreen(driver, "Transactions Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 13)
	public void testBack() throws Exception {

		Logger.info("click on back");
		try {
			transcation.clickOnBack();
		} catch (Exception e) {
			captureScreen(driver, "back");
		}

	}

	@Test(priority = 14)
	public void testLogOut() throws Exception {

		Logger.info("click on log out");
		try {
			transcation.clickOnLogOut();
		} catch (Exception e) {
			captureScreen(driver, "log out");
		}

	}

	@Test(priority = 15)
	public void testHome() throws Exception {

		Logger.info("click on home");
		try {
			transcation.clickOnHome();
		} catch (Exception e) {
			captureScreen(driver, "home");
		}

	}

	@Test(priority = 16)
	public void testHomePage() throws Exception {
		if (transcation.validateHomePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to home Page ");
		} else {
			captureScreen(driver, "home Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
