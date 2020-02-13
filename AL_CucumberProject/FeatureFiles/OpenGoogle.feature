@OpenGoogle
Feature: Open google.com features
Scenario: Open google.co.in and search
	Given user entereing to google.co.in
	When click the search box and type search term as "Red"
	And press the enter key
	Then user should see the search results
