package Pages;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Broswersetup.Readconfig101;

public class CheckFeatures1 extends Readconfig101 {
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/div/a[4]/span/span[2]")
	WebElement element;
	
	@FindBy(xpath = "//select[@id='sorter']")
	WebElement sortedBy;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[1]")
	WebElement style;
	
	@FindBy(xpath = "//*[@id=\"layered-filter-block\"]/div[2]/div[2]/a")
	WebElement clearAll;
	
	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[3]/div[1]")
	WebElement size;
	
	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[4]/div[1]")
	WebElement ptice;
	
	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[5]/div[1]")
	WebElement colors;
	
	
	
	
	public CheckFeatures1()
	{
		  PageFactory.initElements(driver, this);
		  
		  
	}
	
	public void featurecheck() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
 js.executeScript("window.scrollBy(0,1000)"); 
 element.click();

	
	   Select select=new Select(sortedBy);
	   
	   WebElement firstOpen=select.getFirstSelectedOption();
	   System.out.println("Selecte option : "+firstOpen.getText());
	   select.selectByValue("name");
	   select.selectByIndex(2);
	   
//=======================================================style
	   style.click();
	   
	   for(int i=1;i<4;i++)
	   {
		   driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li["+i+"]/a")).click();
		   clearAll.click();
		   Thread.sleep(1000);
		   style.click();
		   
	   }
	   
	   
 //=======================================================size 
	   size.click();
	   for(int i=1;i<4;i++)
	   {
		   driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[3]/div[2]/div/div/a["+i+"]/div")).click();
		   JavascriptExecutor js1=(JavascriptExecutor)driver;
	 js1.executeScript("window.scrollBy(0,1000)"); 
		   clearAll.click();
		   Thread.sleep(1000);
		   size.click();
	}
	  
	
	   
//=======================================================color
	

	colors.click();	
	 for(int i=1;i<4;i++)
	 {
		 driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[5]/div[2]/div/div/a["+i+"]/div")).click();
	   JavascriptExecutor js1=(JavascriptExecutor)driver;
	 js1.executeScript("window.scrollBy(0,1000)"); 
	   clearAll.click();
		   Thread.sleep(1000);
	   colors.click();
		 
	 }

	 //=======================================================click all once
 for(int i=1;i<4;i++)
 {
	 driver.findElement(By.xpath("//*[@id='narrow-by-list']/div["+i+"]/div[1]")).click();
	 Thread.sleep(1000);
	  
	
		 
	 
 }

	
System.out.println("CheckFeature is passed");
}
}
