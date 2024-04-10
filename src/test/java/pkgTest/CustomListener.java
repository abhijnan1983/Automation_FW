package pkgTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CustomListener extends setupUtils implements ITestListener{
	
	ExtentTest test;
	ExtentReports extnt=report_configuration();
	ITestContext context;
	
	@Override
	public void onTestStart(ITestResult result) {
		
        //System.out.println("listener triggered");
        test=extnt.createTest(result.getMethod().getMethodName());

	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		
		context = result.getTestContext();
		driver=(WebDriver) context.getAttribute("WebDriver");
		String screenshot_file_path=null;
		
        //Get the screenshot path from take screenshot method in Base Test class
        try {
            screenshot_file_path=take_screenshot(result.getMethod().getMethodName(),driver);
            //System.out.println(screenshot_file_path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        //Code to get the screenshot from local path and attach to the extent report
        try {
            test.addScreenCaptureFromPath(screenshot_file_path,result.getMethod().getMethodName());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	@Override
	public void onFinish(ITestContext context) {
		extnt.flush();

	}
	

	

}
