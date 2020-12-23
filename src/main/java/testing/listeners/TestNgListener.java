package testing.listeners;


import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener,ISuiteListener {
	
	/*
	 * ITestListener
	 */
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started!");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed!");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped!");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getFailedTests());
		System.out.println(context.getName());
	}


	/*
	 * ISuiteListener
	 */
	
	
	@Override
	public void onStart(ISuite suite) {
	}
	
	
	@Override
	public void onFinish(ISuite suite) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
