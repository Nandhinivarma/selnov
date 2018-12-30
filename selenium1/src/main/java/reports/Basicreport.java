package reports;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Basicreport {

	static ExtentHtmlReporter html;
	static ExtentReports extent;
	ExtentTest test;
	public String testcaseName,testDesc,author,category,fileName;
	@BeforeSuite(groups="common")
	public void startreport() {
		 html=new ExtentHtmlReporter("./reports/result.html");
			html.setAppendExisting(true);
			 extent=new ExtentReports();
			extent.attachReporter(html);
	}
	
	@BeforeMethod(groups="common")
	public void starttest()
	{
		test = extent.createTest(testcaseName, testDesc);
		test.assignAuthor(author);
		test.assignCategory(category);
	}

	public void logstep(String status,String desc) 
	{
		if(status.equalsIgnoreCase("pass"))
		{
			test.pass(desc);
		}
		
		else if(status.equalsIgnoreCase("fail"))
		{
			test.fail(desc);
		}
		else if(status.equalsIgnoreCase("warn"))
		{
			test.warning(desc);
		}
	}
	
	
	public void runReport() throws IOException
	{
		test.pass("user name is entered",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		
		test.assignAuthor("nandhu");
test.assignCategory("smoke");		
			
	}
	
	@AfterSuite(groups="common")
	
	public void endreport()
	{
		extent.flush();
	}
	
	
	
	
}
