
package basepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 

{
	
	public WebDriver driver; //to get the driver in all packages making it public 
	
	@BeforeMethod
	
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selenium.obsqurazone.com/index.php");

	}
	
	@AfterMethod
	 public void closeBrowser()
	 {
		driver.quit();
	 }

}
