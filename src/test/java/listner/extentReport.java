package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReport implements ITestListener{
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;

	 public void onStart(ITestContext context) {
		 
		  }
	 
	 public void onTestStart(ITestResult result) {
		   
		 sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		 sparkReporter.config().setDocumentTitle("Automation Report");
		 sparkReporter.config().setReportName("Smoke testing");
		 sparkReporter.config().setTheme(Theme.DARK);
		 
		 
		 extent =new ExtentReports();
		 extent.attachReporter(sparkReporter);
		 
		 
		 extent.setSystemInfo("Environment", "Firefox");
		 extent.setSystemInfo("Build_Version", "Ops_11.0");
		 extent.setSystemInfo("Assignee", "Dhruvi");
		 
		  }

		  public void onTestSuccess(ITestResult result) {
		    test=extent.createTest(result.getName());
		    test.log(Status.PASS, "Test Case is Passed:"+ result.getName());
		  }

		  public void onTestFailure(ITestResult result) {
			  
			  test=extent.createTest(result.getName());
			    test.log(Status.FAIL, "Test Case is Failed:"+ result.getName());
			    test.log(Status.FAIL, "Test Case is Failed due to :"+ result.getThrowable());
		  }

		  
		  public void onTestSkipped(ITestResult result) {
			  test=extent.createTest(result.getName());
			    test.log(Status.SKIP, "Test Case is Skipped:"+ result.getName());	
			    }
		  
		  public void onFinish(ITestContext context) {
			    extent.flush();
			  }
			}
