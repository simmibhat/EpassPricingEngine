package com.ibm.automation;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FwCommonLib extends FwGlobalVariables{
		public void openBrowserURL(String browserName ,String url){
			if (browserName.equalsIgnoreCase("FF")){
				ProfilesIni profile = new ProfilesIni(); 
                FirefoxProfile ffprofile = profile.getProfile("default");                       
                WebDriver tempBrowserDriver = new FirefoxDriver(ffprofile);
				tempBrowserDriver.manage().window().maximize();
				tempBrowserDriver.get(url);
				driverHash.put(FwUtill.currentTestName(), tempBrowserDriver);
			}
			else if(browserName.equalsIgnoreCase("CH"))
            {
                System.setProperty("webdriver.chrome.driver", "C:\\Env\\chromedriver.exe");
                WebDriver tempBrowserDriver = new ChromeDriver();
                tempBrowserDriver.manage().window().maximize();
                tempBrowserDriver.get(url);
                driverHash.put(FwUtill.currentTestName(), tempBrowserDriver);
                }
	}

	

}
