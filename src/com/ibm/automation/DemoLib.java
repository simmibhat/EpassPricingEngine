package com.ibm.automation;

import java.io.IOException;

public class DemoLib extends FwBaseClass{
	DemoOR DemoOR = new DemoOR();
	
	
	
	public void funcDemoOpenURL() throws InterruptedException, IOException, Exception
	{
		try 
		{				
			FwUtill.openBrowserURL("CH", FwUtill.getTestData(FwUtill.currentTestName(), "URL"));			
			FwReport.logScreenshot("INFO", "Landing Screen page");
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
			throw e;
		}
	}
	//funcDemoLogin
	
	
	public void funcDemoLogin()throws InterruptedException, IOException, Exception
	{
		try
		{	
			FwPerformAction.funcEditSendKeys(DemoOR.loginEditUID,  FwUtill.getxlsTestData("UID"));
			FwPerformAction.FuncKeyPress(DemoOR.loginEditUID, "TAB");
			FwPerformAction.funcEditSendKeys(DemoOR.loginEditPWD,  FwUtill.getxlsTestData("PWD"));
			FwPerformAction.funcBtnClick(DemoOR.loginBtnLogin);
			//verify screen
			
			//FwPerformAction.funcVerifyTextwithMsg(BipOR.addSupplierHeadingText, "Add Supplier", "Add Single Supplier page verification ");
			//FwPerformAction.funcEditSendKeys(BipOR.addSupplierEditSupName, FwUtill.getxlsTestData("SupplierName"));
		
			
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Add Supplier");	
			throw e;
		}
	}
}


