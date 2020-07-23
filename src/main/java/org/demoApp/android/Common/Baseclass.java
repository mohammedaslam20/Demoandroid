package org.demoApp.android.Common;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {

	public static AppiumDriver<MobileElement> driver;
	public static AndroidDriver<MobileElement> androiddriver;

//@BeforeTest
	// @BeforeMethod
	@BeforeClass
	public void setup() {
		try {

			DesiredCapabilities cap = new DesiredCapabilities();

			
			  cap.setCapability("deviceName","Mi A2"); 
			  cap.setCapability("udid","4968b77");
			  cap.setCapability("platformName","Android");
			  cap.setCapability("platformVersion","10");
			  cap.setCapability("automationName", "UiAutomator2");
			 

			//cap.setCapability("appPackage", "com.google.android.calculator");
			//cap.setCapability("appActivity", "com.google.android.gms.common.api.GoogleApiActivity");

			cap.setCapability("appPackage", "com.miui.calculator");
			cap.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
			cap.setCapability(MobileCapabilityType.FULL_RESET, "False");
			cap.setCapability(MobileCapabilityType.NO_RESET, "True");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);

			System.out.println("application startted......");
		} catch (Exception exp) {
			System.out.println("cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();

		}
	}

	/*
	 * @AfterClass public void teardown() throws InterruptedException{
	 * Config.waitForTime(); driver.closeApp();
	 * 
	 * }
	 */

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

}
