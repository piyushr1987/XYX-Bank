package com.xyxbank.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyxbank.genericPage.BaseClass;
import com.xyxbank.pages.CustomerLogin_DepositPage;

public class CustomerLogin_DepositTest extends BaseClass {

	CustomerLogin_DepositPage deposit;

	public CustomerLogin_DepositTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		deposit = new CustomerLogin_DepositPage();

	}

	@Test(priority = 1)
	public void testCustomerLogin() throws Exception {

		Logger.info("click on Customer Login");
		try {
			deposit.clickOnCustomerLogin();
		} catch (Exception e) {
			captureScreen(driver, "Customer Login");
		}

	}

	@Test(priority = 2)
	public void testYourNameDropDown() throws Exception {
		if (deposit.validateYourNameDropDown()) {
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
			deposit.selectCustomerName(prop.getProperty("depUserName"));
		} catch (Exception e) {
			captureScreen(driver, "Customer name");
		}

	}

	@Test(priority = 4)
	public void testLogin() throws Exception {

		Logger.info("click on login");
		try {
			deposit.clickOnLogin();
		} catch (Exception e) {
			captureScreen(driver, "login");
		}

	}

	@Test(priority = 5)
	public void testCustomerNameAccountPage() throws Exception {

		WebElement customerName = driver.findElement(By.xpath("//*[text()='Ron Weasly']"));
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
			deposit.selectCustomerAccountNumber(prop.getProperty("depAccountNumber"));
		} catch (Exception e) {
			captureScreen(driver, "Customer account");
		}

	}

	@Test(priority = 7)
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

	@Test(priority = 8)
	public void testDeposit() throws Exception {

		Logger.info("click on deposit");
		try {
			deposit.clickOnDeposit();
		} catch (Exception e) {
			captureScreen(driver, "deposit");
		}

	}

	@Test(priority = 9)
	public void testAmount() throws Exception {

		Logger.info("enter the amount");
		try {
			deposit.enterAmount(prop.getProperty("depAmount"));
		} catch (Exception e) {
			captureScreen(driver, "amount");
		}

	}

	@Test(priority = 10)
	public void testSubmit() throws Exception {

		Logger.info("click on submit");
		try {
			deposit.clickOnSubmit();
		} catch (Exception e) {
			captureScreen(driver, "submit");
		}

	}

	@Test(priority = 11)
	public void testDepositMessage() throws Exception {

		WebElement depMessage = driver.findElement(By.xpath("//*[@ng-show='message']"));
		String actMessage = depMessage.getText();
		String expMessage = prop.getProperty("sucessMessage");
		if (actMessage.equalsIgnoreCase(expMessage)) {
			Assert.assertTrue(true);
			Logger.info("actual and expected message is matched");
		} else {
			captureScreen(driver, "deposit message");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 12)
	public void testDepositAmount() throws Exception {

		WebElement depositAmount = driver.findElement(By.xpath("//div[@ng-hide='noAccount'][1]/strong[2]"));
		if (depositAmount.isDisplayed()) {
			Assert.assertTrue(true);
			Logger.info("enter deposit amount is matched");
		} else {
			captureScreen(driver, "deposit amount");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 13)
	public void testLogOut() throws Exception {

		Logger.info("click on log out");
		try {
			deposit.clickOnLogOut();
		} catch (Exception e) {
			captureScreen(driver, "log out");
		}

	}

	@Test(priority = 14)
	public void testHome() throws Exception {

		Logger.info("click on home");
		try {
			deposit.clickOnHome();
		} catch (Exception e) {
			captureScreen(driver, "home");
		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
