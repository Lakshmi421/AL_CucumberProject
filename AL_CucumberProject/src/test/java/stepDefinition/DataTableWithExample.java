package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExample 
{
	WebDriver driver;
	
	@Given("^Go to orange HRM login page$")
	public void go_to_orange_HRM_login_page() throws Throwable 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Give the valid login credential \"([^\"]*)\" and \"([^\"]*)\"$")
	public void give_the_valid_login_credential_and(String username, String password) throws Throwable 
	{
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys(password);
	}

	@When("^Press submit button$")
	public void press_submit_button() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@name='Submit']")).sendKeys(Keys.ENTER);
	}


}
