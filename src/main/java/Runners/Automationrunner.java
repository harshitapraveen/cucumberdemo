package Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/Automate.feature"},tags= {"@login"}
,glue={"StepDefinition"},
plugin= {"pretty","html:target/cucumber-reports"},
	monochrome=true)

public class Automationrunner {

}

//@login
//@example
