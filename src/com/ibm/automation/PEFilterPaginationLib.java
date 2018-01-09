package com.ibm.automation;
import java.io.IOException;


public class PEFilterPaginationLib extends FwBaseClass{
	PEFilterPaginationOR PEFilterPaginationOR = new PEFilterPaginationOR();
	
	
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
	public void funcFPAdminLogin()throws InterruptedException, IOException, Exception

    {

           try

           {                         

                  FwPerformAction.funcSendKeys(PEFilterPaginationOR.txtUserName, FwUtill.getxlsTestData("UID"));

                  FwPerformAction.funcSendKeys(PEFilterPaginationOR.txtPassword, FwUtill.getxlsTestData("PWD"));

                  FwPerformAction.funcBtnClick(PEFilterPaginationOR.BtnLogin);

                 

           }

           catch(Exception e)

           {

                  FwReport.logScreenshot("FAIL", "UnSuccessful Login"); 

                  throw e;

           }

    }
	
	
	
	public void funcPEHomeFilter()throws InterruptedException, IOException, Exception
	{
		try
		{
		// 1	
			if (FwUtill.getxlsTestData("FileType") == "")
			 {
				 System.out.println("");
			 }
	    
			if (FwUtill.getxlsTestData("BuyerName") != "")
			 {
			FwPerformAction.funcSendKeys(PEFilterPaginationOR.TxtBuyerName, FwUtill.getxlsTestData("BuyerName"));
			 }
			
		// 2
			if (FwUtill.getxlsTestData("FileType") == "")
			 {
				 System.out.println("");
			 }
			 
		    if (FwUtill.getxlsTestData("SupplierName") != "")
			 {
			FwPerformAction.funcSendKeys(PEFilterPaginationOR.TxtSupplierName, FwUtill.getxlsTestData("SupplierName"));
			 }
			
		// 3	
			if (FwUtill.getxlsTestData("FileType") == "")
			 {
				 System.out.println("");
			 }
			 
		
			if (FwUtill.getxlsTestData("FpRelationshipStatus") != "")
			 {
			FwPerformAction.funcSelectFromDropdown(PEFilterPaginationOR.DdlFpRelationshipStatus,FwUtill.getxlsTestData("FpRelationshipStatus"));
			 }
			
		// 4	
			
			if (FwUtill.getxlsTestData("FileType") == "")
			 {
				 System.out.println("");
			 }
			 
		
			if (FwUtill.getxlsTestData("BuyerId") != "")
			{
			FwPerformAction.funcSendKeys(PEFilterPaginationOR.TxtBuyerId, FwUtill.getxlsTestData("BuyerId"));
			
			 }
			
		// 5
			if (FwUtill.getxlsTestData("FileType") == "")
			 {
				 System.out.println("");
			 }
			 
		
			if (FwUtill.getxlsTestData("SeNumber") != "") 
			 {
			FwPerformAction.funcSendKeys(PEFilterPaginationOR.TxtSeNumber, FwUtill.getxlsTestData("SeNumber"));
			 }
			
		// 6	
			if (FwUtill.getxlsTestData("FileType") == "")
			 {
				 System.out.println("");
			 }
			 
		
			if (FwUtill.getxlsTestData("FpRelationshipId") != "")
			 {
			FwPerformAction.funcSendKeys(PEFilterPaginationOR.TxtFpRelationshipId, FwUtill.getxlsTestData("FpRelationshipId"));
			 }
			
		// 7 
			if (FwUtill.getxlsTestData("FileType") == "")
			 {
				 System.out.println("");
			 }
			 
		
			if (FwUtill.getxlsTestData("BuyerCountry1") != "")
			 {
			FwPerformAction.funcSelectFromDropdown(PEFilterPaginationOR.DdlBuyerCountry,FwUtill.getxlsTestData("BuyerCountry1"));
			
			 }
			
		// 8
			if (FwUtill.getxlsTestData("FileType") == "")
			 {
				 System.out.println("");
			 }
			 
		
			if (FwUtill.getxlsTestData("SuppCountry1") != "") 
			 {
			
		// 9		 
			FwPerformAction.funcSelectFromDropdown(PEFilterPaginationOR.DdlSupplierCountry,FwUtill.getxlsTestData("SuppCountry1"));
			 }
			
			if (FwUtill.getxlsTestData("FileType") == "")
			 {
				 System.out.println("");
			 }
			 
		
			if (FwUtill.getxlsTestData("PendingPricingOption") != "")
			 {
			FwPerformAction.funcSelectFromDropdown(PEFilterPaginationOR.DdlPendingPricingOption,FwUtill.getxlsTestData("PendingPricingOption"));
			
			 }
			
			FwReport.logScreenshot("INFO", "Filter values entered");
			
			FwPerformAction.funcBtnClick(PEFilterPaginationOR.BtnSearch);
			
			FwReport.logScreenshot("INFO", "PE Relationships filtered successfully");
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
			throw e;
		}			
	}
	
	public void funcPEHomePagination()throws InterruptedException, IOException, Exception
	{
		try
		{
			
			if (FwUtill.getxlsTestData("Forward").contains("Y"))
			{
		    FwPerformAction.funcBtnClick(PEFilterPaginationOR.BtnFwrdArrow1);
			}
	
			
			if (FwUtill.getxlsTestData("DoubleForward").contains("Y"))
			 {
		    FwPerformAction.funcBtnClick(PEFilterPaginationOR.BtnFwrdArrow2);
			 }
			
			
			if (FwUtill.getxlsTestData("DoubleBack").contains ("Y"))
			 {
				FwPerformAction.funcBtnClick(PEFilterPaginationOR.BtnBackArrow1);
			 }
			
			
			if (FwUtill.getxlsTestData("Back").contains ("Y"))
			 {
			FwPerformAction.funcBtnClick(PEFilterPaginationOR.BtnBackArrow2);
			 }
		
			if (FwUtill.getxlsTestData("FileType") == "")
			 {
				 System.out.println("");
			 }
			if (FwUtill.getxlsTestData("CurrentPage") != "")
			 {
			FwPerformAction.funcSendKeys(PEFilterPaginationOR.TxtCurrentPage, FwUtill.getxlsTestData("CurrentPage"));
			FwReport.logScreenshot("INFO", "Value entered");
			FwPerformAction.FuncKeyPress(PEFilterPaginationOR.TxtCurrentPage, "ENTER");
			FwReport.logScreenshot("INFO", "Required page displayed");
			 } 
			
			
			
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
			throw e;
		}			
	}
}