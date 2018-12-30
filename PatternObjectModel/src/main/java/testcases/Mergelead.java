package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class Mergelead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_LoginAndLogout";
		testDescription = "LoginAndLogout";
		authors = "sarath";
		category = "smoke";
		dataSheetName = "mergeleadtc";
		testNodes = "Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void login(String userName,String password,String fromid,String toid,String lid) {		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin().clickcrmsfa().clicklead().click_merge_lead().click_from_icon()
		.enterleadid(fromid).clickfleadbutton().click_fresult()
		.click_to_icon()
		.entertoleadid(toid).clickfleadbutton().click_fresult().click_mergebutton().click_alert()
		.click_find_lead().enter_lleadid_as(lid).click_flbutton();
				
		
	}
	
}
