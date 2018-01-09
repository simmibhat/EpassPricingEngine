package com.ibm.automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;




public class AppSampleLib1 extends FwBaseClass{// 
	//Home Screen
	
	private By homeRadioOneway = By.id("OneWay");
	private By homeEditFrom = By.id("FromTag");
	private By homeEditUID = By.name("userid");
	private By homeEditPWD = By.name("pwd");
	private By homeBtnLogin = By.name("Login");
	private By homeBtnLogout = By.linkText("Log Out");
	//EditProfile
	//
	///
	
	

	
	public void funcClearTripSearchFlight()throws InterruptedException, IOException, Exception
	{
		try 
		{	
			Assert.assertTrue(true, "True Assert msg");
			Reporter.log("Log Try");
			//FwUtill.openBrowserURL("CH", "http://www.cleartrip.com/");
			FwUtill.openBrowserURL("CH", FwUtill.getTestData(FwUtill.currentTestName(), "URL"));
			FwReport.log("INFO", "Start firstTest Step first", "Test1 Started");
			FwReport.log("FAIL", "Start Second Test Step 2", "Test1 running");
			FwPerformAction.funcClick(homeRadioOneway);
			FwReport.log("INFO", "Start firstTest Step first", "Test1 Started");
			FwPerformAction.funcSendKeys(homeEditFrom, "Pune, IN - Lohegaon (PNQ)");
			FwReport.logScreenshot("PASS", "Screenshot Test");
		}
		catch(Exception e)
		{
			//report.FuncReport("Fail", "Search Flight Failed");
			throw e;
		}
	}
	public void funcPEOpenURL()throws InterruptedException, IOException, Exception
	{
		try 
		{				
			FwUtill.openBrowserURL("CH", FwUtill.getTestData(FwUtill.currentTestName(), "URL"));			
			FwReport.logScreenshot("INFO", "Login Screen");
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Login");			
			throw e;
		}
	}
	public void funcPELogin()throws InterruptedException, IOException, Exception
	{
		try 
		{	
			FwPerformAction.funcEditSendKeys(homeEditUID, FwUtill.getxlsTestData("UID"));
			FwPerformAction.funcEditSendKeys(homeEditPWD, FwUtill.getxlsTestData("PWD"));
			FwPerformAction.funcBtnClick(homeBtnLogin);
			FwReport.logScreenshot("INFO", "Displayed  Screen after Login");
			FwPerformAction.funcVerifyLink(homeBtnLogout);
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Login");			
			throw e;
		}
	}
	public String funcPELogout()throws InterruptedException, IOException
	{
		try 
		{	
			String sstatus = FwPerformAction.funcLinkClick(homeBtnLogout);
			if (!sstatus.equalsIgnoreCase("PASS")){
				FwReport.log("FAIL", "Logout", "Logout failed");
				return "FAIL";
			}
			FwReport.logScreenshot("PASS", "Logout Screen");
			return "PASS";
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Logout");	
			return "FAIL";
			//throw e;
		}
	}
	
}
