package com.ibm.automation;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class FPSupplierTestNGtest extends AppBaseClass{
	
	FwReport FwReport = new FwReport();
	String TestdataSuiteFile;	
	
	@BeforeSuite
	public void beforeSuit() throws Exception{
		System.out.println("beforeSuit_Start");	
		String[] Suitename = this.getClass().getName().split("\\.");
		
		TestdataSuiteFile = FwUtill.getXLSTestData("FilePath", Suitename[Suitename.length-1], ".//TestData//AutomationSuite.xlsx");		
			
		//FwGlobalVariables.exReport= new ExtentReports(".//ExtentReports//"+Suitename[Suitename.length-1]+"_"+FwUtill.getTimeStamp()+".html");
		FwGlobalVariables.ExtentReportFile = Suitename[Suitename.length-1]+"_"+FwUtill.getTimeStamp()+".html";
			
		//FwGlobalVariables.exReport= new ExtentReports(Suitename[Suitename.length-1]+"_"+FwUtill.getTimeStamp()+".html");
		FwGlobalVariables.exReport= new ExtentReports(FwGlobalVariables.ExtentReportFile);
		
		FwGlobalVariables.exReport.loadConfig(new File(".\\ExtentReports\\extent-config.xml"));
		
	}
	@Test
	public void TC01_CreateRelationship()	 throws InterruptedException, IOException, Exception{
		System.out.println("1");
		testStart(TestdataSuiteFile);
		System.out.println("2");
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N")){
			System.out.println("3");
			FPSupplierLib.funcExpOpenURL();
			FPSupplierLib.funcFPAdminLogin();
			//SupplierEnrollLib.funcExpressBuyerRegisterSupplier();					
		}
		testEnd();
	}

}
