package com.ibm.automation;

import org.openqa.selenium.By;

public class FPSupplierOR {

	public By txtusername = By.id("textboxuid_AD");
	public By txtpassword = By.id("textboxpwd_AD");
	public By BtLogin = By.id("Login");
	public By pageHome = By.xpath("//*[@id='homeidlink']");
	public By btnCreate = By.xpath("//*[@id='mainDiv']/div/div/table/tbody/tr/td/input[1]");
	public By popupWindow1 = By.xpath("//*[@id='regionselect']/div[1]/table/tbody/tr[1]/td[1]");
	public By DDLRegion = By.xpath("//*[@id='supplierCountry1']");
	public By btnConfirm	=By.xpath("//*[@id='button2']");
	public By btnCancel = By.xpath("//*[@id='button1']");
	public By pageDealOverview = By.xpath("//*[@id='body_page']/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]");
	public By ddlProductType = By.xpath("//*[@id='productType']");
	public By DDLDealType = By.xpath("//*[@id='dealType']");
	public By textDealID = By.xpath("//*[@id='dealId']");
	public By textBuyerName	= By.xpath("//*[@id='buyerName']");
	public By textBIPPaymentEntityID = By.xpath("//*[@id='lookupValue']");
	public By textRemitEntityID  = By.xpath("//*[@id='supplierId']");
	public By textSupplierName = By.xpath("//*[@id='supplierName']");
	public By textSE	= By.xpath("//*[@id='seNumber']");
	public By lookupBuyer1 = By.xpath("//*[@id='searchBttn1']");
	public By lookupSupplier2 = By.xpath("//*[@id='searchBttn4']");
	public By btnCancel1	= By.name("action5");
	public By btnNext	=By.name("selectedButton");
	public By textExceptionPricing = By.xpath("//*[@id='exception']");
	public By pagePricingOptions = By.xpath("//*[@id='discountRateForm']/div[2]/table/tbody/tr[3]/td/h4");
	public By pagePricingOptionsActivate = By.xpath("//*[@id='discountRateForm']/div[2]/table/tbody/tr[4]/td/h4");
	public By RelationshipID = By.xpath("//*[@id='fpRelationshipId']");
	public By textProcessingFeeBuyer = By.xpath("//*[@id='buyerFee']");
	public By textProcessingFeeSupplier = By.xpath("//*[@id='merchantDiscountRate']");
	public By btnBack = By.xpath("//*[@id='back']");
	public By btnCancel2 = By.xpath("//*[@id='cancel']");
	public By btnSave = By.xpath("//*[@id='save']");
	
	public By popup1 = By.xpath("//*[@id='confirmPop']/table[1]/tbody/tr/td");
	public By btnYes = By.xpath("//*[@id='button1']");
	public By btnNo = By.xpath("//*[@id='button2']");
	public By chcekboxSplit = By.xpath("//*[@id='isSplitFunded']");
	
	
			
	
	
	
	// HIROC fields
	public By sectionHIROC = By.xpath("//*[@id='hiRocPricing']/table/tbody/tr[1]/td/h4");
	public By CheckboxHIROC1 = By.xpath("//*[@id='isHiROC']");
	public By textThreshold1 = By.xpath("//*[@id='hiRoc1Threshold']");
	public By textAdjustment1 = By.xpath("//*[@id='hiRoc1Reduction']");
	public By textThreshold2 = By.xpath("//*[@id='hiRoc2Threshold']");
	public By textAdjustment2 = By.xpath("//*[@id='hiRoc2Reduction']");
	public By textThreshold3 = By.xpath("//*[@id='hiRoc3Threshold']");
	public By textAdjustment3 = By.xpath("//*[@id='hiRoc3Reduction']");
	
	//DSO Supplier fields
	
