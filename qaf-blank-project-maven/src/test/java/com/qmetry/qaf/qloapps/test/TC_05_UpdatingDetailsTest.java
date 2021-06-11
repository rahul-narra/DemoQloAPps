package com.qmetry.qaf.qloapps.test;

import static com.qmetry.qaf.automation.step.CommonStep.*;

import java.sql.Driver;
import java.util.Map;
import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;
import java.util.concurrent.TimeUnit;
import java.util.ResourceBundle.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.*;
import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;

/*********************************
*Create By:Rahul		Date: 09-06-2021		Type: Qmetry Framework		
*
*********************************/

public class TC_05_UpdatingDetailsTest extends WebDriverTestCase {

	@Test(description="Create Account")
	public void createacc() throws InterruptedException {
	 {
		
		get("/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
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
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("select_dropdown");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("account");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("myaddress");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("update_address");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("company_xpath");
    	String companytext = getBundle().getString("company");
		sendKeys(companytext,"company_xpath");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("save_xpath");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("select_dropdown");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("logout");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	 }
	}
}