package casestudy.cs1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UtilityClass {
       static WebDriver driver;
       public static WebDriver getdriver(String browser)
       {
    	   if(browser.equalsIgnoreCase("chrome"))
    	   {
    		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.05\\Desktop\\SeleniumDrivers\\chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.get("https://www.google.com");
    
    	   }
    	   else if(browser.equalsIgnoreCase("internet explorer"))
    	   {
    		System.setProperty("webdriver.ie.driver","C:\\Users\\training_c2a.05.05\\Desktop\\SeleniumDrivers\\IEdriver.exe");
    		driver = new InternetExplorerDriver();
    		driver.get("https://www.google.com");
    
    	   }
    	   else if(browser.equalsIgnoreCase("mozilla firefox"))
    	   {
    		System.setProperty("webdriver.ie.driver","C:\\Users\\training_c2a.05.05\\Desktop\\SeleniumDrivers\\geckodriver.exe");
    		driver = new FirefoxDriver();
    		driver.get("https://www.google.com");
    
    	   }
    	   else
    	   
    		   System.out.println("invalid");
    	   return driver;
    		   
    	   
		
    	  
       }
}
