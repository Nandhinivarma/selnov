package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class findleadwindowpage extends ProjectMethods {

	public findleadwindowpage() {
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(name= "id") WebElement elefromid;
	@FindBy(xpath="//button[text()='Find Leads']") WebElement eleflbutton;	
	@FindBy(name= "id") WebElement eletoid;
	/*@FindBy(id = "createLeadForm_firstName") WebElement elefname;
	@FindBy(id = "createLeadForm_lastName") WebElement elelname;
	@FindBy(name ="submitButton") WebElement eleclick;
*/
	
	//@FindBy (how = How.XPATH, using = "//div[@class='x-grid3-body']/div/table/tbody/tr/td/div/a") WebElement eleFirstTableValue
	@FindBy(xpath="//div[@class='x-grid3-body']/div/table/tbody/tr/td/div/a") WebElement elefresult;
	@Given("click fresult")
	public Mergeleadpage click_fresult() {
	/*@And ("click fresult")
	public  Mergeleadpage clickfresult()
	{*/
		clickWithNoSnap(elefresult);
		switchToWindow(0);
		return new  Mergeleadpage();
	}

	
	
	@And ("click  fbutton")
	public findleadwindowpage clickfleadbutton()
	{
		click(eleflbutton);
		return this;
	}
	
	
	
	//@Given("enter flead id as {int}")
	//public findleadwindowpage enter_flead_id_as(String data) {
	@And(" enter flead id as (.*)")
	public  findleadwindowpage enterleadid(String data)
	{
		
		type(elefromid,data);
		return this;
	}
	
	@Given("click  fbutton")
	public findleadwindowpage click_fbutton() {
	/*@And(" click  fbutton")
	public findleadwindowpage clicktleadbutton()
	{*/
		click(eleflbutton);
		return this;
	}
	@Given("click fresult")
	public Mergeleadpage click_lresult() {
	/*@And ("click fresult")
	public  Mergeleadpage clickftresult()
	{*/
		clickWithNoSnap(elefresult);
		switchToWindow(0);
		return new  Mergeleadpage();
	}
	public  findleadwindowpage enterfleadid(String data)
	{
		//type(elefromid,"123445");
		type(elefromid,data);
		return this;
	}
	public  findleadwindowpage entertleadid(String data)
	{
		//type(elefromid,"123445");
		type(eletoid,data);
		return this;
	}
	
	/*public findleadwindowpage clickfleadbutton()
	{
		click(eleflbutton);
		return this;
	}*/
	
	@And ("enter tlead id as (.*)")
	public  findleadwindowpage entertoleadid(String data)
	{
		//type(elefromid,"123445");
		type(eletoid,data);
		return this;
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
