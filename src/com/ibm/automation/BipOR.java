package com.ibm.automation;

import org.openqa.selenium.By;

public class BipOR {
	//Login Page
	public By loginEditUID = By.name("userID");
	public By loginEditPWD = By.id("password");
	public By loginBTNLoogin = By.xpath("//input[@value='Log In']");
	
	//Home page
	
	public By homeLogOut = By.id("nl_utility_login");
	public By homeLinkSupplier = By.id("supplierLink");
	
	//Supplier
	public By supplierButtonAddSingleSuplier = By.xpath(".//*[@id='upload']/table/tbody/tr[2]/td[3]/input");
	
	
	//Add Single Supplier 
	
	public By addSupplierHeadingText = By.xpath(".//*[@id='mainBody']/div[1]");
	public By addSupplierEditSupName = By.id("supplierName");
	public By addSupplierEditSupID = By.id("supplierID");
	public By addSupplierSelectCountry = By.id("country");
	public By addSupplierEditAddress1 = By.id("addressLine1");
	public By addSupplierEditCity = By.id("city");
	public By addSupplierEditZip = By.id("zipCode");
	public By addSupplierEditAnnualSpend = By.id("annualSpend");
	public By addSupplierBtnAddSupplier = By.xpath(".//*[@id='buttondiv']/table/tbody/tr/td[1]/input[4]");
	
	//Confirmation page
	public By confirmSupplierInfoHeadingText = By.xpath(".//*[@id='mainBody']/div[1]");
	
	public By confirmSupplierInfoBtnConfirm = By.xpath(".//*[@id='buttondiv']/table/tbody/tr/td[1]/input[2]");
	
	
	
	
	
	
	
	
	
}
