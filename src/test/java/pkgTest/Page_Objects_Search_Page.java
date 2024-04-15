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

public class Page_Objects_Search_Page extends ReusableComps {
	
	WebDriver driver;
	JavascriptExecutor js;
	Actions a;
	Select s;
	
	Integer filter_option_item_count;
	
	public Page_Objects_Search_Page(WebDriver driver) {
		super(driver);
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	
	//Declare Findby annotations for Page Factory model
    @FindBy(css="div[id*='boost-pfs-filter-tree2-pf-m-::mm-google-shopping::custom-label-2']>div>ul>li:nth-child(1)>button>span:nth-child(2)")
    WebElement first_filter_option;
    
    @FindBy(css="div[id*='boost-pfs-filter-tree2-pf-m-::mm-google-shopping::custom-label-2']>div>ul>li:nth-child(1)>button>span:nth-child(3)")
    WebElement first_filter_option_count;
    
    @FindBy(css="div[id*='boost-pfs-filter-tree2-pf-m-::mm-google-shopping::custom-label-2']>div>ul>li:nth-child(1)>button")
    WebElement first_filter_option_click_button;
    
    @FindBy(css="div.boost-pfs-filter-product-item-image a")
    List<WebElement> filtered_items;
    
    
    //Declare by annotation to use for explicit wait
    By first_filter_option_locator=By.cssSelector("div[id*='boost-pfs-filter-tree2-pf-m-::mm-google-shopping::custom-label-2']>div>ul>li:nth-child(1)>button>span:nth-child(2)");
    By first_filter_option_count_locator=By.cssSelector("div[id*='boost-pfs-filter-tree2-pf-m-::mm-google-shopping::custom-label-2']>div>ul>li:nth-child(1)>button>span:nth-child(3)");
    By first_filter_option_click_button_locator=By.cssSelector("div[id*='boost-pfs-filter-tree2-pf-m-::mm-google-shopping::custom-label-2']>div>ul>li:nth-child(1)>button");
    By filtered_items_locator=By.cssSelector("div.boost-pfs-filter-product-item-image a");
    
    
    //Click the first filter option and before that get the count displayed against the filter option
    public void click_first_filter_option() {
    	WebElementExplicitWait(first_filter_option_count_locator);
    	filter_option_item_count=Integer.parseInt(first_filter_option_count.getText().substring(1, 2));
    	
    	WebElementExplicitWait(first_filter_option_click_button_locator);
    	first_filter_option_click_button.click();
    	
    }
    
    //Method to validate that number of items displayed after clicking the filter option is same as the number displayed
    //against the filter option
    public void validate_item_count_after_clicked_filter_option() {
    	
    	WebElementExplicitWait(filtered_items_locator);
    	Integer item_count_after_filter=filtered_items.size();
    	Assert.assertTrue(filter_option_item_count.equals(item_count_after_filter));
    }
    
    

}
