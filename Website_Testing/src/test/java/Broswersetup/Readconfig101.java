package Broswersetup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Readconfig101 {
	
     public static WebDriver driver;
     public static String screenshotsSubFolderName;
	public static Properties prop;
	public Readconfig101()
	{
		
		
		try
		{
			
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"//properties//config.properties");
			prop = new Properties();
			prop.load(fileInputStream);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void initialization()
	{
		String url=prop.getProperty("url");
		
	String browser=prop.getProperty("browser");
	switch(browser.toLowerCase())
	{
	case "chrome":
		WebDriverManager.chromedriver().setup();

	 driver=new ChromeDriver();
	 System.out.println("chrome launch passed");
	 break;
	 
	case "edge":
		WebDriverManager.edgedriver().setup();

	 driver=new EdgeDriver();
	 System.out.println("edge launch passed");
	 break;
	
	case "firefox":
		WebDriverManager.firefoxdriver().setup();

	 driver=new FirefoxDriver();
	 System.out.println("firefox launch passed");
	 break;
	 default:
		 driver=null;
		 
		 break;
		 
		
	}
	
	 driver.get(url);
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	
//	
	public void captureScreenshot(String fileName) {
	
			LocalDateTime myDateObj = LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		    screenshotsSubFolderName = myDateObj.format(myFormatObj);
		    
	
	
		
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/"+ screenshotsSubFolderName+"/"+fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		
		driver.quit();
	}
}