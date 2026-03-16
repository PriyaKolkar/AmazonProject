package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {

	
	   public WebDriver driver;
       @BeforeMethod
       public void launchBrowser() throws InterruptedException
       {
               
               driver=new ChromeDriver();
               driver.get("https://www.Amazon.in");
               driver.manage().window().maximize();
               Thread.sleep(2000);
               driver.navigate().refresh();
               
       }
       @AfterMethod
       public void closeBrowser()
       {
               driver.quit();
               
               
       }
       
       
       
       
}


