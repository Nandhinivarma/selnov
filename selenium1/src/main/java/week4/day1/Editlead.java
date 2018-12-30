package week4.day1;

	
	import org.openqa.selenium.WebElement;
		
	import org.testng.annotations.Test;

	import wdMethods.SeMethods;



		
	public class Editlead extends SeMethods{
			
			
	@Test ( priority =1, groups= "sanity", dependsOnGroups="smoke") /* (dependsOnMethods="testcases.CreateLeads1.createLead")  */ 
		
		public void editLead() throws InterruptedException {
				
			
		
	startApp("chrome", "http://leaftaps.com/opentaps");
				
				
	WebElement eleUsername = locateElement("id", "username");
				
	type(eleUsername, "DemoSalesManager");
				
	WebElement elePassword = locateElement("id", "password");
				
	type(elePassword, "crmsfa");
				
				
	WebElement eleClickLogin = locateElement("classname", "decorativeSubmit");
				
	click(eleClickLogin);
				
				
	WebElement eleClickCRMSFA = locateElement("linkText", "CRM/SFA");
		       
	 click(eleClickCRMSFA);
		        
		       
	 //creat lead icon
		       
	 WebElement elelead= locateElement("linkText", "Leads");
		       
	 click(elelead);
		        
		       
	 WebElement eleFindLead = locateElement("linkText", "Find Leads");
		       
	 click(eleFindLead);
		        
		      
	  WebElement eleFirstName = locateElement("xpath", "(//input[@name='firstName'])[3]");
		    
	    type(eleFirstName, "sakthi");
		        
		      
	  WebElement eleButton = locateElement("xpath", "//button[text()='Find Leads']");
		    
	    click(eleButton);
		        

	Thread.sleep(2000);
		        
		      
	  WebElement eleFirstResult = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		   
	     click(eleFirstResult);
		        
		       
	 verifyTitle("View Lead | opentaps CRM");
		        
		      
	  WebElement eleEdit = locateElement("linkText", "Edit");
		     
	   click(eleEdit);
		        
		        
	locateElement("id", "updateLeadForm_companyName").clear();
		        
		  
	      type(locateElement("id", "updateLeadForm_companyName"), "TestLeaf");
		        
		
	        WebElement eleUpdate = locateElement("classname", "smallSubmit");
		    
	    click(eleUpdate);
		        
		      
	  closeBrowser();
		        
		        
			}

			}

