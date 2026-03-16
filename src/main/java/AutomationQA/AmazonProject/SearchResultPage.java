package AutomationQA.AmazonProject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage  {

	        WebDriver driver;

	        public SearchResultPage(WebDriver driver)
	        {
	                PageFactory.initElements(driver, this);
	        }
	        
	        
	        @FindBy(xpath="//a[@class='a-link-normal s-line-clamp-2 puis-line-clamp-3-for-col-4-and-8 s-link-style a-text-normal']")
	        private List<WebElement> allProducts;
	        
	        
	        
	        
	        public void clickFirstProduct_movingTheControl(WebDriver driver)
	        {
	                allProducts.get(0).click();
	                Set<String> ids=driver.getWindowHandles();
	                Iterator<String>i1=ids.iterator();
	                                String parentId= i1.next();
	                                String childId=  i1.next();
	                                driver.switchTo().window(childId);
	                }
	        
	        
	        
	        
	}


