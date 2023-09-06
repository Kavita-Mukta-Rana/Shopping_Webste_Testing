package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Broswersetup.Readconfig101;

public class LoginPage extends Readconfig101 {
	
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
	
//	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
//	WebElement e;
	 public LoginPage()
	  {
		    PageFactory.initElements(driver, this);
	  }
	 
	 public String tritle()
	 {
		 return driver.getTitle();
	 }

	public void logindetails(String email,String passwwrd)
	{
		clicksignup.click();
		Email.sendKeys(email);
		password.sendKeys(passwwrd);
		signup.click();

	
	
	}
	
	public void invalidlogindetails(String email,String passwwrd)
	{
		clicksignup.click();
		Email.sendKeys(email);
		password.sendKeys(passwwrd);
		signup.click();

	
	
	}

}
