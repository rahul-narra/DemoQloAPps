
package com.qmetry.qaf.qloapps.test;
/*********************************
*Create By: Rahul	Date: 10-06-2021		Type: Qmetry Framework		
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
public class TC_03_BookingHotelTest extends WebDriverTestCase {

	@Test(description="Add To Cart")
	public void BookingHotelTest() throws InterruptedException{
		
		get("/");
		getDriver().manage().window().maximize();
		
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("Toggle");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("rooms");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
    	js.executeScript("window.scrollBy(0,100)", "");
    	getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	
    	click("exec_rooms");
    	Thread.sleep(2000);
    	//getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	click("Exec_book");
    	Thread.sleep(2000);
    	//getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	String parentHandle = getDriver().getWindowHandle();      
        for (String winHandle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
        }
        getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
      
    	click("modify_search");
    	Thread.sleep(2000);
        click("selectcheckin");
		 Thread.sleep(1000);
		 click("selctdatein");
		 Thread.sleep(1000);
		  click("selectcheckout");
		  click("selctdateout");
		  
		click("search");
  
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("e_book");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("proceed_chkout");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("proceed");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("loginnow");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("e-email");
		String email = getBundle().getString("email_id");
		sendKeys(email,"e-email");
		click("e-pass");
		String pwd = getBundle().getString("pwd");
		sendKeys(pwd,"e-pass");
		click("e-signin");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("proceed1");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("checkbox-1");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("paybybank");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("confirmation");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("select_dropdown");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		click("logout");
		getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	
	   }

	
}