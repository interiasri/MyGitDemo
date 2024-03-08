@tag
	Feature: Select Flight route
	
@tag1
	Scenario: Check Selecting A Flgiht Route
		Given I Open browser and enter url "http://flights.qedgetech.com"
		Then I should see Login Page
		When I enter Username "sridhar_interia@outlook.com"
		When I enter Password "Sridhar@1234567"
		And I click Sign in
		Then I should see User Dashboard Page
		When I click flight boarding point "Hyderabad"
		When I click flight destination point "Kolkatha"
		When I click Logout
		Then I Should see Login Page
		Then I close browser 