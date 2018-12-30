package week3day2;


import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alloptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.manage().window().maximize();
	//driver.findElementByLinkText("REGISTER").click();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();

		
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select s=new Select(source);
		List<WebElement> allOptions=s.getOptions();
		int c=allOptions.size();
		s.selectByIndex(c-3);
		for(int i=0;i<allOptions.size();i++) {
			
		System.out.println(allOptions.get(i).getText());
		}
		
	}

}
