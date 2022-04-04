package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_To_Cart_Page {
public static WebDriver driver;
	@FindBy(xpath="//span[text()='Add to cart']")
private WebElement addToCart;

	public Add_To_Cart_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getAddToCart() {
		return addToCart;
	}


}
