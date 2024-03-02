package AutomationTestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AppUtilities.BasicFunctions;

public class CheckLoginwithInvalidInput extends BasicFunctions {
	
	public void checkloginwithinvalidinput() {
		BasicFunctions.invokeApp();
		BasicFunctions fun = new BasicFunctions();
		fun.login("abc", "123");
		String errmsg=driver.findElement(By.id("spanMessage")).getText();
		System.out.println(errmsg);
	}

}
