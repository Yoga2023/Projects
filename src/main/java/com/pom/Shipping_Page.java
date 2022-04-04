package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
public static WebDriver driver;
@FindBy(xpath="//div[@class='checker']")
private WebElement shipping;

@FindBy(xpath="//button[@name='processCarrier']")
private WebElement terms;

public Shipping_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public WebElement getShipping() {
	return shipping;
}

public WebElement getterms() {
	return terms;
}

}
