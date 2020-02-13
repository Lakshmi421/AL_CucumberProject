package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithHeader 
{
	WebDriver driver;
	
	@Given("^Go to login page$")
	public void go_to_login_page() throws Throwable 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Give the login credential$")
	public void give_the_login_credential(DataTable dataTable) throws Throwable 
	{
		List<Map<String, String>> Key_ValuePair = dataTable.asMaps(String.class, String.class);
		String Username = Key_ValuePair.get(0).get("UserName");
		String Password = Key_ValuePair.get(0).get("Password");
		
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys(Username);
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys(Password);
	}

	@When("^Click the submit button to see the home page$")
	public void click_the_submit_button_to_see_the_home_page() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@name='Submit']")).sendKeys(Keys.ENTER);
	}
}
