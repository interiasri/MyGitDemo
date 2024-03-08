@tag
Feature: Login Function Test
	Scenario: Check Login With Valid Credentials
		Given I Open browser and enter url "http://flights.qedgetech.com"
		Then I should see Login Page
		When I enter Username "sridhar_interia@outlook.com"
		When I enter Password "Sridhar@1234567"
		And I click Sign in
		Then I should see User Dashboard Page
		When I click Logout
		Then I Should see Login Page
		Then I close browser
		
		