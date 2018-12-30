package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class Mergeleadpage extends ProjectMethods {

	public Mergeleadpage() {
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath = "(//img[@alt='Lookup'])[1]") WebElement elefromicon;
	@FindBy(xpath ="//a[text()='Merge']") WebElement elemergebutton;
	@FindBy(xpath = "(//img[@alt='Lookup'])[2]") WebElement eletoicon;
	@FindBy(linkText ="Find Leads") WebElement elefindlead;
	//@FindBy(id = "createLeadForm_lastName") WebElement elelname;
	//@FindBy(name ="submitButton") WebElement eleclick;

	
	@Given("click from icon")
	public findleadwindowpage click_from_icon() {
	//@And ("click from icon")
	
		clickWithNoSnap(elefromicon);
		switchToWindow(1);
		return new findleadwindowpage() ;
	}
//	public  findleadwindowpage movetoWindow(int index)
//	{
//		switchToWindow(index);
//		return new findleadwindowpage();
//	}

 @Given("click to icon")
 public findleadwindowpage click_to_icon() {
	/*@And ("click to icon")
	public  findleadwindowpage clicktoicon()
	{*/
		clickWithNoSnap(eletoicon);
		switchToWindow(1);
		return new findleadwindowpage() ;
	}
 
	@And ("click alert")
	public Mergeleadpage acceptalert()
	{
		acceptAlert();
		return this;
	}
	
	/*public  findleadwindowpage switchwindow()
	{
		switchToWindow(1);
		return new findleadwindowpage();
	}*/
	
	@Given("click mergebutton")
	public Alertpage click_mergebutton() {
	/*@And ("click mergebutton")
public Alertpage clickmergebutton()
{*/
	click(elemergebutton);
	return new Alertpage();
}
	
	@Given("click find lead")
	public findleadpage click_find_lead() {
	/*@And ("click find lead")
	
public findleadpage clickfindlead()
{*/
	click(elefindlead);
	return new findleadpage();
}	
	

	
	
	
	
	
	
	
	
	
	
}	
	/*
	public Mergeleadpage entercmpname(String data) {
		type(elecmpname, data);
		return this;
	}
	
	public Mergeleadpage enterfname(String data) {
		type(elefname, data);
		return this;
	}
	
	public Mergeleadpage enterlname(String data) {
		type(elelname, data);
		return this;
	}
	*/
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
