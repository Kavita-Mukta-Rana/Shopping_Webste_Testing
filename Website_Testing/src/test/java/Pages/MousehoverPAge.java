package Pages;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Text;
import com.github.dockerjava.api.model.Driver;

import Broswersetup.Readconfig;
import Broswersetup.Readconfig101;
import Utils.Utility;


public class MousehoverPAge extends Readconfig101{

	
	@FindBy(xpath = "//*[@id=\"ui-id-4\"]/span[2]")
	WebElement hover;
	
	
	@FindBy(xpath = "//*[@id=\"ui-id-9\"]")
	WebElement toplink;
	
	
	@FindBy(xpath = "//*[@id=\"ui-id-11\"]")
	WebElement jackets;
	
	@FindBy(xpath = "//*[@id=\"page-title-heading\"]/span")
	WebElement heading;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/ul/li[3]/a")
	WebElement back1;
	@FindBy(xpath = "/html/body/div[2]/div[2]/ul/li[2]/a")
	WebElement back2;
	
	@FindBy(xpath = " /html/body/div[2]/div[2]/ul/li[1]/a")
	WebElement back3;
	
	
	 public  MousehoverPAge()
	  {
		    PageFactory.initElements(driver, this);
	  }
	 
	 public void mouseHovercheck() 
	 {
		 Utility.mouseHovers1(driver,hover);
		 Utility.mouseHovers2(driver, toplink);
		jackets.click();
		boolean headingcheck=heading.isDisplayed();
		System.out.println(headingcheck);
		if(headingcheck)
		{
			System.out.println("Jackets heading is visible");
		}
		else {
			System.out.println("Jackets heading is not visible");
		}
		
	
		back1.click();
		 
		 back2.click();
		 back3.click();
		String Currenturl =driver.getCurrentUrl();
		
		 if(Currenturl.equals("https://magento.softwaretestingboard.com/"))
		 {
			 System.out.println("succesfully back to home page");
		 }
		 else {
			 System.out.println("Failed to go back home page");
		}
	 }
	 
	
}
