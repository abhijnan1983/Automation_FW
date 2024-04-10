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
    
    //Declare by annotation to use for explicit wait
    By popup_close_button_locator=By.cssSelector("div#m-1635532295580>div+div");
    
    //Method to close the pop-up window
    public void close_pop_up() {
    	WebElementExplicitWait(popup_close_button_locator);
    	popup_close_button.click();
    	
    }
    

}
