package Testcases;



import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Broswersetup.Readconfig101;
import Pages.AdressDetailcheck;
import Pages.CheckFeatures1;
import Pages.HomePage;
import Pages.Links;
import Pages.LoginPage;
import Pages.MousehoverPAge;
import Pages.Password_change;
import Pages.RatingCheck;
import Pages.ScrollingPages;
import Pages.SearchBoxPage;
import Pages.WhatNewsSSPAge;



public class TC02 extends Readconfig101 {
	private static WebDriver driver;
	
	Readconfig101 rc;
	HomePage hp;
	LoginPage lp;
	MousehoverPAge mhp;
	Links links;
	ScrollingPages scrllpage;
	CheckFeatures1 cf1;
	SearchBoxPage sbp;
	WhatNewsSSPAge wnsa;
	Password_change passchange;
	AdressDetailcheck adc;
	RatingCheck rc2;
	public TC02()
	{
		super();
	}
	
	
	
	@BeforeMethod
	@Parameters("browser")
	public void beforemethod()
	{
		
		initialization();

		hp=new HomePage();
        lp=new LoginPage();
        mhp=new MousehoverPAge();
        links=new Links();
        scrllpage=new ScrollingPages();
        cf1=new CheckFeatures1();
        sbp=new SearchBoxPage();
        wnsa=new WhatNewsSSPAge();
        passchange=new Password_change();
        adc=new AdressDetailcheck();
        rc2=new RatingCheck();
		
	}
	
	

	//==========================================================
	@Test(priority = 0,testName = "verifyTitle")
public void verifyTitle() 
{
		SoftAssert softAssert = new SoftAssert();
		String expectedTitle = "Home Page";

	
	  
        
	if ((lp.tritle()).equalsIgnoreCase(expectedTitle)) {
        System.out.println("Title Matched");
        System.out.println("verify title passed");
    } else {
        System.out.println("Not a match");
 
    }
}
//	

//==========================================================
	@Test(priority = 1,testName = "verifyvaliduser")
	public void verifyvaliduser()
	{

		lp.logindetails(prop.getProperty("email"),prop.getProperty("password"));
		
		System.out.println("valid login user passed");
		
	}
	

//==========================================================	
	@Test(priority = 2,testName = "verifyInvaliduser")
	public void verifyInvaliduser()
	{

		lp.logindetails(prop.getProperty("invaliuser"),prop.getProperty("invalidpassword"));
		
		System.out.println("invalid login user passed");
		
	}

//==========================================================
	
	@Test(priority = 3 ,testName = "verifymouseHover")
	public void  verifymouseHover()
	{
		SoftAssert soft=new SoftAssert();
		mhp.mouseHovercheck();
		
		soft.assertAll();
	}
//
//	
//==========================================================
	
	@Test(priority = 4,testName = "verify_all_Links_available")
	public void verify_all_Links_available()
	{
		links.all_Links_available();
	}
//	
	
//==========================================================
	
@Test(priority = 5,testName = "Scrolling_All_Pages")
public void Scrolling_All_Pages() throws InterruptedException
{
	scrllpage.Scrolling_All_Pages();
}

	//==========================================================
//	
	@Test(priority = 6,testName = "verify_featurecheck")
	public void verify_featurecheck() throws InterruptedException
	{
		cf1.featurecheck();
	}


	//==========================================================	
	
	@Test(priority = 7,testName = "verify_searchBox")
	public void verify_searchBox() throws InterruptedException
	{
		sbp.searchBox();
	}
//	
//==========================================================	
	
	@Test(priority = 8,testName = "verify_ss_of_Page")
	public void verify_ss_of_Page() throws IOException, InterruptedException
	{
		wnsa.ss_of_Page();
	}
//	
//==========================================================	
@Test(priority =9,testName = "verify_password_Change")
public void verify_password_Change() throws InterruptedException
{
	passchange.password_Change(prop.getProperty("email"),prop.getProperty("password"));
	passchange.again_change_password(prop.getProperty("email"),prop.getProperty("new_password"));
	
}
	
	@Test(priority = 10,testName = "verify_rating_check")
	public void verify_rating_check() throws InterruptedException
{
		rc2.ratecheck(prop.getProperty("email"),prop.getProperty("password"),prop.getProperty("summary"));
		
}
	
	
	
//	================================================================
    @Test(priority =11,testName = "verify_adressdetails")
   
	public void verify_adressdetails() throws InterruptedException
	{
    	 
		adc.adressdetails(prop.getProperty("email"),prop.getProperty("password"),prop.getProperty("company_name"),prop.getProperty("mobile"),prop.getProperty("street"),prop.getProperty("city"),prop.getProperty("region"),prop.getProperty("zip"),prop.getProperty("country"));

	}
//	
//	================================================================
//	

	
	
//	@AfterTest
//	public void aftermethod()
//	{
//		
//		driver.quit();
//	}
	

}

