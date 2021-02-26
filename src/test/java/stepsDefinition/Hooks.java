package stepsDefinition;

import com.cucumber.listener.Reporter;

import context.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext tstContext;
	
	public Hooks(TestContext context) {
		tstContext=context;
	}
	
	@Before
	public void beforeSteps(Scenario scenario) {
		if(scenario.getName().equals("Scenario Name")) {
			Reporter.assignAuthor("Automation Teams");}}
	
	@After(order=0)
	public void afterSteps() throws InterruptedException {
		Thread.sleep(5000);
		tstContext.getWebDrvMng().closeBrw();}
	
}
