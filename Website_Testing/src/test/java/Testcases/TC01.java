package Testcases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01 {
	WebDriver driver;
  
	public TC01()
	{
		super();
	}
	
	
	
	@Test
	@Parameters({"browserss","url"})
	public void browserLaunch(String browser,String url)
	{
		
	
		switch(browser.toLowerCase())
		{
		case "chrome":
//			WebDriverManager.chromedriver().setup();

		 driver=new ChromeDriver();
		 driver.get(url);
		 System.out.println("chrome launch");
		 break;
		 
		case "edge":
//			WebDriverManager.edgedriver().setup();
 
		 driver=new EdgeDriver();
		 driver.get(url);
		 System.out.println("edge launch");
		 break;
		
		case "firefox":
//			WebDriverManager.firefoxdriver().setup();

		 driver=new FirefoxDriver();
		 driver.get(url);
		 System.out.println("firefox launch");
		 break;
		 default:
			 driver=null;
			 break;
		}
		
		
		

	}

	@AfterMethod
	public void aftermethod()
	{
		driver.quit();
	}

}
