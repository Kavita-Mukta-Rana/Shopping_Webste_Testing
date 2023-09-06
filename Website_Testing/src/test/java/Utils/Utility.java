package Utils;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Broswersetup.Readconfig101;

public class Utility extends Readconfig101 {
	

	public static void mouseHovers1(WebDriver driver, WebElement element) {

		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	public static void mouseHovers2(WebDriver driver, WebElement element) {

		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	

}
