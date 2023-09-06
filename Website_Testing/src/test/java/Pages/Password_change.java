package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Broswersetup.Readconfig101;

public class Password_change extends Readconfig101 {
	
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
	@FindBy(linkText = "Change Password")
	WebElement changepassword;


	@FindBy(xpath = "//input[@name='current_password']")
	WebElement currentp;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement newpassword;
	
	@FindBy(xpath = "//input[@name='password_confirmation']")
	WebElement confirmnewpass;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement save;
	
	@FindBy(id = "message-success")
	WebElement sucess;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	WebElement logout;
	
public Password_change()
{
	  PageFactory.initElements(driver, this);
}

public void password_Change(String email,String passwwrd) throws InterruptedException
{
	clicksignup.click();
	Email.sendKeys(email);
	password.sendKeys(passwwrd);
	signup.click();

	drop.click();
	account.click();
	Actions a=new Actions(driver);
	a.moveToElement(changepassword).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
	Set<String> windowAll=driver.getWindowHandles();
	Iterator<String> iterator=windowAll.iterator();
	String parentwindow=iterator.next();

	String childwidow=iterator.next();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
		
		driver.switchTo().window(childwidow);
	js.executeScript("window.scrollBy(0,500)");
	currentp.sendKeys(prop.getProperty("password"));
    newpassword.sendKeys(prop.getProperty("new_password"));
    confirmnewpass.sendKeys(prop.getProperty("new_password"));
    save.click();
  
    if(driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/account/login/"))
    {
    	System.out.println("change password sucessfully");
    	
    }
    else {
		System.out.println("failed change password");
	}
    

    driver.close();
	driver.switchTo().window(parentwindow);
	drop.click();
	logout.click();
	
	
	
	

}

public void again_change_password(String email,String passwwrd) throws InterruptedException
{
	clicksignup.click();
	Email.sendKeys(email);
	password.sendKeys(passwwrd);
	signup.click();
	Thread.sleep(3000);

	drop.click();
	account.click();
	Actions a1=new Actions(driver);
	a1.moveToElement(changepassword).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
	Set<String> windowAll1=driver.getWindowHandles();
	Iterator<String> iterator1=windowAll1.iterator();
	String parentwindow1=iterator1.next();

	String childwidow1=iterator1.next();
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	
		
		driver.switchTo().window(childwidow1);
	js1.executeScript("window.scrollBy(0,500)");
	currentp.sendKeys(prop.getProperty("new_password"));
    newpassword.sendKeys(prop.getProperty("password"));
    confirmnewpass.sendKeys(prop.getProperty("password"));
    save.click();
  
    if(driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/account/login/"))
    {
    	System.out.println("change password sucessfully");
    	
    }
    else {
		System.out.println("failed change password");
	}
    
	Thread.sleep(1000);
    driver.close();
	driver.switchTo().window(parentwindow1);
	drop.click();
	logout.click();
	
}


}
