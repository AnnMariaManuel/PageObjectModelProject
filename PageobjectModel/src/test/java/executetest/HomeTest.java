package executetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass   //to get the methods in baseclass where the fns common to all tests is written ( launchbrowser) 

{
	
	
	HomePage homepage; //aggregation
	
	
@Test

	
	public void verifyLogoDisplayed()
	{
	    homepage=new HomePage(driver);
	
	  	homepage.printTitle();
	  	homepage.verifyIsLogoDisplayed();
	  	Assert.assertTrue(homepage.verifyIsLogoDisplayed());
	}

}
