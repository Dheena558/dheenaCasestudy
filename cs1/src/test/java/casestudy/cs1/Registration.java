package casestudy.cs1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cs1.UtilityClass;

public class Registration {
	WebDriver driver;
	@Given("open the Testme app Home page")
	public void open_the_Testme_app_Home_page() {
	   driver=UtilityClass.getdriver("chrome");
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    
	}

	@Given("click the signup button")
	public void click_the_signup_button() {
	   System.out.println("Testme Registration");
	    
	}

	@Given("Enter the username {string}")
	public void enter_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.linkText("SignUp")).click();
	       driver.findElement(By.id("userName")).sendKeys("Dheena1");
	        
	          
	}

	@Given("Enter the First name {string}")
	public void enter_the_First_name(String string) { 
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("firstName")).sendKeys("Dheena");
	}

	@Given("Enter the Last name {string}")
	public void enter_the_Last_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("lastName")).sendKeys("Dhayalan");
	}

	@Given("Enter the password {string}")
	public void enter_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys("dheena1234");
	}

	@Given("Confirm the password {string}")
	public void confirm_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass_confirmation")).sendKeys("dheena1234");
	}

	@Given("select the gender")
	public void select_the_gender() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='gender']")).click();
	}

	@Given("Enter email id {string}")
	public void enter_email_id(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys("Rohit45@gmail.com");
	}

	@Given("Enter the Mobile Number {string}")
	public void enter_the_Mobile_Number(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("mobileNumber")).sendKeys("9944957385");
	}

	@Given("Enter the date of birth {string}")
	public void enter_the_date_of_birth(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("dob")).sendKeys("10/14/1997");
	}

	@Given("enter the Address {string}")
	public void enter_the_Address(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("address")).sendKeys("coimbatore");
	}
	@Given("Select the Security Question")
	public void select_the_Security_Question() {
	    // Write code here that turns the phrase above into concrete actions
		Select question = new Select(driver.findElement(By.id("securityQuestion")));
		question.selectByValue("411011");
			}
	@Given("enter the Answer {string}")
	public void enter_the_Answer(String string)
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("answer")).sendKeys("blue");
	
	}
	
	

	@When("User click Register Button")
	public void user_click_Register_Button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Submit")).click();
	}

	@Then("It redirects to login page and displays user registration successfull")
	public void it_redirects_to_login_page_and_displays_user_registration_successfull() {
	    // Write code here that turns the phrase above into concrete actions
		
	}


}
