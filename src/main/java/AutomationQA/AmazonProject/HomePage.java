package AutomationQA.AmazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='nav-link-accountList']")
	private WebElement accountAndList;
	
	@FindBy(xpath="//a[@class='nav-action-signin-button']/span[text()='Sign in']")
	private WebElement signIn;
	
	@FindBy(id="nav-item-signout")
    private WebElement logout;
    
    
    
    @FindBy(id="twotabsearchtextbox")
    private WebElement searchBar;
    
    
    public void hoverOverOnAccountandList(WebDriver driver)
    {
            Actions a1=new Actions(driver);
            a1.moveToElement(accountAndList).perform();
    }
    public void signinClick()
    {
            signIn.click();
    }
    
    public void signOutClick()
    {
            logout.click();
    }
    public void searchingProduct()
    {
            searchBar.sendKeys("Laptop"+Keys.ENTER);
    }
    
    
	
	
}
