package com.qmetry.qaf.qloapps.steps;

import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;

/****************************************************************************************************************************************************************
*Create By: Suhali D 		Date: 09-06-2021		Type: Qmetry Framework		Last_Update_by: Suhali D	Last_Updated_date: 09/06/2021
*
****************************************************************************************************************************************************************/

public class StepsLibrary {

	
	@QAFTestStep(description="Loginn")
	public static void Loginn() {
		 
		//get("https://demo.opencart.com/");
		//getDriver().manage().window().maximize();
		click("MyAccount_button_xpath");
		click("Login_button_xpath");
		String email = getBundle().getString("Email");
		CommonStep.sendKeys(email,"Existing_email_xpath");
		//sendKeys(email,"Existing_email_xpath");
		String pwd = getBundle().getString("Pwd");
		CommonStep.sendKeys(pwd,"Existing_password_xpath"); 
		//getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		click("Login_existing_xpath");
		//return;
	   } 
	
	@QAFDataProvider(dataFile = "resources/Book2.xls", sheetName="Sheet1", key="data")

	@Test(description = "Login using Excel") public static void loginexcel(Map <String, String> data){
		 
		//get("/");
		//getDriver().manage().window().maximize();
		click("MyAccount_button_xpath");
		click("Login_button_xpath");
		sendKeys(data.get("Emaill"),"Existing_email_xpath");
		sendKeys(data.get("Password"),"Existing_password_xpath");
		click("Login_existing_xpath");
		//return;
	   } 
}
