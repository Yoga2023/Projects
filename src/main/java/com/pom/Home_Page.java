package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page{
public static WebDriver driver;
	//collection of webElements and make it ass Private for secured purpose, 
	//by using Getters and setters we can use that private WebElements as global access.

	@FindBy(xpath= "//a[@class='login']")
	
	private WebElement signin_Btn;

	public Home_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}
	
	



}
