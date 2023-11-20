package com.xyxbank.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyxbank.genericPage.BaseClass;
import com.xyxbank.pages.HomePage;

public class HomeTest extends BaseClass {

	HomePage home;

	public HomeTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		home = new HomePage();

	}

	@Test(priority = 1)
	public void testHomeButton() throws Exception {
		if (home.validateHomeButton()) {
			Assert.assertTrue(true);
			Logger.info("home button is displayed on login page");
		} else {
			captureScreen(driver, "home button");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 2)
	public void testCustomerLoginButton() throws Exception {
		if (home.validateCustomerLoginButton()) {
			Assert.assertTrue(true);
			Logger.info("Customer Login Button is displayed on login page");
		} else {
			captureScreen(driver, "Customer Login Button");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testBankManagerLoginButton() throws Exception {
		if (home.validateBankManagerLoginButton()) {
			Assert.assertTrue(true);
			Logger.info("Bank Manager Login Button is displayed on login page");
		} else {
			captureScreen(driver, "Bank Manager Login Button");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testBankName() throws Exception {
		WebElement xyzBank = driver.findElement(By.xpath("//*[@class='mainHeading']"));
		String actName = xyzBank.getText();
		String expName = prop.getProperty("Bank");
		try {
			Assert.assertEquals(actName, expName);
			Logger.info("actual and expected name is matched");
		} catch (Exception e) {
			captureScreen(driver, "bank name");
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
