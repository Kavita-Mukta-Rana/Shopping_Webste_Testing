package Pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Broswersetup.Readconfig101;

public class WhatNewsSSPAge extends Readconfig101 {
	@FindBy(xpath = "//*[@id='ui-id-3']")
	WebElement whatnew;
	
	

	
	public WhatNewsSSPAge()
	{
		PageFactory.initElements(driver, this);
	}

	public void ss_of_Page() throws IOException, InterruptedException
	{
		
		whatnew.click();
		
		for(int i=1;i<4;i++) 
		{
		WebElement element2=driver.findElement(By.xpath("//*[@id='maincontent']/div[4]/div[2]/div/div/ul[1]/li["+i+"]/a"));
			Actions a=new Actions(driver);
			a.moveToElement(element2).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			
			Set<String> windowAll=driver.getWindowHandles();
			Iterator<String> iterator=windowAll.iterator();
			String parentwindow=iterator.next();
			System.out.println("Parent window "+parentwindow);
			String childwidow=iterator.next();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
				System.out.println("Child Window : "+childwidow);
				driver.switchTo().window(childwidow);
			js.executeScript("window.scrollBy(0,500)");
		
		

			Thread.sleep(5000);
			Date ssfiledate=new Date();
			String ssfilename=ssfiledate.toString().replace(" ","-").replace(":", "-");
			File screenshootfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshootfile, new File(".//Screehoshotofnewproduct/"+ssfilename+".png"));
			System.out.println("finish");
			
			driver.close();
			driver.switchTo().window(parentwindow);
			
		     
			
		}
		
		
		
		
	
		
	}
}
