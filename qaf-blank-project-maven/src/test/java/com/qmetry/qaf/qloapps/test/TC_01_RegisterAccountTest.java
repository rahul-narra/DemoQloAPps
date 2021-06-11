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

/****************************************************************************************************************************************************************
*Create By: Rahul 		Date: 09-06-2021		Type: Qmetry Framework		
*
****************************************************************************************************************************************************************/

public class TC_01_RegisterAccountTest extends WebDriverTestCase {

	@Test(description="Create Account")
	public void createacc() throws InterruptedException {
	 {
		
		get("/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("signin");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		
		String email = getBundle().getString("email_id");
		CommonStep.sendKeys(email, "email_create");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("create_account");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	//enter personal information
		String firstname = getBundle().getString("fname");
		CommonStep.sendKeys(firstname, "firstname");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		String lastname = getBundle().getString("lname");
		CommonStep.sendKeys(lastname, "lastname");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		String password = getBundle().getString("pwd");
		CommonStep.sendKeys(password, "password");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		//scroll
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
    	js.executeScript("window.scrollBy(0,280)", "");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("filterdate_xpath");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("filtermonth");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("filteryear");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("register");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("select_dropdown");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("logout");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	
	}
	}
}
