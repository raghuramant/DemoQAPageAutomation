package org.tasks.demoqa.DemoQA;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue={"org.tasks.demoqa.DemoQA"}, plugin = {"pretty","html:target/reports/htmlreport/"}, monochrome = true, tags ={"@textbox,@regression,@sanity"} )
public class TestRunner {

}
