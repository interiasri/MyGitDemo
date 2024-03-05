package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utility.Fun;

public class AddUser extends Fun {
	
	@Parameters({"module","subitem"})
	@Test
	public void userRegistration(String moduleName, String subitem) throws InterruptedException {
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
		
		String susers=driver.findElement(By.xpath("//*[@id=\"systemUser-information\"]/div[1]/h1")).getText();
		System.out.println(susers);
		
		driver.findElement(By.id("btnAdd")).click();
		
		String adduserheading=driver.findElement(By.id("UserHeading")).getText();
		System.out.println(adduserheading);
		
		Select urole = new Select(driver.findElement(By.id("systemUser_userType")));
		urole.selectByVisibleText("ESS");
		
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Sridhar Parutabad");
		
		Thread.sleep(2000);
		driver.findElement(By.id("systemUser_userName")).sendKeys("Sridharp1234");
		
		Select ustatus = new Select(driver.findElement(By.id("systemUser_status")));
		ustatus.selectByVisibleText("Enabled");
		
		driver.findElement(By.id("systemUser_password")).sendKeys("Sridhar@123!123");
		
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Sridhar@123!123");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(5000);
	}

}
