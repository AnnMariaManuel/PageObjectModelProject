package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass

{
	
  InputFormPage  inputformpage;
  
  @Test
  public void verifyShowMessageDisplayed()
  {
	  inputformpage=new InputFormPage(driver);
	  inputformpage.clickOnInputForm(); //navigate to input form 
	  
	  inputformpage.EnterMessage("Hi this is Emma !!");
	  inputformpage.clickShowMessage();
	  
	  
  }
  
  
  
}
