package pkgTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Page_Objects_Product_Details_Page extends ReusableComps {
	
	WebDriver driver;
	JavascriptExecutor js;
	Actions a;
	Select s;
	
	public Page_Objects_Product_Details_Page(WebDriver driver) {
		super(driver);
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	//Declare Findby annotations for Page Factory model
    @FindBy(css="nav.product-gallery--navigation>button")
    List<WebElement> thumbnail_images;
    
    @FindBy(css="button[class*='bv_main_container_row_flex bv_ratings_summary']")
    WebElement rating_button;
    
    @FindBy(css="div#bv_components_histogram>div+div")
    WebElement read_review_link;
    
    @FindBy(css="div#shopify-section-static-product>section>article+div")
    WebElement shadowhost;
    
    
    @FindBy(css="#bv-reviews-rating-snapshot-container")
    WebElement rating_snapshot;
    

    
    //Declare by annotation to use for explicit wait
    By thumbnail_images_locator=By.cssSelector("nav.product-gallery--navigation>button");
    By rating_button_locator=By.cssSelector("button[class*='bv_main_container_row_flex bv_ratings_summary']");
    By read_review_link_locator=By.cssSelector("div#bv_components_histogram>div+div");
    By shadowhost_locator=By.cssSelector("div#shopify-section-static-product>section>article+div");
    By rating_snapshot_locator=By.cssSelector("#bv-reviews-rating-snapshot-container");
    
    
    //Method to validate that there are 3 thumbnail images
    public void validate_thumbnail_images() {
    	WebElementExplicitWait(thumbnail_images_locator);
    	Integer number_of_thumbnails=thumbnail_images.size();
    	boolean flag_thumbnail=false;
    	if(number_of_thumbnails>=1) {
    		flag_thumbnail=true;	
    	}
    	Assert.assertTrue(flag_thumbnail);    }
    
    //Method to hover on review stars and click on read review link
    public void hover_on_stars_click_read_review() {
    	
    	a=setup_Actions();
    	WebElementExplicitWait(rating_button_locator);
    	a.moveToElement(rating_button).build().perform();
    	WebElementExplicitWait(read_review_link_locator);
    	read_review_link.click();
    	
    }
    
    //Method to validate that rating snapshot text is displayed after clicking Read review
    public void display_review() throws InterruptedException {
    	WebElementExplicitWait(shadowhost_locator);
    	 SearchContext rootNode=shadowhost.getShadowRoot();
    	 Thread.sleep(3000);
    	 String rating_snapshot_text=rootNode.findElement(rating_snapshot_locator).getText();
    	 
    	 Assert.assertEquals(rating_snapshot_text, "Rating Snapshot");

    }
    
    

}
