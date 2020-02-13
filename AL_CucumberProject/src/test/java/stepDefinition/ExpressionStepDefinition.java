package stepDefinition;

import cucumber.api.java.en.Given;

public class ExpressionStepDefinition 
{
	@Given("^I have (\\d+) Laptop$")
	public void i_have_1_Laptop(int count) throws Throwable 
	{
		System.out.println("Laptop Count : "+count);
	}

	@Given("^I have a (\\d+\\.\\d+) CGPA$")
	public void i_have_a_CGPA(float num) throws Throwable 
	{
		System.out.println("My CGPA is : "+num);
	}

	@Given("^\"([^\"]*)\" is elder to \"([^\"]*)\" and \"([^\"]*)\"$")
	public void is_elder_to_and(String name1, String name2, String name3) throws Throwable 
	{
		System.out.println(name1+" is elder to +"+name2+" and "+name3);
	}


}
