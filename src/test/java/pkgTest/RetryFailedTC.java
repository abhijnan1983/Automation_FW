package pkgTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTC implements IRetryAnalyzer {
	
	Integer maxTry=1;
	Integer count=0;

	@Override
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
			if(count<maxTry) {
				count++;
				return true;
				
			}
		}
		return false;
	}

}
