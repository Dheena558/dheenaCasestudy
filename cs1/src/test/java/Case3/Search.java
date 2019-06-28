package Case3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cs1.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	WebDriver driver;
	
	
	@Given("Enters the Username {string}")
	public void enters_the_Username(String string) {
		driver=UtilityClass.getdriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		

		driver.findElement(By.name("userName")).sendKeys(string);
		   
		  
	    
	}

	@Given("Enters the password {string}")
	public void enters_the_password(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	   
	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
		 driver.findElement(By.name("Login")).click();
	    
	}

	@Then("It Displays the next page")
	public void it_Displays_the_next_page() {
	    
	    
	}

	@Given("User must be in the home page")
	public void user_must_be_in_the_home_page() {
	    
	    
	}

	@When("User search a product in a search box {string}")
	public void user_search_a_product_in_a_search_box(String string) {
		driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
	    
	}

	@When("Click the Find Details button")
	public void click_the_Find_Details_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("Navigated to the product details page")
	public void navigated_to_the_product_details_page() {
		Assert.assertEquals(driver.getTitle(),"Search");
	}

}
