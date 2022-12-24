package feature;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*@ExtendedCucumberOptions(jsonReport = "target/cucumber-report.json", overviewReport = true, outputFolder = "${user.dir}/DATE(dd-MM-yyyy)", reportPrefix = "results-${user}", jsonUsageReport = "target/cucumber-usage.json", usageReport = true, toPDF = true

)*/

@CucumberOptions(
		features = { "src/test/java/feature/login.feature" }, 
		glue = { "pages","tests" }, 
		monochrome = true, 
		plugin = { "pretty", "json:target/cucumber-report-alex.json", "html:target/cucumber-reports/report.html" }, 
		tags = "@cucumbertest"
		)
// ,plugin = {"pretty",$jsonFile,"html:target/cucumber-reports/report.html" }
// ,plugin= {$test}



public class TestRunner extends AbstractTestNGCucumberTests {

	/*
	 * public LocalDateTime DT = LocalDateTime.now();
	 * 
	 * @BeforeTest
	 * 
	 */
	/*
	 * private TestNGCucumberRunner testNGCucumberRunner;
	 * 
	 * @BeforeClass(alwaysRun = true) public void setUpClass() throws Exception {
	 * testNGCucumberRunner = new TestNGCucumberRunner(this.getClass()); }
	 * 
	 * @Test(groups = "cucumber", description = "Runs Cucumber Feature",
	 * dataProvider = "features") public void feature(CucumberFeatureWrapper
	 * cucumberFeature) {
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @AfterClass(alwaysRun = true) public void tearDownClass() throws Exception {
	 * testNGCucumberRunner.finish(); }
	 */
}
