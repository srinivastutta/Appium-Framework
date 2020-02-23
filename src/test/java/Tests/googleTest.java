package Tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class googleTest extends BaseClass{
	@BeforeSuite
	public void StartTest() throws MalformedURLException {
		//Setup();
	}
	@Test (priority =1)
	public void googleSearchTest1() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Appium Automation");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		System.out.println("First Test is done");
	}
	@Test (priority =2)
	public void googleSearchTest2() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium Automation");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		System.out.println("Second Test is done");
	}
	@AfterTest
	public void ShutDown() {
		TearDown();
		
	}
}
