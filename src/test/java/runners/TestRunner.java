package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

	
	features="src\\test\\resources\\features",
	glue ="stepDefinations",	
	plugin= {"pretty","html:target/cucucmberReport.html"},
	tags="@tc3"
	
)

public class TestRunner { 

}