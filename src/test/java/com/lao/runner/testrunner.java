package com.lao.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/resources",
		glue="com.lao.step_definition",
		dryRun = false,
		monochrome = true
		)
public class testrunner {
	
	//System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");

}
