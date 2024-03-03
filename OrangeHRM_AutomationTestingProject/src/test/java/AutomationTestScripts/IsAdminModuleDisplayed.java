package AutomationTestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import AppUtilities.BasicFunctions;

public class IsAdminModuleDisplayed extends BasicFunctions {
	
	@Test
	public void isadminModuleDisplayed() {
		boolean dash=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed();
		Assert.assertTrue(dash);
	}

}
