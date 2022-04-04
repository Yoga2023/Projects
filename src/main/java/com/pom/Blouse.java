package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blouse {
	public static WebDriver driver;
@FindBy(xpath="(//a[@title='Printed Dress'])[2]")
private WebElement blouse;

public Blouse(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public WebElement getBlouse() {
	return blouse;
}
}
