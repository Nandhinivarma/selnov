package week8.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login {

	@Test()
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	public void flipkart() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.findElementByXPath("//button[text()='✕']").click();
	   WebElement electronics = driver.findElementByXPath("//span[contains(text(),'Electronics')]");
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		driver.findElementByLinkText("Realme").click();
		//driver.findElementByXPath("//span[text() = 'Electronics']").click();

		driver.findElementByXPath("//div[text()='Newest First']").click();
		       String title = driver.getTitle();
		if(title.contains("(Mi/RealMe) Mobile Phones"))
			System.out.println("Title Verification PASSED: Title Has  Keywords - (Mi/RealMe) Mobile Phones ");
		else
			System.out.println("Title Verification FAILED: Title does Not match ");
		
		//print all product
		List<WebElement> allproduct = driver.findElementsByClassName("_3O0U0u");
		//List<WebElement> allproduct = driver.findElementsByClassName("_3wU53n");
		for (WebElement each : allproduct) 
		{
			System.out.println(each.getText());				
	}
		List<WebElement> allprice = driver.findElementsByClassName("_1uv9Cb");
		for (WebElement each : allprice) 
		{
			System.out.println(each.getText());				
	}
	
		
		driver.findElementByXPath("(//div[@class='_3O0U0u'])[1]").click();
				
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<>(windowHandles);
		driver.switchTo().window(allWindows.get(1));
			
		String RealmeTitle = driver.getTitle();
		if(RealmeTitle.contains("Realme"))
			System.out.println("The  pagetitle has Realme, based on product selected");
		else
			System.out.println("The Pagetitle is generic, not product specific");
			
		
		String textRatings = driver.findElementByXPath("(//span[contains(text(),'Ratings')])[1]").getText();
		System.out.println("The total ratings for this is "+textRatings);
		
		String textReviews = driver.findElementByXPath("(//span[contains(text(),'Reviews')])[1]").getText();
		System.out.println("The total reviews for this is "+textReviews);
		
		driver.quit();
		
		
}
}