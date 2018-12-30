package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class Myleadpage extends ProjectMethods {

	public Myleadpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Create Lead") WebElement elecreatelead;
	//@FindBy(how = How.XPATH, using = "//a[text()='Create Lead']")
	@FindBy(linkText="Merge Leads") WebElement elemergelead;
	
	@And ("click createlead")
	public Createleadpage clickcreatelead() {		
		click( elecreatelead);
		return new Createleadpage();
	}
	
	@Given("click merge lead")
	public Mergeleadpage  click_merge_lead() {
		click(elemergelead);
		return new  Mergeleadpage();
		
	  
	   
	}
	/*@And ("click merge lead")
	public Mergeleadpage clickmergelead() {
		click(elemergelead);
		return new  Mergeleadpage();
		
	}*/
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

