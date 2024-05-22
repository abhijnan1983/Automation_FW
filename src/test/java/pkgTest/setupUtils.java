package pkgTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;



public class setupUtils {
	
	public static WebDriver driver;
	private static ThreadLocal<WebDriver> TC=new ThreadLocal<>();
	
	/*
	 * public void test() { System.out.println("test"); }
	 */
	
	public static WebDriver setDriver(String browser) {
		
		try {
		switch(browser) {
		
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			TC.set(new ChromeDriver(options));
			driver=TC.get();
			break;
		
		case "Edge":
			
			WebDriverManager.edgedriver().setup();
			TC.set(new EdgeDriver());
			driver=TC.get();
			break;
		
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		
		return driver;
		
		
	}
	
    @BeforeTest
    public ExtentReports report_configuration() {
        String path=System.getProperty("user.dir")+"\\Test_Reports\\test_report_new.html";
        ExtentSparkReporter reporter=new ExtentSparkReporter(path);

        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);
        return extent;
    }
    
    public String take_screenshot(String test_name, WebDriver driver) throws IOException {


        String screenshot_file_name=test_name+".png";
        String screenshot_file_path=(System.getProperty("user.dir")+"\\Screenshots\\"+screenshot_file_name);
        File screenshot_file=new File(screenshot_file_path);
        File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, screenshot_file);
        return screenshot_file_path;

    }

	
	  public static WebDriver getDriver() { 
		  return driver; }
	  
	  public static void setDriver(WebDriver driver) { 
		  setupUtils.driver = driver;
	  }
	 


}
