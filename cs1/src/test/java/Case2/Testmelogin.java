package Case2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cs1.UtilityClass;

public class Testmelogin {
	WebDriver driver;
	@Given("Enter the Username {string}")
	public void enter_the_Username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver=UtilityClass.getdriver("Chrome");
		 
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@Given("enter the password {string}")
	public void enter_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}

	@When("click the login button")
	public void click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
	}

	@Then("It displays the next page")
	public void it_displays_the_next_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User logged in successfully");
	}

}
