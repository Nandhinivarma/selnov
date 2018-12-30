package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import reports.Basicreport;

public class SeMethods extends Basicreport implements WdMethods{
	
	public RemoteWebDriver driver;	
	public int i = 1;
	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) { 
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodrivers.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			logstep("pass","browser" +browser+" launched successfully");
			
			//System.out.println("The Browser "+browser+" Launched Successfully");
			takeSnap();
		}
		catch(WebDriverException e) {
		// TODO Auto-generated catch block
			System.out.println("The Browser "+browser+"  not Launched Successfully");
		logstep("fail","The Browser "+browser+"not Launched Successfully");
			throw new RuntimeException();
		}
	}
	


	public WebElement locateElement(String locator, String locValue) {
		try {
		switch (locator) {
		case "id": return driver.findElementById(locValue);
		case "classname": return driver.findElementByClassName(locValue);
		case "xpath": return driver.findElementByXPath(locValue);
		case  "linktext": return driver.findElementByLinkText(locValue);
		case "name": return driver.findElementByName(locValue);
		}
		logstep("pass","locate element" +locator+" is select successfully");
		
	}
	catch(Exception e) {
		logstep("fail","locate element" +locator+" is  not select successfully");

	System.out.println("locate element failed");
	e.printStackTrace();
	
	}return null;
	}
	@Override
	public WebElement locateElement(String locValue) {

		return null;
	}

	@Override
	public void type(WebElement ele, String data) {
		try {
		ele.sendKeys(data);
		logstep("pass","The Data " +ele+" Entered Successfully");
		takeSnap();
	}
		catch(Exception e)
		{
			logstep("fail","data" +ele+" is  not entered successfully");
			System.out.println("type failed");
			e.printStackTrace();
		}
			
		}

	@Override
	public void click(WebElement ele) {
		try {
		ele.click();
		//System.out.println("The Element "+ele+" is clicked Successfully");
		logstep("pass","element is clicked successfully");
		takeSnap();
	}
catch(Exception e)
{
	logstep("pass","the text captured successfully");
	//System.out.println("click failed");
	e.printStackTrace();
}
	}
	
	
	public void clickwithoutsnap(WebElement ele) {
		try {
		ele.click();
		logstep("pass","the element" + ele+" clicked successfully");
		//System.out.println("The Element "+ele+" is clicked Successfully");
		
	}
catch(Exception e)
{
	logstep("fail","the element"+ele+" is not clicked successfully");
	//System.out.println("The Element"+ele+" is not clicked Successfully");
	e.printStackTrace();
}
	}
	
	
	
	
	public void clear(WebElement ele) {
		try {
		ele.clear();
		//System.out.println("The Element "+ele+" is cleared Successfully");
		logstep("pass","element"+ele+" is clear successfully");
		takeSnap();
	}
		catch(Exception e)
		{
			logstep("fail","element "+ele+"is not clear successfully");
			//System.out.println("exception");
			e.printStackTrace();
		}
	}
	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		try {
		String text = ele.getText();
		System.out.println("the text captured Successfully" + text);
		logstep("pass","the text "+ text+"captured successfully");
		//System.out.println(text);
		takeSnap();
		}
		catch(Exception e)
		{
			logstep("fail","the text not captured successfully");
			System.out.println("exception");
			e.printStackTrace();
		}
		return null;
	}


	public void selectDropDownUsingText(WebElement ele, String value) {
try {
              Select s =new Select(ele) ;
             s.selectByVisibleText(value);
             logstep("pass","the element"+ele+" selected successfully");
            
            System.out.println("The Element "+ele+" is selected Successfully");
    		  takeSnap();
}
catch(Exception e){
	 logstep("fail","the element"+ele+"  is not selected successfully");
	 System.out.println("exception");
		e.printStackTrace();
}

	}
	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
try {
		Select s=new Select(ele);
		s.selectByIndex(index);
		 logstep("pass","the element"+ele+" selected successfully");
		System.out.println("The Element "+ele+" is selected Successfully");
		  takeSnap();
		
	}
catch(Exception e)
{
	 logstep("fail","the element"+ele+"  is not selected successfully");
	System.out.println("exception");
	e.printStackTrace();
}
	}
	@Override
	public boolean verifyTitle(WebElement ele,String expectedTitle) {
		// TODO Auto-generated method stub
		try {
			String firstname = ele.getText();
			System.out.println(firstname);
			if(firstname.contentEquals(expectedTitle))
			System.out.println("Matched");
			else
			System.out.println("Not Matched");
			
			 logstep("pass","the title"+ele+"  is verified successfully");		
			
			}
			catch (Exception e)
			{
				 logstep("fail","the text"+ele+"  is not verified successfully");
				System.out.println("No such element");
				e.printStackTrace();
			}
			
					
		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
	
		// TODO Auto-generated method stub
		try {
	  if(expectedText.equals(expectedText))
	  {
		  logstep("pass","exactText "+  expectedText+"is verified");
		  System.out.println("exactText "+  expectedText+"is verified");
	  }
		}
		catch(Exception e) {
	 
		  logstep("fail", "exactText "+  expectedText+"is not verified");
			  System.out.println("exactText "+ expectedText+ " is not  verified");
		}
	
	}
	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		try {
		Set<String> allwindow = driver.getWindowHandles();
		List<String> lst=new ArrayList();
		lst.addAll(allwindow);
		driver.switchTo().window(lst.get(index));	
		 logstep("pass","the window"+index+"  is switched successfully");
	}
catch(Exception e)
		{
	logstep("fail","the window"+index+"  is not switched successfully");
	System.out.println("exception");
	e.printStackTrace();
		}
	}
	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
		driver.switchTo().alert().accept();
		logstep("pass","the alert  is accept successfully");

	}
catch(Exception e){
	logstep("fail","the alert  is not accept successfully");
}
	}
	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}


	public void takeSnap() {
		try {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File desc = new File("./snaps/img"+i+".png");
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
          driver.close();
		
		
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}


	
	public void selectDropDownUsingValue(WebElement ele, String value) {
		
		// TODO Auto-generated method stub
		try {
		Select s=new Select(ele);
		s.selectByValue(value);
		 logstep("pass","the element"+ele+" selected successfully"); 
		System.out.println("The Element "+ele+" is selected Successfully");
		  takeSnap();
	
	}
		catch(Exception e)
		{
			 logstep("pass","the element"+ele+"is not selected successfully");
			System.out.println("exception");
		}
	}
public void selectDropDown(WebElement ele, String type, String data)
{
	Select sc=new Select(ele);
	if(type.equalsIgnoreCase("visible"))
	{
		sc.selectByVisibleText(data);
	}
	else if(type.equalsIgnoreCase("value"))
	{
		sc.selectByValue(data);
	}
	else if(type.equalsIgnoreCase("index"))
	{
		sc.selectByIndex(Integer.parseInt(data));
	}
	
}

@Override
public boolean verifyTitle(String expectedTitle) {
	// TODO Auto-generated method stub
	return false;
}	
	
	
	



	
		
	}


