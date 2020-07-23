package org.demoApp.android.extentReportFiles;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

//OB: ExtentReports extent instance created here. That instance can be reachable by getReporter() method.

public class ExtentManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter(){
        if(extent == null){
            //Set HTML reporting file location
        	//String fileName = new SimpleDateFormat("yyyy_MM_dd_HH_mm'.html'").format(new Date());
        	
        	 String workingDir = System.getProperty("user.dir");
        	
        	 //extent = new ExtentReports(workingDir+"\\ExtentReports\\AngelLiteApp_TestReport_"+ fileName, true);
            extent = new ExtentReports(workingDir+"\\ExtentReports\\Calculator_TestReport.html", true);
        }
        return extent;
    }
}
