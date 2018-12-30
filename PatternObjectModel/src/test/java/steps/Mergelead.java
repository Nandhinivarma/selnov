package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Mergelead {

	public ChromeDriver driver;
	@Given("open the browser")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	
	@And("max the browser")
	public void maxBrowser()
	{
		driver.manage().window().maximize();
	}
	
	@And("Set the Timeout")
	public void setTimeout()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And("launch the url")
	public void launch()
	{
	driver.get("http://leaftaps.com/opentaps");
	}
	
	//@And("enter username as DemoSalesManager")
	@And("enter username as (.*)")
	public void enterUsername(String data)
	{
		/*driver.findElementById("username").sendKeys("DemoSalesManager");*/
		
		driver.findElementById("username").sendKeys(data);
		
	}
	
	@And("enter password as (.*)")
	public void enterPassword(String data)
	{
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementById("password").sendKeys(data);
	}	
	
	@And("click on the login button")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
