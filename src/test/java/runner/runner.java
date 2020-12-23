package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/test.feature",
plugin= {"pretty","html:target/cucumber-html-report.html"},
glue= {"stepdefinition"},
monochrome=true,
dryRun=false)
public class runner{

}
