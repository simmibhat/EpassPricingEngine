package com.ibm.automation;

import java.io.IOException;

import org.openqa.selenium.By;

public class FPSupplierLib extends FwBaseClass{
	String HIROCSection;
	
	FPSupplierOR FPSupplierOR = new FPSupplierOR();
	
	
	public void funcExpOpenURL() throws InterruptedException, IOException, Exception
	{
		try 
		{
			System.out.println(FwUtill.getxlsTestData("PE_URL"));
			System.out.println(FwUtill.getxlsTestData("ENV_PE"));

			String EnvURL = FwUtill.getXLSTestData("PE_URL", FwUtill.getxlsTestData("ENV_PE") , ".//TestData//Setup.xlsx");
			
			System.out.println("Environment testing " +EnvURL);
			FwUtill.openBrowserURL(FwUtill.getxlsTestData( "Browser"),EnvURL);  
			FwReport.logScreenshot("INFO", "Landing Screen page");
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
			throw e;
		}
	}
	
	
	// this function is for closing DP
	
	public void funcCloseDP() throws InterruptedException, IOException, Exception
	{
		try 
		{
			FwPerformAction.funcBtnClick(FPSupplierOR.btnLogout);	
			
		}
		catch(Exception e)
		{
			FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
			throw e;
		}
	}
	
	
	//Closing Browser
	public void funcCloseBrowser() throws InterruptedException, IOException, Exception
	{
		try 
		{
			FwUtill.closeWindow();
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
				FwReport.logScreenshot("INFO", "Landing Screen page of FP");
				FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageHome, "Home", "Home Page Displayed    ");
				
			}
			catch(Exception e)
			{
				FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
				throw e;
			}
		}
		
		//FP Create Relationship for BIPX
				public void funcFPCreateRelatioshipProductBIPFX()throws InterruptedException, IOException, Exception
				{
					try
					{			
						FwPerformAction.funcBtnClick(FPSupplierOR.btnCreate);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.popupWindow1, "Region Selection- Create New Relationship", "Region Selection- Create New Relationship  Page Displayed    ");
						Thread.sleep(1000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.DDLRegion, FwUtill.getxlsTestData("DDLRegion"));
						Thread.sleep(1000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnConfirm);
						Thread.sleep(1000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDealOverview, "Deal Overview", "Deal Overview Page Displayed    ");
						Thread.sleep(1000);
						FwReport.logScreenshot("INFO", "Deal Overview page of FP");
						Thread.sleep(1000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.ddlProductType, FwUtill.getxlsTestData("ddlProductType"));
						Thread.sleep(1000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textDealID, FwUtill.getxlsTestData("textDealID"));
						Thread.sleep(1000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerName, FwUtill.getxlsTestData("textBuyerName"));
						Thread.sleep(1000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBIPPaymentEntityID, FwUtill.getxlsTestData("textBIPPaymentEntityID"));
						Thread.sleep(1000);
						FwPerformAction.funcBtnClick(FPSupplierOR.lookupBuyer1);
						Thread.sleep(6000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnNext);
						Thread.sleep(3000);
						
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pagePricingOptions, "Pricing Options", "Pricing Options Page Displayed    ");
						Thread.sleep(2000);
												
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textExceptionPricing, FwUtill.getxlsTestData("textExceptionPricing"));
						Thread.sleep(3000);
						
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textProcessingFeeBuyer, FwUtill.getxlsTestData("textProcessingFeeBuyer"));
						Thread.sleep(3000);
						
						FwReport.logScreenshot("INFO", "Pricing Options Screen page of FP");
						Thread.sleep(6000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnSave);
						Thread.sleep(2000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDynamicSummary, "Dynamic Pricing Summary", "Dynamic Pricing Summary Page Displayed    ");
						Thread.sleep(2000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnBackHome);
						Thread.sleep(2000);
						FwReport.logScreenshot("INFO", "Home page of FP is displayed");
						
						
					}
					catch(Exception e)
					{
						FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
						throw e;
					}
				}
		
		
		
		
		//FP Create Relationship buyer funded
				public void funcFPCreateRelatioshipBuyerFunded()throws InterruptedException, IOException, Exception
				{
					try
					{				
						FwPerformAction.funcBtnClick(FPSupplierOR.btnCreate);
						Thread.sleep(6000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.popupWindow1, "Region Selection- Create New Relationship", "Region Selection- Create New Relationship  Page Displayed    ");
						Thread.sleep(3000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.DDLRegion, FwUtill.getxlsTestData("DDLRegion"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnConfirm);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDealOverview, "Deal Overview", "Deal Overview Page Displayed    ");
						Thread.sleep(3000);
						FwReport.logScreenshot("INFO", "Deal Overview page of FP");
						Thread.sleep(3000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.ddlProductType, FwUtill.getxlsTestData("ddlProductType"));
						Thread.sleep(3000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.DDLDealType, FwUtill.getxlsTestData("DDLDealType"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textDealID, FwUtill.getxlsTestData("textDealID"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerName, FwUtill.getxlsTestData("textBuyerName"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBIPPaymentEntityID, FwUtill.getxlsTestData("textBIPPaymentEntityID"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.lookupBuyer1);
						Thread.sleep(6000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textSupplierName, FwUtill.getxlsTestData("textSupplierName"));
						Thread.sleep(3000);
						//FwPerformAction.funcEditSendKeys(FPSupplierOR.textRemitEntityID, FwUtill.getxlsTestData("textRemitEntityID"));
						//Thread.sleep(3000);
						if(!(FwUtill.getxlsTestData("textSE").isEmpty()))
						{
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textSE, FwUtill.getxlsTestData("textSE"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.lookupSupplier2);
						Thread.sleep(6000);
						//FwPerformAction.funcBtnClick(FPSupplierOR.btnNext);
						}		
						
						FwReport.logScreenshot("INFO", "Create Deal Overview Screen page of FP");
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnNext);
						Thread.sleep(3000);
						
										
											
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pagePricingOptions, "Pricing Options", "Pricing Options Page Displayed    ");
						Thread.sleep(3000);
												
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textExceptionPricing, FwUtill.getxlsTestData("textExceptionPricing"));
						Thread.sleep(3000);
						
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textProcessingFeeBuyer, FwUtill.getxlsTestData("textProcessingFeeBuyer"));
						Thread.sleep(3000);
						FwPerformAction.funcMoveToElement(FPSupplierOR.textExceptionPricing);
						
						if (FwUtill.getxlsTestData("HIROC").equals("Y"))
						{
							FwPerformAction.funcClick(FPSupplierOR.CheckboxHIROC1);
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold1, FwUtill.getxlsTestData("textThreshold1"));
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment1, FwUtill.getxlsTestData("textAdjustment1"));	
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold2, FwUtill.getxlsTestData("textThreshold2"));
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment2, FwUtill.getxlsTestData("textAdjustment2"));
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold3, FwUtill.getxlsTestData("textThreshold3"));
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment3, FwUtill.getxlsTestData("textAdjustment3"));
						}
						
						FwReport.logScreenshot("INFO", "Pricing Options Screen page of FP");
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnSave);
						
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDynamicSummary, "Dynamic Pricing Summary", "Dynamic Pricing Summary Page Displayed    ");
						FwPerformAction.funcBtnClick(FPSupplierOR.btnBackHome);
						FwReport.logScreenshot("INFO", "Home page of FP is displayed");
						
						
						
					}
					catch(Exception e)
					{
						FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
						throw e;
					}
				}


				//FP Create Relationship Split Rate
				public void funcFPCreateRelatioshipSplitRate()throws InterruptedException, IOException, Exception
				{
					try
					{				
						FwPerformAction.funcBtnClick(FPSupplierOR.btnCreate);
						Thread.sleep(6000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.popupWindow1, "Region Selection- Create New Relationship", "Region Selection- Create New Relationship  Page Displayed    ");
						Thread.sleep(6000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.DDLRegion, FwUtill.getxlsTestData("DDLRegion"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnConfirm);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDealOverview, "Deal Overview", "Deal Overview Page Displayed    ");
						Thread.sleep(3000);
						FwReport.logScreenshot("INFO", "Deal Overview page of FP");
						Thread.sleep(3000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.ddlProductType, FwUtill.getxlsTestData("ddlProductType"));
						Thread.sleep(3000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.DDLDealType, FwUtill.getxlsTestData("DDLDealType"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textDealID, FwUtill.getxlsTestData("textDealID"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerName, FwUtill.getxlsTestData("textBuyerName"));
						Thread.sleep(1000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBIPPaymentEntityID, FwUtill.getxlsTestData("textBIPPaymentEntityID"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.lookupBuyer1);
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textSupplierName, FwUtill.getxlsTestData("textSupplierName"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textRemitEntityID, FwUtill.getxlsTestData("textRemitEntityID"));
						Thread.sleep(3000);
						
						if(!(FwUtill.getxlsTestData("textSE").isEmpty()))
						{
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textSE, FwUtill.getxlsTestData("textSE"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.lookupSupplier2);
						Thread.sleep(3000);
						//FwPerformAction.funcBtnClick(FPSupplierOR.btnNext);
						}	
																	
						FwReport.logScreenshot("INFO", "Create Deal Overview Screen page of FP");
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnNext);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pagePricingOptions, "Pricing Options", "Pricing Options Page Displayed    ");
						Thread.sleep(3000);
						FwPerformAction.funcMoveToElement(FPSupplierOR.chcekboxSplit);
						FwPerformAction.funcClick(FPSupplierOR.chcekboxSplit);
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textProcessingFeeSupplier, FwUtill.getxlsTestData("textProcessingFeeSupplier"));
						Thread.sleep(4000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textExceptionPricing, FwUtill.getxlsTestData("textExceptionPricing"));
						Thread.sleep(4000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textProcessingFeeBuyer, FwUtill.getxlsTestData("textProcessingFeeBuyer"));
						Thread.sleep(3000);
												
						FwPerformAction.funcMoveToElement(FPSupplierOR.textExceptionPricing);
						
						if (FwUtill.getxlsTestData("HIROC").equals("Y"))
						{
							FwPerformAction.funcClick(FPSupplierOR.CheckboxHIROC1);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold1, FwUtill.getxlsTestData("textThreshold1"));
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment1, FwUtill.getxlsTestData("textAdjustment1"));	
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold2, FwUtill.getxlsTestData("textThreshold2"));
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment2, FwUtill.getxlsTestData("textAdjustment2"));
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold3, FwUtill.getxlsTestData("textThreshold3"));
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment3, FwUtill.getxlsTestData("textAdjustment3"));
							Thread.sleep(4000);
						}
						
						
						//Supplier section fields
						if (FwUtill.getxlsTestData("DSO").equals("Y"))
						{
							
							
							Thread.sleep(4000);
							 
							FwPerformAction.funcMoveToElement(FPSupplierOR.CheckboxDSO);
							//FwPerformAction.funcClick(FPSupplierOR.CheckboxDSO);
							Thread.sleep(4000);
							FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.SectionBuyer, "Buyer", "Buyer Section Displayed    ");
							
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textToDay1);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textToDay1, FwUtill.getxlsTestData("textToDay1"));
							Thread.sleep(6000);
							
							FwPerformAction.funcMoveToElement(FPSupplierOR.textFromday1);
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.ToDay2);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.ToDay2, FwUtill.getxlsTestData("ToDay2"));	
							Thread.sleep(6000);
							
							FwPerformAction.funcMoveToElement(FPSupplierOR.textReductionRate1);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textReductionRate1, FwUtill.getxlsTestData("textReductionRate1"));
							Thread.sleep(6000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.ToDay3);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.ToDay3, FwUtill.getxlsTestData("ToDay3"));
							Thread.sleep(6000);
							
							FwPerformAction.funcMoveToElement(FPSupplierOR.textReductionRate2);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textReductionRate2, FwUtill.getxlsTestData("textReductionRate2"));
							
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.ToDay4);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.ToDay4, FwUtill.getxlsTestData("ToDay4"));
							
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textReductionRate3);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textReductionRate3, FwUtill.getxlsTestData("textReductionRate3"));
							
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textReductionRate4);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textReductionRate4, FwUtill.getxlsTestData("textReductionRate4"));
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textBuyerAdjustment1);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerAdjustment1, FwUtill.getxlsTestData("textBuyerAdjustment1"));
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textBuyerAdjustment2);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerAdjustment2, FwUtill.getxlsTestData("textBuyerAdjustment2"));
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textBuyerAdjustment3);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerAdjustment3, FwUtill.getxlsTestData("textBuyerAdjustment3"));
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textBuyerAdjustment4);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerAdjustment4, FwUtill.getxlsTestData("textBuyerAdjustment4"));
						}
												
						FwReport.logScreenshot("INFO", "Pricing Options Screen page of FP");
						Thread.sleep(4000);
						//FwPerformAction.funcMoveToElement(FPSupplierOR.btnSave);
						//Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnSave);
						Thread.sleep(4000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDynamicSummary, "Dynamic Pricing Summary", "Dynamic Pricing Summary Page Displayed    ");
						Thread.sleep(6000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnBackHome);
						Thread.sleep(4000);
						FwReport.logScreenshot("INFO", "Home page of FP is displayed");
						
					}
					catch(Exception e)
					{
						FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
						throw e;
					}
				}
   
				
	// FP relation create using Copy Buyer option
				public void funcFPCreateRelatioshipCopyBuyerBuyerfunded()throws InterruptedException, IOException, Exception
				{
					try
					{	
						
						Thread.sleep(3000);
						FwPerformAction.funcMoveToElement(FPSupplierOR.textID);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textID, FwUtill.getxlsTestData("textID"));
						Thread.sleep(3000);
						
						FwPerformAction.funcMoveToElement(FPSupplierOR.textBuyerID);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerID, FwUtill.getxlsTestData("textBuyerID"));
						Thread.sleep(3000);
						
						FwPerformAction.funcBtnClick(FPSupplierOR.btnSearch);
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.CheckBox1);
						Thread.sleep(3000);
						
						
						if (FwUtill.getxlsTestData("btnCopyBuyer").equals("Y"))
						{
						
						FwPerformAction.funcBtnClick(FPSupplierOR.btnCopyBuyer);
						Thread.sleep(3000);
						}
						
						
						if (FwUtill.getxlsTestData("btnCopySupplier").equals("Y"))
						{
						
						FwPerformAction.funcBtnClick(FPSupplierOR.btnCopySupplier);
						Thread.sleep(3000);
						}
						
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDealOverview, "Deal Overview", "Deal Overview Page Displayed    ");
						Thread.sleep(4000);
						FwReport.logScreenshot("INFO", "Deal Overview page of FP");
						Thread.sleep(3000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.DDLDealType, FwUtill.getxlsTestData("DDLDealType"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textDealID, FwUtill.getxlsTestData("textDealID"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerName, FwUtill.getxlsTestData("textBuyerName"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBIPPaymentEntityID, FwUtill.getxlsTestData("textBIPPaymentEntityID"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.lookupBuyer1);
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textSupplierName, FwUtill.getxlsTestData("textSupplierName"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textRemitEntityID, FwUtill.getxlsTestData("textRemitEntityID"));
						Thread.sleep(3000);
						if(!(FwUtill.getxlsTestData("textSE").isEmpty()))
						{
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textSE, FwUtill.getxlsTestData("textSE"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.lookupSupplier2);
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnNext);
						}		
						Thread.sleep(3000);
						FwReport.logScreenshot("INFO", "Create Deal Overview Screen page of FP");
						Thread.sleep(6000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnNext);
						Thread.sleep(6000);		
										
											
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pagePricingOptions, "Pricing Options", "Pricing Options Page Displayed    ");
						Thread.sleep(3000);
												
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textExceptionPricing, FwUtill.getxlsTestData("textExceptionPricing"));
						Thread.sleep(3000);
						
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textProcessingFeeBuyer, FwUtill.getxlsTestData("textProcessingFeeBuyer"));
						Thread.sleep(3000);
						
						
						HIROCSection = FwPerformAction.funcGetText(FPSupplierOR.sectionHIROC);
						
						if(!(FwPerformAction.funcGetText(FPSupplierOR.sectionHIROC).equals("HI ROC Pricing")))
						{
						if (FwUtill.getxlsTestData("HIROC").equals("Y"))
						{
							FwPerformAction.funcClick(FPSupplierOR.CheckboxHIROC1);
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold1, FwUtill.getxlsTestData("textThreshold1"));
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment1, FwUtill.getxlsTestData("textAdjustment1"));	
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold2, FwUtill.getxlsTestData("textThreshold2"));
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment2, FwUtill.getxlsTestData("textAdjustment2"));
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold3, FwUtill.getxlsTestData("textThreshold3"));
							Thread.sleep(3000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment3, FwUtill.getxlsTestData("textAdjustment3"));
						}
						}
						Thread.sleep(3000);
						FwReport.logScreenshot("INFO", "Pricing Options Screen page of FP");
						Thread.sleep(4000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnSave);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDynamicSummary, "Dynamic Pricing Summary", "Dynamic Pricing Summary Page Displayed    ");
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnBackHome);
						Thread.sleep(3000);
						FwReport.logScreenshot("INFO", "Home page of FP is displayed");
						
						
						
					}
					catch(Exception e)
					{
						FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
						throw e;
					}
				}

				
				
				//FP Create Relationship Split Rate Copy buyer functionality
				
				public void funcFPCreateRelatioshipSplitRateCopybuyer()throws InterruptedException, IOException, Exception
				{
					try
					{				
						Thread.sleep(3000);
						FwPerformAction.funcMoveToElement(FPSupplierOR.textID);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textID, FwUtill.getxlsTestData("textID"));
						Thread.sleep(3000);
						
						FwPerformAction.funcMoveToElement(FPSupplierOR.textBuyerID);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerID, FwUtill.getxlsTestData("textBuyerID"));
						Thread.sleep(3000);
						
						FwPerformAction.funcBtnClick(FPSupplierOR.btnSearch);
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.CheckBox1);
						Thread.sleep(3000);
						
						
						if (FwUtill.getxlsTestData("btnCopyBuyer").equals("Y"))
						{
						
						FwPerformAction.funcBtnClick(FPSupplierOR.btnCopyBuyer);
						Thread.sleep(3000);
						}
						
						
						if (FwUtill.getxlsTestData("btnCopySupplier").equals("Y"))
						{
						
						FwPerformAction.funcBtnClick(FPSupplierOR.btnCopySupplier);
						Thread.sleep(3000);
						}
						
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDealOverview, "Deal Overview", "Deal Overview Page Displayed    ");
						Thread.sleep(3000);
						FwReport.logScreenshot("INFO", "Deal Overview page of FP");
						Thread.sleep(3000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.DDLDealType, FwUtill.getxlsTestData("DDLDealType"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textDealID, FwUtill.getxlsTestData("textDealID"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerName, FwUtill.getxlsTestData("textBuyerName"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textBIPPaymentEntityID, FwUtill.getxlsTestData("textBIPPaymentEntityID"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.lookupBuyer1);
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textSupplierName, FwUtill.getxlsTestData("textSupplierName"));
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textRemitEntityID, FwUtill.getxlsTestData("textRemitEntityID"));
						Thread.sleep(3000);
						
						if(!(FwUtill.getxlsTestData("textSE").isEmpty()))
						{
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textSE, FwUtill.getxlsTestData("textSE"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.lookupSupplier2);
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnNext);
						}	
						Thread.sleep(3000);										
						FwReport.logScreenshot("INFO", "Create Deal Overview Screen page of FP");
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnNext);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pagePricingOptions, "Pricing Options", "Pricing Options Page Displayed    ");
						Thread.sleep(3000);
						FwPerformAction.funcClick(FPSupplierOR.chcekboxSplit);
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textProcessingFeeSupplier, FwUtill.getxlsTestData("textProcessingFeeSupplier"));
						Thread.sleep(4000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textExceptionPricing, FwUtill.getxlsTestData("textExceptionPricing"));
						Thread.sleep(4000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textProcessingFeeBuyer, FwUtill.getxlsTestData("textProcessingFeeBuyer"));
						Thread.sleep(3000);
						
						if(!(FwPerformAction.funcGetText(FPSupplierOR.sectionHIROC).equals("HI ROC Pricing")))
						{
						
						if (FwUtill.getxlsTestData("HIROC").equals("Y"))
						{
							FwPerformAction.funcClick(FPSupplierOR.CheckboxHIROC1);
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold1, FwUtill.getxlsTestData("textThreshold1"));
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment1, FwUtill.getxlsTestData("textAdjustment1"));	
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold2, FwUtill.getxlsTestData("textThreshold2"));
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment2, FwUtill.getxlsTestData("textAdjustment2"));
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textThreshold3, FwUtill.getxlsTestData("textThreshold3"));
							Thread.sleep(4000);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textAdjustment3, FwUtill.getxlsTestData("textAdjustment3"));
							Thread.sleep(4000);
						}
						
						}
						
						
						//Supplier section fields
						if(!(FwPerformAction.funcGetText(FPSupplierOR.SectionBuyer).equals("Supplier")))
						{
						if (FwUtill.getxlsTestData("DSO").equals("Y"))
						{
							
							
							Thread.sleep(4000);
							 
							FwPerformAction.funcMoveToElement(FPSupplierOR.CheckboxDSO);
							//FwPerformAction.funcClick(FPSupplierOR.CheckboxDSO);
							Thread.sleep(4000);
							FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.SectionBuyer, "Buyer", "Buyer Section Displayed    ");
							
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textToDay1);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textToDay1, FwUtill.getxlsTestData("textToDay1"));
							Thread.sleep(6000);
							
							FwPerformAction.funcMoveToElement(FPSupplierOR.textFromday1);
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.ToDay2);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.ToDay2, FwUtill.getxlsTestData("ToDay2"));	
							Thread.sleep(6000);
							
							FwPerformAction.funcMoveToElement(FPSupplierOR.textReductionRate1);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textReductionRate1, FwUtill.getxlsTestData("textReductionRate1"));
							Thread.sleep(6000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.ToDay3);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.ToDay3, FwUtill.getxlsTestData("ToDay3"));
							Thread.sleep(6000);
							
							FwPerformAction.funcMoveToElement(FPSupplierOR.textReductionRate2);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textReductionRate2, FwUtill.getxlsTestData("textReductionRate2"));
							
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.ToDay4);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.ToDay4, FwUtill.getxlsTestData("ToDay4"));
							
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textReductionRate3);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textReductionRate3, FwUtill.getxlsTestData("textReductionRate3"));
							
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textReductionRate4);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textReductionRate4, FwUtill.getxlsTestData("textReductionRate4"));
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textBuyerAdjustment1);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerAdjustment1, FwUtill.getxlsTestData("textBuyerAdjustment1"));
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textBuyerAdjustment2);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerAdjustment2, FwUtill.getxlsTestData("textBuyerAdjustment2"));
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textBuyerAdjustment3);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerAdjustment3, FwUtill.getxlsTestData("textBuyerAdjustment3"));
							Thread.sleep(4000);
							FwPerformAction.funcMoveToElement(FPSupplierOR.textBuyerAdjustment4);
							FwPerformAction.funcEditSendKeys(FPSupplierOR.textBuyerAdjustment4, FwUtill.getxlsTestData("textBuyerAdjustment4"));
						}
						}					
						FwReport.logScreenshot("INFO", "Pricing Options Screen page of FP");
						Thread.sleep(4000);
						FwPerformAction.funcMoveToElement(FPSupplierOR.btnSave);
						Thread.sleep(4000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnSave);
						Thread.sleep(4000);
						
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDynamicSummary, "Dynamic Pricing Summary", "Dynamic Pricing Summary Page Displayed    ");
						Thread.sleep(4000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnBackHome);
						Thread.sleep(4000);
						FwReport.logScreenshot("INFO", "Home page of FP is displayed");
						
					}
					catch(Exception e)
					{
						FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
						throw e;
					}
				}
   

				// This test will approve Relationships
				
				public void funcApproveActivateRelatioship() throws InterruptedException, IOException, Exception
				{
					try 
					{
						Thread.sleep(3000);
						FwPerformAction.funcMoveToElement(FPSupplierOR.textID);
						Thread.sleep(3000);
						FwPerformAction.funcEditSendKeys(FPSupplierOR.textID, FwUtill.getxlsTestData("textID"));
						Thread.sleep(3000);
						
						FwPerformAction.funcMoveToElement(FPSupplierOR.textPricing);
						Thread.sleep(3000);
						FwPerformAction.funcSelectFromDropdown(FPSupplierOR.textPricing, FwUtill.getxlsTestData("textPricing"));
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnSearch);
						Thread.sleep(3000);			
												
						FwReport.logScreenshot("INFO", "Searched data displayed on the page");
						Thread.sleep(3000);	
						FwPerformAction.funcBtnClick(FPSupplierOR.linkViewEdit);
						Thread.sleep(3000);
						
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDealOverview, "Deal Overview", "Deal Overview Page Displayed    ");
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnNext1);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pagePricingOptionsActivate, "Pricing Options", "Pricing Options Page Displayed    ");
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnApprovePricing);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.tabCurrentPricing, "Current Pricing", "Current Pricing Page Displayed    ");
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnNext1);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.pageDynamicSummary, "Dynamic Pricing Summary", "Dynamic Pricing Summary Page Displayed    ");
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnActivate);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.popup2, "Confirmation !!!", "Confirmation pop is Displayed    ");
						Thread.sleep(3000);
						FwPerformAction.funcBtnClick(FPSupplierOR.btnConfirm1);
						Thread.sleep(3000);
						FwPerformAction.funcVerifyTextwithMsg(FPSupplierOR.tabPricingRelationship, "Pricing Relationship", "Home page is Displayed    ");
						
						
					}
					catch(Exception e)
					{
						FwReport.logScreenshot("FAIL", "UnSuccessful Login");	
						throw e;
					}
				}
				
				
				
				
}

