package com.ibm.automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FwReport extends FwGlobalVariables{
	public  void startTestReporting (){
		ExtentTest thisTest= 	exReport.startTest(FwUtill.currentTestName());
		extentTestHash.put(FwUtill.currentTestName(), thisTest);
	}
	public  void endTestReporting(){
		exReport.endTest(getTestExtent());
	}
	public static ExtentTest getTestExtent(){
			return extentTestHash.get(FwUtill.currentTestName());
	}
	public void log(String status,String stepName, String messege){
		if(status.equalsIgnoreCase("INFO")){
			getTestExtent().log(LogStatus.INFO, stepName, messege);
		}
		else if(status.equalsIgnoreCase("PASS")){
			getTestExtent().log(LogStatus.PASS, stepName, messege);
		}
		else if(status.equalsIgnoreCase("FAIL")){
			getTestExtent().log(LogStatus.FAIL, stepName, messege);
		}
		else if(status.equalsIgnoreCase("WARNING")){
			getTestExtent().log(LogStatus.WARNING, stepName, messege);
		}
		else if(status.equalsIgnoreCase("SKIP")){
			getTestExtent().log(LogStatus.SKIP, stepName, messege);
		}
	}
	public void  logScreenshot(String status,String stepName) throws IOException{
		try {
			TakesScreenshot ts =(TakesScreenshot)FwUtill.currentWebDriver();
			File srcFile =ts.getScreenshotAs(OutputType.FILE);
		//	String imageUrl = "./Screenshot/"+FwUtill.getTimeStamp()+"_"+FwUtill.currentTestName()+".png";
			String imageUrl = "./Screenshot/"+FwUtill.getTimeStamp()+"_"+FwUtill.currentTestName()+".png";
			File destFile = new File(imageUrl);	
			System.out.println(destFile.getAbsolutePath());
			FileUtils.copyFile(srcFile, destFile);
			
			System.out.println("destFile="+destFile);
			String image = getTestExtent().addScreenCapture(imageUrl);
			System.out.println("image="+image);
			if(status.equalsIgnoreCase("INFO")){
				getTestExtent().log(LogStatus.INFO, stepName, image);
			}
			else if(status.equalsIgnoreCase("PASS")){
				getTestExtent().log(LogStatus.PASS, stepName, image);
			}
			else if(status.equalsIgnoreCase("FAIL")){
				getTestExtent().log(LogStatus.FAIL, stepName, image);
			}
			else if(status.equalsIgnoreCase("WARNING")){
				getTestExtent().log(LogStatus.WARNING, stepName, image);
			}
			
		} catch (IOException e) {
			throw e;
		}
		
	}

}
