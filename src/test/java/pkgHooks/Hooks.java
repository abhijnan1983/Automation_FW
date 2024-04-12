package pkgHooks;

import io.cucumber.java.After;
import static pkgStepDefinitions.Step_Defs.driver;

public class Hooks {
	
	@After
	public void tear_down() {
		
		driver.close();
	}

}
