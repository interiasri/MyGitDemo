package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginTestMethods {
	
	WebDriver driver;
	
	@Given("I Open browser and enter url {string}")
	public void i_open_browser_and_enter_url(String url) {
		
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	    
	}

	@Then("I should see Login Page")
	public void i_should_see_login_page1() {
	    String lpage=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/p/b")).getText();
	    if(lpage.equalsIgnoreCase("Login")) {
	    	System.out.println("Login Page Displayed");
	    }
	    else {
	    	System.out.println("This is not Login Page");
	    }
	}

	@When("I enter Username {string}")
	public void i_enter_username(String uname) {
	    driver.findElement(By.name("email")).sendKeys(uname);
	}

	@When("I enter Password {string}")
	public void i_enter_password(String pwd) {
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@And("I click Sign in")
	public void i_click_sign_in() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("I should see User Dashboard Page")
	public void i_should_see_user_dashboard_page() {
	    String udash=driver.findElement(By.xpath("//*[@id=\"contact-info\"]/div/div[1]/h2")).getText();
	    if(udash.equalsIgnoreCase("User Dashboard")) {
	    	System.out.println("Logged in Successfully");
	    	
	    }
	    else {
	    	System.out.println("Login Failed");
	    }
	}

	@When("I click Logout")
	public void i_click_logout() {
	    driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[3]/ul/li[2]/div/a/i")).click();
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("I Should see Login Page")
	public void i_should_see_login_page() {
		String lpage=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/p/b")).getText();
	    if(lpage.equalsIgnoreCase("Login")) {
	    	System.out.println("Login Page Displayed");
	    }
	    else {
	    	System.out.println("This is not Login Page");
	    }
	    
	}

	@Then("I close browser")
	public void i_close_browser() {
	    driver.close();
	}
	
	@When("I enter date of flight {string}")
	public void i_enter_date_of_flight(String date) {
	    driver.findElement(By.id("search-date")).sendKeys(date);
	}
	
	
	@When("I click flight boarding point {string}")
	public void i_click_flight_boarding_point(String from) {
	    WebElement f=driver.findElement(By.xpath("//select[contains(@class,'sf2')]"));
	    Select fr = new Select(f);
	    fr.selectByVisibleText(from);
	}
	@When("I click flight destination point {string}")
	public void i_click_flight_destination_point(String destin) {
		WebElement t=driver.findElement(By.xpath("//select[contains(@class,'sf3')]"));
		Select to = new Select(t);
		to.selectByVisibleText(destin);
	    
	}
	
	
	@When("I click Search Flights")
	public void i_click_search_flights() {
	    driver.findElement(By.xpath("//*[@id=\"contact-info\"]/div/div[2]/div/div[2]/div[1]/div/div/div[4]/button/i")).click();
	}
	@Then("I should see Flights Search Results table")
	public void i_should_see_flights_search_results_table() {
		
		String results=driver.findElement(By.xpath("//*[@id=\"flights-results\"]/div/div/div[1]/h3/span/i")).getText();
		if(results.equalsIgnoreCase("Flights Search Results")) {
			System.out.println("Flights results table displayed");
			
		}
	    
	}
}

