package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriver {
	
	public   static WebDriver driver= null;



	public static  void openBrowser(){
            
	    	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
               }

	
	public static WebDriver getDriver() {
		return driver;
	}

}
