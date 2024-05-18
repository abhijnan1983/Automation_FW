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
    
    @FindBy(css="select#qty_0287938")
    WebElement cart_line_item_qty_Selector;
    
    @FindBy(css="div#cartMainContainer>header+div+div>div:nth-child(1)")
    WebElement cart_reserve_online_checklist;
    
    @FindBy(css="div.cart-total button")
    WebElement cart_reserve_now_button;
    
    //Declare by annotation to use for explicit wait
    By cart_selected_store_locator=By.cssSelector("div#cartMainContainer>header>div>div:nth-child(2)>h3");
    By cart_subtotal_locator=By.cssSelector("div.cart-subtotal>span:nth-child(2)");
    By cart_line_item_qty_Selector_locator=By.cssSelector("select#qty_0287938");
    By cart_reserve_online_checklist_locator=By.cssSelector("div#cartMainContainer>header+div+div>div:nth-child(1)");
    By cart_reserve_now_button_locator=By.cssSelector("div.cart-total button");
    
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
    
    public void change_line_item_qty_cart(String QTY) {
    	
    	WebElementExplicitWait(cart_line_item_qty_Selector_locator);
    	s=new Select(cart_line_item_qty_Selector);
    	s.selectByValue(QTY);
    }
    
    public void reserve_online_checklist_display() {
    	WebElementExplicitWait(cart_reserve_online_checklist_locator);
    	Assert.assertTrue(cart_reserve_online_checklist.isDisplayed());
    }
    
    public void click_reserve_now_button() {
    	
    	WebElementExplicitWait(cart_reserve_now_button_locator);
    	cart_reserve_now_button.click();
    	
    }
    
    public void land_checkout_page() {
    	String url=driver.getCurrentUrl();
    	boolean checkout_url=false;
    	
    	if(url.contains("/checkouts/")) {
    		checkout_url=true;
    	}
    	
    	Assert.assertTrue(checkout_url);
    	
    	
    }
    
    

}
