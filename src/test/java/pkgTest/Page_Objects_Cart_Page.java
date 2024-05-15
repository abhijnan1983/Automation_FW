package pkgTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

public class Page_Objects_Cart_Page extends ReusableComps{
	
	WebDriver driver;
	JavascriptExecutor js;
	Actions a;
	Select s;
	
	public Page_Objects_Cart_Page(WebDriver driver) {
		super(driver);
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	//Declare Findby annotations for Page Factory model
    @FindBy(css="div#cartMainContainer>header>div>div:nth-child(2)>h3")
    WebElement cart_selected_store;
    
    @FindBy(css="div.cart-subtotal>span:nth-child(2)")
    WebElement cart_subtotal;
    
    //Declare by annotation to use for explicit wait
    By cart_selected_store_locator=By.cssSelector("div#cartMainContainer>header>div>div:nth-child(2)>h3");
    By cart_subtotal_locator=By.cssSelector("div.cart-subtotal>span:nth-child(2)");
    
    //Method to validate that cart page has launched
    public void cart_page_url() {
    	String current_url=driver.getCurrentUrl();
    	boolean correct_url=false;
    	
    	if(current_url.contains("/cart")) {
    		correct_url=true;
    	}
    	
    	Assert.assertTrue(correct_url);
    }
    
    //Method to validate that cart selected store is displayed
    public void validate_cart_selected_store() {
    	
    	boolean selected_store_display=false;
    	WebElementExplicitWait(cart_selected_store_locator);
    	String selected_store=cart_selected_store.getText();
    	
    	if(!selected_store.isEmpty()) {
    		selected_store_display=true;
    	}
    	
    	Assert.assertTrue(selected_store_display);
    	
    }
    
    //Method to validate that cart subtotal is displayed
    public void validate_cart_subtotal() {
    	boolean cart_subtotal_flag=false;
    	WebElementExplicitWait(cart_subtotal_locator);
    	String cart_subtotal_text=cart_subtotal.getText();
    	
    	if(!cart_subtotal_text.isEmpty()) {
    		cart_subtotal_flag=true;
    	}
    	
    	Assert.assertTrue(cart_subtotal_flag);
    }
    
    

}
