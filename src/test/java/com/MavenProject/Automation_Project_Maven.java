package com.MavenProject;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseClass.Base_Class;
import com.pom.Home_Page;
import com.pom.Login_Page;

public class Automation_Project_Maven extends Base_Class {
	Home_Page hp=new Home_Page(driver);
	Login_Page lp=new Login_Page(driver);
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();

		browser("chrome");
		url("http://automationpractice.com/index.php");

		// driver.get("http://automationpractice.com/index.php");
		// driver.manage().window().maximize();

		WebElement signin_Btn = driver.findElement(By.xpath("//a[@class='login']"));

		// signin_Btn.click();

		click(signin_Btn);
		WebElement email = driver.findElement(By.id("email"));

		// email.sendKeys("Sele12345@gmail.com");
		input(email, "Sele12345@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));

		// password.sendKeys("123asd@Q");

		input(password, "123asd@Q");
		screenShot("C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Screenshot\\Base_class-1.png");
		WebElement sign_Btn = driver.findElement(By.id("SubmitLogin"));

		// sign_Btn.click();

		click(sign_Btn);

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		click(women);

		WebElement cart = driver.findElement(By.xpath("(//a[contains(text(),'Blouse')])[3]"));

		action(cart, "ContextClick");

		robot(1);

		/*
		 * Set<String> women1 = driver.getWindowHandles(); for (String data : women1) {
		 * Thread.sleep(5000);
		 * System.out.println(driver.switchTo().window(data).getTitle()); }
		 * 
		 * String newTab = "Blouse - My Store"; Thread.sleep(5000); for (String data1 :
		 * women1) {
		 * 
		 * if (driver.switchTo().window(data1).getTitle().equals(newTab)) { break; }
		 * 
		 * }
		 */

		windowHandles();
		WebElement add = driver.findElement(By.xpath("//i[@class='icon-plus']"));

		for (int i = 0; i < 3; i++) {
			add.click();

		}

		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		dropdown(size, "value", "2");

		WebElement addToCart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		click(addToCart);

		WebElement proceed = driver.findElement(By.xpath("(//a[contains(@class,'default')])[2]"));
		click(proceed);
		WebElement checkout = driver.findElement(By.xpath("(//a[contains(@class,'default')])[5]"));
		click(checkout);
		WebElement address = driver.findElement(By.xpath("//button[@name='processAddress']"));
		click(address);
		WebElement shipping = driver.findElement(By.xpath("//div[@class='checker']"));
		click(shipping);
		WebElement terms = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		click(terms);
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		click(payment);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Screenshot\\Base_class-1.png");
		FileUtils.copyFile(source, destination);

		screenShot("C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Screenshot\\Base_class-2.png"); // driver.close();

		
		
		close();
		quit();

	}

}
