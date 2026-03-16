package AutomationQA.AmazonProject;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.BaseClass;
import utility.ListnersLogic;
import utility.RetryLogic;


@Listeners(ListnersLogic.class)
public class TC1_LoginToAmazon extends BaseClass{

	@Test(retryAnalyzer=RetryLogic.class)
	public void withValidCredentials() throws InterruptedException {
	Reporter.log("Browser and URL launched successfully");
	HomePage homepage= new HomePage(driver);
	homepage.hoverOverOnAccountandList(driver);
	homepage.signinClick();
	Reporter.log("Hover on AccountList and Signin is successfull");
	
	
	LoginPage loginpage= new LoginPage(driver);
	loginpage.enterUsername();
	loginpage.continueClick();
	loginpage.enterPassword();
	loginpage.signInClick();
	Reporter.log("Username and Password entered successfully");
	
String url=	driver.getCurrentUrl();
System.out.println(url);
SoftAssert s1= new SoftAssert();
s1.assertEquals(url, "https://www.amazon.in/?ref_=nav_signin");
s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Assertion Failed for Test Case 1 since the title is not matching");
s1.assertAll();
Reporter.log("Test case is passed along with assertion");
	}
}
