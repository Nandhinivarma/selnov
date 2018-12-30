package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActionTestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		Set<String> all = driver.getWindowHandles();
		List<String> lst=new ArrayList();
		lst.addAll(all);
		
		driver.switchTo().window(lst.get(1));
		
		driver.findElementByName("id").sendKeys("123445");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//driver.findElementByXPath("//a[@class='linktext']/parent::div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]").click();
		driver.findElementByXPath("//div[@class='x-grid3-body']/div/table/tbody/tr/td/div/a").click();
		driver.switchTo().window(lst.get(0));
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		driver.switchTo().window(lst.get(2));
		driver.findElementByName("id").sendKeys("123456");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-body']/div/table/tbody/tr/td/div/a").click();
		//driver.findElementByXPath("//a[@class='linktext']/parent::div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]").click();
		
		driver.switchTo().window(lst.get(0));

		driver.findElementByXPath("//a[text()='Merge']");
		
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys("123445");
		driver.findElementByXPath("//button[text()='Find Leads']");
		driver.close();

				
	}

}
