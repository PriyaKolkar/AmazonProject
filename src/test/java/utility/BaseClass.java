package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BaseClass extends ListnersLogic {
	
	@Parameters("Browsers")
    @BeforeMethod
    public void launchBrowser(String nameofBrowser) throws InterruptedException
    {
            if(nameofBrowser.equals("chrome"))
    {
             driver=new ChromeDriver();
    }
    if(nameofBrowser.equals("edge"))
    {
             driver=new EdgeDriver();
    }
    if(nameofBrowser.equals("firefox"))
    {
             driver=new FirefoxDriver();
    }
    driver.get("https://www.amazon.in");
    Thread.sleep(2000);
    driver.navigate().refresh();
    driver.manage().window().maximize();
            
    }
    @AfterMethod
    public void closeBrowser()
    {
    //        driver.quit();
            
            
    }
    
}
    
    

