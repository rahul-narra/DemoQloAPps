package com.qmetry.qaf.qloapps.test;

import static com.qmetry.qaf.automation.step.CommonStep.*;

import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.*;

public class TC_04_OrderCancelTest {
	public class TC04_CancelOrderTest extends WebDriverTestCase {

		
		@Test
		public void cancelOrder() throws InterruptedException {

			get("/");
			getDriver().manage().window().maximize();

			// Sign In
			click("signin");
			getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
			clear("Existing_email_xpath");
			clear("Existing_password_xpath");
			String email = getBundle().getString("email_id");
			sendKeys(email, "Existing_email_xpath");
			getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
			String password = getBundle().getString("pwd");
			sendKeys(password, "Existing_password_xpath");
			getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
			click("Login_existing_xpath");

			// Cancelling order in Orders page
			getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			click("accntBtn");
			getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			click("orders");
			getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			click("ordrDetails");
			getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			click("cancelBookingbtn");
			getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			click("selectPack");
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,150)");
			waitForVisible("cancelReqSubmt", 10);
			click("cancelReqSubmt");
			getDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			String msg = getBundle().getString("msg");
			waitForVisible("popupMsg", 10);
			sendKeys(msg , "popupMsg");
			click("popupSubmit");
		}

	}

}
