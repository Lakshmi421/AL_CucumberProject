package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithDataStepDefinition 
{
	WebDriver driver;
	
	@Given("^User entering to login page$")
	public void user_entering_to_login_page() throws Throwable 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Give the login credential \"([^\"]*)\" and \"([^\"]*)\"$")
	public void give_the_login_credential_and(String username, String password) throws Throwable 
	{
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^Press the submit button to proceed$")
	public void press_the_submit_button_to_proceed() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Then("^The user should see the home page of orange HRM$")
	public void the_user_should_see_the_home_page_of_orange_HRM() throws Throwable 
	{
		boolean status = driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		if(status)
		{
			System.out.println("The Search Content is displayed.");
		}
	}
}
