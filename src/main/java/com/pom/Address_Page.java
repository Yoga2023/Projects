package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {

	public Address_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver driver;
	
	public WebElement getAddress() {
		return address;
	}

	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement address;
	
}
