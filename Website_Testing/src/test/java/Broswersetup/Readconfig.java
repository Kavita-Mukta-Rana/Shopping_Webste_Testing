package Broswersetup;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Readconfig {
	
     public static WebDriver driver;
	public static Properties prop;
	public Readconfig()
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
	
	public String getUrl()
	{
		String value=prop.getProperty("url");
		if(value!=null)
		{
			
		return value;
		}
		else {
			throw new RuntimeException("url is not specified  config file");
		}
	}

	public String getBroswer()
	{String value=prop.getProperty("browser");
	if(value!=null)
	{
		
	return value;
	}
	else {
		throw new RuntimeException("url is not specified in config file");
	}
		
	}
}
