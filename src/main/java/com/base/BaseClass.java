package com.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass {
public static AppiumDriver<WebElement> driver;

	public void Setup() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//Mobile Version Chrome Driver is not supporting Appium, downloaded below chrome driver from
		//https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/
		caps.setCapability("chromedriverExecutable", "E:\\Selenium\\Workspace\\AppiumFramework\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0 NRD90M");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		caps.setCapability(MobileCapabilityType.UDID, "0ed6de780404");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//caps.setCapability(MobileCapabilityType.APP, "");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		//Passing URL of appium server and capabilities to driver
		driver = new AppiumDriver<WebElement>(url, caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		System.out.println("Application started");
	}
	
	public void TearDown() {
		driver.close();
		
	}
	
}
