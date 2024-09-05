package practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent_reports_practise implements ITestListener {
	
	
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	 public void onTestStart(ITestResult result) {
		    
		 sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myPractiseReport.html");
		 sparkreporter.config().setDocumentTitle("Automation Report");
		 sparkreporter.config().setReportName("Testing");
		 sparkreporter.config().setTheme(Theme.DARK);
		 
		 extent = new ExtentReports();
		 extent.attachReporter(sparkreporter);
		 
		 extent.setSystemInfo("Environment", "OPS-QA");
		 extent.setSystemInfo("Build", "11.0.1");
		 extent.setSystemInfo("Tester", "Heet");
		 
		  }
	 
	
	  public void onTestSuccess(ITestResult result) {
		
		  test=extent.createTest(result.getName());
		  test.log(Status.PASS,"Test is Passed"+result.getName());
		  }
	  
	  public void onTestFailure(ITestResult result) {
		  
		  test=extent.createTest(result.getName());
		  test.log(Status.FAIL, "Test is Failed"+result.getName());
		  test.log(Status.FAIL, "Test is Failed Due to"+result.getThrowable());
		 	}
	  
	  public void onTestSkipped(ITestResult result) {
		  
		  test=extent.createTest(result.getName());
		  test.log(Status.SKIP,"Test is Skipped"+result.getName());
		  }
	

		
		  public void onFinish(ITestContext context) {
			 extent.flush();
		  }
	 
}
