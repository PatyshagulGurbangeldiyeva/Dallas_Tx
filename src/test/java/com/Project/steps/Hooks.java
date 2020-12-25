package com.Project.steps;

import com.Project.testbase.BaseClass;
import com.Project.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	@Before
	public void start() {
		BaseClass.setUp();
	}
	
	@After
	public void end(Scenario scenario) {
	
		byte[] pic;
		if (scenario.isFailed()) {
			
			pic=CommonMethods.takeScreenshot("failed/"+scenario.getName());// it return an array of bytes as screenshot
		}else {
			pic=CommonMethods.takeScreenshot("passed/"+scenario.getName());
		}
		
		scenario.attach(pic, "image/png", scenario.getName());
		BaseClass.tearDown();
	}

}
