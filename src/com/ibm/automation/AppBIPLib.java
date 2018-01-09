package com.ibm.automation;

import java.io.IOException;


public class AppBIPLib extends FwBaseClass{
	BipOR BipOR = new BipOR();
	//private By homeEditUID = By.name("userID");

	
	public void funcBIPOpenURL() throws InterruptedException, IOException, Exception
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
	public void funcBIPLogin()throws InterruptedException, IOException, Exception
	{
		try 
		{	
			FwPerformAction.funcEditSendKeys(BipOR.loginEditUID, FwUtill.getxlsTestData("UID"));
			FwPerformAction.FuncKeyPress(BipOR.loginEditUID, "TAB");
			FwPerformAction.funcEditSendKeys(BipOR.loginEditPWD, FwUtill.getxlsTestData("PWD"));		
			FwPerformAction.funcBtnClick(BipOR.loginBTNLoogin);
			FwPerformAction.funcVerifyButtonWithMSG(BipOR.homeLogOut,"Login verification");	
			
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Login");		
			throw e;
		}
	}
	
	public void funcBIPAddSupplier()throws InterruptedException, IOException, Exception
	{
		try
		{	
					
			FwPerformAction.funcLinkClick(BipOR.homeLinkSupplier);
			FwPerformAction.funcBtnClick(BipOR.supplierButtonAddSingleSuplier);			
			FwPerformAction.funcVerifyTextwithMsg(BipOR.addSupplierHeadingText, "Add Supplier", "Add Single Supplier page verification ");
			FwPerformAction.funcEditSendKeys(BipOR.addSupplierEditSupName, FwUtill.getxlsTestData("SupplierName"));
			FwPerformAction.funcEditSendKeys(BipOR.addSupplierEditSupID, FwUtill.getxlsTestData("SupplierID"));
			FwPerformAction.funcSelectFromDropdown(BipOR.addSupplierSelectCountry,  FwUtill.getxlsTestData("Country"));
			FwPerformAction.funcEditSendKeys(BipOR.addSupplierEditAddress1, FwUtill.getxlsTestData("AddressLine1"));
			FwPerformAction.funcEditSendKeys(BipOR.addSupplierEditCity, FwUtill.getxlsTestData("City"));
			FwPerformAction.funcEditSendKeys(BipOR.addSupplierEditZip, FwUtill.getxlsTestData("Zip"));
			FwPerformAction.funcEditSendKeys(BipOR.addSupplierEditAnnualSpend, FwUtill.getxlsTestData("AnnualSpend"));		
			FwPerformAction.funcBtnClick(BipOR.addSupplierBtnAddSupplier);			
			FwPerformAction.funcVerifyTextwithMsg(BipOR.confirmSupplierInfoHeadingText, "Confirm Supplier Information", "Confirm Supplier Information page verification ");
			FwPerformAction.funcBtnClick(BipOR.confirmSupplierInfoBtnConfirm);
			FwReport.logScreenshot("PASS", "Successful Add Supplier");
			
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Add Supplier");	
			throw e;
		}
	}
	
}

