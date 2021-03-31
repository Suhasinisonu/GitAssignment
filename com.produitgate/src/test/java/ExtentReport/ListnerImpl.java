package ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImpl implements ITestListener {

			
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

   	
    public void onStart(ITestContext arg0) {					
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("./ExtentReport.html");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("amazon");
        htmlReporter.config().setReportName("Smoke Test");
        ExtentReports report = new ExtentReports();
        		
    }		

   
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

   
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    	
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    	
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    	
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
}
