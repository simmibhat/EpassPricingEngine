package com.ibm.automation;


import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
public class AppTestNGTests extends AppBaseClass{
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
		System.out.println("beforeSuit_End");
	}
	@Test
	public void DemoTest1() throws InterruptedException, IOException, Exception{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N")){
			DemoLib.funcDemoOpenURL();
			DemoLib.funcDemoLogin();
			//DemoLib.funcDemoAddSupplier();
		}		
		testEnd();	
	}
	
	@Test
	public void bipTest1() throws InterruptedException, IOException, Exception{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N")){	
			AppBIPLib.funcBIPOpenURL();
			AppBIPLib.funcBIPLogin();
			AppBIPLib.funcBIPAddSupplier();
		}
		testEnd();
		
	}
	@Test
	public void sampleTest1() throws InterruptedException, IOException, Exception{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N")){
			AppSampleLib1.funcClearTripSearchFlight();
		}		
		testEnd();	
	}
	@Test
	public void sampleTest2() throws InterruptedException, IOException, Exception{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N")){
			FwReport.log("INFO", "Start Second Test Step Firsst", "Test2 Started");
			FwReport.log("PASS", "Start Second Test Step 2", "Test2 running");
			AppSampleLib1.funcClearTripSearchFlight();
		}
		testEnd();		
	}
	
	@Test
	public void sampleTest3() throws InterruptedException, IOException, Exception{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N")){
			AppSampleLib1.funcPEOpenURL();
			AppSampleLib1.funcPELogin();
			AppSampleLib1.funcPELogout();
		}
		testEnd();
		
	}
	@Test
	public void sampleTest4() throws InterruptedException, IOException, Exception{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N")){	
			AppSampleLib1.funcPEOpenURL();
			AppSampleLib1.funcPELogin();
		}
		testEnd();
		
	}
	@Test
	public void sampleTest5() throws InterruptedException, IOException, Exception
	{
		testStart(TestdataSuiteFile);
		System.out.println(FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag"));
		if (!FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N")){			
			AppSampleLib1.funcPEOpenURL();
			AppSampleLib1.funcPELogout();
		}
		testEnd();
		
	}
	@AfterSuite
	public void afterSuite(){
		FwGlobalVariables.exReport.flush();	
		//FwUtill.openBrowserURL("CH","C:\\Selenium\\TestNGFW\\workspace\\BIPnPE\\"+FwGlobalVariables.ExtentReportFile);
		
	}
	
	
	
}
