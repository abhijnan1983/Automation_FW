package pkgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Objects_Home_Page extends ReusableComps {
	
	WebDriver driver;
	
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
    
    //Declare by annotation to use for explicit wait
    By popup_close_button_locator=By.cssSelector("div#m-1635532295580>div+div");
    By home_page_logo_locator=By.cssSelector("div#shopify-section-static-header-2 section div+div>div td a img");
    
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
    

}
