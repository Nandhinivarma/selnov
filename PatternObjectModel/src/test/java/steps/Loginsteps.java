package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsteps {

	
	
	public ChromeDriver driver;
	@Given("open the browser")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	/*public void openBrowser(String browser,String url)
	{
		System.setProperty(browser,url);
		 driver=new ChromeDriver();
	}
	*/
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
	
//	@And("enter username1 ")
//	public void enterUsername1(String data)
//	{
//		/*driver.findElementById("username").sendKeys("DemoSalesManager");*/
//		
//		driver.findElementById("username").sendKeys(data);
//		
//	}
	@And("enter password as (.*)")
	public void enterPassword(String data)
	{
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementById("password").sendKeys(data);
	}
//	@And("enter password1")
//	public void enterPassword1(String data)
//	{
//		//driver.findElementById("password").sendKeys("crmsfa");
//		driver.findElementById("password").sendKeys(data);
//	}
	
	@And("click on the login button")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("verify login")
	public void verifylogin()
	{
	
		System.out.println("success");
	}
	
	@And("click crmsfa")
	public void clickcrmsfa()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		
		
	}
	@And("click leads")
	public void clickleads()
	{
		driver.findElementByLinkText("Leads").click();

}
	
	@And("click createlead")
	public void clickcreatelead()
	{
		driver.findElementByLinkText("Create Lead").click();

}
	@Given("enter cmpname as (.*)")
	public void enter_cmpname_as_abc(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	
	/*@And("enter cmpname  as (.*)")
	public void entercmpname(String data)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(data);

}
	
*/	@And("enter firstname as (.*)")
	public void enterfname(String data)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(data);

}
	@And("enter lastname as (.*)")
	public void enterlname(String data)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(data);

}
	@Given("enter source")
	public void enter_source() {
	    // Write code here that turns the phrase above into concrete actions

		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select sc=new Select(source);
		sc.selectByVisibleText("Public Relations");
		
	}
	/*@And(" enter source")
	public void selectsource()
	{
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select sc=new Select(source);
		sc.selectByVisibleText("Public Relations");
		 
	}*/
	
	
	
	
	@And("click createleadbutton")
	public void clickcreateleadbutton()
	{
		driver.findElementByName("submitButton").click();

}
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
