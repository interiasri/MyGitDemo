package AutomationTestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import AppUtilities.BasicFunctions;

public class AddEmployeeTestcase extends BasicFunctions {
	
	
	@Test(priority=1)
	public void addEmployee() throws InterruptedException{
		WebElement menu=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul"));
		List<WebElement> menulist=menu.findElements(By.tagName("li"));
		int listcount=menulist.size();
		System.out.println(listcount);
		for(int i=0; i<menulist.size();i++) {
			if(menulist.get(i).getText().equalsIgnoreCase("PIM")) {
				menulist.get(i).click();
				break;
			}
		}
		
		WebElement menu2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul"));
		List<WebElement> subitems=menu2.findElements(By.tagName("li"));
		int subcount=subitems.size();
		System.out.println(subcount);
		for(int j=0; j<subitems.size();j++) {
			if(subitems.get(j).getText().equalsIgnoreCase("Add Employee")) {
				subitems.get(j).click();
				break;
			}
		}
		
		boolean addemp=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6")).isDisplayed();
		Assert.assertTrue(addemp);
		String addemp1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6")).getText();
		System.out.println(addemp1);
		driver.findElement(By.name("firstName")).sendKeys("Sridhar");
		driver.findElement(By.name("lastName")).sendKeys("porus2");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(5000);	
	}
	
	
	@Test(priority=2)
	public void searchEmp() throws InterruptedException {
		
		WebElement menu2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul"));
		List<WebElement> subitems=menu2.findElements(By.tagName("li"));
		int subcount=subitems.size();
		System.out.println(subcount);
		for(int j=0; j<subitems.size();j++) {
			if(subitems.get(j).getText().equalsIgnoreCase("Employee List")) {
				subitems.get(j).click();
				break;
			}
		}	
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("sridhar");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	

}
