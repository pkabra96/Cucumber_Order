package stepDefinition;
import util.driverutil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class demosignscript {
	WebDriver driver;
	
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
	  
		 driver =driverutil.getDriver("chrome");
	      driver.manage().window().maximize();
	}

	@When("^Launch the application$")
	public void launch_the_application() throws Throwable {   
		  driver.get("http://demowebshop.tricentis.com/");
	}

	@Then("^Pass the Username and password to sign-up$")
	public void pass_the_Username_and_password_to_sign_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Log in")).click();
		  Thread.sleep(1000);
		    
		  driver.findElement(By.id("Email")).sendKeys("anushree@gmail.com");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("Password")).sendKeys("anushree123");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  Thread.sleep(1000);
	}

	@Then("^User should LOGIN$")
	public void user_should_LOGIN() throws Throwable {
		Assert.assertEquals(driver.findElement(By.linkText("anushree@gmail.com")).getText(),"anushree@gmail.com");
		  Thread.sleep(1000);
	    
	}


}
