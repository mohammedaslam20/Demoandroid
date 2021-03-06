package org.demoApp.android.listeners;

import com.relevantcodes.extentreports.LogStatus;

import org.demoApp.android.Common.Baseclass;
import org.demoApp.android.extentReportFiles.ExtentManager;
import org.demoApp.android.extentReportFiles.ExtentTestManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener extends Baseclass implements ITestListener {

	private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
        
    }

    public void onStart(ITestContext iTestContext) {
        //System.out.println("I am in onStart method " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", this.driver);
    }

    public void onFinish(ITestContext iTestContext) {
        //System.out.println("I am in onFinish method " + iTestContext.getName());
        //Do tier down operations for extentreports reporting!
        ExtentTestManager.endTest();
        ExtentManager.getReporter().assignProject("Calculator mobile application");
        ExtentManager.getReporter().flush();
        
        
    }

    public void onTestStart(ITestResult iTestResult) {
       // System.out.println("I am in onTestStart method " +  getTestMethodName(iTestResult) + " start");
        //Start operation for extentreports.
        ExtentTestManager.startTest(iTestResult.getMethod().getMethodName(),"");
        
    }

    public void onTestSuccess(ITestResult iTestResult) {
       // System.out.println("I am in onTestSuccess method " +  getTestMethodName(iTestResult) + " succeed");
        //Extentreports log operation for passed tests.
        ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("I am in onTestFailure method " +  getTestMethodName(iTestResult) + " failed");

        //Get driver from BaseTest and assign to local webdriver variable.
        Object testClass = iTestResult.getInstance();
        
        WebDriver webDriver = ((Baseclass) testClass).getDriver();

        //Take base64Screenshot screenshot.
        String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)webDriver).
                getScreenshotAs(OutputType.BASE64);

        //Extentreports log and screenshot operations for failed tests.
        ExtentTestManager.getTest().log(LogStatus.FAIL,"Test Failed",
                ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
        
        Throwable string = iTestResult.getThrowable();
        String str =  string.toString(); 
        String[] arrOfStr = str.split("Command", 2);
        String arrOfStr2 = arrOfStr[0];
        String[] arrOfStr3 = arrOfStr2.split(":", 2); 
        
       System.out.println(string);
       ExtentTestManager.getTest().log(LogStatus.FAIL, arrOfStr3[1]);
         
       // ExtentTestManager.getTest().log(LogStatus.FAIL, iTestResult.getThrowable());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        //System.out.println("I am in onTestSkipped method "+  getTestMethodName(iTestResult) + " skipped");
        //Extentreports log operation for skipped tests.
        ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        //System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }


}





