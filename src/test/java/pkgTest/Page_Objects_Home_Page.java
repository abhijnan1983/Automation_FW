package pkgTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Page_Objects_Home_Page extends ReusableComps {
	
	WebDriver driver;
	JavascriptExecutor js;
	Actions a;

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
    
    @FindBy(css="div#m-1689863456011>div:nth-child(1)>div:nth-child(1)+div>button:nth-child(1)")
    WebElement arrow_left;
    
    @FindBy(css="div#m-1689863456011>div:nth-child(1)>div:nth-child(1)+div>button:nth-child(2)")
    WebElement arrow_right;
    
    
    
    @FindBy(css="div#m-1689865380373>div>div:nth-child(1)>div>div")
    List<WebElement> top_brands;
    
    @FindBy(css="div#m-1689865380373>div>div:nth-child(1)>div>div:nth-child(6)")
    WebElement sixth_brand;
    
    @FindBy(css="div#m-1689865380373>div>div:nth-child(2)>button:nth-child(2)")
    WebElement top_brands_right_arrow;
    
    @FindBy(css="div#e-1661522315904")
    WebElement hiring_banner;
    
    @FindBy(css="div#r-1573160384857")
    WebElement find_store_banner;
    
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
    By arrow_left_locator=By.cssSelector("div#m-1689863456011>div:nth-child(1)>div:nth-child(1)+div>button:nth-child(1)");
    By arrow_right_locator=By.cssSelector("div#m-1689863456011>div:nth-child(1)>div:nth-child(1)+div>button:nth-child(2)");
    By sixth_brand_locator=By.cssSelector("div#m-1689865380373>div>div:nth-child(1)>div>div");
    By top_brands_right_arrow_locator=By.cssSelector("div#m-1689865380373>div>div:nth-child(2)>button:nth-child(2)");
    By hiring_banner_locator=By.cssSelector("div#e-1661522315904");
    By find_store_banner_locator=By.cssSelector("div#r-1573160384857");
    
    
    
    //Method to close the pop-up window
    public void close_pop_up() {
    	WebElementExplicitWait(popup_close_button_locator);
    	popup_close_button.click();
    	
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
	  
	  Thread.sleep(5000); WebElementExplicitWait(postal_code_entry_locator);
	  a.moveToElement(postal_code_entry).click().sendKeys(postal_code).build().
	  perform();
	  
	  WebElementExplicitWait(submit_button_locator); submit_button.click();
	  
	  js.executeScript("window.scrollBy(0,250)", "");
	  WebElementExplicitWait(make_my_store_button_locator);
	  js.executeScript("arguments[0].click();", make_my_store_button);
	  Thread.sleep(5000);
	
	  
	  }
	  
	  //Method to verify rolling advertisement images in home page
	  
	  public void ads_rolling_images() throws InterruptedException {
		  
		  WebElementExplicitWait(image_one_locator);
		  WebElementExplicitWait(image_two_locator);
		  
		  Integer counter1=0;
		  Integer counter2=0;
		  
		  while(counter1<10){
			  
			  String image1_active=image_one.getAttribute("class");
			  
			  if(image1_active.contains("active")) {
				  
				  a=setup_Actions();
				  a.moveToElement(image_one).build().perform();
				  WebElementExplicitWait(arrow_left_locator);
				  WebElementExplicitWait(arrow_right_locator);
				  
					Assert.assertTrue(arrow_left.isDisplayed());
					Assert.assertTrue(arrow_right.isDisplayed());
					a.moveToElement(home_page_logo).build().perform();
				  
					break;
				  
			  }else {
				  counter1++;
				  Thread.sleep(1000);
			  }
			  
		  }
		  
			while(counter2<10) {
				String image2_active=image_two.getAttribute("class");
				//System.out.println(image2_active);
				if(image2_active.contains("active")) {
					
					break;
					
				}else {
					counter2++;
					Thread.sleep(1000);
				}
			}
	  }
	  
	  //Method to verify top brands and validate that top brands section arrow navigator works
	  
	 public void verify_top_brands() {
			List<String> initial_active_brands=new ArrayList<String>();
			List<String> later_active_brands=new ArrayList<String>();
			
			//List<WebElement> top_brands=new ArrayList<WebElement>();
			a=setup_Actions();
			
			//Iterate through all the brands and print the brands which are currently displayed on the page.
			
			for(WebElement brand:top_brands) {
				
				String brand_active_status=brand.getAttribute("class");
				
				if(brand_active_status.contains("active")) {
				
				WebElement link=brand.findElement(By.tagName("a"));
				url=link.getAttribute("href");
				String brand_name=brand_from_url(url);
				initial_active_brands.add(brand_name);
				
				}
				
			}
			
			//hover on 6th brand to activate the right arrow button
			WebElementExplicitWait(sixth_brand_locator);
			a.moveToElement(sixth_brand).build().perform();
			
			//Click on right arrow button 5 times to display new set of top brands on the page
			WebElementExplicitWait(top_brands_right_arrow_locator);
			Integer number_of_click=0;
			
			while(number_of_click<6) {
				top_brands_right_arrow.click();
				number_of_click++;
			}
			
			//Iterate through brands and get new list of active brands on the page
			for(WebElement brand:top_brands) {
				String brand_active_status=brand.getAttribute("class");
				if(brand_active_status.contains("active")) {
					
					WebElement link=brand.findElement(By.tagName("a"));
					url=link.getAttribute("href");
					String brand_name=brand_from_url(url);
					later_active_brands.add(brand_name);
					
					}
			}
			
			//System.out.println(initial_active_brands);
			//System.out.println(later_active_brands);
			Assert.assertFalse(initial_active_brands.equals(later_active_brands));
			

			
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
	
	
	
    

}
