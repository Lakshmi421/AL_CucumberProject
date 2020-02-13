package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition 
{
	WebDriver driver;

	@Given("^User entering to Orange HRM login page$")
	public void user_entering_to_Orange_HRM_login_page() throws Throwable 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Type the valid username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void type_the_valid_username_as_and_password_as(String arg1, String arg2) throws Throwable 
	{
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
	}

	@When("^Press the login button$")
	public void press_the_login_button() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@name='Submit']")).sendKeys(Keys.ENTER);
	}

	@Then("^the user should be navigated to home page$")
	public void the_user_should_be_navigated_to_home_page() throws Throwable 
	{
		boolean status = driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		Assert.assertTrue(status);
	}
	


}
