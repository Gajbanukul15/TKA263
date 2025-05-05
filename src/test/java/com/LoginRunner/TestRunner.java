package com.LoginRunner;


	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features= "L:\\AutomationByKiran\\H_Project_Cucumber_BDD\\FeatureFile\\Login.feature", 
	glue= "com.StepDefination", 
	tags = "@runThis",
	dryRun= false,
	monochrome= true,
	plugin = {"html:target/cucumber-reports/htmlReport.html"}
	
			)

	public class TestRunner {
		
	}
	
