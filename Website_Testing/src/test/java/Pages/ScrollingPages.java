package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Broswersetup.Readconfig101;

public class ScrollingPages extends Readconfig101{
	
	@FindBy(xpath = "//*[@id=\"ui-id-4\"]/span[2]")
	WebElement hover;
	
	public ScrollingPages()
	{
		  PageFactory.initElements(driver, this);
	}
	
	public void Scrolling_All_Pages() throws InterruptedException
	{
		for(int i=1;i<7;i++)
		{
			
			driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li["+i+"]")).click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
		
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(3000);
			
		}
	}

}
