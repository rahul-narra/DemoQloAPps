package com.qmetry.qaf.qloapps.test;

/*********************************
*Create By: Rahul		Date: 09-06-2021		Type: Qmetry Framework		
*
*********************************/

import static com.qmetry.qaf.automation.step.CommonStep.*;

import java.awt.event.ActionEvent;
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
public class TC_07_RemoveProductTest extends WebDriverTestCase {

	@Test(description="Add To Cart")
	public void addtoCart() throws InterruptedException{
		
		get("/");
        getDriver().manage().window().maximize();
        sendKeys("United States", "enterhotelloc");
        waitForVisible("selcthotelloc", 1000);
        click("selcthotelloc");
        click("selecthotel");
        Thread.sleep(2000);
        click("selecthotelprime");
        Thread.sleep(2000);
        click("selectcheckin");
        
        click("selctdatein");
        
        click("selectcheckout");
       
        click("selctdateout");
        
         
        click("clickSearchnow");
        click("clickbooknow1");
        Thread.sleep(5000);
        click("proceed_chkout");
        Thread.sleep(2000);
        click("viewcart");
        click("removecart");
        Thread.sleep(3000);

	}
}