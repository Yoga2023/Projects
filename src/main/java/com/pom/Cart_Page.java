package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart_Page {
public static WebDriver driver;
	@FindBy(xpath="(//a[contains(text(),'Blouse')])[3]")
	private WebElement cart;
	
	

	public  Cart_Page(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getCart() {
		
		return cart;
	}
	

}
