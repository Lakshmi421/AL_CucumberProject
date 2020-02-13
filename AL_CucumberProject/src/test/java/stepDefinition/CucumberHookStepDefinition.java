package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberHookStepDefinition 
{
	@Given("^Thanos has Infinity stones$")
	public void thanos_has_Infinity_stones() throws Throwable
	{
		System.out.println("Thanos has infinity stones");
	}

	@When("^Thanos snap his fingers$")
	public void thanos_snap_his_fingers() throws Throwable 
	{
		System.out.println("Thanos snap his fingers");
	}

	@Then("^Half of the living things died$")
	public void half_of_the_living_things_died() throws Throwable 
	{
		System.out.println("Half of the living things died");
	}
}
