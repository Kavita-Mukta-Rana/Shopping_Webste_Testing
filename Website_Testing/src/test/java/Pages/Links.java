package Pages;

import java.util.List;

import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Broswersetup.Readconfig101;

public class Links extends Readconfig101{
	@FindBy(xpath = "//*[@id=\"ui-id-3\"]")
	WebElement clickonnews;
	
	@FindBy(tagName= "a")
	List<WebElement> alllinks;
	
	@FindBy(tagName= "div")
	List<WebElement>  alldiv;

	@FindBy(tagName= "span")
	List<WebElement> allspan;
	@FindBy(tagName= "option")
	List<WebElement> alloption;
	public Links()
	{
		  PageFactory.initElements(driver, this);
	}
 
	public void all_Links_available()
	{
		clickonnews.click();
		String currenturl=driver.getCurrentUrl();
		
		if(currenturl.equals("https://magento.softwaretestingboard.com/what-is-new.html"))
		{
		for(int i=0;i<alllinks.size();i++)
		{
			
		System.out.println("links are : " +alllinks.get(i).getAttribute("href"));
		System.out.println("links name : "+alllinks.get(i).getText());
		
		
		}
		
		System.out.println("*================================What's news page all links===========================*");
		System.out.println("Links avaible in page : "+alllinks.size());
		System.out.println("Div tags avaible in page : "+alldiv.size());
		System.out.println("Span tag avaible in page : "+allspan.size());
		System.out.println("Option avaible in page : "+alloption.size());
		}
		else {
			System.out.println("What's news page is not able to open");
		}
	}
}
