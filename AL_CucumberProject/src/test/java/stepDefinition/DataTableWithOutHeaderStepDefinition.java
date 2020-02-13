package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithOutHeaderStepDefinition 
{
	WebDriver driver;
	
	@Given("^You are entering to login page$")
	public void you_are_entering_to_login_page() throws Throwable 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Give the required login credential$")
	public void give_the_required_login_credential(DataTable dataTable) throws Throwable 
	{
		List<String> credentials = dataTable.asList(String.class);
		String Username = credentials.get(0);
		String Password = credentials.get(1);
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys(Username);
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys(Password);
	}

	@When("^Click the submit button to proceed$")
	public void click_the_submit_button_to_proceed() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@name='Submit']")).sendKeys(Keys.ENTER);
	}
}
