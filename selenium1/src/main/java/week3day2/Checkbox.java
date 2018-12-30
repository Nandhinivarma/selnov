package week3day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/checkbox.html");
WebElement sc = driver.findElementByXPath("//div[@id='contentblock']//following::input[1]");

	if(sc.isSelected()==true)	
		System.out.println("check box is selected");
	
	else
		System.out.println("check box is not selected");
		
	WebElement sc1 = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input[1]");
	
	if(sc1.isSelected()==true)
System.out.println("check box is selected");
	
	else
		System.out.println("check box is not selected");
	
	
	driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[2]");
	
	}

}
