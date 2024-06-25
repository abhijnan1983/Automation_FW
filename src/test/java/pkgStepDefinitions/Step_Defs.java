package pkgStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pkgTest.Page_Objects_Cart_Page;
import pkgTest.Page_Objects_Checkout_Page;
import pkgTest.Page_Objects_Home_Page;
import pkgTest.Page_Objects_Product_Details_Page;
import pkgTest.Page_Objects_Search_Page;
import pkgTest.setupUtils;

public class Step_Defs extends setupUtils {
	
	Page_Objects_Home_Page PO_HomePage;
	Page_Objects_Search_Page PO_SearchPage;
	Page_Objects_Product_Details_Page PO_ProductDetailsPage;
	Page_Objects_Cart_Page PO_Cart_Page;
	Page_Objects_Checkout_Page PO_Checkout_Page;
	
	public static WebDriver driver;
	
	@When("^I land on home  using (.+)$")
	public void launch_page(String browser) throws InterruptedException {
		

		//WebDriver driver;
		driver=setupUtils.setDriver(browser);
		driver.manage().deleteAllCookies();
		driver.get("https://www.partsource.ca/");
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		
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
	
	@When("^I enter SKU (.+) number for product search$")
	public void enter_sku_number(String SKU) {
		PO_HomePage.enter_skunum(SKU);
	}
	
	@And("hit Enter key")
	public void hit_enter_key() {
		PO_HomePage.hit_enter_key();
	}
	
	@Then("product link should be displayed")
	public void validate_product_link_display() {
		PO_HomePage.validate_display_of_product_link();
	}
	
	@When("I click product link")
	public void click_product_link() {
		PO_HomePage.click_product_link();
		
	}
	
	@Then("product details page should be displayed with thumbnail images")
	public void validate_product_details_page_displayed() {
		PO_ProductDetailsPage=new Page_Objects_Product_Details_Page(driver);
		PO_ProductDetailsPage.validate_thumbnail_images();
		
	}
	
	@When("I hover on stars and click read review")
	public void hover_on_stars_click_review() {
		PO_ProductDetailsPage.hover_on_stars_click_read_review();
	}
	
	@Then("Review should be displayed")
	public void review_should_display() throws InterruptedException {
		PO_ProductDetailsPage.display_review();
	}
	
	@When("I as user click Add to Cart button")
	public void click_add_to_cart_button() {
		PO_ProductDetailsPage.click_add_to_cart_button();
	}
	
	@Then("Added to your Cart header should be displayed")
	public void added_to_cart_banner_displayed() throws InterruptedException {
		PO_ProductDetailsPage.validate_added_to_cart_header();
	}
	
	@When("I as user click View Cart")
	public void click_vew_cart() {
		PO_ProductDetailsPage.click_view_cart();
	}
	
	@Then("Cart page should be displayed")
	public void cart_page_displayed() {
		
		PO_Cart_Page=new Page_Objects_Cart_Page(driver);
		PO_Cart_Page.cart_page_url();
		
	}
		
	@And("pickup store should be displayed")
	public void pick_up_store_cart_page() {
		PO_Cart_Page.validate_cart_selected_store();
	}
	
	@And("Subtotal should be displayed")
	public void subtotal_display() {
		PO_Cart_Page.validate_cart_subtotal();
	}
	
	@And("^I as user should be able to change to qty to (.+)$")
	public void change_cart_line_item_qty(String QTY) {
		PO_Cart_Page.change_line_item_qty_cart(QTY);
	}
	
	@And("Reserve online checklist should be displayed")
	public void validate_reserve_online_checklist() {
		PO_Cart_Page.reserve_online_checklist_display();
	}
	
	@When("I as user click Reserve Now button")
	public void click_reserve_now_button() {
		PO_Cart_Page.click_reserve_now_button();
	}
	
	@Then("Checkout page should be displayed")
	public void checkout_page_displayed() {
		PO_Cart_Page.land_checkout_page();
	}
	
	@And("cursor should be on email address field when checkout page is launched")
	public void cursor_in_email_field() {
		
		PO_Checkout_Page=new Page_Objects_Checkout_Page(driver);
		PO_Checkout_Page.validate_active_element_page_launch();
		
	}
	
	@And("Item thubnail image should be displayed")
	public void checkout_page_image_thumbnail() {
		PO_Checkout_Page.validate_item_image_thumbnail_displayed_checkout_page();
	}
	
	@And("product name should be displayed")
	public void checkout_page_product_name_display() {
		PO_Checkout_Page.checkout_page_validate_product_name();
	}
	
	@And("total pre-tax should be displayed")
	public void checkout_page_total_pretax() {
		PO_Checkout_Page.checkout_page_total_display();
	}
	
	@When("^I as user enter email address (.+)$")
	public void enter_email(String email) {
		PO_Checkout_Page.enter_email_address(email);
		
	}
	
	@And("click on consent checkbox")
	public void click_consent_checkbox() {
		PO_Checkout_Page.click_consent_checkbox();
	}
	
	@And("^enter first name (.+)$")
	public void enter_fname(String fname) {
		PO_Checkout_Page.enter_firstname(fname);
		
	}
	
	@And("^enter last name (.+)$")
	public void enter_lname(String lname) {
		PO_Checkout_Page.enter_lname(lname);
	}
	
	@And("^enter address (.+)$")
	public void enter_address(String address) {
		PO_Checkout_Page.enter_address(address);
	}
	
	@And("^enter Apartment number (.+)$")
	public void enter_aptnum(String aptnum) {
		PO_Checkout_Page.enter_aptnum(aptnum);
	}
	
	@And("^enter City (.+)$")
	public void enter_city(String city) {
		PO_Checkout_Page.enter_city(city);
	}
	
	@And("^select province (.+)$")
	public void select_province(String province) {
		PO_Checkout_Page.select_province(province);
	}
	
	@And("^enter postal code (.+)$")
	public void enter_postal_code(String postal_code) {
		PO_Checkout_Page.enter_postal_code(postal_code);
	}
	
	@And("^enter phone number (.+)$")
	public void enter_phone_number(String phone_number) {
		PO_Checkout_Page.enter_phone_number(phone_number);
	}
	
	@And("Click Continue button")
	public void click_continue_button_checkout_page() {
		PO_Checkout_Page.click_continue_button();
	}
	
	@Then("order placement page should be displayed")
	public void display_order_place_page() {
		PO_Checkout_Page.navigate_to_order_placement_page();
	}
	
	@And("tooltip text should be displayed on hovering mouse on question mark in phone number field")
	public void validate_tooltip_text() {
		PO_Checkout_Page.validate_tooltip_text_messageon_hovering_question_mark_phone_field();
	}
	
	@And("I verify that accessiblity icon is displayed on scrolling the page to the bottom")
	public void validate_accessiblity_icon() {
		
		PO_HomePage.validate_accessiblity_icon_page_scroll();
		
	}
		
	
	
	
	

}
