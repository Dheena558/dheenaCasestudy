package case4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cs1.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtocart {
	WebDriver driver;
	@Given("Username {string}")
	public void username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver=UtilityClass.getdriver("Chrome");
		 
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@Given("password {string}")
	public void password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
	}

	@Then("Displays the next page")
	public void displays_the_next_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User logged in successfully");
	}

	@Given("user must be in the home page")
	public void user_must_be_in_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user search a product in a search box {string}")
	public void user_search_a_product_in_a_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
	}

	@When("Click the Find Details Button")
	public void click_the_Find_Details_Button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Navigated to the product Details page")
	public void navigated_to_the_product_Details_page() {
	    // Write code here that turns the phrase above into concrete actions
		 Assert.assertEquals(driver.getTitle(),"Search");
	}

	@Then("user checks for payment_error happens")
	public void user_checks_for_payment_error_happens() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals("View Cart", driver.getTitle());  //error occurs
	    
	}

	@Given("user sign and find products")
	public void user_sign_and_find_products() {
	    // Write code here that turns the phrase above into concrete actions
		 driver=UtilityClass.getdriver("Chrome");
		   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		   driver.findElement(By.name("userName")).sendKeys("lalitha");
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
		   driver.findElement(By.name("Login")).click();
	}

	@Given("user click add to cart button")
	public void user_click_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		 
		String cartNo=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b")).getText();
		 
		System.out.println(cartNo);
		 
		Assert.assertEquals("1",cartNo);
		 
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b")).click();
		 
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
		 
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();

		
	}

	@Given("after verifying click cart button")
	public void after_verifying_click_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("click checkout button")
	public void click_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));
		 
		driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
		 
		driver.findElement(By.id("btn")).click();
		 
		Assert.assertEquals(driver.getTitle(), "Payment Gateway");
		 
		driver.findElement(By.name("username")).sendKeys("123456");
		 
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		 
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		 
		Assert.assertNull(By.name("transpwd"));

	}

	@Given("for payment click payment Button")
	public void for_payment_click_payment_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("Select bank")
	public void select_bank() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));
		 
		driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
		 
		driver.findElement(By.id("btn")).click();
		 
		Assert.assertEquals(driver.getTitle(), "Payment Gateway");
		 
		driver.findElement(By.name("username")).sendKeys("123456");
		 
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		 
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		 
		WebDriverWait waitt = new WebDriverWait(driver, 10);
		 
		waitt.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h4")));
		 
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		 
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		 
		Assert.assertEquals(driver.getTitle(), "Order Details");

	}

	@Given("click Continue button")
	public void click_Continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("User enters the User Name")
	public void user_enters_the_User_Name() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("User enters the password")
	public void user_enters_the_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("click login Button")
	public void click_login_Button() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("enters the transaction password")
	public void enters_the_transaction_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("click pay button")
	public void click_pay_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("payment successfull")
	public void payment_successfull() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
