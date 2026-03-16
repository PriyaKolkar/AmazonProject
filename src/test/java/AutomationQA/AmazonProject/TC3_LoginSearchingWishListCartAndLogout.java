package AutomationQA.AmazonProject;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListnersLogic;
import utility.RetryLogic;


@Listeners(ListnersLogic.class)
public class TC3_LoginSearchingWishListCartAndLogout extends BaseClass {

	@Test(retryAnalyzer=RetryLogic.class)
	public void searchingTheProduct_WL_Cart() throws InterruptedException  {
	HomePage homepage= new HomePage(driver);
	homepage.hoverOverOnAccountandList(driver);
	homepage.signinClick();
	
	//signIn
	LoginPage loginpage= new LoginPage(driver);
	loginpage.enterUsername();
	loginpage.continueClick();
	loginpage.enterPassword();
	loginpage.signInClick();
	
	
	  homepage.searchingProduct();
      SearchResultPage searchresultpage=new SearchResultPage(driver);
      searchresultpage.clickFirstProduct_movingTheControl(driver);
      Thread.sleep(2000);
      Reporter.log("Searching the product and clicking on the first product from the result and moving control to child window is successfull");
      
      ProductPage productpage= new ProductPage(driver);
      productpage.wishListAddition();
      Thread.sleep(2000);
      productpage.addingToCart();
      Thread.sleep(2000);
      homepage.hoverOverOnAccountandList(driver);
      homepage.signOutClick();
      Assert.assertEquals(driver.getTitle(),"Amazon Sign-In");
      Reporter.log("Sign Out Successfully");

      }

}


