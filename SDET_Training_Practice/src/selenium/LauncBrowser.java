package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauncBrowser {
	
	public static void main (String []args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nelaturir\\eclipse-workspace\\SDET_Training_Practice\\Drivers\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://qa.mydigitaliim.com");
		
		driver.quit();
		
	
	}
	
	
}
