package pkgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Page_Objects_Checkout_Page extends ReusableComps {
	
	WebDriver driver;
	JavascriptExecutor js;
	Actions a;
	Select s;
	
	public Page_Objects_Checkout_Page(WebDriver driver) {
		super(driver);
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	//Declare Findby annotations for Page Factory model
    @FindBy(css="input#email")
    WebElement email_input_checkout_page;
    
    @FindBy(css="div._6zbcq524._1fragem2s._1fragem2d._6zbcq52b img")
    WebElement checkout_page_item_image_thumbnail;
    
    @FindBy(css="div.jCic4._1fragemod._1fragemoa._1fragemuu p")
    WebElement checkout_page_item_name;
    
    @FindBy(css="div.jCic4._1fragemod._1fragemoa._1fragemuu strong")
    WebElement checkout_page_total_pretax;
    
    @FindBy(css="input#marketing_opt_in")
    WebElement consent_checkbox;
    
    @FindBy(css="input#TextField0")
    WebElement fname_field;
    
    @FindBy(css="input#TextField1")
    WebElement lname_field;
    
    @FindBy(css="input#billing-address1")
    WebElement address_field;
    
    
    @FindBy(css="input#TextField2")
    WebElement apt_field;
    
    @FindBy(css="input#TextField3")
    WebElement city_field;
    
    @FindBy(css="select#Select1")
    WebElement province_field;
    
    @FindBy(css="input#TextField4")
    WebElement postal_code_field;
    
    @FindBy(css="input#TextField5")
    WebElement phone_number_field;
    
    @FindBy(css="div.oQEAZ button")
    WebElement continue_button;
 
    @FindBy(css="label#TextField5-label+div>div>div>div>button")
    WebElement tooltip_button;
    
    @FindBy(css="div#PortalHost>div>div>div")
    WebElement tooltip_text;
    
    //Declare by annotation to use for explicit wait
    By email_input_checkout_page_locator=By.cssSelector("input#email");
    By checkout_page_item_image_thumbnail_locator=By.cssSelector("div._6zbcq524._1fragem2s._1fragem2d._6zbcq52b img");
    By checkout_page_item_name_locator=By.cssSelector("div.jCic4._1fragemod._1fragemoa._1fragemuu p");
    By checkout_page_total_pretax_locator=By.cssSelector("div.jCic4._1fragemod._1fragemoa._1fragemuu strong");
    By consent_checkbox_locator=By.cssSelector("input#marketing_opt_in");
    By fname_field_locator=By.cssSelector("input#TextField0");
    By lname_field_locator=By.cssSelector("input#TextField1");
    By address_field_locator=By.cssSelector("input#billing-address1");
    By apt_field_locator=By.cssSelector("input#TextField2");
    By city_field_locator=By.cssSelector("input#TextField3");
    By province_field_locator=By.cssSelector("select#Select1");
    By postal_code_field_locator=By.cssSelector("input#TextField4");
    By phone_number_field_locator=By.cssSelector("input#TextField5");
    By continue_button_locator=By.cssSelector("div.oQEAZ button");
    By tooltip_button_locator=By.cssSelector("label#TextField5-label+div>div>div>div>button");
    By tooltip_text_locator=By.cssSelector("div#PortalHost>div>div>div");
    
    public void validate_active_element_page_launch() {
    	WebElement actual_Active_element=driver.switchTo().activeElement();
    	WebElementExplicitWait(email_input_checkout_page_locator);
    	WebElement expected_Active_element=email_input_checkout_page;
    	Assert.assertTrue(actual_Active_element.equals(expected_Active_element));
    }
    
    public void validate_item_image_thumbnail_displayed_checkout_page() {
    	WebElementExplicitWait(checkout_page_item_image_thumbnail_locator);
    	Assert.assertTrue(checkout_page_item_image_thumbnail.isDisplayed());
    }
    
    public void checkout_page_validate_product_name() {
    	
    	WebElementExplicitWait(checkout_page_item_name_locator);
    	Assert.assertTrue(checkout_page_item_name.isDisplayed());
    }
    
    public void checkout_page_total_display() {
    	WebElementExplicitWait(checkout_page_total_pretax_locator);
    	Assert.assertTrue(checkout_page_total_pretax.isDisplayed());
    	
    }
    
    public void enter_email_address(String email) {
    	email_input_checkout_page.sendKeys(email);
    }
    
    public void click_consent_checkbox() {
    	WebElementExplicitWait(consent_checkbox_locator);
    	consent_checkbox.click();
    	Assert.assertTrue(consent_checkbox.isSelected());
    	
    }
    
    public void enter_firstname(String fname) {
    	WebElementExplicitWait(fname_field_locator);
    	fname_field.sendKeys(fname);
    }
    
    public void enter_lname(String lname) {
    	WebElementExplicitWait(lname_field_locator);
    	lname_field.sendKeys(lname);
    }
    
    public void enter_address(String address) {
    	WebElementExplicitWait(address_field_locator);
    	address_field.sendKeys(address);
    }
    
    public void enter_aptnum(String aptnum) {
    	WebElementExplicitWait(apt_field_locator);
    	apt_field.sendKeys(aptnum);
    }
    
    public void enter_city(String city) {
    	WebElementExplicitWait(city_field_locator);
    	city_field.sendKeys(city);
    }
	
	public void select_province(String province) {
		WebElementExplicitWait(province_field_locator);
		s=new Select(province_field);
		s.selectByVisibleText(province);
	}
	
	public void enter_postal_code(String postal_code) {
		WebElementExplicitWait(postal_code_field_locator);
		postal_code_field.sendKeys(postal_code);
	}
	
	public void enter_phone_number(String phone_number) {
		WebElementExplicitWait(phone_number_field_locator);
		phone_number_field.sendKeys(phone_number);
	}
	
	public void click_continue_button() {
		WebElementExplicitWait(continue_button_locator);
		continue_button.click();
	}
	
	public void validate_tooltip_text_messageon_hovering_question_mark_phone_field() {
		
		a=setup_Actions();
		WebElementExplicitWait(tooltip_button_locator);
		a.moveToElement(tooltip_button).build().perform();
		WebElementExplicitWait(tooltip_text_locator);
		String message=tooltip_text.getText();
		
		Assert.assertTrue(message.equals("In case we need to contact you about your order"));
		
	}
	
	public void navigate_to_order_placement_page() {
		
		boolean flag=false;
		while(flag==false) {
		String page_url=driver.getCurrentUrl();
		if(page_url.contains("payment")) {
			flag=true;
			//System.out.println(page_url);
			break;
		}
	}
		
	Assert.assertTrue(flag);
	}

}
