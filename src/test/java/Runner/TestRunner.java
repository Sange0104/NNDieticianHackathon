package Runner;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith (Cucumber.class)
	@CucumberOptions(
			
	features = "src/test/resources/features/",
	glue = {"stepDefinitions"},
		//glue = 	{"Runner","classpath/stepDefinitions"},
	// tags = "@blank",
	dryRun =false,
	monochrome = true,

	plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
	"html:target/HtmlReports1/report.html",
	"pretty",	"json:target/JSONReports/report.json",
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	"junit:target/JUnitReports/report.xml"
	}
	)
	

	public class TestRunner {


	}

