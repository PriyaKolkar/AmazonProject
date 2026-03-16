package AutomationQA.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement pass;
	
	@FindBy(id="signInSubmit")
	private WebElement signIn;
	
	@FindBy(xpath="//a[@id='nav-item-signout']")
	private WebElement logout;
	
	
	public void signoutClick() {
		logout.click();
	}
	
	public void enterUsername() {
		username.sendKeys("9136722871");
	}
	
	public void continueClick() {
		continueButton.click();
	}
	
	public void enterPassword() throws InterruptedException {
		Thread.sleep(1000);
		pass.sendKeys("priya@1234");
	}
	
	
	public void signInClick() {
		signIn.click();
	}
}
