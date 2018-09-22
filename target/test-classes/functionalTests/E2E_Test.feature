Feature: Amazon Selenium Test

Scenario: Place Online Book Order
	Given user is on amazon home page
	When user searches Fifth Season
	Then user should see search result
	
Scenario: Order Test
	Given user is on amazon home page
	When user click order
	Then user should see log in page