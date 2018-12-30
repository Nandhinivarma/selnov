package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class Alertpage extends ProjectMethods {

	public Alertpage() {
		PageFactory.initElements(driver, this);
	}

	
	
	
	//@FindBy(name= "id") WebElement elefromid;
	@FindBy(xpath="//button[text()='Find Leads']") WebElement eleflbutton;	
	@FindBy(name= "id") WebElement eletoid;
	/*@FindBy(id = "createLeadForm_firstName") WebElement elefname;
	@FindBy(id = "createLeadForm_lastName") WebElement elelname;
	@FindBy(name ="submitButton") WebElement eleclick;
*/
	
	
	@FindBy(xpath="//div[@class='x-grid3-body']/div/table/tbody/tr/td/div/a") WebElement elefresult;
	
	
	
	
	
	@Given("click alert")
	public  Mergeleadpage click_alert() {
	/*@And ("click alert")
	
	public   Mergeleadpage clickalert()
	{*/
		acceptAlert();
		return new   Mergeleadpage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
