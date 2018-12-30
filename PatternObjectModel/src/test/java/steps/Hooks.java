package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods {

	
	
	
	@Before
	public void beforeSuite(){
		startResult();
	}
	public void beforeClass(){		
		startTestModule(testCaseName, testDescription);	
	}

	public void beforeMethod(){
		test = startTestCase(testNodes);
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp("chrome", "http://leaftaps.com/opentaps");		
	}
	public void before(Scenario sc)
	{
		System.out.println(sc.getName());
		System.out.println(sc.getId());
	}
	
	@After
	public void afterSuite(){
		endResult();
	}
	public void after(Scenario sc)
	{
		System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());
	}
	
	public void afterMethod(){
		closeAllBrowsers();

	}

	
	
	
}
