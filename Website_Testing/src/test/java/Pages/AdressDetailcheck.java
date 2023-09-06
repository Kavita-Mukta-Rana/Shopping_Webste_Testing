package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Broswersetup.Readconfig101;

public class AdressDetailcheck extends Readconfig101 {
	@FindBy(xpath ="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement clicksignup;
	
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement login;
	
	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy(id = "send2")
	WebElement signup;
	
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	WebElement drop;
	
	@FindBy(linkText = "My Account")
	WebElement account;
	
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[1]/a")
	WebElement clickaddress;
	
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[5]/div[1]/button")
	WebElement add_address;
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	@FindBy(id = "country")
	WebElement country;
	@FindBy(id = "company")
	WebElement company;
	@FindBy(id = "telephone")
	WebElement mobile;
	@FindBy(id = "street_1")
	WebElement street1;
	@FindBy(id = "zip")
	WebElement zip;
	@FindBy(id = "primary_billing")
	WebElement primarybilling;
	@FindBy(id = "primary_shipping")
	WebElement primary_shipping;
	@FindBy(xpath = "//button[@title='Save Address']")
	WebElement save_address;
	@FindBy(id = "region_ids")
	WebElement region;
	
//	
	public AdressDetailcheck()
	{
		 PageFactory.initElements(driver, this);
	}
	
	public void adressdetails(String email,String passwwrd,String companyname,String monileno,String street,String citys,String regions,String zips,String countrys) throws InterruptedException
	{
		clicksignup.click();
		Email.sendKeys(email);
		password.sendKeys(passwwrd);
		signup.click();
		drop.click();
		Thread.sleep(7000);
		account.click();
		clickaddress.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0,350)", "");
		add_address.click();
		company.sendKeys(companyname);
		
		mobile.sendKeys(monileno);
		street1.sendKeys(street);
		city.sendKeys(citys);
//		 Select select=new Select(region);
//		
//		   select.selectByVisibleText(regions);
		region.sendKeys(regions);
		  zip.sendKeys(zips);
//		  Select select1=new Select(country);
//		  
//			
//		   select1.selectByVisibleText(countrys);
		  country.sendKeys(countrys);
		   primary_shipping.click();
		   primarybilling.click();
		  save_address.click();
		
	}

}
