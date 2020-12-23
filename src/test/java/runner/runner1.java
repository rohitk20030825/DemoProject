package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/feature/test.feature",
plugin= {"pretty","html:target/cucumber-html-report.html"},
glue= {"stepdefinition"})
public class runner1 extends AbstractTestNGCucumberTests{

}
