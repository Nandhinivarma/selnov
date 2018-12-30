package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class findleadpage extends ProjectMethods {

	public findleadpage() {
		PageFactory.initElements(driver, this);
	}

	
	
	
	//@FindBy(linkText ="Find Leads") WebElement elefindlead;
	//@FindBy(id = "createLeadForm_lastName") WebElement elelname;
	//@FindBy(name ="submitButton") WebElement eleclick;

	@FindBy(name= "id") WebElement elefindid;
	@FindBy(xpath="//button[text()='Find Leads']") WebElement eleflbutton;
	
//	public  findleadwindowpage movetoWindow(int index)
//	{
//		switchToWindow(index);
//		return new findleadwindowpage();
//	}
	@Given("enter lleadid as{int}")
	public findleadpage enter_lleadid_as(String data) {
	/*@And(" enter lleadid as (.*)")
	public  findleadpage enterlleadid(String data)
	{
	*/	//type(elefromid,"123445");
		type(elefindid,data);
		return this;
	}
	@Then("click flbutton")
	public findleadpage click_flbutton() {
	/*@Then(" click flbutton")
	public  findleadpage clickflbutton()
	{*/
		click(eleflbutton);
		return new findleadpage();
	}
	
	

	/*public  findleadwindowpage switchwindow()
	{
		switchToWindow(1);
		return new findleadwindowpage();
	}*/
	
	

	

	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
