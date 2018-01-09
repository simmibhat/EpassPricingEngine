package com.ibm.automation;

import java.io.IOException;

public class FPSupplierLib extends FwBaseClass{
	FPSupplierOR FPSupplierOR = new FPSupplierOR();
	public void funcExpOpenURL() throws InterruptedException, IOException, Exception
	{
		try 
		{
			System.out.println("start");			
			FwUtill.openBrowserURL("FF", FwUtill.getTestData(FwUtill.currentTestName(), "URL"));			
			FwReport.logScreenshot("INFO", "Landing Screen page");
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
			throw e;
		}
	}
	
	//FP Admin login
		public void funcFPAdminLogin()throws InterruptedException, IOException, Exception
		{
			try
			{				
				FwPerformAction.funcSendKeys(FPSupplierOR.txtusername, FwUtill.getxlsTestData("UID"));
				FwPerformAction.funcSendKeys(FPSupplierOR.txtpassword, FwUtill.getxlsTestData("PWD"));
				FwPerformAction.funcBtnClick(FPSupplierOR.BtLogin);
				
			}
			catch(Exception e)
			{
				FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
				throw e;
			}
		}

}
