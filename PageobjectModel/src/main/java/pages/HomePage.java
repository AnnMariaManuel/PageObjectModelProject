package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage

{
	
	WebDriver driver;
	By obsquara_logo=By.xpath("//div[@class='top-logo']");
	
	   //parametrized constructor to initalize driver 
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void printTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	public boolean verifyIsLogoDisplayed()
	{
		WebElement logo=driver.findElement(obsquara_logo);
		return logo.isDisplayed();
		
	}

}
