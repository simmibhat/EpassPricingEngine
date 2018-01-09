package com.ibm.automation;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class FwGlobalVariables {
	public static Hashtable<String,Hashtable<String, String>> tcTestdataTable;
	public static Hashtable <String,WebDriver> driverHash = new Hashtable <String,WebDriver>();
	public static ExtentReports exReport;
	public static String ExtentReportFile;
	public static Hashtable <String,ExtentTest> extentTestHash = new Hashtable <String,ExtentTest>();
	//public static WebDriver browserDriver;	
}
