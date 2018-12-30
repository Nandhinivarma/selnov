package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)


/*@CucumberOptions(features= "src\\test\\java\\feature\\Login.feature",
				glue="steps",monochrome=true)//,dryRun=true,snippets=SnippetType.CAMELCASE)
*/		


@CucumberOptions(features= "src\\test\\java\\feature\\Merge.feature",
glue="steps",monochrome=true)//,dryRun=true,snippets=SnippetType.CAMELCASE)

public class Runstep {
	
	
	

}



