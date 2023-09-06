package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Broswersetup.Readconfig101;

public class HomePage extends Readconfig101 {
	
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	WebElement signup;
	
	@FindBy(id = "firstname")
	WebElement FirstName;
	
	@FindBy(id = "lastname")
	WebElement LastName;
	
	@FindBy(id = "email_address")
	WebElement Email_Address;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id = "password-confirmation")
	WebElement Password_confirmation;
	
	@FindBy(xpath ="//*[@id=\"form-validate\"]/div/div[1]/button/span")
	WebElement submit;

  public HomePage()
  {
	    PageFactory.initElements(driver, this);
	    
  }
  
  public void clicksignup(String firstname,String lastname,String email,String password,String reenter)
  {
	
	  signup.click();
	  FirstName.sendKeys(firstname);
	  LastName.sendKeys(lastname);
	  Email_Address.sendKeys(email);
	  Password.sendKeys(password);
	  Password_confirmation.sendKeys(password);
         submit.click();	  
  }
}
