package pkgStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pkgTest.Page_Objects_Home_Page;
import pkgTest.Page_Objects_Search_Page;
import pkgTest.setupUtils;

public class Step_Defs extends setupUtils {
	
	Page_Objects_Home_Page PO_HomePage;
	Page_Objects_Search_Page PO_SearchPage;
	
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
	
	@And("browse parts button should be disabled")
	public void validate_browse_parts_disable_state() {
		PO_HomePage.validate_browse_parts_disabled();
	}
	
	@When("^I select vehicle year (.+)$")
	public void select_year(String year) {
		PO_HomePage.select_vehicle_year(year);
	}
	
	@When("^I select vehicle make (.+)$")
	public void select_make(String make) {
		PO_HomePage.select_vehicle_make(make);
	}
	
	@When("^I select vehicle model (.+)$")
	public void select_model(String model) {
		PO_HomePage.select_vehicle_model(model);
	}
	
	@When("^I select vehicle trim (.+)$")
	public void select_trim(String trim) {
		PO_HomePage.select_vehicle_trim(trim);
	}
	
	@When("^I select vehicle engine (.+)$")
	public void select_engine(String engine) throws InterruptedException {
		PO_HomePage.select_vehicle_engine(engine);
	}
	
	@Then("browse parts button should be enabled")
	public void validate_browse_parts_enabled() {
		PO_HomePage.validate_browse_parts_button_enable();
	}
	
	@When("I click on Browse Parts button")
	public void click_browse_parts_button() {
		PO_HomePage.click_browse_parts_button();
	}
	
	@Then("Page should launch displaying Change vehicle and Browse Parts button and also vehicle name")
	public void validate_after_click_browse_parts() throws InterruptedException {
		PO_HomePage.validate_page_after_clicking_browse_parts();
	}
	
	@When("I click on first filter option in search page")
	public void click_first_filter_option_search_page() {
		PO_SearchPage=new Page_Objects_Search_Page(driver);
		PO_SearchPage.click_first_filter_option();
	}
	
	@Then("number of items should match with number displayed in filter option")
	public void validate_number_of_items_search_page() {
		
		PO_SearchPage.validate_item_count_after_clicked_filter_option();
	
	}
		
	
	 
	
	
	
	

}
