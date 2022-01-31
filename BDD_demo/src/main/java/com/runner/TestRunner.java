package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/features",
		glue="com.stepdefs",
		//plugin=""
		//or	
	   format={"html:target"},
		//dryRun=true // compile features file 
	    dryRun=false ,// run
		monochrome=true ,// used for readable output
	//	tags={"@login","@logo"}// 2 scenerio // tags are used to run a specific scenario/feature
		tags="@login"
		)
public class TestRunner {

}
