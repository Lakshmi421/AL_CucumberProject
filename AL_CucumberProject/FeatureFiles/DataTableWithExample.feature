@DataDriven_Example
Feature: This is login feature with datatable Header and Example
Scenario Outline:: This is login scenario with datatable Header and Example
	Given Go to orange HRM login page
	When Give the valid login credential "<UserName>" and "<Password>"
	And Press submit button
	
Examples:
|UserName|Password|
|Admin|admin123|
|Admin|admin13|