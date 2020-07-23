package org.demoApp.android.Tests;


import org.demoApp.android.Common.Baseclass;
import org.demoApp.android.Common.Config;

import org.demoApp.android.extentReportFiles.ExtentTestManager;
import org.demoApp.android.factory.CalculatorFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

public class CalculatorTest extends Baseclass {

	@Test(priority =1)
	public void addition_Of_Two_Number() throws InterruptedException{
		
	    ExtentTestManager.getTest().setDescription("This test will verify addition of 2 number");
		SoftAssert softAssert = new SoftAssert();
		CalculatorFactory lpa = PageFactory.initElements(driver, CalculatorFactory.class);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Launch calculator application");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '7'");
		lpa.getBtn_Seven().click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Click sign '+'");
		lpa.getBtn_Plus().click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '5'");
		lpa.getBtn_Five().click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '='");
		lpa.getBtn_Equals().click();
		String result = lpa.getTxt_Result().getText();
		softAssert.assertEquals("= 12", result, "calculated result is not correct");	
		ExtentTestManager.getTest().log(LogStatus.INFO, "The calculated result for addition of two number is: " +result);
		softAssert.assertAll();
	}
	
	  @Test(priority =2) public void addition_Of_Three_Number() throws
	  InterruptedException{
	  
	  ExtentTestManager.getTest().
	  setDescription("This test will verify addition of 3 number but is intensionaly failed to show report format"
	  ); SoftAssert softAssert = new SoftAssert(); CalculatorFactory lpa =
	  PageFactory.initElements(driver, CalculatorFactory.class);
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Launch calculator application"); Thread.sleep(2000);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '7'");
	  lpa.getBtn_Seven().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '+'"); lpa.getBtn_Plus().click();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '5'");
	  lpa.getBtn_Five().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Again click sign  '+'"); lpa.getBtn_Plus().click();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '8'");
	  lpa.getBtn_Eight().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '='"); lpa.getBtn_Equals().click(); String result =
	  lpa.getTxt_Result().getText(); softAssert.assertEquals("= 22", result,
	  "calculated result is not correct");
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "The calculated result for addition of three number is: " +result);
	  softAssert.assertAll();
	  
	  }
	  
	  @Test(priority =3) public void substraction() throws InterruptedException{
	  
	  ExtentTestManager.getTest().
	  setDescription("This test will verify subtraction"); SoftAssert softAssert =
	  new SoftAssert(); CalculatorFactory lpa = PageFactory.initElements(driver,
	  CalculatorFactory.class); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Launch calculator application"); Thread.sleep(2000);
	  
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '9'");
	  lpa.getBtn_Nine().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '-'"); lpa.getBtn_Minus().click();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '5'");
	  lpa.getBtn_Five().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '='"); lpa.getBtn_Equals().click(); String result =
	  lpa.getTxt_Result().getText(); softAssert.assertEquals("= 4", result,
	  "calculated result is not correct");
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "The calculated result for subtraction is: " +result);
	  softAssert.assertAll(); }
	  
	  @Test(priority =4) public void multiplication_Of_Two_Number() throws
	  InterruptedException{
	  
	  ExtentTestManager.getTest().
	  setDescription("This test will verify multiplication of 2 numbers");
	  SoftAssert softAssert = new SoftAssert(); CalculatorFactory lpa =
	  PageFactory.initElements(driver, CalculatorFactory.class);
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Launch calculator application"); Thread.sleep(2000);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '7'");
	  lpa.getBtn_Seven().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '*'"); lpa.getBtn_Multiply().click();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '5'");
	  lpa.getBtn_Five().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '='"); lpa.getBtn_Equals().click(); String result =
	  lpa.getTxt_Result().getText(); softAssert.assertEquals("= 35", result,
	  "calculated result is not correct");
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "The calculated result for multiplication of two number is: " +result);
	  softAssert.assertAll(); }
	  
	  @Test(priority =5) public void multiplication_Of_Three_Number() throws
	  InterruptedException{
	  
	  ExtentTestManager.getTest().
	  setDescription("This test will verify multiplication of 3 numbers");
	  SoftAssert softAssert = new SoftAssert(); CalculatorFactory lpa =
	  PageFactory.initElements(driver, CalculatorFactory.class);
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Launch calculator application"); Thread.sleep(2000);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '7'");
	  lpa.getBtn_Seven().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '*'"); lpa.getBtn_Multiply().click();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '5'");
	  lpa.getBtn_Five().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '*'"); lpa.getBtn_Multiply().click();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '9'");
	  lpa.getBtn_Nine().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '='"); lpa.getBtn_Equals().click(); String result =
	  lpa.getTxt_Result().getText(); softAssert.assertEquals("= 315", result,
	  "calculated result is not correct");
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "The calculated result for multiplication of three number is: " +result);
	  softAssert.assertAll(); }
	  
	  @Test(priority =6) public void division() throws InterruptedException{
	  
	  ExtentTestManager.getTest().setDescription("This test will verify divison");
	  SoftAssert softAssert = new SoftAssert(); CalculatorFactory lpa =
	  PageFactory.initElements(driver, CalculatorFactory.class);
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Launch calculator application"); Thread.sleep(2000);
	  
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '8'");
	  lpa.getBtn_Eight().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '/'"); lpa.getBtn_Divide().click();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '4'");
	  lpa.getBtn_Four().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click nsign '='"); lpa.getBtn_Equals().click(); String result =
	  lpa.getTxt_Result().getText(); softAssert.assertEquals("= 2", result,
	  "calculated result is not correct");
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "The calculated result for division is: " +result); softAssert.assertAll(); }
	  
	  @Test(priority =7) public void multiple_Operation() throws
	  InterruptedException{
	  
	  ExtentTestManager.getTest().
	  setDescription("This test will verify multiple operation"); SoftAssert
	  softAssert = new SoftAssert(); CalculatorFactory lpa =
	  PageFactory.initElements(driver, CalculatorFactory.class);
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Launch calculator application"); Thread.sleep(2000);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '7'");
	  lpa.getBtn_Seven().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '+'"); lpa.getBtn_Plus().click();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '5'");
	  lpa.getBtn_Five().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click sign '*'"); lpa.getBtn_Multiply().click();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Click number '9'");
	  lpa.getBtn_Nine().click(); ExtentTestManager.getTest().log(LogStatus.INFO,
	  "Click number '='"); lpa.getBtn_Equals().click(); String result =
	  lpa.getTxt_Result().getText(); softAssert.assertEquals("= 52", result,
	  "calculated result is not correct");
	  ExtentTestManager.getTest().log(LogStatus.INFO,
	  "The calculated result for multiple operation is: " +result);
	  softAssert.assertAll(); }
	 

}
