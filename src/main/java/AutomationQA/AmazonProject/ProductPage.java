package AutomationQA.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver)
    {
            PageFactory.initElements(driver, this);
    }
    
    
    @FindBy(xpath="//input[@aria-label='Add to Wish List']")
    private WebElement wishListButton;
    @FindBy(xpath="//input[@aria-label='Continue shopping']")
    private WebElement continueShoppingButton;
    @FindBy(xpath="(//span[@id='submit.add-to-cart'])[2]")
    private WebElement addToCartButton;
    @FindBy(xpath="//span[@class='a-button a-button-primary attach-button-large attach-primary-cart-button']")
    private WebElement cartButton;
    
    
    
    public void wishListAddition() throws InterruptedException
    {
            wishListButton.click();
            Thread.sleep(3000);
            continueShoppingButton.click();
            
            }
    public void addingToCart() throws InterruptedException
    {
            addToCartButton.click();
            Thread.sleep(3000);
            cartButton.click();
            
            }

    
    
    
    
}

