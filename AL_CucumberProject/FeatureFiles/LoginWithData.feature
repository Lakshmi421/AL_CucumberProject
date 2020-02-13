Feature: This is login feature with data for orange HRM
Scenario: This is login scenario with data for orange HRM
	Given User entering to login page
	When Give the login credential "Admin" and "admin123"
	And Press the submit button to proceed
	Then The user should see the home page of orange HRM 