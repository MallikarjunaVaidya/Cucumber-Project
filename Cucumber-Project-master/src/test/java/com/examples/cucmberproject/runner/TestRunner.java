package com.examples.cucmberproject.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features", 
					 glue= {"com.examples.cucumberproject.stepdef"},
					 plugin= {"Pretty","html:target/cucumber-reports"},
					 monochrome=true,
					 publish=true)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
