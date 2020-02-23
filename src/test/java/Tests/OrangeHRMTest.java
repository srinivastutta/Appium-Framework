package Tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class OrangeHRMTest extends BaseClass {

	@BeforeSuite
	public void StartTest() throws MalformedURLException {
		Setup();
	}

	@Test (priority =1)
	public void OrangeLoginTest() {
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		   driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		   driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		   driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Keys.ENTER);
	}

	@AfterSuite
	public void ShutDown() {
		TearDown();
	}
}
