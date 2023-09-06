package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPen_url {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.findElement(By.xpath("//a[text()='हिन्दी']")).click();
	}

}
