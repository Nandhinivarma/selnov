package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class myhomepage extends ProjectMethods {

	public myhomepage() {
		PageFactory.initElements(driver, this);
	}

	//@FindBy(id = "username") WebElement eleuserName;
	@FindBy(linkText="Leads") WebElement elelead;
	
	@And("click leads")

	public Myleadpage clicklead() {		
		click(elelead);
		return new Myleadpage();
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
