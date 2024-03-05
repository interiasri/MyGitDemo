package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Fun;

public class UserManagement extends Fun {
	
	
	@Test
	public void CheckEmployeeAsUser() throws InterruptedException{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Sridhar");
		List<WebElement> suglist=driver.findElement(By.xpath("/html/body/div[4]")).findElement(By.tagName("ul")).findElements(By.tagName("li"));
		for(int i=0; i<suglist.size(); i++) {
			String tname=suglist.get(i).getText();
			if(tname.equalsIgnoreCase("Sridhar Parutabad")) {
				suglist.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		
		WebElement rtable=driver.findElement(By.id("resultTable"));
		List<WebElement> tablerows=rtable.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		for(int j=0; j<tablerows.size(); j++) {
			List<WebElement> tablecols=tablerows.get(j).findElements(By.tagName("td"));
			String ename=tablecols.get(3).getText();
			if(ename.equalsIgnoreCase("Sridhar Parutabad")) {
				System.out.println(ename);
				break;
			}
		}
		
	}

}
