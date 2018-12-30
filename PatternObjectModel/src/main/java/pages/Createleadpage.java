package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class Createleadpage extends ProjectMethods {

	public Createleadpage() {
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(id = "createLeadForm_companyName") WebElement elecmpname;
	@FindBy(id = "createLeadForm_firstName") WebElement elefname;
	@FindBy(id = "createLeadForm_lastName") WebElement elelname;
	@FindBy(name ="submitButton") WebElement eleclick;

	
	@And ("enter cmpname as <cmpname>")
	public Createleadpage entercmpname(String data) {
		type(elecmpname, data);
		return this;
	}
	@And(" enter firstname as <fname>")
	public Createleadpage enterfname(String data) {
		type(elefname, data);
		return this;
	}
	@And ("enter lastname as <lname> ")
	public Createleadpage enterlname(String data) {
		type(elelname, data);
		return this;
	}
	@Then ("click createleadbutton")
	public  viewleadpage clickcreatebutton()
	{
		click(eleclick);
		return new viewleadpage();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
