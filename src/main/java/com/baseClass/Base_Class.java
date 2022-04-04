package com.baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

//to launch
	public static WebDriver browser(String value) {
		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else if (value.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Driver\\iedriverserver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	// Navigate Comands
	public static void navigate_Back() {
		driver.navigate().back();

	}

	public static void navigate_Forward() {
		driver.navigate().forward();
	}

	public static void navigate_Refresh() {
		driver.navigate().refresh();
	}

	public static void naviagte_To() {
		driver.navigate().to(" ");
	}
//To Get Url

	public static void url(String url) {
		driver.get(url);
	}

//Alerts
	public static void alert(String type) {
		if (type.equalsIgnoreCase("accepts")) {
			driver.switchTo().alert().accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void prompt_Alert(String type, String data) {
		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("accept")) {
			a.sendKeys(data);
			a.accept();
		} else {
			a.sendKeys(data);
			a.dismiss();
		}
	}

	// Frames
	public static void frames(String frames, String value) {
		if (frames.equalsIgnoreCase("id")) {
			driver.switchTo().frame(value);
		} else if (frames.equalsIgnoreCase("index")) {
			driver.switchTo().frame(value);
		}

	}

	public static void frames_WE(WebElement element) {
		driver.switchTo().frame(element);
	}

	// Click
	public static void click(WebElement element) {
		element.click();

	}

	// Checkbox
	public static void checkBox(WebElement element) {
		element.click();
	}

	// Displayed,selected,enabled
	public static void screens(WebElement element, String type) {
		if (type.equalsIgnoreCase("displayed")) {
			element.isDisplayed();
		} else if (type.equalsIgnoreCase("enabled")) {
			element.isEnabled();
		} else if (type.equalsIgnoreCase("Selected")) {
			element.isSelected();
		}
	}

	// Radiobutton
	public static void radio_Btn(WebElement element) {
		element.click();
	}

	// Get Text
	public static void text(WebElement element) {
		System.out.println(element.getText());
	}

	// Current url
	public static void current_url() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	// Title
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// PageSource
	public static void page_Source() {
		String page = driver.getPageSource();
		System.out.println(page);
	}

//is multiple
	public static void multiple(WebElement element, String type) {
		Select sel = new Select(element);
		if (type.equalsIgnoreCase("allSelected")) {
			List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
			for (WebElement multi : allSelectedOptions) {
				System.out.println(multi.getText());
			}
		} else if (type.equalsIgnoreCase("allOptions")) {
			List<WebElement> options = sel.getOptions();

			int a = options.size();
			System.out.println("Size of the WebElement: " + a);

			for (int i = 0; i < a; i++) {
				if (options.get(i).getText().equalsIgnoreCase("Opel")) {
					System.out.println(options.get(i).getText());
				}
			}
		} else if (type.equalsIgnoreCase("oneOption")) {
			WebElement b = sel.getFirstSelectedOption();
			System.out.println(b.getText());
		}

	}

	// attribute
	public static void attribute(WebElement element, String type) {
		System.out.println(element.getAttribute(type));

	}

	// Delay
	public static void delay() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//SendKeys
	public static void input(WebElement element, String value) {
		element.sendKeys(value);
	}

//Actions
	public static void action(WebElement element, String type) {

		Actions a = new Actions(driver);
		if(type.equalsIgnoreCase("contextclick")) {
		a.contextClick(element).perform();}
		else if(type.equalsIgnoreCase("singleclick")) {
			a.click(element).perform();
		}else if(type.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element).perform();
		}else if(type.equalsIgnoreCase("moveto")) {
			a.moveToElement(element).click().perform();
		}
	}

//Robot class
	public static void robot(int key) throws AWTException {
		Robot r = new Robot();
		for(int i=0;i<key;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

//Windowhandles
	public static void windowHandles() throws InterruptedException {
		Set<String> women = driver.getWindowHandles();
		for (String data : women) {
			
			String header=driver.switchTo().window(data).getTitle();
		

//		String newTab = "Blouse - My Store";
	//	Thread.sleep(5000);
		for (String data1 : women) {

			if (driver.switchTo().window(data1).getTitle().equals(header)) {
				break;
			}

		}
		}

	}

//Dropdown
	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equals("value")) {
			s.selectByValue(value);

		} else if (type.equals("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else {
			s.selectByVisibleText(value);
		}
	}

//ScreenShot
	public static void screenShot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);

	}

//Close
	public static void close() {
		driver.close();
	}

	// Quit
	public static void quit() {
		driver.quit();
	}
}
