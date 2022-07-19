package StepDefination;


	import org.junit.runner.RunWith;

	import io.cucumber.junit.CucumberOptions;
	import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/main/resources/Features/parameterization.feature",
	glue= {"StepDefination"},monochrome=true, 
	plugin= {"pretty","html:reports/htmlReport/html", 
	"json:report/JsonReports/Cucumber.json",
	"junit:reports/junitReport/reports.xml"})
	public class TestRunnerParameterization {
	
}
