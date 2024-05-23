package pkgHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

import static pkgStepDefinitions.Step_Defs.driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
	
	@After()
	public void tear_down() {
		
		driver.quit();
	}
	
	@AfterStep()
	public void attach_screenshot(Scenario scenario) {
		
		if(scenario.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", screenshot.toString());
			
		}
		
	}

}
