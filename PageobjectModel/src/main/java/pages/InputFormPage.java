


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	
	WebDriver driver;
	By inputForm=By.xpath("//a[contains(text(),'Input')]");
	By EnterMsg=By.xpath("//input[@id='single-input-field']");
	By showmsgbtn=By.xpath("//button[@id='button-one']");
	
	public InputFormPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
	public void clickOnInputForm()
	{
		WebElement input_form=driver.findElement(inputForm);
		input_form.click();
	}
	
	public void EnterMessage(String msg)
	{
		WebElement Enter_Message=driver.findElement(EnterMsg);
		Enter_Message.sendKeys(msg);
		
    }
	
	public void clickShowMessage()
	{
		WebElement Show_message=driver.findElement(showmsgbtn);
		Show_message.click();
	}
}
