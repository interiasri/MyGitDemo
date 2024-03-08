@tag
Feature: Search Flights

@tag1
	Scenario: Search Flights button TestCase
		Given I Open browser and enter url "http://flights.qedgetech.com"
		Then I should see Login Page
		When I enter Username "sridhar_interia@outlook.com"
		When I enter Password "Sridhar@1234567"
		And I click Sign in
		Then I should see User Dashboard Page
		When I enter date of flight "05/20/2024"
		When I click flight boarding point "Hyderabad"
		When I click flight destination point "Kolkatha"
		When I click Search Flights
		Then I should see Flights Search Results table
		When I click Logout
		Then I Should see Login Page
		Then I close browser