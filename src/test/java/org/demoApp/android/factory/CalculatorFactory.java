package org.demoApp.android.factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.demoApp.android.Common.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CalculatorFactory extends Baseclass{

	//This is a constructor, as every page need a base driver to find web elements
	public CalculatorFactory(WebDriver driver) {
		super();
	}

	@FindBy(how = How.XPATH, using = "//*[@text='0']")     
	public WebElement btn_Zero ;
	
	
	@FindBy(how = How.XPATH, using = "//*[@text='1']")    
	public WebElement btn_One ;
	
	@FindBy(how = How.XPATH, using = "//*[@text='2']")     
	public WebElement btn_Two ;
	
	
	@FindBy(how = How.XPATH, using = "//*[@text='3']")    
	public WebElement btn_Three ;
	
	
	@FindBy(how = How.XPATH, using = "//*[@text='4']")    
	public WebElement btn_Four ;
	
	
	@FindBy(how = How.XPATH, using = "//*[@text='5']")     
	public WebElement btn_Five;
	
	
	@FindBy(how = How.XPATH, using = "//*[@text='6']")    
	public WebElement btn_Six ;
	
	@FindBy(how = How.XPATH, using = "//*[@text='7']")     
	public WebElement btn_Seven ;
	
	
	@FindBy(how = How.XPATH, using = "//*[@text='8']")    
	public WebElement btn_Eight ;
	
	
	@FindBy(how = How.XPATH, using = "//*[@text='9']")    
	public WebElement btn_Nine ;
	
	
//symbols
	
	@FindBy(how = How.ID, using = "btn_plus_s")
	public WebElement btn_Plus;

	@FindBy(how = How.ID, using = "btn_equal_s")
	public WebElement btn_Equals;

	@FindBy(how = How.ID, using = "btn_minus_s")
	public WebElement btn_Minus;

	@FindBy(how = How.ID, using = "btn_mul_s")
	public WebElement btn_Multiply;
	
	@FindBy(how = How.ID, using = "btn_div_s")
	public WebElement btn_Divide;

	@FindBy(how = How.ID, using = "btn_c_s")
	public WebElement btn_AC;
	
	@FindBy(how = How.ID, using = "btn_del_s")
	public WebElement btn_Delete;
	
	@FindBy(how = How.ID, using = "result")
	public WebElement txt_Result;
	
	public WebElement getBtn_Zero() {
		return btn_Zero;
	}

	public void setBtn_Zero(WebElement btn_Zero) {
		this.btn_Zero = btn_Zero;
	}
	public WebElement getBtn_One() {
		return btn_One;
	}
	public void setBtn_One(WebElement btn_One) {
		this.btn_One = btn_One;
	}

	public WebElement getBtn_Two() {
		return btn_Two;
	}

	public void setBtn_Two(WebElement btn_Two) {
		this.btn_Two = btn_Two;
	}
	public WebElement getBtn_Three() {
		return btn_Three;
	}

	public void setBtn_Three(WebElement btn_Three) {
		this.btn_Three = btn_Three;
	}

	public WebElement getBtn_Four() {
		return btn_Four;
	}
	public void setBtn_Four(WebElement btn_Four) {
		this.btn_Four = btn_Four;
	}

	public WebElement getBtn_Five() {
		return btn_Five;
	}
	public void setBtn_Five(WebElement btn_Five) {
		this.btn_Five = btn_Five;
	}

	public WebElement getBtn_Six() {
		return btn_Six;
	}

	public void setBtn_Six(WebElement btn_Six) {
		this.btn_Six = btn_Six;
	}

	public WebElement getBtn_Seven() {
		return btn_Seven;
	}

	public void setBtn_Seven(WebElement btn_Seven) {
		this.btn_Seven = btn_Seven;
	}

	public WebElement getBtn_Eight() {
		return btn_Eight;
	}

	public void setBtn_Eight(WebElement btn_Eight) {
		this.btn_Eight = btn_Eight;
	}

	public WebElement getBtn_Nine() {
		return btn_Nine;
	}

	public void setBtn_Nine(WebElement btn_Nine) {
		this.btn_Nine = btn_Nine;
	}
	public WebElement getBtn_Plus() {
		return btn_Plus;
	}

	public void setBtn_Plus(WebElement btn_Plus) {
		this.btn_Plus = btn_Plus;
	}

	public WebElement getBtn_Equals() {
		return btn_Equals;
	}

	public void setBtn_Equals(WebElement btn_Equals) {
		this.btn_Equals = btn_Equals;
	}

	
	public WebElement getBtn_Minus() {
		return btn_Minus;
	}

	public void setBtn_Minus(WebElement btn_Minus) {
		this.btn_Minus = btn_Minus;
	}

	public WebElement getBtn_Multiply() {
		return btn_Multiply;
	}

	public void setBtn_Multiply(WebElement btn_Multiply) {
		this.btn_Multiply = btn_Multiply;
	}

	public WebElement getBtn_Divide() {
		return btn_Divide;
	}

	public void setBtn_Divide(WebElement btn_Divide) {
		this.btn_Divide = btn_Divide;
	}

	public WebElement getBtn_AC() {
		return btn_AC;
	}

	public void setBtn_AC(WebElement btn_AC) {
		this.btn_AC = btn_AC;
	}

	public WebElement getBtn_Delete() {
		return btn_Delete;
	}

	public void setBtn_Delete(WebElement btn_Delete) {
		this.btn_Delete = btn_Delete;
	}

	public WebElement getTxt_Result() {
		return txt_Result;
	}

	public void setTxt_Result(WebElement txt_Result) {
		this.txt_Result = txt_Result;
	}

	public AppiumDriver getDriver() {
		return driver;
	}

}
