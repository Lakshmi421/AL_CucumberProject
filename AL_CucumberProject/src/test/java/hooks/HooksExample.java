package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksExample 
{
	@Before(order = 1)
	public void beforeSnapping()
	{
		System.out.println("Thanos collects infinity stones");
	}
	
	@Before(order = 0)
	public void beforeBeforeSnapping()
	{
		System.out.println("Thanos has to be born");
	}
	
	@After(order = 1)
	public void afterSnapping()
	{
		System.out.println("After killing everyone, take rest on garden");
	}
	
	@After(order = 0)
	public void afterAfterSnapping()
	{
		System.out.println("Finally, Thanos is also dying.");
	}
}
