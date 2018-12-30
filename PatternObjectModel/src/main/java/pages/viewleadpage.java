package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class viewleadpage extends ProjectMethods {

	public viewleadpage() {
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	public viewleadpage verify()
	{
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@FindBy(id = "createLeadForm_companyName") WebElement elecmpname;
	@FindBy(id = "createLeadForm_firstName") WebElement elefname;
	@FindBy(id = "createLeadForm_lastName") WebElement elelname;
	@FindBy(name ="submitButton") WebElement eleclick;

	
	
	public viewleadpage entercmpname(String data) {
		type(elecmpname, data);
		return this;
	}
	
	public viewleadpage enterfname(String data) {
		type(elefname, data);
		return this;
	}
	
	public viewleadpage enterlname(String data) {
		type(elelname, data);
		return this;
	}
	
	public  viewleadpage clickcreatebutton()
	{
		click(eleclick);
		return new viewleadpage();
	}
	*/
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
