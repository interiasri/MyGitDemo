package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utility.Fun;

public class IsSpecificModuleTestCase extends Fun {
	
	
	@Parameters({"module"})
	@Test
	public static void isModuleDisplayed(String moduleName) {
		WebElement ul=driver.findElement(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]"));
		List<WebElement> menu = ul.findElements(By.className("main-menu-first-level-list-item"));
		System.out.println(menu.size());
		
		for(int i=0; i<menu.size(); i++) {
			String item=menu.get(i).getText();
			if(item.equals(moduleName)) {
				System.out.println(item+" Module Displayed");
				break;
			}
		}
	}
}
