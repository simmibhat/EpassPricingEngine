package com.ibm.automation;


public class AppBaseClass {
	
	AppSampleLib1 AppSampleLib1= new AppSampleLib1();
	AppBIPLib AppBIPLib = new AppBIPLib();
	DemoLib DemoLib = new DemoLib();
	FwReport FwReport = new FwReport();
	FPSupplierLib FPSupplierLib = new FPSupplierLib();
	//FPNegativeLib FPNegativeLib = new FPNegativeLib();
	
	public void testStart(){
		System.out.println(FwUtill.currentTestName());
		//FwGlobalVariables.tcTestdataTable = FwUtill.loadTestData(FwUtill.currentTestName(), ".//TestData//test.xlsx");
		FwReport.startTestReporting();
		if (FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N")){
			FwReport.log("SKIP", "Test Skip", "Test is not marked for run");
		}
	}
	public void testStart(String FilePath) throws Exception{
		System.out.println(FwUtill.currentTestName());
		FwGlobalVariables.tcTestdataTable = FwUtill.loadTestData(FwUtill.currentTestName(),".//TestData//"+ FilePath);
		FwReport.startTestReporting();
		if (FwUtill.getTestData(FwUtill.currentTestName(), "RunFlag").equalsIgnoreCase("N")){
			FwReport.log("SKIP", "Test Skip", "Test is not marked for run");
		}
	}
	public void testEnd(){
		FwReport.endTestReporting();
		//FwGlobalVariables.tcTestdataTable.remove(FwUtill.currentTestName());
	}
}
