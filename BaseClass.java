package generic_Utility;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.LogStatus;

public abstract class BaseClass 
{

	@BeforeMethod
	public void configBM(Method method)
	{
		ExtentTestManagerExtent.startTest(method.getName());
    }
    
	
    @AfterMethod
    protected void afterMethod(ITestResult result)
    {
        if (result.getStatus() == ITestResult.FAILURE) {
            ExtentTestManagerExtent.getTest().log(LogStatus.FAIL, result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            ExtentTestManagerExtent.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
        } else {
            ExtentTestManagerExtent.getTest().log(LogStatus.PASS, "Test passed");
        }
        
        ExtentManager.getReporter().endTest(ExtentTestManagerExtent.getTest());        
        ExtentManager.getReporter().flush();
    }
 
   
    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
	
}
