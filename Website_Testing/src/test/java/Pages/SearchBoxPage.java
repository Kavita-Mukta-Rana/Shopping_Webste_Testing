package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Broswersetup.Readconfig101;

public class SearchBoxPage extends Readconfig101 {

	@FindBy(xpath = "//*[@id=\"search\"]")
	WebElement from;
	
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[10]/div/a/span/span/img")
	WebElement selectitem;
	
	@FindBy(id = "option-label-color-93-item-49")
	WebElement color1;
	@FindBy(id = "option-label-color-93-item-50")
	WebElement color2;
	@FindBy(id = "option-label-color-93-item-53")
	WebElement color3;
	
	@FindBy(id = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
	WebElement errormsg;
	
	
	@FindBy(xpath  = "//*[@id='maincontent']/div[2]/div/div[1]/div[5]/div/a[1]/span")
	WebElement like;
	

	

	public SearchBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void searchBox() throws InterruptedException
	{
		
		from.click();
		Thread.sleep(2000);
		from.sendKeys("pants");
		Thread.sleep(3000);
		
		for (int i=0; i<5; i++)
		{
		    from.sendKeys(Keys.ARROW_DOWN);
		}   // for
		from.sendKeys(Keys.ENTER);
	selectitem.click();	
	
	for(int i=175;i<179;i++)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
 js.executeScript("window.scrollBy(0,100)"); 
 Thread.sleep(2000);
	driver.findElement(By.id("option-label-size-143-item-"+i+"")).click();;
		color1.click();
		color2.click();
		color3.click();
	}
	Thread.sleep(2000);
   like.click();
	boolean status=driver.findElement(By.xpath("//*[@id=\"email\"]")).isEnabled();
if(status)
{
	System.out.println("User should login first ");
	System.out.println("Testcase passed");
}
else {
	System.out.println("user is login in");
}



	}
}
