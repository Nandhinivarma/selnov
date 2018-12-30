package week4.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Duplicatetestcase extends SeMethods {
	//@Test
@Test(dataProvider="fetchData")
//	public void login() 
public void duplicate(String cname,String fname,String lname)
{
	
	//dologin()
	//click lead
 	 WebElement elelead=locateElement("linktext","Leads");
 	 click(elelead);
 	 //click find lead
  	 WebElement elefind=locateElement("linktext","Find Leads");
  	 click(elefind);
  	 //click email
    WebElement elemail=locateElement("linktext","Email");
    click(elemail);
  //enter email
    WebElement elemailid=locateElement("name","emailAddress");
    click(elemailid);
    //click find lead button
    WebElement elebutton=locateElement("linktext","Find Leads");
    click(elemailid);
    
	}    
	
	@DataProvider(name="fetchData")
	public  String[][] getData()
	{
		String[][] data=new String[2][3];
		data[0][0]="abc";
		data[0][1]="ajay";
		data[0][2]="k";
	
		
		
		data[1][0]="abc";
		data[1][1]="nithis";
		data[1][2]="v";
		return data;
	}	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

