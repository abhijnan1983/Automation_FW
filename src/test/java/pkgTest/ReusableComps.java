package pkgTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableComps {
	
    WebDriver driver;

    //Constructor created below to catch the driver instance from child class. It is sent using Super(driver) from child class

    public ReusableComps(WebDriver driver) {

        this.driver=driver;

    }

    //Method for explicit wait

    public void WebElementExplicitWait(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    
    public Actions setup_Actions() {
    	Actions a=new Actions(driver);
    	return a;
    }

}
