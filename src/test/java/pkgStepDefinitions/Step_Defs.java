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
	public static WebDriver driver;
	
	@When("^I land on home  using (.+)$")
	public void launch_page(String browser) throws InterruptedException {
		

		//WebDriver driver;
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
	
	
    @And("^I should be able to set up my store in (.+)$") 
	public void setup_my_store(String postalcode) throws InterruptedException {
	PO_HomePage.select_store(postalcode); }
	  
	@And("rolling images for ads should be displayed")
	public void rolling_images() throws InterruptedException {
		PO_HomePage.ads_rolling_images();
	}
	
	@And("top brands section should display new brands on clicking right arrow key in the section")
	public void top_brands() {
		PO_HomePage.verify_top_brands();
	}
	
	@And("hiring banner should be displayed")
	public void hiring_banner() {
		PO_HomePage.hiring_banner_display();
	}
	
	@And("find store banner should be displayed")
	public void find_store_banner() {
		PO_HomePage.find_store_banner();
	}
	 
	
	
	
	

}
