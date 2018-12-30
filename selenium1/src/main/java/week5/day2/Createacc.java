package week5.day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Projectspecificmethod;

public class Createacc extends Projectspecificmethod{

	@BeforeClass 
	public void setData()
	{
		testcaseName= "tc01_createlead";
		testDesc= "create lead";
		author= "nandhini";
		category= "smoke";
	}
	//@Test
	@Test(dataProvider="fetchdata")
	//public void login()
	public void createacc(String accname,String city,String mail)
	{
		//login
	
	/*WebElement elecr=locateElement("linktext","CRM/SFA");
	click(elecr);*/
    //click acc
    WebElement eleacc=locateElement("linktext","Accounts");
    click(eleacc);
    //click create acc
    WebElement elecracc=locateElement("linktext","Create Account");
    click(elecracc);
    //enter acc name
    WebElement elename=locateElement("id","accountName");
   // type(elename,"nandhinimathu") ;
    type(elename,accname);
    //select indus
    WebElement eleindus=locateElement("name","industryEnumId");
    selectDropDownUsingText(eleindus,"Computer Software");
      
    //select prefered currency
    WebElement elecurr=locateElement("id","currencyUomId");
    selectDropDownUsingText(elecurr,"INR - Indian Rupee");
	//select source
    WebElement elesource=locateElement("id","dataSourceId");
    selectDropDownUsingValue(elesource,"LEAD_EMPLOYEE");
    //select marketing camp
    WebElement elemark=locateElement("id", "marketingCampaignId");
    selectDropDownUsingIndex(elemark,3);
    
	//enter phno
    WebElement elephno=locateElement("id","primaryPhoneNumber");
    type(elephno,"9123456780") ;
    //enetr city
    WebElement elecity=locateElement("id","generalCity");
   // type(elecity,"chennai") ;
    type(elecity,city);
    //enetr email
    WebElement elemail=locateElement("id","primaryEmail");
   // type(elemail,"mkanshduu@gmail.com") ;
    type(elemail,mail);
    //select country
    WebElement elecoun=locateElement("id", "generalCountryGeoId");
    selectDropDownUsingText(elecoun,"India");
    
    //select state
    WebElement elestate=locateElement("id", "generalStateProvinceGeoId");
    selectDropDownUsingText(elestate,"TAMILNADU");
    //click create button
    WebElement elecrbut=locateElement("classname","smallSubmit");
    click(elecrbut);
    //click find acc
    WebElement eleaccfnd=locateElement("linktext","Find Accounts");
    click(eleaccfnd);
  //To get the value in String
    /*WebElement elecap = locateElement("xpath","//a[text()='Find Accounts']");
    click()*/
	  WebElement elecap=locateElement("xpath", "(//span[@class='tabletext'])[3]");
	String getAccountIdText = getText(elecap);
	System.out.println(getAccountIdText);
	
	//String replaceAllCharrectersOnly = getAccountIdText.replaceAll("//D", ""); //to Remove All Strings
	//System.out.println(getAccountIdText.replaceAll("//D", "")); 
	String replaceAllIntegerOnly = getAccountIdText.replaceAll("[^0-9]", "");
	System.out.println(replaceAllIntegerOnly);
//Converting the String into a integer
//	int parseInt1 = Integer.parseInt(replaceAll1); This is NOT NEEDED here But this is the metd to convert string to Int
    //capture acc id
    /*WebElement eletext= locateElement("xpath" , "(//span[@class='tabletext'])[3]");  
           String text = getText(eletext);
         // int accid= Integer.parseInt(text.replaceAll("\\D", ""));
          
          String newid= text.replaceAll("\\D", "");*/
           
   
    //enter acc name
    WebElement eleaccn=locateElement("linktext","Find Accounts");
    click(eleaccn) ;

	WebElement eleAccname = locateElement("xpath", "(//input[@name='accountName'])[2]");
	String text1 = getText(elecap);
	String leadAccName = text1.replaceAll("[a-zA-Z]", "");
	System.out.println(leadAccName);
	
	WebElement eleId = locateElement("name", "id");
	type(eleId, replaceAllIntegerOnly);
   /* //enetr acc id
    WebElement eleaid=locateElement("xpath","(//span[@class='tabletext'])[1]");
    type(eleaid,newid) ;
    //click button
    WebElement elefacc=locateElement("xpath","//button[text()='Find Accounts']");
    click(elefacc);*/
    
    //verify
    //close browser
    //closebrowser();
    
	}
	
	@DataProvider(name="fetchdata")
	public String [][] getdata()
	{
		String[][] data=new String[2][3];
		data[0][0]="nandhini";
		data[0][1]="chennai";
		data[0][2]="mknandhu@gmail.com";
		
		data[1][0]="sindhu";
		data[1][1]="chennai";
		data[1][1]="mksindhu@gmail.com";
		
	
	return data;
	}
	
	
		
	
}
