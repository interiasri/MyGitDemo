@Tag
Feature: Select Flight Reservation Date

@Tag1
Scenario: Check flight Reservation Date Test Case
		Given I Open browser and enter url "http://flights.qedgetech.com"
		Then I should see Login Page
		When I enter Username "sridhar_interia@outlook.com"
		When I enter Password "Sridhar@1234567"
		And I click Sign in
		Then I should see User Dashboard Page
		When I enter date of flight "05/20/2024"
		When I click Logout
		Then I Should see Login Page
		Then I close browser
		
	
	 
	
