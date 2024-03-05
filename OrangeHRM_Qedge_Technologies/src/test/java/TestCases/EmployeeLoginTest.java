package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utility.Fun;

public class EmployeeLoginTest extends Fun {
	
	@Test
	public void employeeName() {
		String ename=driver.findElement(By.xpath("//*[@id=\"welcome\"]")).getText();
		System.out.println(ename);
	}
}
