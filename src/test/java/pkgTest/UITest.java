package pkgTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UITest extends setupUtils {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void initialize_Driver(String browser,ITestContext context) throws IOException {
		
		
		driver=setDriver(browser);
		context.setAttribute("WebDriver", driver);
		
		
		
	}
	
	@Test
	public void launch_site() {
		driver.get("https://www.partsource.ca/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement logo=driver.findElement(By.id("abc"));
		logo.click();

	}

}
