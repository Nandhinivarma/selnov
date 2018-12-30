package week3.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Loginauto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver1=new ChromeDriver();
		
		driver1.get("https://www.irctc.co.in/nget/train-search");
		driver1.manage().window().maximize();
		driver1.findElementByLinkText("REGISTER").click();
		driver1.findElementById("userName").sendKeys("nandhini96");
		driver1.findElementById("usrPwd").sendKeys("nandhu123a");
		driver1.findElementById("cnfUsrPwd").sendKeys("nandhu123a");
		
		WebElement source = driver1.findElementByXPath("//label[text()='Select Security Question']");
		
		Select sc=new Select(source);
		sc.selectByIndex(3);
		WebElement source1 = driver1.findElementByLinkText("Select Occupation");
		Select sc1=new Select(source1);
		sc1.selectByVisibleText("GOVERMENT");
		driver1.findElementById("firstName").sendKeys("mathu");
		driver1.findElementById("middleName").sendKeys("nandhu");
		driver1.findElementById("lastname").sendKeys("k");
		
		 driver1.findElementByXPath("//label[@class='col-md-3 col-sm-4 col-xs-4']").click();
		
		
		
	}

	
	}


