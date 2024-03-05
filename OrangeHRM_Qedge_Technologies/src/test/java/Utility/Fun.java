package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Fun {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://orangehrm.qedgetech.com");
	}
	
//	Admin Login Credentials-log.Login("Admin", "Qedge123!@#");
//	Employee Login Details(Username: Sridharp1234) And (Password: Sridhar@123!123)
	
	@BeforeTest
	public void login() {
		driver.findElement(By.className("form-hint")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	@AfterTest
	public void logout() {
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterSuite
	public void closeApp() {
		driver.quit();
	}

}
