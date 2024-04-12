package pkgStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pkgTest.Page_Objects_Home_Page;
import pkgTest.setupUtils;

public class Step_Defs extends setupUtils {
	
	Page_Objects_Home_Page PO_HomePage;
	
	@When("^I land on home  using (.+)$")
	public void launch_page(String browser) throws InterruptedException {
		

		WebDriver driver;
		driver=setupUtils.setDriver(browser);
		driver.manage().deleteAllCookies();
		driver.get("https://www.partsource.ca/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Then("I verify that pop-up is closed")
	public void close_pop_up() {
		PO_HomePage=new Page_Objects_Home_Page(driver);
		PO_HomePage.close_pop_up();
	}
	
	@And("Application logo should be displayed in home page")
	public void validate_logo() {
		Assert.assertTrue(PO_HomePage.logo_displayed());
	}
	
	@And("reserve online message should be displayed in home page")
	public void reserve_online_message_displayed() {
		Assert.assertTrue(PO_HomePage.reserve_online_message_display());
	}
	
	
	
	

}
