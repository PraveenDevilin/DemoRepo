package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\Eclipse workspace\\Cucumber11.30\\src\\test\\resources\\log.feature", glue = "org.stepdef")
public class TestRunner {

}
