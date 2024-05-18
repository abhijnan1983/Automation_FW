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
    
    @FindBy(css="div.jCic4._1fragemod._1fragemoa._1fragemuu img")
    WebElement checkout_page_item_image_thumbnail;
    
    @FindBy(css="div.jCic4._1fragemod._1fragemoa._1fragemuu p")
    WebElement checkout_page_item_name;
    
 
    
    //Declare by annotation to use for explicit wait
    By email_input_checkout_page_locator=By.cssSelector("input#email");
    By checkout_page_item_image_thumbnail_locator=By.cssSelector("div.jCic4._1fragemod._1fragemoa._1fragemuu img");
    By checkout_page_item_name_locator=By.cssSelector("div.jCic4._1fragemod._1fragemoa._1fragemuu p");
    
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
	
	

}
