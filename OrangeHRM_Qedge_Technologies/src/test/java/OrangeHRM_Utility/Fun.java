package OrangeHRM_Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

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
	
	
//	log.Login("Admin", "Qedge123!@#");
	
	
	
	
	
	public void closeApp() {
		driver.quit();
	}

}
