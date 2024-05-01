package pkgCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/pkgCucumber",
glue={"pkgStepDefinitions","pkgHooks"},
monochrome=true,
tags="@newscript",
plugin= {"html:target/cucumber.html"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
