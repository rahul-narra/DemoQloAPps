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
*Create By: Rahul 		Date: 09-06-2021		Type: Qmetry Framework		Last_Update_by: Rahul	Last_Updated_date: 09/06/2021
*
****************************************************************************************************************************************************************/

public class TC_02_AddingAddressTest extends WebDriverTestCase {

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
		CommonStep.sendKeys(email, "Existing_email_xpath");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		String password = getBundle().getString("pwd");
		CommonStep.sendKeys(password, "Existing_password_xpath");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("Login_existing_xpath");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("select_dropdown");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("account");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("add_address");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	clear("firstname_adress");
    	clear("lastname_adress");
    	String firstname = getBundle().getString("fname");
		CommonStep.sendKeys(firstname, "firstname_adress");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		String lastname = getBundle().getString("lname");
		CommonStep.sendKeys(lastname, "lastname_adress");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		String address = getBundle().getString("address_details");
		CommonStep.sendKeys(address, "address");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		String city = getBundle().getString("cityname");
		CommonStep.sendKeys(city, "city");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("state");
		String zip = getBundle().getString("zipcode");
		CommonStep.sendKeys(zip, "zip");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		String home_phone = getBundle().getString("phone");
		CommonStep.sendKeys(home_phone, "home_phone");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("save");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	 
	 }
	 
	}
	 }