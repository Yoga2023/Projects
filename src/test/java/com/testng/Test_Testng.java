package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Testng {
	WebDriver driver;
	@BeforeSuite
	private void property() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\yogak\\eclipse-workspace\\MavenProject"
				+ "\\Driver\\chromedriver.exe");

	}
@BeforeTest
private void browser() {
	 driver=new ChromeDriver();
		

}
@BeforeClass
private void url() {
	driver.get("http://automationpractice.com/index.php");	

}
	@BeforeMethod
	private void sign_In() {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).
		sendKeys("Sele12345@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123asd@Q");
		driver.findElement(By.id("SubmitLogin")).click();

	}
	@Test
	private void dress() {
		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();

	}
	
	@AfterMethod
	private void sign_Out() {
		
driver.findElement(By.xpath("//a[@class='logout']")).click();
	}
	@AfterClass
	private void close() {
		driver.close();

	}
	@AfterTest
	private void verify() {
		System.out.println("verify");

	}
	@AfterSuite
	private void cookies() {
		driver.manage().deleteAllCookies();

	}
}
 