	public By SectionSupplier = By.xpath("//*[@id='rateScheduleMerchant']/table/tbody/tr/td[1]/table/tbody/tr[1]/th/h2");
	public By CheckboxDSO = By.xpath("//*[@id='isDsoDpo']");
	public By IDDSO  =  By.name("isDsoDpo");
	public By textToDay1 = By.xpath("//*[@id='dsoDelayTo1']");
	public By textFromday1  = By.xpath("//*[@id='dsoDelayFrom2']");
	public By ToDay2 = By.xpath("//*[@id='dsoDelayTo2']");
	public By textReductionRate1 = By.xpath("//*[@id='reductionInDiscountRate1']");
	public By ToDay3 = By.xpath("//*[@id='dsoDelayTo3']");
	public By textReductionRate2 = By.xpath("//*[@id='reductionInDiscountRate2']");
	public By ToDay4 = By.xpath("//*[@id='dsoDelayTo4']");
	public By textReductionRate3 = By.xpath("//*[@id='reductionInDiscountRate3']");
	public By textReductionRate4 = By.xpath("//*[@id='reductionInDiscountRate4']");
	
//DSo Buyer Fields
	
	public By SectionBuyer = By.xpath("//*[@id='rateScheduleBuyer']/table/tbody/tr/td[1]/table/tbody/tr[1]/th/h2");
	public By textBuyerAdjustment1 = By.xpath("//*[@id='buyerFee1']");
	public By textBuyerAdjustment2 = By.xpath("//*[@id='buyerFee2']");
	public By textBuyerAdjustment3 = By.xpath("//*[@id='buyerFee3']");
	public By textBuyerAdjustment4 = By.xpath("//*[@id='buyerFee4']");
	
	
	
	// for Summary Page
	
	public By pageDynamicSummary  = By.xpath("//*[@id='adminHeaderWidth']/div[1]/table/tbody/tr/td[1]/h4");
	public By btnBackHome =  By.xpath("//*[@id='buttonacthome']");
	public By btnBack2 =  By.xpath("//*[@id='buttactback']");
	
	
	// for closing
	public By btnLogout = By.xpath("//*[@id='body_page']/div[1]/div/table/tbody/tr[2]/td[4]/a");
	
	
	//copy buyer
	
	public By textID = By.xpath("//*[@id='fpRelationshipId']");
	public By btnSearch = By.xpath("//*[@id='searchBtnID']");
	public By CheckBox1 = By.xpath("//*[@id='checkbox0']");
	public By btnCopyBuyer = By.xpath("//*[@id='copyBuyer']");
	public By btnCopySupplier = By.xpath("//*[@id='copySupplier']");
	public By textBuyerID = By.xpath("//*[@id='buyerId']");
	
	//Approve and Activate 
	 
	public By textPricing = By.xpath("//*[@id='pendingPricingOption']");
	public By linkViewEdit = By.xpath("//*[@id='linkAction4']");
	public By btnNext1 	= By.xpath("//*[@id='next >']");
	public By btnBack1 = By.xpath("//*[@id='< back']");
	public By btnEdit = By.xpath("//*[@id='edit']");
	public By btnApprovePricing = By.xpath("//*[@id='approvePending']");
	public By tabCurrentPricing = By.xpath("//*[@id='body_page']/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]");
	public By btnActivate = By.xpath("//*[@id='buttonactact']");
	public By popup2 = By.xpath("//*[@id='uniquename3']/table/tbody/tr[1]/td");
	public By btnCancel3 = By.xpath("//*[@id='uniquename3']/table/tbody/tr[4]/td/input[1]");
	public By btnConfirm1 = By.xpath("//*[@id='confirmID']");
	public By tabPricingRelationship = By.xpath("//*[@id='tdID1']/span");
	
	
	// error message
	
	public By messageNoText = By.xpath("//*[@id='dataTabHeaderDivId']/div[8]/text()");
	
	public By messageCopybuyer= By.xpath("//*[@id='copyErr']/font");
	
	public By message = By.className("warn");
	

	
	
	
	
	
	
	

	
	
	
	
			
	
	
	
}
