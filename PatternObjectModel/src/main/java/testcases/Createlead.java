package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class Createlead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_LoginAndLogout";
		testDescription = "LoginAndLogout";
		authors = "sarath";
		category = "smoke";
		dataSheetName = "createleadtc";
		testNodes = "Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void login(String userName,String password,String cmpname,String fname,String lname) {		
		/*new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin().clickcrmsfa().clicklead().clickcreatelead().entercmpname(cmpname).enterfname(fname).enterlname(lname).clickcreatebutton().verify();*/
//		.clickLogout();
				
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password).clickLogin().clickcrmsfa().clicklead().clickcreatelead().entercmpname(cmpname).enterfname(fname).enterlname(lname).clickcreatebutton();
		
	}
	
}
