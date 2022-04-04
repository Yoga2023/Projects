package com.MavenProject;
 
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.baseClass.Base_Class;
import com.pom.Blouse;
import com.sdp.Page_Object_Manager;

public class AutomationMaven extends Base_Class {
	public static WebDriver driver=Base_Class.browser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static Blouse b=new Blouse(driver);
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		url("http://automationpractice.com/index.php");
		click(pom.getHp().getSignin_Btn());
		input(pom.getLp().getEmail(), "Sele12345@gmail.com");
		input(pom.getLp().getPassword(), "123asd@Q");
		click(pom.getLp().getSignIn());
		click(pom.getW().getWomen());
		//click(pom.getb().getBlouse());
		action(pom.getb().getBlouse(), "contextclick");
		robot(1);
		windowHandles();
		
		for (int i = 0; i < 3; i++) {
			click(pom.getQc().getAdd());
		}
		dropdown(pom.getQc().getSize(), "value", "2");
		click(pom.getAtcp().getAddToCart());
		click(pom.getPp().getProceed());
		click(pom.getSp().getCheckout());
		click(pom.getAp().getAddress());
		click(pom.getSpp().getShipping());
		click(pom.getSpp().getterms());
		click(pom.getPpp().getPayment());
	screenShot("C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Screenshot\\After_POM.png");

	}
}
