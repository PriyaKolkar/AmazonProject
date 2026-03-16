package AutomationQA.AmazonProject;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.ListnersLogic;
import utility.RetryLogic;
import utility.BaseClass;
@Listeners(ListnersLogic.class)
public class TC2_LoginToAmazonAndLogout extends BaseClass {

	@Test(retryAnalyzer=RetryLogic.class)
	public void  loginAndLogout() throws InterruptedException {
		
	HomePage homepage= new HomePage(driver);
	homepage.hoverOverOnAccountandList(driver);
	homepage.signinClick();
	
	//signIn
	LoginPage loginpage= new LoginPage(driver);
	loginpage.enterUsername();
	loginpage.continueClick();
	loginpage.enterPassword();
	loginpage.signInClick();
	
	homepage.hoverOverOnAccountandList(driver);
	
	//SignOut
	
loginpage.signoutClick();
Assert.assertEquals(driver.getTitle(),"Amazon Sign-In");
Reporter.log("Sign Out Successfully");

	
	}
}