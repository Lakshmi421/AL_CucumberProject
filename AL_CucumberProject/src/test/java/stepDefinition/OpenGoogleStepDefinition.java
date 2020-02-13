package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleStepDefinition 
{
	WebDriver driver;
	
	@Given("^user entereing to google\\.co\\.in$")
	public void user_entereing_to_google_co_in() throws Throwable 
	{
	    driver = new ChromeDriver();
	    driver.get("https://www.google.co.in");
	}

	@When("^click the search box and type search term as \"([^\"]*)\"$")
	public void click_the_search_box_and_type_search_term_as(String searchTerm) throws Throwable 
	{    
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("^press the enter key$")
	public void press_the_enter_key() throws Throwable 
	{
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^user should see the search results$")
	public void user_should_see_the_search_results() throws Throwable 
	{
		boolean status = driver.findElement(By.partialLinkText("color")).isDisplayed();
		if(status)
		{
			System.out.println("The result is displayed");
		}
		else
		{
			System.out.println("The result is not displayed. Because, "+status+" is not show in this page.");
		}
	}

}
