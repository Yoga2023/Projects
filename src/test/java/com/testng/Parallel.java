package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {

	@Test
	private void facebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	@Test
	private void instagram() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");

	}
	@Test
	private void whtsapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");

	}
}
