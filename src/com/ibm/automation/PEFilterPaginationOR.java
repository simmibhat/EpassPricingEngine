package com.ibm.automation;

import org.openqa.selenium.By;

public class PEFilterPaginationOR 
{
		
		// PE Login		
	
	public By txtUserName = By.id("textboxuid_AD");

    public By txtPassword = By.id("textboxpwd_AD");

    public By BtnLogin = By.id("Login");
    
       // Filters
    
    public By TxtBuyerName = By.id("buyerName");	
    
    public By TxtSupplierName = By.id("supplierName");
    
    public By DdlFpRelationshipStatus = By.id("fpRelationshipStatus");
    
    public By TxtBuyerId = By.id("buyerId");
    
    public By TxtSeNumber = By.id("seNumber");
    
    public By TxtFpRelationshipId = By.id("fpRelationshipId");
    
    public By DdlBuyerCountry = By.id("buyerCountry1");
    
    public By DdlSupplierCountry = By.id("suppCountry1");
    
    public By DdlPendingPricingOption = By.id("pendingPricingOption");
    
    public By BtnSearch = By.id("searchBtnID");
    
    
    //Pagination
    
    public By BtnBackArrow1 = By.xpath("//div[@id='dataTabHeaderDivId']/div[8]/table/tbody/tr/td[3]/table/tbody/tr/td[3]/table/tbody/tr/td/a/img");
    
    public By BtnBackArrow2 = By.xpath("//div[@id='dataTabHeaderDivId']/div[8]/table/tbody/tr/td[3]/table/tbody/tr/td[3]/table/tbody/tr/td[2]/a/img");
    
    public By TxtCurrentPage = By.xpath(".//*[@id='currentPage']");
        
    public By BtnFwrdArrow1 = By.xpath("//div[@id='dataTabHeaderDivId']/div[8]/table/tbody/tr/td[3]/table/tbody/tr/td[3]/table/tbody/tr/td[5]/a/img");
    
    public By BtnFwrdArrow2 = By.xpath("//div[@id='dataTabHeaderDivId']/div[8]/table/tbody/tr/td[3]/table/tbody/tr/td[3]/table/tbody/tr/td[6]/a/img");
    
    
    
}
