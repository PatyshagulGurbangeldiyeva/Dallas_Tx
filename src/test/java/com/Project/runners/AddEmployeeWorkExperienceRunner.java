package com.Project.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		features="src/test/resources/features/",
		
		glue="com/Project/steps",
		dryRun=false, // if you will use false we will run code, if true just feature will run
		monochrome=true
		,strict=true // if you have an implemented steps it will not run
		, tags="@sendKeys"
		,plugin= {
				"pretty",
				"html:target/cucumber-default-report",//create basic html report in specified location
				"json:target/cucumber.json",
				"rerun:target/failed.txt"
		}
		
		
		
		)




public class AddEmployeeWorkExperienceRunner {

}
