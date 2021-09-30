package selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DlaNavigationClass {
	
	WebDriver driver;
		public static void main(String[] args) {
		WebDriver driver ;
		//Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nelaturir\\eclipse-workspace\\SDET_Training_Practice\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //ChromeDriver object creation
		// Using navigate command to navigate to another URL
		driver.navigate().to("https://uat.mydigitaliim.com"); 
		String title= driver.getTitle();
		
		System.out.println("Title is:"  +title);
		String url= driver.getCurrentUrl();
		
		System.out.println("URL is:"  +url);
		
	String pageSource =	driver.getPageSource();
	
	System.out.println("Page Source is :\n"+ pageSource);
	//File f = new File(pageSource);
	//System.out.println(f);
		
		
		
		driver.quit();
		}

		
	

}
