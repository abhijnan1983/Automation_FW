package pkgTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Page_Objects_Home_Page extends ReusableComps {
	
	WebDriver driver;
	JavascriptExecutor js;
	Actions a;
	Select s;

	String url;
	String brand_name;
	
	public Page_Objects_Home_Page(WebDriver driver) {
		super(driver);
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	//Declare Findby annotations for Page Factory model
    @FindBy(css="div#m-1635532295580>div+div")
    WebElement popup_close_button;
    
    @FindBy(css="div#shopify-section-static-header-2 section div+div>div td a img")
    WebElement home_page_logo;
    
    @FindBy(css="div#shopify-section-static-header-2>div:nth-of-type(1)>div:nth-of-type(1)")
    WebElement reserve_online_message;
    
    @FindBy(css="td#desktop_myStore input")
    WebElement find_store_button;
    
    @FindBy(css="input#address_search")
    WebElement postal_code_entry;
    
    @FindBy(css="button#submitBtn")
    WebElement submit_button;
    
    @FindBy(css="input#btn_PS719")
    WebElement make_my_store_button;
    
    @FindBy(css="div#m-1689863456011>div:nth-child(1)>div:nth-child(1)>div>div:nth-child(3)")
    WebElement image_one;
    
    @FindBy(css="div#m-1689863456011>div:nth-child(1)>div:nth-child(1)>div>div:nth-child(4)")
    WebElement image_two;
    
    @FindBy(css="div#m-1689863456011>div:nth-child(1)>div:nth-child(1)>div>div:nth-child(5)")
    WebElement image_three;
    
    @FindBy(css="div#m-1689863456011>div:nth-child(1)>div:nth-child(1)+div>button:nth-child(1)")
    WebElement arrow_left;
    
    @FindBy(css="div#m-1689863456011>div:nth-child(1)>div:nth-child(1)+div>button:nth-child(2)")
    WebElement arrow_right;
    
    @FindBy(css="div#c-1730303009352 h1")
    WebElement top_brands_header;
    
    @FindBy(css="div[class='owl-item active'] a")
    List<WebElement> top_brands_active_items;
    

    @FindBy(css="div#m-1689865380373>div>div:nth-child(2)>button:nth-child(2)")
    WebElement top_brands_right_arrow;
    
    @FindBy(css="div#e-1661522315904")
    WebElement hiring_banner;
    
    @FindBy(css="div#r-1573160384857")
    WebElement find_store_banner;
    
    @FindBy(css="input#vid_browse")
    WebElement browse_parts_button;
    
    @FindBy(css="select#ymm_year")
    WebElement vehicle_year;
    
    @FindBy(css="select#ymm_make")
    WebElement vehicle_make;
    
    @FindBy(css="select#ymm_model")
    WebElement vehicle_model;
    
    @FindBy(css="select#ymm_trim")
    WebElement vehicle_trim;
    
    @FindBy(css="select#ymm_engine")
    WebElement vehicle_engine;
    
    @FindBy(css="div#YMM_bar>span:nth-child(2)>div>span+input")
    WebElement change_vehicle_button;
    
    @FindBy(css="div#YMM_bar>span:nth-child(2)>div>span+input+input")
    WebElement browse_parts_button_2;
    
    @FindBy(css="input#psHeaderSearchTextBox")
    WebElement item_search_field;
    
    @FindBy(css="div[class='boost-pfs-filter-product-bottom'] a")
    WebElement product_link;
    
    @FindBy(css="div#userwayAccessibilityIcon>span>img")
    WebElement accessiblity_icon;
    
    //Declare by annotation to use for explicit wait
    By popup_close_button_locator=By.cssSelector("div#m-1635532295580>div+div");
    By home_page_logo_locator=By.cssSelector("div#shopify-section-static-header-2 section div+div>div td a img");
    By reserve_online_message_locator=By.cssSelector("div#shopify-section-static-header-2>div:nth-of-type(1)>div:nth-of-type(1)");
    By find_store_button_locator=By.cssSelector("td#desktop_myStore input");
    By postal_code_entry_locator=By.cssSelector("input#address_search");
    By submit_button_locator=By.cssSelector("button#submitBtn");
    By make_my_store_button_locator=By.cssSelector("input#btn_PS719");
    By image_one_locator=By.cssSelector("div#m-1689863456011>div:nth-child(1)>div:nth-child(1)>div>div:nth-child(3)");
    By image_two_locator=By.cssSelector("div#m-1689863456011>div:nth-child(1)>div:nth-child(1)>div>div:nth-child(4)");
    By image_three_locator=By.cssSelector("div#m-1689863456011>div:nth-child(1)>div:nth-child(1)>div>div:nth-child(5)");
    By arrow_left_locator=By.cssSelector("div#m-1689863456011>div:nth-child(1)>div:nth-child(1)+div>button:nth-child(1)");
    By top_brands_header_locator=By.cssSelector("div#c-1730303009352 h1");
    By arrow_right_locator=By.cssSelector("div#m-1689863456011>div:nth-child(1)>div:nth-child(1)+div>button:nth-child(2)");
    By top_brands_locator=By.cssSelector("div#m-1689865380373>div>div:nth-child(1)>div>div");
    By top_brands_first_item_locator=By.cssSelector("div#m-1689865380373>div>div:nth-child(1)>div>div:nth-child(1)");
    By sixth_brand_locator=By.cssSelector("div#m-1689865380373>div>div:nth-child(1)>div>div");
    By top_brands_right_arrow_locator=By.cssSelector("div#m-1689865380373>div>div:nth-child(2)>button:nth-child(2)");
    By hiring_banner_locator=By.cssSelector("div#e-1661522315904");
    By find_store_banner_locator=By.cssSelector("div#r-1573160384857");
    By browse_parts_button_locator=By.cssSelector("input#vid_browse");
    By vehicle_year_locator=By.cssSelector("select#ymm_year");
    By vehicle_make_locator=By.cssSelector("select#ymm_make");
    By vehicle_model_locator=By.cssSelector("select#ymm_model");
    By vehicle_trim_locator=By.cssSelector("select#ymm_trim");
    By vehicle_engine_locator=By.cssSelector("select#ymm_engine");
    By change_vehicle_button_locator=By.cssSelector("div#YMM_bar>span:nth-child(2)>div>span+input");
    By browse_parts_button_2_locator=By.cssSelector("div#YMM_bar>span:nth-child(2)>div>span+input+input");
    By item_search_field_locator=By.cssSelector("input#psHeaderSearchTextBox");
    By product_link_locator=By.cssSelector("div[class='boost-pfs-filter-product-bottom'] a");
    By accessiblity_icon_locator=By.cssSelector("div#userwayAccessibilityIcon>span>img");
    
    //Method to close the pop-up window
    public void close_pop_up() {
    	try {
    	WebElementExplicitWait(popup_close_button_locator);
    	popup_close_button.click();
    	}
    	catch(TimeoutException e){
    		
    		boolean flag=false;
    		while(flag==false) {
    			//WebElementExplicitWait(popup_close_button_locator);
    			if(popup_close_button.isDisplayed()) {
    				flag=true;
    				break;
    			}
    		}
    		
    	}
    	
    }
    
    //Method to validate that logo is displayed in home page
    public boolean logo_displayed() {
    	
    	boolean logo_display_status=false;
    	WebElementExplicitWait(home_page_logo_locator);
    	
    	if(home_page_logo.isDisplayed()) {
    		logo_display_status=true;
    	}
    	
    	return logo_display_status;
    }
    
    //Method to validate that reserve online message is displayed
    
    public boolean reserve_online_message_display() {
    	
    	boolean reserve_online_message_status=false;
    	WebElementExplicitWait(reserve_online_message_locator);
    	
    	if(reserve_online_message.isDisplayed()) {
    		reserve_online_message_status=true;
    	}
    	
    	return reserve_online_message_status;
    }
    
    //Method to select a store
	
	  public void select_store(String postal_code) throws InterruptedException {
	  
	  a=setup_Actions();
	  js = (JavascriptExecutor) driver;
	  WebElementExplicitWait(find_store_button_locator);
	  js.executeScript("arguments[0].click();", find_store_button);
	  
	  Thread.sleep(5000); 
	  WebElementExplicitWait(postal_code_entry_locator);
	  a.moveToElement(postal_code_entry).click().sendKeys(postal_code).build().perform();
	  
	  WebElementExplicitWait(submit_button_locator); 
	  submit_button.click();
	  
	  js.executeScript("window.scrollBy(0,250)", "");
	  WebElementExplicitWait(make_my_store_button_locator);
	  js.executeScript("arguments[0].click();", make_my_store_button);
	  Thread.sleep(5000);
	
	  
	  }
	  
	  //Method to verify rolling advertisement images in home page
	  
	  public void ads_rolling_images() throws InterruptedException {
		  
		  boolean image1_status=false;
		  boolean image2_status=false;
		  boolean image3_status=false;
		  
		  while(image1_status==false){
			  
			  String image1_active=image_one.getAttribute("class");
			  
			  if(image1_active.contains("active")) {
				  
				  a=setup_Actions();
				  a.moveToElement(image_one).build().perform();
				  WebElementExplicitWait(arrow_left_locator);
				  WebElementExplicitWait(arrow_right_locator);
				  
					Assert.assertTrue(arrow_left.isDisplayed());
					Assert.assertTrue(arrow_right.isDisplayed());
					a.moveToElement(home_page_logo).build().perform();
				  
					image1_status=true;
				  
			  }
			  
		  }
		  
			while(image2_status==false) {
				String image2_active=image_two.getAttribute("class");
				//System.out.println(image2_active);
				if(image2_active.contains("active")) {
					
					image2_status=true;
					
				}
			}
			
			/*
			 * while(image3_status==false) { String
			 * image3_active=image_three.getAttribute("class");
			 * //System.out.println(image2_active); if(image3_active.contains("active")) {
			 * 
			 * image3_status=true;
			 * 
			 * } }
			 */
	  }
	  
	  //Method to verify top brands and validate that top brands section arrow navigator works
	  
	 public void verify_top_brands()   {

			boolean top_brands_first_item_status=false;
			//List<WebElement> top_brands=new ArrayList<WebElement>();
			a=setup_Actions();
			Set<String> s=new HashSet<>();
			
			//Validate that top brands header is displayed
			WebElementExplicitWait(top_brands_header_locator);
			String top_brands_header_text=top_brands_header.getText();
			System.out.println(top_brands_header_text);
			
			//Get the number of top brands displayed when page is loaded
			Integer num_active_top_brands_items=top_brands_active_items.size();
			System.out.println(num_active_top_brands_items);
			
			//following loop extracts the url of each top brand displayed and then inserts them into
			//a set. When set size is 8 then it exits the loop. This way, it is established that 8 top
			//brands were displayed when carousel was scrolling.
			
			while(s.size()<8) {
			for(WebElement active_item:top_brands_active_items) {
				String url=active_item.getAttribute("href");
				
				s.add(url);
			}
			}
			
			//Print the set to display the brands recorded in the set.
			System.out.println(s);
			
			
			
			
	 }
	 
	 //Generic method to return brand name from the url
		public String brand_from_url(String url) {
			Integer length_url=url.length();
			Integer last_slash_index=url.lastIndexOf("/");
			brand_name=url.substring(last_slash_index+1, length_url);
			return brand_name;
			
		}
		
	//Verify that hiring banner is displayed
	public void hiring_banner_display() {
		WebElementExplicitWait(hiring_banner_locator);
		Assert.assertTrue(hiring_banner.isDisplayed());
	}
	
	//Verify that find store banner is displayed
	public void find_store_banner() {
		WebElementExplicitWait(find_store_banner_locator);
		Assert.assertTrue(find_store_banner.isDisplayed());
	}
	
	//Method to verify that browse parts button is not enabled
	public void validate_browse_parts_disabled() {
		Assert.assertFalse(browse_parts_button.isEnabled());
	}
	
	//Method to select the vehicle year from drop down
	public void select_vehicle_year(String year) {
		WebElementExplicitWait(vehicle_year_locator);
		s=new Select(vehicle_year);
		s.selectByVisibleText(year);
	}
	
	//Method to select vehicle make from drop down
	public void select_vehicle_make(String make) {
		WebElementExplicitWait(vehicle_make_locator);
		s=new Select(vehicle_make);
		s.selectByVisibleText(make);
	}
	
	//Method to select vehicle model from drop down
	public void select_vehicle_model(String model) {
		WebElementExplicitWait(vehicle_model_locator);
		s=new Select(vehicle_model);
		boolean model_data=false;
		
		List<WebElement> models=new ArrayList<>();
		while(model_data==false) {
			models=s.getOptions();
			if(models.size()>0) {
				model_data=true;
			}
		}
		
		for(WebElement mdl:models) {
			if(mdl.getText().equalsIgnoreCase(model)) {
				mdl.click();
			}
		}
		//s.selectByVisibleText(model);
	}
	
	//Method to select vehicle trim from down
	public void select_vehicle_trim(String trim) {
		WebElementExplicitWait(vehicle_trim_locator);
		s=new Select(vehicle_trim);
		s.selectByVisibleText(trim);
		
	}
	
	//Method to select vehicle engine from drop down
	public void select_vehicle_engine(String engine) throws InterruptedException {
		WebElementExplicitWait(vehicle_engine_locator);
		s=new Select(vehicle_engine);
		Thread.sleep(2000);
		s.selectByVisibleText(engine);
		
	}
	
	//Method to validate that browse parts button is enabled
	public void validate_browse_parts_button_enable() {
		WebElementClickableExplicitWait(browse_parts_button_locator);
		Assert.assertTrue(browse_parts_button.isEnabled());
	}
	
	//Method to click browse parts button
	public void click_browse_parts_button() {
		WebElementExplicitWait(browse_parts_button_locator);
		browse_parts_button.click();
	}
	
	//Method to validate page after clicking on browse parts button and validate change vehicle and browse parts buttons
	//are enabled
	public void validate_page_after_clicking_browse_parts() throws InterruptedException {
		
		try {
			
			WebElementExplicitWait(change_vehicle_button_locator);
			Assert.assertTrue(change_vehicle_button.isEnabled());
			
			WebElementExplicitWait(browse_parts_button_2_locator);
			Assert.assertTrue(browse_parts_button_2.isEnabled());
			
		}catch(StaleElementReferenceException e) {
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			WebElementExplicitWait(change_vehicle_button_locator);
			Assert.assertTrue(change_vehicle_button.isEnabled());
			
			WebElementExplicitWait(browse_parts_button_2_locator);
			Assert.assertTrue(browse_parts_button_2.isEnabled());
		}
	}
	
	public void enter_skunum(String sku) {
		WebElementExplicitWait(item_search_field_locator);
		item_search_field.sendKeys(sku);
	}
	
	public void hit_enter_key() {
		item_search_field.sendKeys(Keys.ENTER);
	}
	
	public void validate_display_of_product_link() {
		
		WebElementExplicitWait(product_link_locator);
		Assert.assertTrue(product_link.isDisplayed());
		
	}
	
	public void click_product_link() {
		
		try {
		WebElementExplicitWait(product_link_locator);
		product_link.click();
		}catch(StaleElementReferenceException e) {
			driver.navigate().refresh();
			WebElementExplicitWait(product_link_locator);
			product_link.click();
			
		}
		
	}
	
	public void validate_accessiblity_icon_page_scroll() {
		
		WebElementExplicitWait(accessiblity_icon_locator);
		Assert.assertTrue(accessiblity_icon.isDisplayed());
		 js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Assert.assertTrue(accessiblity_icon.isDisplayed());
		
		
	}
	
	
	
	
    

}
