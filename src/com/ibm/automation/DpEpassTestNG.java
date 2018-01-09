package com.ibm.automation;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class DpEpassTestNG extends AppBaseClass
{
FwReport FwReport = new FwReport();
	
	String TestdataSuiteFile;	
	
	@BeforeSuite
	public void beforeSuit() throws Exception
	{
		System.out.println("beforeSuit_Start");		
		String[] Suitename = this.getClass().getName().split("\\.");		
		TestdataSuiteFile = FwUtill.getXLSTestData("FilePath", Suitename[Suitename.length-1], ".//TestData//AutomationSuite.xlsx");
		//System.out.println("bxjwq"+TestdataSuiteFile);
		//FwGlobalVariables.exReport= new ExtentReports(".//ExtentReports//"+Suitename[Suitename.length-1]+"_"+FwUtill.getTimeStamp()+".html");
		FwGlobalVariables.ExtentReportFile = Suitename[Suitename.length-1]+"_"+FwUtill.getTimeStamp()+".html";
		//FwGlobalVariables.exReport= new ExtentReports(Suitename[Suitename.length-1]+"_"+FwUtill.getTimeStamp()+".html");
		FwGlobalVariables.exReport= new ExtentReports(FwGlobalVariables.ExtentReportFile);
		FwGlobalVariables.exReport.loadConfig(new File(".\\ExtentReports\\extent-config.xml"));
		System.out.println("beforeSuit_End");
	}
	
	//*****************************US scenarios start**********************************/
	
	/*This test case will create FP relationship Buyer  for US market*/
	@Test(priority=0)
	public void TC_001_FPCreateRelatioshipBuyerFunded_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipBuyerFunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship buyer funded and HIROC for US*/
	@Test(priority=1)
	public void TC_002_FPCreateRelatioshipBuyerFundedHIROC_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipBuyerFunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	/*This test case will create FP relationship Split Rate */
	@Test(priority=2)
	public void TC_003_FPCreateRelatioshipSplitRate_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
					
		}		
		testEnd();	
	}
	/*This test case will create FP relationship Split Rate with HIROC  US*/
	@Test(priority=3)
	public void TC_004_FPCreateRelatioshipSplitRateWithHIROC_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship Split Rate with DSO US*/
	@Test(priority=4)
	public void TC_005_FPCreateRelatioshipSplitRateWithDSO_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship Split Rate with DSO and HIROC US */
	@Test(priority=5)
	public void TC_006_FPCreateRelatioshipSplitRateWithDSOHIROC_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
		
	/*This test case will create FP relationship Dynamic (DSO/DPO) */
	@Test(priority=6)
	public void TC_007_FPCreateRelatioshipDSO_DPO_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship For BIP_FX*/
	@Test(priority=7)
	public void TC_008_FPCreateRelatioshipProductBIPFX_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipProductBIPFX();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	/*This test case will create FP relationship using CopyBuyer for Buyer funder */
	@Test(priority=8)
	public void TC_009_FPCreateRelatioshipCopybuyerFunded_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipCopyBuyerBuyerfunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	/*This test case will create FP relationship using CopyBuyer for Buyer funder HIROC */
	@Test(priority=9)
	public void TC_010_FPCreateRelatioshipCopybuyerFundedHIROC_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipCopyBuyerBuyerfunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	/*This test case will create FP relationship using CopyBuyer for SplitRate  */
	@Test(priority=10)
	public void TC_011_FPCreateRelatioshipCopySplitRate_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRateCopybuyer();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship using CopyBuyer for SplitRate with HIROC */
	@Test(priority=11)
	public void TC_012_FPCreateRelatioshipCopySplitRateHIROC_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRateCopybuyer();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	/*This test case will create FP relationship using CopyBuyer for SplitRate withDSO */
	@Test(priority=12)
	public void TC_013_FPCreateRelatioshipCopySplitRateDSO_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRateCopybuyer();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	/*This test case will create FP relationship using CopyBuyer for SplitRate with HIROC and DSO */
	@Test(priority=13)
	public void TC_014_FPCreateRelatioshipCopySplitRateHIROCDSO_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRateCopybuyer();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	/*This test case will create FP relationship using Copy supplier for Buyer funded */
	@Test(priority=14)
	public void TC_015_FPCreateRelatioshipCopySupplierBuyerFunded_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipCopyBuyerBuyerfunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	/*This test case will create FP relationship using Copy supplier for Buyer funded HIROC*/
	@Test(priority=15)
	public void TC_016_FPCreateRelatioshipCopySupplierBuyerFundedHIROC_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipCopyBuyerBuyerfunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship using Copy supplier for SplitRate  */
	@Test(priority=16)
	public void TC_017_FPCreateRelatioshipCopySupplierSplitRate_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRateCopybuyer();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship using Copy supplier for SplitRate with HIROC  */
	@Test(priority=17)
	public void TC_018_FPCreateRelatioshipCopySupplierSplitRateHROC_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRateCopybuyer();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship using Copy supplier for SplitRate with DSO */
	@Test(priority=18)
	public void TC_019_FPCreateRelatioshipCopySupplierSplitRateDSO_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRateCopybuyer();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship using Copy supplier for SplitRate with DSO and HIROC */
	@Test(priority=19)
	public void TC_020_FPCreateRelatioshipCopySupplierSplitRateDSOHROC_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRateCopybuyer();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	/*This test case will Approve FP relationship  */
	@Test(priority=20)
	public void TC_021_FPApproveandActivateCreateRelatioship_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcApproveActivateRelatioship();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create relationship using copy buyer option DSO/dPO deal type  */
	@Test(priority=21)
	public void TC_022_FPCreateRelatioshipCopyBuyerDSODealType_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRateCopybuyer();
			FPSupplierLib.funcApproveActivateRelatioship();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create relationship using copy supplier option DSO/dPO deal type  */
	@Test(priority=22)
	public void TC_023_FPCreateRelatioshipCopySupplierDSODealType_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRateCopybuyer();
			FPSupplierLib.funcApproveActivateRelatioship();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	/*This test case will approve and activate relationship  */
	@Test(priority=23)
	public void TC_024_FPApproveRelationship_US() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcApproveActivateRelatioship();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	 
	
	//*****************************************US Scenarios END*************************************
	
	//*****************************************CAN Scenarios start**********************************
	
	/*This test case will create FP relationship Buyer funder for Canada market*/
	@Test(priority=21)
	public void TC_032_FPCreateRelatioshipBuyerFunded_CAN() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipBuyerFunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	/*This test case will create FP relationship buyer funded and HIROC for Canada*/
	@Test(priority=22)
	public void TC_033_FPCreateRelatioshipBuyerFundedHIROC_CAN() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipBuyerFunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	

	/*This test case will create FP relationship Split Rate for Canada market*/
	@Test(priority=23)
	public void TC_034_FPCreateRelatioshipSplitRate_CAN() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
					
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship Split Rate with HIROC  Canada market*/
	@Test(priority=24)
	public void TC_035_FPCreateRelatioshipSplitRateWithHIROC_CAN() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship Split Rate with DSO CAN  Invalid scenario*/
	@Test(priority=25)
	public void TC_036_FPCreateRelatioshipSplitRateWithDSO_CAN() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship Split Rate with DSO and HIROC CAN  Invalid scenario*/
	@Test(priority=26)
	public void TC_037_FPCreateRelatioshipSplitRateWithDSOHIROC_CAN() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	
	/*This test case will create FP relationship Dynamic (DSO/DPO) */
	@Test(priority=31)
	public void TC_038_FPCreateRelatioshipDSO_DPO_CAN() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipBuyerFunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	
	/*This test case will create FP relationship Dynamic (DSO/DPO) */
	@Test(priority=32)
	public void TC_039_FPCreateRelatioshipDSO_DPO_Split_CAN() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	
	//*************************************CAN scenarios END************************************/
	
	//*************************************EMEA scenarios END************************************/
	
	/*This test case will create FP relationship Buyer funder for EMEA market*/
	@Test(priority=27)
	public void TC_040_FPCreateRelatioshipReverseVertical_EMEA() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipBuyerFunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship Reverse vertical Split funded for EMEA*/
	@Test(priority=28)
	public void TC_041_FPCreateRelatioshipBuyerFundedHIROC_EMEA() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipBuyerFunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	}
	/*This test case will create FP relationship Reverse vertical Split Rate for EMEA market*/
	@Test(priority=29)
	public void TC_042_FPCreateRelatioshipReverse_SplitFunded_EMEA() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
					
		}		
		testEnd();	
	}
	
	/*This test case will create FP relationship Reverse vertical split funded with HIROC  EMEA market*/
	@Test(priority=30)
	public void  TC_043_FPCreateRelatioshipSplitRateWithHIROC_EMEA() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	
		
	}
	
	
	/*This test case will create FP relationship Vertical Deal type for Buyer funded EMEA market*/
	@Test(priority=30)
	public void TC_044_FPCreateRelatioshipVerticalBuyerFunded_EMEA() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipBuyerFunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	
		
	}
	
	/*This test case will create FP relationship Vertical Deal type for Buyer funded EMEA market*/
	@Test(priority=30)
	public void TC_045_FPCreateRelatioshipVerticalBuyerFundedHIROC_EMEA() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipBuyerFunded();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	
		
	}
	
	/*This test case will create FP relationship Vertical Deal type for Split funded EMEA market*/
	@Test(priority=30)
	public void TC_046_FPCreateRelatioshipVerticalSplitFunded_EMEA() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	
		
	}
	
	/*This test case will create FP relationship Vertical Deal type for Split funded HIROC EMEA market*/
	@Test(priority=31)
	public void TC_047_FPCreateRelatioshipVerticalSplitFundedHIROC_EMEA() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N"))
		{
			FPSupplierLib.funcExpOpenURL();        
			FPSupplierLib.funcFPAdminLogin();
			FPSupplierLib.funcFPCreateRelatioshipSplitRate();
			FPSupplierLib.funcCloseDP();
			FPSupplierLib.funcCloseBrowser();
			
		}		
		testEnd();	
	
		
	}
	
	
	
	
	//*************************************EMEA scenarios END**************************************/
	
	//**************************************Negative Scenarios start*******************************/s
	
	
	 
	@AfterSuite
	public void afterSuite()
	{
		FwGlobalVariables.exReport.flush();	
		//FwUtill.openBrowserURL("CH","C:\\Selenium\\TestNGFW\\workspace\\BIPnPE\\"+FwGlobalVariables.ExtentReportFile);
		
	}
}
