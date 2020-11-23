package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\Eclipse workspace\\Cucumber11.30\\src\\test\\resources\\adactin.feature"
, glue = "org.stepdef"
,dryRun = false  
,monochrome = true
,snippets = SnippetType.CAMELCASE )
public class TestRunner {

}
