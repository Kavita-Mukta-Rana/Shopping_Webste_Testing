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

public class RatingCheck extends Readconfig101 {
	@FindBy(xpath ="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement clicksignup;
	
	@FindBy(xpath ="//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/div[1]/div[2]/a")
	WebElement review;

	@FindBy(xpath ="//*[@id=\"review-form\"]/div/div/button")
	WebElement submitreview;
	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy(id = "send2")
	WebElement signup;
	
	@FindBy(id = "ui-id-4")
	WebElement women;
	
	@FindBy(id ="summary_field")
	WebElement summary;
	@FindBy(id="review_field")
	WebElement review_fe;

	@FindBy(xpath  ="//*[@id=\"Rating_5_label\"]")
	WebElement rate3;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	WebElement drop;
	
	@FindBy(linkText = "My Account")
	WebElement account;
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[5]/div[1]/a")
	WebElement view_all_rating;
	
	public RatingCheck()
	{
		 PageFactory.initElements(driver, this);
	}

	public void ratecheck(String email,String passwwrd,String summarys) throws InterruptedException
	{
		clicksignup.click();
		Email.sendKeys(email);
		password.sendKeys(passwwrd);
		signup.click();
		women.click();
		review.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(3000);
		Actions a=new Actions(driver);
	    a.doubleClick(rate3).perform();
		summary.sendKeys(summarys);
		
		
		Thread.sleep(1000);
		a.keyDown(summary,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(1000);
		a.keyDown(review_fe,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
	  submitreview.click();
	  
	  Set<String> windowAll=driver.getWindowHandles();
		Iterator<String> iterator=windowAll.iterator();
		String parentwindow=iterator.next();
		System.out.println("Parent window "+parentwindow);
		String childwidow=iterator.next();
		driver.switchTo().window(childwidow);
	
		

		
		
	}
}
