package com.pom;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page {
public static WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	
	public Women_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}
	
	
}
