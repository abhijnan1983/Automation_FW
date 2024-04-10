package pkgTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UITest extends setupUtils {
	
	
	Page_Objects_Home_Page PO_HomePage;
	
	@BeforeTest
	@Parameters("browser")
	public void initialize_Driver(String browser,ITestContext context) throws IOException {
		
		WebDriver driver;
		driver=setDriver(browser);
		context.setAttribute("WebDriver", driver);
		
		PO_HomePage=new Page_Objects_Home_Page(driver);
		
		driver.get("https://www.partsource.ca/");
		driver.manage().window().maximize();
		
		
		
	}
	
	//Test Case to close the pop up after launching the website
	@Test(priority=1)
	public void close_pop_up() {
		
		PO_HomePage.close_pop_up();
		
	
	}
	
	//Test case to validate that logo is displayed in the home page
	@Test(priority=2)
	public void validate_logo() {
		Assert.assertTrue(PO_HomePage.logo_displayed());
	}
	
	//Test case to validate that reserve online message is displayed in home page
	@Test(priority=3)
	public void validate_reserve_online_message() {
		Assert.assertTrue(PO_HomePage.reserve_online_message_display());
	}

}
