package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utility.Fun;

public class AddEmployee extends Fun {
	
	@Parameters({"module", "subitem", "emplist"})
	@Test
	public void empreg(String moduleName, String subitem, String emplist) throws InterruptedException {
		WebElement nav=driver.findElement(By.id("mainMenuFirstLevelUnorderedList"));
		List<WebElement> menulist=nav.findElements(By.xpath("//li[contains(@class,'main-menu-first-level-list-item')]"));
		System.out.println(menulist.size());
		
		for(int i=0; i<menulist.size();i++) {
			String menuitem=menulist.get(i).getText();
			if(menuitem.equals(moduleName)) {
				menulist.get(i).click();
				break;
			}
		}
		nav=driver.findElement(By.id("mainMenuFirstLevelUnorderedList"));
		WebElement currentmodule=nav.findElement(By.xpath("//li[contains(@class,'current')]"));
		List<WebElement> sublist=currentmodule.findElement(By.tagName("ul")).findElements(By.tagName("li"));
		System.out.println(sublist.size());
		for(WebElement item: sublist) {
			if(item.getText().equals(subitem)) {
				item.click();
				break;
			}
		}
		String addemp=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
		System.out.println(addemp);
		
		driver.findElement(By.id("firstName")).sendKeys("Sridhar");
		driver.findElement(By.id("lastName")).sendKeys("Parutabad");
		String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(empid);
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(2000);
		nav=driver.findElement(By.id("mainMenuFirstLevelUnorderedList"));
		currentmodule=nav.findElement(By.xpath("//li[contains(@class,'current')]"));
		sublist=currentmodule.findElement(By.tagName("ul")).findElements(By.tagName("li"));
		for(WebElement item: sublist) {
			if(item.getText().equals(emplist)) {
				item.click();
				break;
			}
		}
		Thread.sleep(2000);
		String empinfo=driver.findElement(By.xpath("//*[@id=\"employee-information\"]/div[1]/h1")).getText();
		System.out.println(empinfo);
		Thread.sleep(2000);
		driver.findElement(By.id("empsearch_employee_name_empName")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Sridhar");
		Thread.sleep(2000);
		List<WebElement> searchlist=driver.findElement(By.xpath("/html/body/div[4]")).findElement(By.tagName("ul")).findElements(By.tagName("li"));

		System.out.println(searchlist.size());
		
		for(int j=0; j<searchlist.size(); j++) {
			String empname=searchlist.get(j).getText();
			if(empname.equalsIgnoreCase("Sridhar Parutabad")) {
				searchlist.get(j).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.id("searchBtn")).click();
		
		List<WebElement> trows=driver.findElement(By.id("resultTable")).findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		
		for(int k=0; k<trows.size(); k++) {
			List<WebElement> tcols=trows.get(k).findElements(By.tagName("td"));
			String fname=tcols.get(2).getText();
			String lname=tcols.get(3).getText();
			if(fname.equalsIgnoreCase("Sridhar") && lname.equalsIgnoreCase("Parutabad")) {
				System.out.println(fname+" "+lname);
				break;
			}
		}
	}
}
