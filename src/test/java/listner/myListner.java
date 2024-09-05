package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListner implements ITestListener {

	public void onStart(ITestContext context) {
	    System.out.println("Test Execution is Start");
	  }
	 public void onTestStart(ITestResult result) {
		  System.out.println("Test Execution Method is Start");		  }
	 public void onTestSuccess(ITestResult result) {
		  System.out.println("Test Execution is Passed");		  }
	 public void onTestFailure(ITestResult result) {
		  System.out.println("Test Execution is Failed");		  }
	 public void onTestSkipped(ITestResult result) {
		  System.out.println("Test Execution is Skipped");		  }
	 public void onFinish(ITestContext context) {
		  System.out.println("Test Execution is Finish");		  }
}
